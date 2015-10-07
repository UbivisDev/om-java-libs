package nl.wur.fbr.om.math;

import nl.wur.fbr.om.conversion.CoreInstanceFactory;
import nl.wur.fbr.om.core.set.CoreUnitAndScaleSet;
import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.core.set.quantities.angle.Angle;
import nl.wur.fbr.om.core.set.quantities.length.Area;
import nl.wur.fbr.om.core.set.quantities.length.Length;
import nl.wur.fbr.om.core.set.quantities.length.Radius;
import nl.wur.fbr.om.core.set.quantities.temperature.Temperature;
import nl.wur.fbr.om.core.set.quantities.time.Time;
import nl.wur.fbr.om.exceptions.QuantityCreationException;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.math.equations.ConditionalExpression;
import nl.wur.fbr.om.math.equations.Equation;
import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.impl.MathProcessorImpl;
import nl.wur.fbr.om.math.impl.equations.EquationImpl;
import nl.wur.fbr.om.math.impl.equations.ExpressionImpl;
import nl.wur.fbr.om.model.QuantitySet;
import nl.wur.fbr.om.model.measures.Measure;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for expressions.
 * @author Don Willems on 05/10/15.
 */
public class ExpressionTest {

    @Test
    public void testExpressionAddition() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        CoreQuantitySet quantitySet = new CoreQuantitySet();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
        Expression expression = new ExpressionImpl(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression addition = expression.add(length2);
            {
                Radius radius = (Radius) QuantitySet.createQuantity(CoreQuantitySet.RADIUS);
                Equation equation = new EquationImpl(radius, ConditionalExpression.EQUAL_TO, addition);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
            {
                Time time = (Time) QuantitySet.createQuantity(CoreQuantitySet.TIME);
                Equation equation = new EquationImpl(time, ConditionalExpression.EQUAL_TO, addition);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Temperature temperature = (Temperature) QuantitySet.createQuantity(CoreQuantitySet.TEMPERATURE);
            Expression addition = expression.add(temperature);
            {
                Radius radius = (Radius) QuantitySet.createQuantity(CoreQuantitySet.RADIUS);
                Equation equation = new EquationImpl(radius, ConditionalExpression.EQUAL_TO, addition);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
    }

    @Test
    public void testExpressionAdditionWithValues() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(14,CoreUnitAndScaleSet.METRE));
        Expression expression = new ExpressionImpl(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(10,CoreUnitAndScaleSet.METRE));
            Expression addition = expression.add(length2);
            {
                Expression result = addition.evaluate();
                Measure expectedResult = factory.createMeasure(24, CoreUnitAndScaleSet.METRE);
                Measure resultMeasure = result.getMeasure();
                boolean equals = factory.equals(expectedResult,resultMeasure,0.00000001);
                Assert.assertEquals("Test evaluation result of " + addition, expectedResult.getScalarValue(), result.getMeasure().getScalarValue(), 0.0000001);
                Assert.assertTrue("Test evaluation result of " + addition, equals);
            }
        }
    }

    @Test
    public void testExpressionSubtraction() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
        Expression expression = new ExpressionImpl(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression subtraction = expression.subtract(length2);
            {
                Radius radius = (Radius) QuantitySet.createQuantity(CoreQuantitySet.RADIUS);
                Equation equation = new EquationImpl(radius, ConditionalExpression.EQUAL_TO, subtraction);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
            {
                Time time = (Time) QuantitySet.createQuantity(CoreQuantitySet.TIME);
                Equation equation = new EquationImpl(time, ConditionalExpression.EQUAL_TO, subtraction);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Temperature temperature = (Temperature) QuantitySet.createQuantity(CoreQuantitySet.TEMPERATURE);
            Expression subtraction = expression.subtract(temperature);
            {
                Radius radius = (Radius) QuantitySet.createQuantity(CoreQuantitySet.RADIUS);
                Equation equation = new EquationImpl(radius, ConditionalExpression.EQUAL_TO, subtraction);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
    }

    @Test
    public void testExpressionSubtractionWithValues() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(14,CoreUnitAndScaleSet.METRE));
        Expression expression = new ExpressionImpl(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(10,CoreUnitAndScaleSet.METRE));
            Expression subtraction = expression.subtract(length2);
            {
                Expression result = subtraction.evaluate();
                Measure expectedResult = factory.createMeasure(4, CoreUnitAndScaleSet.METRE);
                Measure resultMeasure = result.getMeasure();
                boolean equals = factory.equals(expectedResult,resultMeasure,0.00000001);
                Assert.assertEquals("Test evaluation result of " + subtraction, expectedResult.getScalarValue(), result.getMeasure().getScalarValue(), 0.0000001);
                Assert.assertTrue("Test evaluation result of " + subtraction, equals);
            }
        }
    }

    @Test
    public void testExpressionMultiplication() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
        Expression expression = new ExpressionImpl(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression multiplication = expression.multiply(length2);
            {
                Area area = (Area) QuantitySet.createQuantity(CoreQuantitySet.AREA);
                Equation equation = new EquationImpl(area, ConditionalExpression.EQUAL_TO, multiplication);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
            {
                Length length3 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length3, ConditionalExpression.EQUAL_TO, multiplication);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
    }

    /*
    @Test
    public void testExpressionMultiplicationWithValues() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(14,CoreUnitAndScaleSet.METRE));
        Expression expression = new ExpressionImpl(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(10,CoreUnitAndScaleSet.METRE));
            Expression multiplication = expression.multiply(length2);
            {
                Expression result = multiplication.evaluate();
                Measure expectedResult = factory.createMeasure(140, CoreUnitAndScaleSet.SQUARE_METRE);
                Measure resultMeasure = result.getMeasure();
                boolean equals = factory.equals(expectedResult,resultMeasure,0.00000001);
                Assert.assertEquals("Test evaluation result of " + multiplication, expectedResult.getScalarValue(), result.getMeasure().getScalarValue(), 0.0000001);
                Assert.assertTrue("Test evaluation result of " + multiplication, equals);
            }
        }
    }
    */

    @Test
    public void testExpressionDivision() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Area area = (Area) QuantitySet.createQuantity(CoreQuantitySet.AREA);
        Expression expression = new ExpressionImpl(area);
        {
            Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression division = expression.divide(length1);
            {
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, division);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
            {
                Area area2 = (Area) QuantitySet.createQuantity(CoreQuantitySet.AREA);
                Equation equation = new EquationImpl(area2, ConditionalExpression.EQUAL_TO, division);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
    }

    @Test
    public void testExpressionSine() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression sine = expression.sin();
            System.out.println(sine.toString());
            Assert.assertTrue("Test dimensional consistency of " + sine, sine.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression lsine = sine.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + lsine, lsine.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, lsine);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression expression = new ExpressionImpl(length);
            Expression sine = expression.sin();
            System.out.println(sine.toString());
            Assert.assertFalse("Test dimensional consistency of " + sine, sine.isDimensionalConsistent());
        }
    }
}
