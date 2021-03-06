package nl.wur.fbr.om.om20.set;

import nl.wur.fbr.om.model.scales.Scale;

import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.core.impl.scales.ScaleImpl;
import nl.wur.fbr.om.core.impl.units.*;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.core.impl.points.PointImpl;
import java.util.Set;
import org.apache.commons.lang3.Range;
import java.util.HashSet;
import nl.wur.fbr.om.prefixes.*;

/**
 * This class contains all identifiers for units and scales defined in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Thu Aug 13 21:23:54 CEST 2015.
 */
public class OM extends UnitAndScaleSet {

	public static Unit Decasievert;

	/** The statvolt is a unit of electric potential defined as 2.997925e2 volt. */
	public static Unit Statvolt;

	/** Megametre per second is a unit of speed defined as megametre divided by second. */
	public static Unit MegametrePerSecondTime;

	/** The attohertz is a unit of frequency defined as 1.0e-18 hertz. */
	public static Unit Attohertz;

	/** The petagray is a unit of absorbed dose defined as 1.0e15 gray. */
	public static Unit Petagray;

	/** The terametre is a unit of length defined as 1.0e12 metre. */
	public static Unit Terametre;

	/** Metre per yottasecond is a unit of speed defined as metre divided by yottasecond. */
	public static Unit MetrePerYottasecondTime;

	public static Unit Yoctosievert;

	public static Unit Gigasiemens;

	public static Unit DecasecondTimeSquared;

	/** Metre per microsecond squared is a unit of acceleration defined as metre divided by microsecond squared. */
	public static Unit MetrePerMicrosecondTimeSquared;

	public static Unit Zebibit;

	public static Unit Jansky;

	/** The apothecaries' ounce is a unit of mass defined as 3.110348e-2 kilogram. */
	public static Unit OunceApothecaries;

	/** The yoctohenry is a unit of inductance defined as 1.0e-24 henry. */
	public static Unit Yoctohenry;

	/** The oersted is a unit of magnetic field defined as 7.957747e1 ampere per metre. */
	public static Unit Oersted;

	public static Unit Gigaweber;

	/** Zettagram per litre is a unit of density defined as zettagram divided by litre. */
	public static Unit ZettagramPerLitre;

	/** The microhertz is a unit of frequency defined as 1.0e-6 hertz. */
	public static Unit Microhertz;

	/** The yottajoule is a unit of energy defined as 1.0e24 joule. */
	public static Unit Yottajoule;

	/** Metre per megasecond squared is a unit of acceleration defined as metre divided by megasecond squared. */
	public static Unit MetrePerMegasecondTimeSquared;

	/** The gigakatal is a unit of catalytic activity defined as 1.0e9 katal. */
	public static Unit Gigakatal;

	/** The decakelvin is a unit of thermodynamic temperature defined as 1.0e1 kelvin. */
	public static Unit Decakelvin;

	public static Unit Megasiemens;

	/** The petaampere is a unit of electric current defined as 1.0e15 ampere. */
	public static Unit Petaampere;

	/** Gram per yoctolitre is a unit of density defined as gram divided by yoctolitre. */
	public static Unit GramPerYoctolitre;

	/** The picokatal is a unit of catalytic activity defined as 1.0e-12 katal. */
	public static Unit Picokatal;

	public static Unit Kilolux;

	/** The ampere is a unit of electric current defined as the constant current that produces an attractive force of 2e–7 newton per metre of length between two straight, parallel conductors of infinite length and negligible circular cross section placed one metre apart in a vacuum. */
	public static Unit Ampere;

	/** Metre per hectosecond squared is a unit of acceleration defined as metre divided by hectosecond squared. */
	public static Unit MetrePerHectosecondTimeSquared;

	public static Unit Picoweber;

	public static Unit Decisievert;

	public static Unit CandelaSteradian;

	public static Unit SquareMicrometre;

	/** The hectobecquerel is a unit of activity defined as 1.0e2 becquerel. */
	public static Unit Hectobecquerel;

	public static Unit WattPerCubicmetre;

	/** The petagram is a unit of mass defined as 1.0e15 gram. */
	public static Unit Petagram;

	/** The desserspoon is a unit of volume defined as 2 teaspoon. */
	public static Unit Dessertspoon;

	public static Unit CubicMegametre;

	public static Unit DecisecondTime;

	/** The tesla is a unit of magnetic flux density defined as volt times second divided by square metre = newton divided by ampere times metre = weber divided by square metre = kilogram divided by coulomb times second = kilogram divided by ampere times second squared. */
	public static Unit Tesla;

	/** The avoirdupois pound is a unit of mass defined as 4.535924e-1 kilogram. */
	public static Unit PoundAvoirdupois;

	public static Unit FemtomolePerMetre;

	public static Unit Kilolitre;

	/** The yottametre is a unit of length defined as 1.0e24 metre. */
	public static Unit Yottametre;

	public static Unit Exasievert;

	/** The petamolair is a unit of amount of substance concentration defined as 1.0e15 molair. */
	public static Unit Petamolair;

	/** The millimetre of mercury is a unit of pressure defined as 1.0e-3 metre of mercury. */
	public static Unit MillimetreOfMercury;

	/** Gram per nanolitre is a unit of density defined as gram divided by nanolitre. */
	public static Unit GramPerNanolitre;

	/** The inch is a unit of length defined as 2.54e-2 metre. */
	public static Unit Inch;

	public static Unit Megabit;

	public static Unit PicosecondTime;

	public static Unit SquareMetrePerSquareMetreDay;

	public static Unit Nanopascal;

	public static Unit TonnePerHectare;

	public static Unit Megasievert;

	public static Unit Hectolitre;

	/** Hectometre per second squared is a unit of acceleration defined as hectometre divided by second squared. */
	public static Unit HectometrePerSecondTimeSquared;

	/** The International Table British thermal unit is a unit of energy defined as 1.055056e3 joule. */
	public static Unit BritishThermalUnitInternationalTable;

	public static Unit DegreeCelsiusPerHour;

	/** Gram per cubic centimetre is a unit of density defined as gram divided by cubic centimetre. */
	public static Unit GramPerCubicCentimetre;

	public static Unit Exatesla;

	/** The centikelvin is a unit of temperature defined as 1.0e-2 kelvin. */
	public static Unit Centikelvin;

	/** The exakelvin is a unit of thermodynamic temperature defined as 1.0e18 kelvin. */
	public static Unit Exakelvin;

	public static Unit Gigasievert;

	public static Unit MillimolePerMetre;

	/** The gon is a unit of angle defined as 1.570796e-2 radian. */
	public static Unit Gon;

	public static Unit MolePerMicrometre;

	public static Unit Zettapascal;

	public static Unit Millivolt;

	public static Unit Petamole;

	public static Unit Exasiemens;

	/** The centihenry is a unit of inductance defined as 1.0e-2 henry. */
	public static Unit Centihenry;

	public static Unit LumenSecondTime;

	/** The megafarad is a unit of capacitance defined as 1.0e6 farad. */
	public static Unit Megafarad;

	/** The rem is a unit of dose equivalent defined as 1.0e-2 sievert. */
	public static Unit Rem;

	public static Unit ReciprocalHenry;

	/** The femtocandela is a unit of luminous intensity defined as 1.0e-15 candela. */
	public static Unit Femtocandela;

	public static Unit Teratesla;

	public static Unit Zeptolitre;

	/** The decahertz is a unit of frequency defined as 1.0e1 hertz. */
	public static Unit Decahertz;

	public static Unit SquareMetrePerSquareMetre;

	/** The metre is a unit of length defined as the length of the path travelled by light in vacuum during a time interval of 1/299 792 458 of a second. */
	public static Unit Metre;

	public static Unit SquareExametre;

	/** The zeptcandela is a unit of luminous intensity defined as 1.0e-21 candela. */
	public static Unit Zeptocandela;

	/** The cicular mil is a unit of area defined as 5.067075e-10 square metre. */
	public static Unit CircularMil;

	/** Mole per exalitre is a unit of amount of substance concentration defined as mole divided by exalitre. */
	public static Unit MolePerExalitre;

	/** The atronomical unit is a unit of length defined as 149 597 870 700 metre (IAU 2012 Resolution). */
	public static Unit AstronomicalUnit;

	public static Unit KelvinKilogram;

	public static Scale RankineScale;

	public static Unit Exavolt;

	public static Unit MillisecondTime;

	/** Mole per cubic metre is a unit of amount of substance concentration defined as mole divided by cubic metre. */
	public static Unit MolePerCubicmetre;

	public static Unit MegasecondTimeSquared;

	public static Unit Millimole;

	public static Unit Zettasiemens;

	public static Unit Millisteradian;

	/** The decihenry is a unit of inductance defined as 1.0e-1 henry. */
	public static Unit Decihenry;

	public static Unit Nanoweber;

	/** The biot is a unit of electric current defined as 10 ampere. */
	public static Unit Biot;

	/** Parts per million is a unit of dimension one defined as 1/1 000 000. */
	public static Unit PartsPerMillion;

	/** The abampere is a unit of electric current defined as 10 ampere. */
	public static Unit Abampere;

	public static Unit Zettasievert;

	public static Unit Yottatesla;

	/** The terajoule is a unit of energy defined as 1.0e12 joule. */
	public static Unit Terajoule;

	public static Unit Milliwatt;

	public static Unit ReciprocalDegreeCelsiusDay;

	public static Unit Gigayear;

	public static Unit Exbibyte;

	/** The nanocoulomb is a unit of electric charge defined as 1.0e-9 coulomb. */
	public static Unit Nanocoulomb;

	/** The US dry gallon is a unit of volume defined as 4.40488377086e-3 cubic metre. */
	public static Unit DryGallonUS;

	/** The foot is a unit of foot defined as 3.048e-1 metre. */
	public static Unit Foot;

	/** The microsecond (angle) is a unit of length defined as 1.0e-6 second (angle). Used in astronomy (measurements of positions of stars, galaxies, etc.) to represent the error. */
	public static Unit MicrosecondAngle;

	/** The exametre is a unit of length defined as 1.0e18 metre. */
	public static Unit Exametre;

	public static Unit ReciprocalYear;

	/** The statfarad is a unit of capacitance defined as 1.112650e-12 farad. */
	public static Unit Statfarad;

	public static Unit SecondTimeSquared;

	/** Femtometre per second is a unit of speed defined as femtometre divided by second. */
	public static Unit FemtometrePerSecondTime;

	public static Unit Femtopascal;

	public static Unit CentimolePerMetre;

	public static Unit Deciradian;

	/** Gram per picolitre is a unit of density defined as gram divided by picolitre. */
	public static Unit GramPerPicolitre;

	public static Unit Megawatt;

	public static Unit MicromolePerMole;

	public static Unit ErgSecondTime;

	/** Mole per millilitre is a unit of amount of substance concentration defined as mole divided by millilitre. */
	public static Unit MolePerMillilitre;

	public static Unit SecondTimeToThePower2;

	public static Unit NanosecondTimeSquared;

	public static Unit ZeptosecondTime;

	/** The attohenry is a unit of inductance defined as 1.0e-18 henry. */
	public static Unit Attohenry;

	/** The milligray is a unit of absorbed dose defined as 1.0e-3 gray. */
	public static Unit Milligray;

	public static Unit CubicMillimetre;

	/** The hectomolair is a unit of amount of substance concentration defined as 1.0e2 molair. */
	public static Unit Hectomolair;

	/** The yottakelvin is a unit of thermodynamic temperature defined as 1.0e24 kelvin. */
	public static Unit Yottakelvin;

	public static Unit NanosecondTime;

	/** The rhe is a unit of fluidity defined as 10 reciprocal pascal second (time). */
	public static Unit Rhe;

	public static Unit JoulePerSquareMetre;

	/** Metre per petasecond squared is a unit of acceleration defined as metre divided by petasecond squared. */
	public static Unit MetrePerPetasecondTimeSquared;

	/** The milligram is a unit of mass defined as 1.0e-3 gram. */
	public static Unit Milligram;

	public static Unit MolePerKilometre;

	public static Unit Kilolumen;

	public static Unit Yoctosiemens;

	public static Unit Zeptolumen;

	/** The terafarad is a unit of capacitance defined as 1.0e12 farad. */
	public static Unit Terafarad;

	public static Unit Exabit;

	/** Metre per megasecond is a unit of speed defined as metre divided by megasecond. */
	public static Unit MetrePerMegasecondTime;

	public static Unit Zeptoradian;

	/** The stattesla is a unit of magnetic flux density defined as 2.9979e6 tesla. */
	public static Unit Stattesla;

	/** The yoctohertz is a unit of frequency defined as 1.0e-24 hertz. */
	public static Unit Yoctohertz;

	/** The yoctodegree Celsius is a unit of temperature defined as 1.0e-24 degree Celsius. */
	public static Unit YoctodegreeCelsius;

	public static Unit LitrePer100Kilometre;

	/** Teragram per litre is a unit of density defined as teragram divided by litre. */
	public static Unit TeragramPerLitre;

	/** The microhenry is a unit of inductance defined as 1.0e-6 henry. */
	public static Unit Microhenry;

	/** The yottaampere is a unit of electric current defined as 1.0e24 ampere. */
	public static Unit Yottaampere;

	/** Zettamole per litre is a unit of amount of substance concentration defined as zettamole divided by litre. */
	public static Unit ZettamolePerLitre;

	public static Unit ReciprocalPascalSecondTime;

	/** The zettabecquerel is a unit of activity defined as 1.0e21 becquerel. */
	public static Unit Zettabecquerel;

	/** Mole per decalitre is a unit of amount of substance concentration defined as mole divided by decalitre. */
	public static Unit MolePerDecalitre;

	/** Decametre per second is a unit of speed defined as decametre divided by second. */
	public static Unit DecametrePerSecondTime;

	/** The microcoulomb is a unit of electric charge defined as 1.0e-6 coulomb. */
	public static Unit Microcoulomb;

	public static Unit Megamole;

	public static Unit Petavolt;

	public static Unit WattPerNanometre;

	public static Unit Yoctoradian;

	public static Unit Decalumen;

	/** The US liquid quart is a unit of volume defined as 9.463529e-4 cubic metre. */
	public static Unit LiquidQuartUS;

	/** De eenheid van de Hubble constante (die niet constant is!) (http://en.wikipedia.org/wiki/Hubble_constant). */
	public static Unit KilometrePerSecondTimePerMegaparsec;

	public static Unit MegaeuroPerMegawatt;

	public static Unit CubicKilometre;

	/** The centikatal is a unit of catalytic activity defined as 1.0e-2 katal. */
	public static Unit Centikatal;

	/** The petacoulomb is a unit of electric charge defined as 1.0e15 coulomb. */
	public static Unit Petacoulomb;

	public static Unit CoulombPerCubicmetre;

	public static Unit Hectovolt;

	public static Unit Kilovolt;

	public static Unit Terasiemens;

	/** Gram per petalitre is a unit of density defined as gram divided by petalitre. */
	public static Unit GramPerPetalitre;

	/** The amount of stellar mass created per cubic parsec in each billion years. */
	public static Unit SolarMassPerGigayearCubicParsec;

	/** The exagray is a unit of absorbed dose defined as 1.0e18 gray. */
	public static Unit Exagray;

	/** Mole per centilitre is a unit of amount of substance concentration defined as mole divided by centilitre. */
	public static Unit MolePerCentilitre;

	public static Unit Megalitre;

	public static Unit Attolumen;

	/** Metre per kilosecond is a unit of speed defined as metre divided by kilosecond. */
	public static Unit MetrePerKilosecondTime;

	/** The kelvin is a unit of temperature defined as 1/273.16 of the thermodynamic temperature of the triple point of water. */
	public static Unit Kelvin;

	public static Unit Zettalux;

	/** The exagram is a unit of mass defined as 1.0e18 gram. */
	public static Unit Exagram;

	/** The EC therm is a unit of energy defined as 1.05506e8 joule. */
	public static Unit ThermEC;

	/** Hectogram per litre is a unit of density defined as hectogram divided by litre. */
	public static Unit HectogramPerLitre;

	/** The kilofarad is a unit of capacitance defined as 1.0e3 farad. */
	public static Unit Kilofarad;

	/** The US fluid ounce is a unit of volume defined as 2.957353e-5 cubic metre. */
	public static Unit FluidOunceUS;

	/** The megamolair is a unit of amount of substance concentration defined as 1.0e6 molair. */
	public static Unit Megamolair;

	public static Unit Decawatt;

	public static Unit Kilobit;

	public static Unit ExamolePerMetre;

	public static Unit Terasievert;

	public static Unit SquareMetreKelvin;

	public static Unit Petaweber;

	public static Unit CubicCentimetrePerCubicCentimetre;

	public static Unit Zettawatt;

	public static Unit GramPerGram;

	/** Decametre per second squared is a unit of acceleration defined as decametre divided by second squared. */
	public static Unit DecametrePerSecondTimeSquared;

	/** The femtojoule is a unit of energy defined as 1.0e-15 joule. */
	public static Unit Femtojoule;

	/** The erg is a unit of energy defined as 1.0e-7 joule. */
	public static Unit Erg;

	public static Unit Hectolux;

	public static Unit MolePerSecondTime;

	/** Metre per petasecond is a unit of speed defined as metre divided by petasecond. */
	public static Unit MetrePerPetasecondTime;

	public static Unit Hectopascal;

	public static Unit PetasecondTime;

	/** Candela per square metre is a unit of luminance defined as candela divided by square metre. */
	public static Unit CandelaPerSquareMetre;

	/** Yoctometre per second is a unit of speed defined as yoctometre divided by second. */
	public static Unit YoctometrePerSecondTime;

	public static Unit Milliradian;

	public static Unit ExasecondTime;

	public static Unit Megalux;

	/** Terametre per second is a unit of speed defined as terametre divided by second. */
	public static Unit TerametrePerSecondTime;

	/** The farad is a unit of capacitance defined as ampere times second divided by volt = coulomb divided by volt = coulomb squared divided by joule = coulomb squared divided by newton times metre = second squared times coulomb squared divided by square metre times kilogram = second to the power 4 times ampere squared divided by square metre times kilogram. */
	public static Unit Farad;

	public static Unit GramPerSquareMetreSecondTime;

	/** The unified atomic mass unit is a unit of mass defined as 1.660538782(83)e-27 kilogram. */
	public static Unit UnifiedAtomicMassUnit;

	/** Yoctogram per litre is a unit of density defined as yoctogram divided by litre. */
	public static Unit YoctogramPerLitre;

	public static Unit DecasecondTime;

	/** The decamolair is a unit of amount of substance concentration defined as 1.0e1 molair. */
	public static Unit Decamolair;

	public static Unit MegaeuroPerMegatonne;

	/** The candela is a unit of luminous intensity defined as the luminous intensity, in a given direction, of a source that emits monochromatic radiation of frequency 540e12 hertz and that has a radiant intensity in that direction of 1/683 watt per steradian. */
	public static Unit Candela;

	public static Unit HectomolePerMetre;

	public static Unit Zettaweber;

	public static Unit JoulePerSquareMetreDay;

	/** Metre per decasecond squared is a unit of acceleration defined as metre divided by decasecond squared. */
	public static Unit MetrePerDecasecondTimeSquared;

	/** The poise is a unit of dynamic viscosity defined as 1.0e-1 pascal second (time). */
	public static Unit Poise;

	public static Unit MicrogramPerSquareMetreSecondTime;

	/** The nanohertz is a unit of frequency defined as 1.0e-9 hertz. */
	public static Unit Nanohertz;

	public static Unit PascalSecondTime;

	/** The hectoampere is a unit of electric current defined as 1.0e2 ampere. */
	public static Unit Hectoampere;

	/** The acre foot is a unit of volume defined as 1.233489e3 cubic metre. */
	public static Unit AcreFoot;

	/** The joule is a unit of energy defined as kilogram times square metre divided by second squared. */
	public static Unit Joule;

	/** The thermochemical calorie is a unit of energy defined as 4.184 joule. */
	public static Unit CalorieThermochemical;

	public static Unit MetreKilogramPerSecondTime;

	/** The kilocoulomb is a unit of electric charge defined as 1.0e3 coulomb. */
	public static Unit Kilocoulomb;

	/** The hectofarad is a unit of capacitance defined as 1.0e2 farad. */
	public static Unit Hectofarad;

	/** The millikatal is a unit of catalytic activity defined as 1.0e-3 katal. */
	public static Unit Millikatal;

	/** Decimetre per second squared is a unit of acceleration defined as decimetre divided by second squared. */
	public static Unit DecimetrePerSecondTimeSquared;

	public static Unit CentisecondTimeSquared;

	public static Unit BitPerSecondTime;

	public static Unit Exaohm;

	/** The hectojoule is a unit of energy defined as 1.0e2 joule. */
	public static Unit Hectojoule;

	/** The maxwell is a unit of magnetic flux defined as 1.0e-8 weber. */
	public static Unit Maxwell;

	public static Unit Picosievert;

	public static Unit SecondTimePerSquareMetre;

	public static Unit Millitesla;

	/** The yottafarad is a unit of capacitance defined as 1.0e24 farad. */
	public static Unit Yottafarad;

	/** Metre per zeptosecond squared is a unit of acceleration defined as metre divided by zeptosecond squared. */
	public static Unit MetrePerZeptosecondTimeSquared;

	/** The abmho is a unit of electrical conductance defined as 1.0e9 siemens. */
	public static Unit Abmho;

	/** Centimetre per second squared is a unit of acceleration defined as centimetre divided by second squared. */
	public static Unit CentimetrePerSecondTimeSquared;

	/** The kilojoule is a unit of energy defined as 1.0e3 joule. */
	public static Unit Kilojoule;

	/** Mole per decilitre is a unit of amount of substance concentration defined as mole divided by decilitre. */
	public static Unit MolePerDecilitre;

	public static Unit WattPerMetreKelvin;

	/** The centiampere is a unit of electric current defined as 1.0e-2 ampere. */
	public static Unit Centiampere;

	/** The hectogray is a unit of absorbed dose defined as 1.0e2 gray. */
	public static Unit Hectogray;

	/** Picometre per second squared is a unit of acceleration defined as picometre divided by second squared. */
	public static Unit PicometrePerSecondTimeSquared;

	public static Unit Hectomole;

	public static Unit Kilomole;

	/** The milligauss is a unit of magnetic flux density defined as 1.0e-3 gauss. */
	public static Unit Milligauss;

	/** The petakatal is a unit of catalytic activity defined as 1.0e15 katal. */
	public static Unit Petakatal;

	/** The rod is a unit of length defined as 5.029210 metre. */
	public static Unit Rod;

	/** The femtometre is a unit of length defined as 1.0e-15 metre. */
	public static Unit Femtometre;

	/** The nanohenry is a unit of inductance defined as 1.0e-9 henry. */
	public static Unit Nanohenry;

	/** The picodegree Celsius is a unit of temperature defined as 1.0e-12 degree Celsius. */
	public static Unit PicodegreeCelsius;

	public static Unit PetasecondTimeSquared;

	public static Unit OhmMetre;

	/** The zettagray is a unit of absorbed dose defined as 1.0e21 gray. */
	public static Unit Zettagray;

	/** The stokes is a unit of kinematic viscosity defined as 1.0e-4 square metre per second (time). */
	public static Unit Stokes;

	/** The yoctokelvin is a unit of temperature defined as 1.0e-24 kelvin. */
	public static Unit Yoctokelvin;

	public static Unit MolePerYoctometre;

	/** The petabecquerel is a unit of activity defined as 1.0e15 becquerel. */
	public static Unit Petabecquerel;

	public static Unit Petawatt;

	public static Unit Decinewton;

	public static Unit Attolux;

	/** The picomolair is a unit of amount of substance concentration defined as 1.0e-12 molair. */
	public static Unit Picomolair;

	public static Unit FemtosecondTime;

	/** The zettagram is a unit of mass defined as 1.0e21 gram. */
	public static Unit Zettagram;

	/** The zettamolair is a unit of amount of substance concentration defined as 1.0e21 molair. */
	public static Unit Zettamolair;

	/** The teraampere is a unit of electric current defined as 1.0e12 ampere. */
	public static Unit Teraampere;

	/** The pennyweight is a unit of mass defined as 1.555174e-3 kilogram. */
	public static Unit Pennyweight;

	public static Unit Centilux;

	/** The decahenry is a unit of inductance defined as 1.0e1 henry. */
	public static Unit Decahenry;

	/** The gigamolair is a unit of amount of substance concentration defined as 1.0e9 molair. */
	public static Unit Gigamolair;

	/** The millimagnitude is a unit of magnitude defined as 1.0e-3 magnitude. */
	public static Unit Millimagnitude;

	public static Unit Picosiemens;

	/** The femtofarad is a unit of capacitance defined as 1.0e-15 farad. */
	public static Unit Femtofarad;

	public static Unit Kilowatt;

	public static Unit VoltPerMetre;

	public static Unit Decasiemens;

	/** Solar mass is a unit used in astronomy to denote stellar or galactic masses (http://en.wikipedia.org/wiki/SolarMass). */
	public static Unit SolarMass;

	public static Unit Decalux;

	public static Unit Megatonne;

	public static Unit Examole;

	/** The phot is a unit of illuminance defined as 1.0e4 lux. */
	public static Unit Phot;

	/** Metre per nanosecond squared is a unit of acceleration defined as metre divided by nanosecond squared. */
	public static Unit MetrePerNanosecondTimeSquared;

	public static Unit Exawatt;

	/** Kilogram per gigajoule is a unit of energy consumption. */
	public static Unit KilogramPerGigajoule;

	/** Gram per gigalitre is a unit of density defined as gram divided by gigalitre. */
	public static Unit GramPerGigalitre;

	/** Terametre per second squared is a unit of acceleration defined as terametre divided by second squared. */
	public static Unit TerametrePerSecondTimeSquared;

	public static Unit Zeptonewton;

	/** The petakelvin is a unit of thermodynamic temperature defined as 1.0e15 kelvin. */
	public static Unit Petakelvin;

	/** The zeptdegree Celsius is a unit of temperature defined as 1.0e-21 degree Celsius. */
	public static Unit ZeptodegreeCelsius;

	public static Unit Femtosievert;

	public static Unit CubicYoctometre;

	/** The hectogram is a unit of mass defined as 1.0e2 gram. */
	public static Unit Hectogram;

	public static Unit Zettamole;

	public static Unit KelvinMole;

	public static Unit TeramolePerMetre;

	public static Unit MicromolePerSecondTimeGram;

	/** Nanometre per second is a unit of speed defined as nanometre divided by second. */
	public static Unit NanometrePerSecondTime;

	public static Unit Zebibyte;

	/** The kilocalorie (mean) is a unit of energy defined as 1.0e3 calorie (mean). */
	public static Unit KilocalorieMean;

	/** The millidegree Celsius is a unit of temperature defined as 1.0e-3 degree Celsius. */
	public static Unit MillidegreeCelsius;

	/** The barye is a unit of pressure defined as 0.1 pascal. */
	public static Unit Barye;

	public static Unit Yoctonewton;

	public static Unit MicronewtonMetre;

	/** Exametre per second is a unit of speed defined as exametre divided by second. */
	public static Unit ExametrePerSecondTime;

	/** Zeptometre per second is a unit of speed defined as zeptometre divided by second. */
	public static Unit ZeptometrePerSecondTime;

	public static Unit DegreeCelsiusPerSecondTime;

	public static Scale ReaumurScale;

	/** The faraday is a unit of electric charge defined as 9.648531e4 coulomb. */
	public static Unit Faraday;

	/** The terakelvin is a unit of thermodynamic temperature defined as 1.0e12 kelvin. */
	public static Unit Terakelvin;

	public static Unit MetrePerMetre;

	/** The franklin is a unit of electric charge defined as 3.335641e-10 coulomb. */
	public static Unit Franklin;

	public static Unit MolePerFemtometre;

	public static Unit GramPerSquareMetreMetre;

	public static Unit GigasecondTimeSquared;

	/** The femtohertz is a unit of frequency defined as 1.0e-15 hertz. */
	public static Unit Femtohertz;

	public static Unit CubicMicrometre;

	public static Unit ReciprocalCubicCentimetre;

	public static Unit Exaweber;

	public static Unit Femtotesla;

	public static Unit Centilumen;

	public static Unit Tebibit;

	/** The zeptometre is a unit of length defined as 1.0e-21 metre. */
	public static Unit Zeptometre;

	public static Unit AttomolePerMetre;

	public static Unit Zettavolt;

	/** The abohm is a unit of electrical resistance defined as 1.0e-9 ohm. */
	public static Unit Abohm;

	/** The decigram is a unit of mass defined as 1.0e-1 gram. */
	public static Unit Decigram;

	public static Unit MolePerMole;

	public static Unit Zeptosievert;

	/** The femtocoulomb is a unit of electric charge defined as 1.0e-15 coulomb. */
	public static Unit Femtocoulomb;

	public static Unit Zettabit;

	/** The gigahertz is a unit of frequency defined as 1.0e9 hertz. */
	public static Unit Gigahertz;

	public static Unit MegajoulePerSquareMetreDay;

	/** Gram per exalitre is a unit of density defined as gram divided by exalitre. */
	public static Unit GramPerExalitre;

	/** Zeptometre per second squared is a unit of acceleration defined as zeptometre divided by second squared. */
	public static Unit ZeptometrePerSecondTimeSquared;

	/** The cup is a unit of volume defined as 2.365882e-4 cubic metre. */
	public static Unit Cup;

	public static Unit SquarePicometre;

	public static Unit Teranewton;

	/** The US survey mile is a unit of length defined as 1.609347e3 metre. */
	public static Unit MileUSSurvey;

	/** The shake is a unit of time defined as 1.0e-8 second. */
	public static Unit Shake;

	/** The hour is a unit of time defined as 3600 second. */
	public static Unit Hour;

	/** The decigray is a unit of absorbed dose defined as 1.0e-1 gray. */
	public static Unit Decigray;

	public static Unit CubicMetrePerMole;

	/** Nanogram per litre is a unit of density defined as nanogram divided by litre. */
	public static Unit NanogramPerLitre;

	/** The millibecquerel is a unit of activity defined as 1.0e-3 becquerel. */
	public static Unit Millibecquerel;

	/** Wordt gebruikt als hoek (360°=24) voor o.a. rechte klimming. De h wordt meestal als superscript achter de waarde gezet gevolgd door de verdere opdeling naar minuten en seconden. Zoals in 5h34m12s09. Vaak wordt de fractie in seconden zonder punt geschreven, de s wordt als afscheiding gebruikt (http://en.wikipedia.org/wiki/Right_ascension). */
	public static Unit HourHourAngle;

	public static Unit Picotesla;

	/** Metre per hectosecond is a unit of speed defined as metre divided by hectosecond. */
	public static Unit MetrePerHectosecondTime;

	public static Unit Microweber;

	/** The are is a unit of area defined as 100 square metre. */
	public static Unit Are;

	public static Unit MetreToThePower2ReciprocalMetre;

	public static Unit MoleMicrometreReciprocalSquareCentimetre;

	public static Unit Yottamole;

	public static Unit Zeptosiemens;

	public static Unit Attoradian;

	public static Unit Decisteradian;

	public static Unit Pebibyte;

	public static Unit MolePerHectometre;

	public static Unit Megabyte;

	/** The decafarad is a unit of capacitance defined as 1.0e1 farad. */
	public static Unit Decafarad;

	/** Gram per zeptolitre is a unit of density defined as gram divided by zeptolitre. */
	public static Unit GramPerZeptolitre;

	public static Unit Tebibyte;

	/** The picokelvin is a unit of temperature defined as 1.0e-12 kelvin. */
	public static Unit Picokelvin;

	/** The petametre is a unit of length defined as 1.0e15 metre. */
	public static Unit Petametre;

	public static Unit CoulombPerVolt;

	public static Unit Hectowatt;

	/** Megametre per second squared is a unit of acceleration defined as megametre divided by second squared. */
	public static Unit MegametrePerSecondTimeSquared;

	/** Mole per gigalitre is a unit of amount of substance concentration defined as mole divided by gigalitre. */
	public static Unit MolePerGigalitre;

	public static Unit WattPerAmpere;

	public static Unit SecondAngleSquared;

	public static Unit Kibibyte;

	/** The microkatal is a unit of catalytic activity defined as 1.0e-6 katal. */
	public static Unit Microkatal;

	/** The petajoule is a unit of energy defined as 1.0e15 joule. */
	public static Unit Petajoule;

	public static Unit HenryPerMetre;

	public static Unit Picosteradian;

	/** Millimole per litre is a unit of amount of substance concentration defined as millimole divided by litre. */
	public static Unit MillimolePerLitre;

	/** The hectometre is a unit of length defined as 1.0e2 metre. */
	public static Unit Hectometre;

	/** The ATA pica is a unit of length defined as 12 point (ATA). */
	public static Unit PicaATA;

	public static Unit JoulePerKelvinMole;

	/** The decikatal is a unit of catalytic activity defined as 1.0e-1 katal. */
	public static Unit Decikatal;

	public static Unit Megapascal;

	/** The millimolair is a unit of amount of substance concentration defined as 1.0e-3 molair. */
	public static Unit Millimolair;

	/** The teramolair is a unit of amount of substance concentration defined as 1.0e12 molair. */
	public static Unit Teramolair;

	public static Unit PicomolePerMetre;

	public static Unit Deciweber;

	/** The micromolair is a unit of amount of substance concentration defined as 1.0e-6 molair. */
	public static Unit Micromolair;

	public static Unit Decimole;

	/** The exakatal is a unit of catalytic activity defined as 1.0e18 katal. */
	public static Unit Exakatal;

	public static Unit JoulePerMole;

	/** Gram per hectolitre is a unit of density defined as gram divided by hectolitre. */
	public static Unit GramPerHectolitre;

	/** The attocandela is a unit of luminous intensity defined as 1.0e-18 candela. */
	public static Unit Attocandela;

	public static Unit MoleMicrometreReciprocalSquareCentimetreReciprocalSecondTime;

	public static Unit Yottawatt;

	/** The decabecquerel is a unit of activity defined as 1.0e1 becquerel. */
	public static Unit Decabecquerel;

	/** The nanoampere is a unit of electric current defined as 1.0e-9 ampere. */
	public static Unit Nanoampere;

	/** Metre per millisecond is a unit of speed defined as metre divided by millisecond. */
	public static Unit MetrePerMillisecondTime;

	public static Unit Microlux;

	/** Cubic metre is a unit of volume defined as the volume of a cube whose sides measure exactly one metre. */
	public static Unit CubicMetre;

	public static Unit Decanewton;

	/** The microbar is a unit of pressure defined as 1.0e-6 bar. */
	public static Unit Microbar;

	/** The femtoampere is a unit of electric current defined as 1.0e-15 ampere. */
	public static Unit Femtoampere;

	public static Unit LitrePerHour;

	public static Unit PartsPerMillionPerYear;

	public static Unit WeberPerSquareMetre;

	/** The picometre is a unit of length defined as 1.0e-12 metre. */
	public static Unit Picometre;

	/** The litre is a unit of volume defined as 1.0e-3 cubic metre. */
	public static Unit Litre;

	/** The knot is a unit of speed defined as nautical mile per hour. */
	public static Unit Knot;

	public static Unit SquareMetreNanometre;

	public static Unit WattPerSteradian;

	/** The zeptjoule is a unit of energy defined as 1.0e-21 joule. */
	public static Unit Zeptojoule;

	public static Unit Centilitre;

	public static Unit MetreKilogram;

	/** The femtobecquerel is a unit of activity defined as 1.0e-15 becquerel. */
	public static Unit Femtobecquerel;

	/** Metre per exasecond is a unit of speed defined as metre divided by exasecond. */
	public static Unit MetrePerExasecondTime;

	/** The gigacandela is a unit of luminous intensity defined as 1.0e9 candela. */
	public static Unit Gigacandela;

	public static Unit Yottalumen;

	public static Unit GramPerMegajoule;

	/** The teracandela is a unit of luminous intensity defined as 1.0e12 candela. */
	public static Unit Teracandela;

	public static Unit MetrePerSecondTimePerMetre;

	/** Metre per decisecond is a unit of speed defined as metre divided by decisecond. */
	public static Unit MetrePerDecisecondTime;

	/** The water horsepower is a unit of power defined as 7.46043e2 watt. */
	public static Unit HorsepowerWater;

	public static Unit KilomolePerMetre;

	public static Unit DegreeCelsiusDay;

	/** The sidereal minute is a unit of time defined as 5.983617e1 second. */
	public static Unit MinuteSidereal;

	/** The abcoulomb is a unit of electric charge defined as 10 coulomb. */
	public static Unit Abcoulomb;

	public static Unit ZettasecondTimeSquared;

	public static Unit Yoctolumen;

	public static Unit ReciprocalGram;

	/** The microfarad is a unit of capacitance defined as 1.0e-6 farad. */
	public static Unit Microfarad;

	public static Unit KilowattHour;

	public static Unit Petatesla;

	public static Unit N1000ColonyFormingUnit;

	/** The carat (mass) is a unit of mass defined as 2.0e-4 kilogram. */
	public static Unit CaratMass;

	/** Microgram per litre is a unit of density defined as microgram divided by litre. */
	public static Unit MicrogramPerLitre;

	public static Unit YottasecondTime;

	public static Unit MolePerZeptometre;

	/** The zettahenry is a unit of inductance defined as 1.0e21 henry. */
	public static Unit Zettahenry;

	/** The boiler horsepower is a unit of power defined as 9.80950e3 watt. */
	public static Unit HorsepowerBoiler;

	/** Solar radius is a unit used in astronomy to denote stellar or stellar system radii (http://en.wikipedia.org/wiki/solarRadius). */
	public static Unit SolarRadius;

	/** Milligram per litre is a unit of density defined as milligram divided by litre. */
	public static Unit MilligramPerLitre;

	/** Attometre per second is a unit of speed defined as attometre divided by second. */
	public static Unit AttometrePerSecondTime;

	/** The barn is a unit of area defined as 1.0e-28 square metre. */
	public static Unit Barn;

	public static Unit KilogramPerHectareDay;

	/** Mole per kilolitre is a unit of amount of substance concentration defined as mole divided by kilolitre. */
	public static Unit MolePerKilolitre;

	/** The millihenry is a unit of inductance defined as 1.0e-3 henry. */
	public static Unit Millihenry;

	public static Unit Terabit;

	public static Unit Nanotesla;

	public static Unit JoulePerSquareMetreSecondTime;

	/** Kilogram per cubic metre is a unit of density defined as kilogram divided by cubic metre. */
	public static Unit KilogramPerCubicmetre;

	/** The tropical year is a unit of time defined as 3.155693e7 second. */
	public static Unit YearTropical;

	public static Unit Yottapascal;

	/** The attofarad is a unit of capacitance defined as 1.0e-18 farad. */
	public static Unit Attofarad;

	public static Unit Decivolt;

	/** The US liquid pint is a unit of volume defined as 4.731765e-4 cubic metre. */
	public static Unit LiquidPintUS;

	/** The picocandela is a unit of luminous intensity defined as 1.0e-12 candela. */
	public static Unit Picocandela;

	/** The megacandela is a unit of luminous intensity defined as 1.0e6 candela. */
	public static Unit Megacandela;

	public static Unit N25Millilitre;

	public static Unit Kilosievert;

	/** The nanomolair is a unit of amount of substance concentration defined as 1.0e-9 molair. */
	public static Unit Nanomolair;

	public static Unit Megalumen;

	/** The femtokelvin is a unit of temperature defined as 1.0e-15 kelvin. */
	public static Unit Femtokelvin;

	/** The microcandela is a unit of luminous intensity defined as 1.0e-6 candela. */
	public static Unit Microcandela;

	/** Centimetre per day is a unit of speed defined as centimetre divided by day. */
	public static Unit CentimetrePerDay;

	/** Nanomole per litre is a unit of amount of substance concentration defined as nanomole divided by litre. */
	public static Unit NanomolePerLitre;

	/** The minute (time) is a unit of time defined as 60 second. */
	public static Unit MinuteTime;

	/** The abhenry is a unit of inductance defined as 1.0e-9 henry. */
	public static Unit Abhenry;

	public static Unit Teralitre;

	/** Gram per decilitre is a unit of density defined as gram divided by decilitre. */
	public static Unit GramPerDecilitre;

	public static Unit Nanolumen;

	public static Unit Zeptotesla;

	public static Unit SquareZeptometre;

	public static Unit Attolitre;

	public static Unit MolePerDecametre;

	public static Unit JoulePerCubicmetre;

	/** The decidegree Celsius is a unit of temperature defined as 1.0e-1 degree Celsius. */
	public static Unit DecidegreeCelsius;

	/** The pint is a unit of volume defined as 568.26125 millilitre. */
	public static Unit PintImperial;

	/** The tonne is a unit of mass defined as 1000 kilogram. */
	public static Unit Tonne;

	/** Mole per megalitre is a unit of amount of substance concentration defined as mole divided by megalitre. */
	public static Unit MolePerMegalitre;

	public static Unit Yobibit;

	public static Unit Zeptosteradian;

	/** The electric horsepower is a unit of power defined as 7.46e2 watt. */
	public static Unit HorsepowerElectric;

	public static Unit MegaeuroPerPetajoule;

	/** The millicandela is a unit of luminous intensity defined as 1.0e-3 candela. */
	public static Unit Millicandela;

	public static Unit ReciprocalWatt;

	public static Unit CentisecondTime;

	public static Unit Zettabyte;

	/** Gigametre per second is a unit of speed defined as gigametre divided by second. */
	public static Unit GigametrePerSecondTime;

	public static Unit Nanolitre;

	public static Unit Millinewton;

	public static Unit MetreToThePower2ReciprocalGram;

	public static Unit WattPerSquareMetre;

	public static Unit KilogramPerKilogram;

	public static Unit Decalitre;

	/** The decaampere is a unit of electric current defined as 1.0e1 ampere. */
	public static Unit Decaampere;

	public static Unit NewtonPerSquareMetre;

	public static Unit DeltaA450PerSecondTime;

	/** The degree is a unit of angle defined as 1.745329e-2 radian. */
	public static Unit Degree;

	/** Metre per day is a unit of speed defined as metre divided by day. */
	public static Unit MetrePerDay;

	public static Unit CoulombMetre;

	/** Millimetre per second is a unit of speed defined as millimetre divided by second. */
	public static Unit MillimetrePerSecondTime;

	public static Unit GramPerSquareMetreCentimetre;

	/** Decimetre per second is a unit of speed defined as decimetre divided by second. */
	public static Unit DecimetrePerSecondTime;

	public static Unit Euro;

	/** The megagray is a unit of absorbed dose defined as 1.0e6 gray. */
	public static Unit Megagray;

	/** The lambert is a unit of luminance defined as 3.183099e3 candela per square metre. */
	public static Unit Lambert;

	/** The baud is a unit of symbol rate defined as one distinct symbol change or signalling event made to the transmission medium per second in a digitally modulated signal or a line code. */
	public static Unit Baud;

	public static Unit CubicDecimetre;

	public static Unit Femtovolt;

	/** The megagram is a unit of mass defined as 1.0e6 gram. */
	public static Unit Megagram;

	public static Unit JoulePerSecondTime;

	/** The centihertz is a unit of frequency defined as 1.0e-2 hertz. */
	public static Unit Centihertz;

	public static Unit Gibibit;

	/** Metre per kilosecond squared is a unit of acceleration defined as metre divided by kilosecond squared. */
	public static Unit MetrePerKilosecondTimeSquared;

	public static Unit Femtolumen;

	/** The picoampere is a unit of electric current defined as 1.0e-12 ampere. */
	public static Unit Picoampere;

	public static Unit SquarePetametre;

	/** The imperial fluid ounce is a unit of volume defined as 2.841306e-5 cubic metre. */
	public static Unit FluidOunceImperial;

	/** Megagram per litre is a unit of density defined as megagram divided by litre. */
	public static Unit MegagramPerLitre;

	public static Unit Microsievert;

	public static Unit Yoctolux;

	/** Gram per kilolitre is a unit of density defined as gram divided by kilolitre. */
	public static Unit GramPerKilolitre;

	public static Unit CubicPetametre;

	public static Unit Mebibyte;

	/** The kilobecquerel is a unit of activity defined as 1.0e3 becquerel. */
	public static Unit Kilobecquerel;

	/** The degree Rankine is a unit of temperature defined as 5.555556e-1 kelvin. */
	public static Unit DegreeRankine;

	/** Millimetre per second squared is a unit of acceleration defined as millimetre divided by second squared. */
	public static Unit MillimetrePerSecondTimeSquared;

	public static Unit MolePerTerametre;

	public static Unit Attopascal;

	/** The zettakatal is a unit of catalytic activity defined as 1.0e21 katal. */
	public static Unit Zettakatal;

	/** Decimole per litre is a unit of amount of substance concentration defined as decimole divided by litre. */
	public static Unit DecimolePerLitre;

	public static Unit WattPerSquareMetreKelvin;

	/** The gigahenry is a unit of inductance defined as 1.0e9 henry. */
	public static Unit Gigahenry;

	public static Unit MilligramPerHectogram;

	/** Gram per microlitre is a unit of density defined as gram divided by microlitre. */
	public static Unit GramPerMicrolitre;

	/** The becquerel is a unit of activity defined as the activity of a quantity of radioactive material in which one nucleus decays per second. Algebraically it is defined as 1 divided by second. */
	public static Unit Becquerel;

	/** Mole per yottalitre is a unit of amount of substance concentration defined as mole divided by yottalitre. */
	public static Unit MolePerYottalitre;

	/** The nanokelvin is a unit of temperature defined as 1.0e-9 kelvin. */
	public static Unit Nanokelvin;

	/** The Postscript pica is a unit of length defined as 12 point (Postscript). */
	public static Unit PicaPostscript;

	public static Unit GrayPerSecondTime;

	/** The zeptfarad is a unit of capacitance defined as 1.0e-21 farad. */
	public static Unit Zeptofarad;

	/** Hectomole per litre is a unit of amount of substance concentration defined as hectomole divided by litre. */
	public static Unit HectomolePerLitre;

	public static Unit Teraohm;

	public static Unit Megavolt;

	/** Micromole per litre is a unit of amount of substance concentration defined as micromole divided by litre. */
	public static Unit MicromolePerLitre;

	/** The megahertz is a unit of frequency defined as 1.0e6 hertz. */
	public static Unit Megahertz;

	/** Nanometre per second squared is a unit of acceleration defined as nanometre divided by second squared. */
	public static Unit NanometrePerSecondTimeSquared;

	/** Decamole per litre is a unit of amount of substance concentration defined as decamole divided by litre. */
	public static Unit DecamolePerLitre;

	/** The femtomolair is a unit of amount of substance concentration defined as 1.0e-15 molair. */
	public static Unit Femtomolair;

	/** Metre per picosecond squared is a unit of acceleration defined as metre divided by picosecond squared. */
	public static Unit MetrePerPicosecondTimeSquared;

	/** The gigakelvin is a unit of thermodynamic temperature defined as 1.0e9 kelvin. */
	public static Unit Gigakelvin;

	public static Unit CubicZeptometre;

	/** The mass (in solar masses) per cubic parsec. */
	public static Unit SolarMassPerCubicParsec;

	public static Unit MegamolePerMetre;

	/** The 59 °F British thermal unit is a unit of energy defined as 1.05480e3 joule. */
	public static Unit BritishThermalUnit59F;

	/** The day is a unit of time defined as 86400 second. */
	public static Unit Day;

	public static Unit Centiohm;

	/** The attocoulomb is a unit of electric charge defined as 1.0e-18 coulomb. */
	public static Unit Attocoulomb;

	public static Unit Mebibit;

	public static Unit SiemensPerMetre;

	public static Unit Hectoohm;

	/** The kilocandela is a unit of luminous intensity defined as 1.0e3 candela. */
	public static Unit Kilocandela;

	/** The kilokelvin is a unit of thermodynamic temperature defined as 1.0e3 kelvin. */
	public static Unit Kilokelvin;

	/** The yottacoulomb is a unit of electric charge defined as 1.0e24 coulomb. */
	public static Unit Yottacoulomb;

	/** The zettacoulomb is a unit of electric charge defined as 1.0e21 coulomb. */
	public static Unit Zettacoulomb;

	/** Micrometre per second squared is a unit of acceleration defined as micrometre divided by second squared. */
	public static Unit MicrometrePerSecondTimeSquared;

	/** The microampere is a unit of electric current defined as 1.0e-6 ampere. */
	public static Unit Microampere;

	/** The technical atmosphere is a unit of pressure defined as 9.80665e4 pascal. */
	public static Unit AtmosphereTechnical;

	/** The gigaampere is a unit of electric current defined as 1.0e9 ampere. */
	public static Unit Gigaampere;

	public static Unit Kilonewton;

	/** The millihertz is a unit of frequency defined as 1.0e-3 hertz. */
	public static Unit Millihertz;

	public static Unit Microsiemens;

	public static Unit Millisiemens;

	public static Unit Pebibit;

	/** Molair is a unit of amount of substance concentration defined as 1 mole per litre. */
	public static Unit Molair;

	public static Unit Femtolitre;

	public static Unit ColonyFormingUnitPer25Millilitre;

	/** Metre per microsecond is a unit of speed defined as metre divided by microsecond. */
	public static Unit MetrePerMicrosecondTime;

	public static Unit ExasecondTimeSquared;

	public static Scale FahrenheitScale;

	/** The British hundredweight is a unit of mass defined as 5.080235e1 kilogram. */
	public static Unit HundredweightBritish;

	public static Unit HourSidereal;

	/** Yottametre per second squared is a unit of acceleration defined as yottametre divided by second squared. */
	public static Unit YottametrePerSecondTimeSquared;

	/** The terahertz is a unit of frequency defined as 1.0e12 hertz. */
	public static Unit Terahertz;

	public static Unit KilogramSecondTimeToThePower2;

	/** Decigram per litre is a unit of density defined as decigram divided by litre. */
	public static Unit DecigramPerLitre;

	/** The yoctocandela is a unit of luminous intensity defined as 1.0e-24 candela. */
	public static Unit Yoctocandela;

	/** The cord is a unit of volume defined as 3.624556 cubic metre. */
	public static Unit Cord;

	public static Unit Micronewton;

	/** Picogram per litre is a unit of density defined as picogram divided by litre. */
	public static Unit PicogramPerLitre;

	/** The petafarad is a unit of capacitance defined as 1.0e15 farad. */
	public static Unit Petafarad;

	/** The kilokatal is a unit of catalytic activity defined as 1.0e3 katal. */
	public static Unit Kilokatal;

	public static Unit Teralumen;

	public static Unit GramPerKilogram;

	public static Unit MolePermegametre;

	/** The megaparsec is a unit of length defined as 1.0e6 parsec. Gebruikt voor afstanden op de schaal van clusters. */
	public static Unit Megaparsec;

	/** Mole per yoctolitre is a unit of amount of substance concentration defined as mole divided by yoctolitre. */
	public static Unit MolePerYoctolitre;

	/** Metre per zettasecond squared is a unit of acceleration defined as metre divided by zettasecond squared. */
	public static Unit MetrePerZettasecondTimeSquared;

	/** The megahenry is a unit of inductance defined as 1.0e6 henry. */
	public static Unit Megahenry;

	/** Decagram per litre is a unit of density defined as decagram divided by litre. */
	public static Unit DecagramPerLitre;

	public static Unit Millilumen;

	public static Unit Zettaohm;

	public static Unit ReciprocalKelvin;

	public static Unit KilogramPerSecondTime;

	public static Unit Centiradian;

	public static Unit Yottalitre;

	public static Unit Picovolt;

	public static Unit Yoctolitre;

	public static Unit WattPerSteradianSquareMetreHertz;

	public static Unit DegreeSquared;

	public static Unit GramPerSquareMetreDay;

	public static Unit MilligramRAE;

	/** The TeX point is a unit of length defined as 0.01383700013837000138370001383 inch. */
	public static Unit PointTeX;

	/** The 23 °C perm is a unit of permeance defined as 5.74525e-11 kilogram per pascal second (time) square metre. */
	public static Unit Perm23C;

	public static Unit Nanonewton;

	public static Unit FaradPerMetre;

	public static Unit Millisievert;

	/** The lumen is a unit of luminous flux defined as candela times steradian = lux times square metre. */
	public static Unit Lumen;

	public static Unit SquareHectometre;

	/** The milliampere is a unit of electric current defined as 1.0e-3 ampere. */
	public static Unit Milliampere;

	/** The lux is a unit of illuminance defined as lumen divided by square metre = candela times steradian divided by square metre. */
	public static Unit Lux;

	/** The radiative intensity (in watts) of an area on the celestial sphere of 1 arcsecond by 1 arcsecond. */
	public static Unit WattPerSecondAngleSquared;

	/** The bar is a unit of pressure defined as 100 000 pascal. */
	public static Unit Bar;

	public static Unit Hectoweber;

	/** The kiloampere is a unit of electric current defined as 1.0e3 ampere. */
	public static Unit Kiloampere;

	public static Unit ZettasecondTime;

	public static Unit NewtonPerCoulomb;

	/** Metre per yoctosecond is a unit of speed defined as metre divided by yoctosecond. */
	public static Unit MetrePerYoctosecondTime;

	/** The millikelvin is a unit of temperature defined as 1.0e-3 kelvin. */
	public static Unit Millikelvin;

	/** Microram per cubic centimetre is a unit of density defined as microgram divided by cubic centimetre. */
	public static Unit MicrogramPerCubicCentimetre;

	/** The microkelvin is a unit of temperature defined as 1.0e-6 kelvin. */
	public static Unit Microkelvin;

	/** The 39 °F British thermal unit is a unit of energy defined as 1.05967e3 joule. */
	public static Unit BritishThermalUnit39F;

	/** The US hundredweight is a unit of mass defined as 4.535924e1 kilogram. */
	public static Unit HundredweightUS;

	/** Wordt gebruikt als hoek (360°=1440) voor o.a. rechte klimming. De m wordt meestal als superscript achter de waarde gezet gevolgd door de verdere opdeling naar seconden. Zoals in 5h34m12s09. Vaak wordt de fractie in seconden zonder punt geschreven, de s wordt als afscheiding gebruikt (http://en.wikipedia.org/wiki/Right_ascension). */
	public static Unit MinuteHourAngle;

	/** The ton-force is a unit of force defined as 8.896443e3 newton. */
	public static Unit TonForce;

	/** The femtokatal is a unit of catalytic activity defined as 1.0e-15 katal. */
	public static Unit Femtokatal;

	public static Unit Microohm;

	/** The 60 °F British thermal unit is a unit of energy defined as 1.05468e3 joule. */
	public static Unit BritishThermalUnit60F;

	public static Unit CubicNanometre;

	/** The degree Celsius is a unit of temperature defined as 1 kelvin. */
	public static Unit DegreeCelsius;

	/** The electronvolt is a unit of energy defined as 1.602177e-19 joule. */
	public static Unit Electronvolt;

	public static Unit WattPerSquareMetreSteradian;

	/** The yoctobecquerel is a unit of activity defined as 1.0e-24 becquerel. */
	public static Unit Yoctobecquerel;

	public static Unit Attosteradian;

	/** The picogram is a unit of mass defined as 1.0e-12 gram. */
	public static Unit Picogram;

	/** Gram per yottalitre is a unit of density defined as gram divided by yottalitre. */
	public static Unit GramPerYottalitre;

	public static Unit MicromolePerSecondTime;

	/** The centicoulomb is a unit of electric charge defined as 1.0e-2 coulomb. */
	public static Unit Centicoulomb;

	/** The decicoulomb is a unit of electric charge defined as 1.0e-1 coulomb. */
	public static Unit Decicoulomb;

	public static Unit GigayearCubicParsec;

	/** The hertz is a unit of frequency defined as 1 divided by second. */
	public static Unit Hertz;

	/** Attomole per litre is a unit of amount of substance concentration defined as attomole divided by litre. */
	public static Unit AttomolePerLitre;

	/** The picogray is a unit of absorbed dose defined as 1.0e-12 gray. */
	public static Unit Picogray;

	/** The exahertz is a unit of frequency defined as 1.0e18 hertz. */
	public static Unit Exahertz;

	public static Unit ColonyFormingUnitPerMillilitre;

	public static Unit ReciprocalDay;

	public static Unit NanomolePerMetre;

	/** The deciampere is a unit of electric current defined as 1.0e-1 ampere. */
	public static Unit Deciampere;

	public static Unit MetreToThePower2;

	public static Unit KilogramPerMole;

	/** Milligram per cubic metre is a unit of density defined as milligram divided by cubic metre. */
	public static Unit MilligramPerCubicmetre;

	/** The yoctojoule is a unit of energy defined as 1.0e-24 joule. */
	public static Unit Yoctojoule;

	/** Petametre per second squared is a unit of acceleration defined as petametre divided by second squared. */
	public static Unit PetametrePerSecondTimeSquared;

	/** The zeptampere is a unit of electric current defined as 1.0e-21 ampere. */
	public static Unit Zeptoampere;

	/** The assay ton is a unit of mass defined as 2.916667e-2 kilogram. */
	public static Unit TonAssay;

	/** Millimetre per day is a unit of speed defined as millimetre divided by day. */
	public static Unit MillimetrePerDay;

	/** The yoctocoulomb is a unit of electric charge defined as 1.0e-24 coulomb. */
	public static Unit Yoctocoulomb;

	public static Unit Millipascal;

	public static Unit TerasecondTimeSquared;

	/** The megacoulomb is a unit of electric charge defined as 1.0e6 coulomb. */
	public static Unit Megacoulomb;

	/** Petametre per second is a unit of speed defined as petametre divided by second. */
	public static Unit PetametrePerSecondTime;

	/** The centifarad is a unit of capacitance defined as 1.0e-2 farad. */
	public static Unit Centifarad;

	public static Unit Petalitre;

	/** The week is a unit of time defined as 6.04800e5 second. */
	public static Unit Week;

	/** Reciprocal metre is a unit of wavenumber defined as 1 divided by metre. */
	public static Unit ReciprocalMetre;

	public static Unit LumenPerWatt;

	/** Mole per femtolitre is a unit of amount of substance concentration defined as mole divided by femtolitre. */
	public static Unit MolePerFemtolitre;

	public static Unit Zeptoohm;

	public static Unit Yottabyte;

	/** The microdegree Celsius is a unit of temperature defined as 1.0e-6 degree Celsius. */
	public static Unit MicrodegreeCelsius;

	/** The fermi is a unit of length defined as 1.0e-15 metre. */
	public static Unit Fermi;

	public static Unit SquareAttometre;

	/** The grain is a unit of mass defined as 6.479891e-5 kilogram. */
	public static Unit Grain;

	/** The apothecaries' pound is a unit of mass defined as 3.732417e-1 kilogram. */
	public static Unit PoundApothecaries;

	public static Scale CelsiusScale;

	/** The millisecond (angle) is a unit of length defined as 1.0e-3 second (angle). Used in astronomy (measurements of positions of stars, galaxies, etc.) to represent the error. */
	public static Unit MillisecondAngle;

	/** Millimetre per hour is a unit of speed defined as millimetre divided by hour. */
	public static Unit MillimetrePerHour;

	public static Unit Microtesla;

	/** The gigabecquerel is a unit of activity defined as 1.0e9 becquerel. */
	public static Unit Gigabecquerel;

	/** Mole per hectolitre is a unit of amount of substance concentration defined as mole divided by hectolitre. */
	public static Unit MolePerHectolitre;

	/** The imperial gill is a unit of volume defined as 1.420653e-4 cubic metre. */
	public static Unit GillImperial;

	public static Unit Femtomole;

	public static Unit Piconewton;

	/** The minute (angle) is a unit of angle defined as 2.908882e-4 radian. */
	public static Unit MinuteAngle;

	/** Mole per zeptolitre is a unit of amount of substance concentration defined as mole divided by zeptolitre. */
	public static Unit MolePerZeptolitre;

	public static Unit Femtoohm;

	public static Unit Femtoweber;

	public static Unit KilogramPerHectare;

	public static Unit Petabit;

	public static Unit ReciprocalSecondTime;

	/** The decacoulomb is a unit of electric charge defined as 1.0e1 coulomb. */
	public static Unit Decacoulomb;

	/** Attogram per litre is a unit of density defined as attogram divided by litre. */
	public static Unit AttogramPerLitre;

	public static Unit Picoradian;

	public static Unit KilogramSecondTimeToThePower2ReciprocalMetre;

	/** The thermochemical British thermal unit is a unit of energy defined as 1.054350e3 joule. */
	public static Unit BritishThermalUnitThermochemical;

	public static Unit DecisecondTimeSquared;

	/** Picomole per litre is a unit of amount of substance concentration defined as picomole divided by litre. */
	public static Unit PicomolePerLitre;

	/** The nanofarad is a unit of capacitance defined as 1.0e-9 farad. */
	public static Unit Nanofarad;

	public static Unit Femtowatt;

	public static Unit KilojoulePerSquareMetreDay;

	public static Unit Picomole;

	/** Metre per decasecond is a unit of speed defined as metre divided by decasecond. */
	public static Unit MetrePerDecasecondTime;

	public static Unit Zettalumen;

	/** Micrometre per second is a unit of speed defined as micrometre divided by second. */
	public static Unit MicrometrePerSecondTime;

	public static Unit MolePerMetre;

	public static Unit AttosecondTime;

	/** The stathenry is a unit of inductance defined as 8.987552e11 henry. */
	public static Unit Stathenry;

	/** The year is a unit of time defined as 3.1536e7 second. */
	public static Unit Year;

	public static Unit MolePerGigametre;

	public static Unit ReciprocalCubicMetre;

	/** Gram per megalitre is a unit of density defined as gram divided by megalitre. */
	public static Unit GramPerMegalitre;

	/** The kilomolair is a unit of amount of substance concentration defined as 1.0e3 molair. */
	public static Unit Kilomolair;

	public static Unit LumenPerSquareMetre;

	/** Metre per centisecond squared is a unit of acceleration defined as metre divided by centisecond squared. */
	public static Unit MetrePerCentisecondTimeSquared;

	public static Unit Decitesla;

	public static Unit HectareDay;

	public static Unit Attotesla;

	public static Unit Nanowatt;

	public static Unit SquareDecimetre;

	/** The revolution is a unit of angle defined as 6.283185 radian. */
	public static Unit Revolution;

	public static Unit Picowatt;

	public static Unit Megohm;

	public static Unit YoctosecondTime;

	public static Unit SquareMetreSteradian;

	public static Unit CubicPicometre;

	/** Kilometre per second squared is a unit of acceleration defined as kilometre divided by second squared. */
	public static Unit KilometrePerSecondTimeSquared;

	/** Metre per second is a unit of speed defined as metre divided by second. */
	public static Unit MetrePerSecondTime;

	/** The amylase unit is a unit of catalytic activity. */
	public static Unit AmylaseUnit;

	public static Unit NewtonMetre;

	public static Unit CubicMetrePerYear;

	public static Unit Kiloweber;

	public static Unit Zeptoweber;

	public static Unit Petalumen;

	public static Unit ReciprocalDegreeCelsius;

	public static Unit CubicHectometre;

	/** The metre of mercury is a unit of pressure defined as 133 322 pascal. */
	public static Unit MetreOfMercury;

	/** The femtogram is a unit of mass defined as 1.0e-15 gram. */
	public static Unit Femtogram;

	public static Unit ReciprocalAtmosphereStandard;

	/** The attometre is a unit of length defined as 1.0e-18 metre. */
	public static Unit Attometre;

	/** The petacandela is a unit of luminous intensity defined as 1.0e15 candela. */
	public static Unit Petacandela;

	/** The Postscript point is a unit of length defined as 0.013888888888888888888888888888889 inch. */
	public static Unit PointPostscript;

	/** The ton of refridgeration is a unit of power defined as 3.516853e3 watt. */
	public static Unit TonOfRefridgeration;

	public static Unit ReciprocalSquareMetre;

	public static Unit CubicGigametre;

	/** Femtometre per second squared is a unit of acceleration defined as femtometre divided by second squared. */
	public static Unit FemtometrePerSecondTimeSquared;

	public static Unit Decatesla;

	public static Unit DegreeCelsiusPerMinuteTime;

	public static Unit Kibibit;

	/** The femtogray is a unit of absorbed dose defined as 1.0e-15 gray. */
	public static Unit Femtogray;

	/** The decijoule is a unit of energy defined as 1.0e-1 joule. */
	public static Unit Decijoule;

	public static Unit Femtonewton;

	/** Square metre is a unit of area defined as the area of a square whose sides measure exactly one metre. */
	public static Unit SquareMetre;

	/** Metre per exasecond squared is a unit of acceleration defined as metre divided by exasecond squared. */
	public static Unit MetrePerExasecondTimeSquared;

	public static Unit Megaeuro;

	/** The centimetre is a unit of length defined as 1.0e-2 metre. */
	public static Unit Centimetre;

	public static Unit Deciohm;

	public static Unit MegametrePerKilojoule;

	/** The picofarad is a unit of capacitance defined as 1.0e-12 farad. */
	public static Unit Picofarad;

	/** Kilomole per litre is a unit of amount of substance concentration defined as kilomole divided by litre. */
	public static Unit KilomolePerLitre;

	public static Unit ColonyFormingUnit;

	/** The röntgen is a unit of exposure to x and γ rays defined as 2.58e-4 coulomb per kilogram. */
	public static Unit Röntgen;

	/** The yottahertz is a unit of frequency defined as 1.0e24 hertz. */
	public static Unit Yottahertz;

	public static Unit Nanosiemens;

	/** The sidereal second is a unit of time defined as 9.972696e-1 second. */
	public static Unit SecondSidereal;

	public static Unit Picolitre;

	public static Unit YoctomolePerMetre;

	public static Unit Nanomole;

	/** The degree Fahrenheit is a unit of temperature defined as 5.555556e-1 kelvin. */
	public static Unit DegreeFahrenheit;

	public static Unit KilosecondTime;

	public static Unit GramPerMetre;

	/** The micrometre is a unit of length defined as 1.0e-6 metre. */
	public static Unit Micrometre;

	public static Unit Centisteradian;

	/** The nanobecquerel is a unit of activity defined as 1.0e-9 becquerel. */
	public static Unit Nanobecquerel;

	/** The picocoulomb is a unit of electric charge defined as 1.0e-12 coulomb. */
	public static Unit Picocoulomb;

	public static Unit Exapascal;

	/** The zeptmolair is a unit of amount of substance concentration defined as 1.0e-21 molair. */
	public static Unit Zeptomolair;

	public static Unit CubicMetrePerCubicmetre;

	/** The zettakelvin is a unit of thermodynamic temperature defined as 1.0e21 kelvin. */
	public static Unit Zettakelvin;

	public static Unit Nanosievert;

	/** The decimetre is a unit of length defined as 1.0e-1 metre. */
	public static Unit Decimetre;

	/** The hectokatal is a unit of catalytic activity defined as 1.0e2 katal. */
	public static Unit Hectokatal;

	public static Unit Zettalitre;

	public static Unit SquareYottametre;

	public static Unit TerawattHour;

	/** Metre per femtosecond squared is a unit of acceleration defined as metre divided by femtosecond squared. */
	public static Unit MetrePerFemtosecondTimeSquared;

	/** The centijoule is a unit of energy defined as 1.0e-2 joule. */
	public static Unit Centijoule;

	public static Unit Giganewton;

	/** Wordt gebruikt om de waargenomen verandering van de positie van sterren uit te drukken (de proper motion). */
	public static Unit MillisecondAnglePerYear;

	public static Unit JouleSecondTime;

	/** The sidereal year is a unit of time defined as 3.155815e7 second. */
	public static Unit YearSidereal;

	public static Unit MolePerZettametre;

	public static Unit JoulePerKelvin;

	public static Unit PetamolePerMetre;

	/** The attojoule is a unit of energy defined as 1.0e-18 joule. */
	public static Unit Attojoule;

	/** The decimolair is a unit of amount of substance concentration defined as 1.0e-1 molair. */
	public static Unit Decimolair;

	/** The yoctomolair is a unit of amount of substance concentration defined as 1.0e-24 molair. */
	public static Unit Yoctomolair;

	/** Gram per joule is a unit of energy consumption. */
	public static Unit GramPerJoule;

	public static Unit YottamolePerMetre;

	/** The terahenry is a unit of inductance defined as 1.0e12 henry. */
	public static Unit Terahenry;

	public static Unit Yottalux;

	public static Unit Petasievert;

	/** The curie is a unit of activity defined as 3.7e10 becquerel. */
	public static Unit Curie;

	/** Metre per decisecond squared is a unit of acceleration defined as metre divided by decisecond squared. */
	public static Unit MetrePerDecisecondTimeSquared;

	/** The henry is a unit of inductance defined as square metre times kilogram divided by second squared times ampere squared = weber divided by ampere = volt second divided by ampere = (joule divided by coulomb) times second divided by (coulomb divided by second) = joule times second squared divided by coulomb squared = square metre times kilogram divided by coulomb squared. */
	public static Unit Henry;

	/** The imperial quart is a unit of volume defined as 1.1365 litre. */
	public static Unit QuartImperial;

	public static Unit MicrogramPerJoule;

	/** The statohm is a unit of electrical resistance defined as 8.987552e11 ohm. */
	public static Unit Statohm;

	/** The exabecquerel is a unit of activity defined as 1.0e18 becquerel. */
	public static Unit Exabecquerel;

	public static Unit Millilitre;

	/** The exahenry is a unit of inductance defined as 1.0e18 henry. */
	public static Unit Exahenry;

	/** The 15 °C calorie is a unit of energy defined as 4.18580 joule. */
	public static Unit Calorie15C;

	public static Unit ZeptosecondTimeSquared;

	/** The bit is a unit of information capacity defined as the information capacity of one binary digit. */
	public static Unit Bit;

	/** The nanogray is a unit of absorbed dose defined as 1.0e-9 gray. */
	public static Unit Nanogray;

	public static Unit ZeptomolePerMetre;

	/** The TeX pica is a unit of length defined as 12 point (TeX). */
	public static Unit PicaTeX;

	public static Unit LuxSecondTime;

	/** The nanogram is a unit of mass defined as 1.0e-9 gram. */
	public static Unit Nanogram;

	public static Unit Nanosteradian;

	public static Unit MolePerNanometre;

	/** The exacoulomb is a unit of electric charge defined as 1.0e18 coulomb. */
	public static Unit Exacoulomb;

	public static Unit Kilosiemens;

	/** The gigacoulomb is a unit of electric charge defined as 1.0e9 coulomb. */
	public static Unit Gigacoulomb;

	/** The megaerg is a unit of energy defined as 1.0e6 erg. */
	public static Unit Megaerg;

	/** Mile (statute) per hour is a unit of speed defined as mile (statute) divided by hour. */
	public static Unit MileStatutePerHour;

	public static Unit Megaweber;

	/** The teracoulomb is a unit of electric charge defined as 1.0e12 coulomb. */
	public static Unit Teracoulomb;

	public static Unit MetrePerCubicmetre;

	public static Unit NewtonPerMetre;

	/** The nanometre is a unit of length defined as 1.0e-9 metre. */
	public static Unit Nanometre;

	/** Metre per zeptosecond is a unit of speed defined as metre divided by zeptosecond. */
	public static Unit MetrePerZeptosecondTime;

	public static Unit Petasiemens;

	/** The dyne is a unit of force defined as 1.0e-5 newton. */
	public static Unit Dyne;

	/** The second (angle) is a unit of angle defined as 4.848137e-6 radian. */
	public static Unit SecondAngle;

	/** Megamole per litre is a unit of amount of substance concentration defined as megamole divided by litre. */
	public static Unit MegamolePerLitre;

	/** Zettametre per second is a unit of speed defined as zettametre divided by second. */
	public static Unit ZettametrePerSecondTime;

	/** Metre per femtosecond is a unit of speed defined as metre divided by femtosecond. */
	public static Unit MetrePerFemtosecondTime;

	public static Unit MolePerPetametre;

	/** The microjoule is a unit of energy defined as 1.0e-6 joule. */
	public static Unit Microjoule;

	/** The centigray is a unit of absorbed dose defined as 1.0e-2 gray. */
	public static Unit Centigray;

	/** Metre per attosecond squared is a unit of acceleration defined as metre divided by attosecond squared. */
	public static Unit MetrePerAttosecondTimeSquared;

	public static Unit Gigawatt;

	/** The decifarad is a unit of capacitance defined as 1.0e-1 farad. */
	public static Unit Decifarad;

	/** The peck is a unit of volume defined as 8.809768e-3 cubic metre. */
	public static Unit Peck;

	/** The siemens is a unit of electrical conductance defined as 1 divided by ohm = ampere divided by volt = coulomb squared times second divided by kilogram times square metre = ampere squared times second to the power 3 divided by kilogram times square metre. */
	public static Unit Siemens;

	/** The unit pole is a unit of magnetic flux defined as 1.256637e-7 weber. */
	public static Unit UnitPole;

	public static Unit MicromolePerMetre;

	public static Unit Attowatt;

	public static Unit Centitesla;

	/** The picojoule is a unit of energy defined as 1.0e-12 joule. */
	public static Unit Picojoule;

	/** The statute mile is a unit of length defined as 1.609344e3 metre. */
	public static Unit MileStatute;

	public static Unit Zeptovolt;

	/** Metre per terasecond is a unit of speed defined as metre divided by terasecond. */
	public static Unit MetrePerTerasecondTime;

	public static Unit Centimole;

	/** The short ton is a unit of mass defined as 9.071847e2 kilogram. */
	public static Unit TonShort;

	public static Unit Terapascal;

	/** The decibecquerel is a unit of activity defined as 1.0e-1 becquerel. */
	public static Unit Decibecquerel;

	public static Unit CubicYottametre;

	public static Unit Yottavolt;

	public static Unit Yoctoohm;

	/** The statweber is a unit of magnetic flux defined as 2.9979e2 weber. */
	public static Unit Statweber;

	/** The newton is a unit of force defined as kilogram timesmetre divided by second squared. */
	public static Unit Newton;

	public static Unit Hectosiemens;

	public static Unit Exalumen;

	public static Unit Nanovolt;

	/** The byte is a unit of information capacity defined as 8 bit. */
	public static Unit Byte;

	/** Cubic metre per kilogram is a unit of specific volume defined as cubic metre divided by kilogram. */
	public static Unit CubicMetrePerKilogram;

	public static Unit DecimolePerMetre;

	/** Gigamole per litre is a unit of amount of substance concentration defined as gigamole divided by litre. */
	public static Unit GigamolePerLitre;

	/** The debye is a unit of electric dipole moment defined as 3.33564e-30 coulomb metre. */
	public static Unit Debye;

	public static Unit SquareMetrePerSecondTime;

	/** The chain is a unit of length defined as 2.011684e1 metre. */
	public static Unit Chain;

	/** The quad is a unit of energy defined as 1.0e15 British thermal unit (International Table). */
	public static Unit Quad;

	public static Unit WattPerSquareMetreHertz;

	/** The abvolt is a unit of electric potential defined as 1.0e-8 volt. */
	public static Unit Abvolt;

	/** The darcy is a unit of area defined as 9.869233e-13 square metre. */
	public static Unit Darcy;

	public static Unit DecamolePerMetre;

	/** The gilbert is a unit of electric current defined as 7.957747e-1 ampere. */
	public static Unit Gilbert;

	public static Unit HectosecondTimeSquared;

	/** The micromagnitude is a unit of magnitude defined as 1.0e-6 magnitude. */
	public static Unit Micromagnitude;

	public static Unit Yoctopascal;

	/** Nautical mile per hour is a unit of speed defined as nautical mile divided by hour. */
	public static Unit NauticalMilePerHour;

	/** Metre per picosecond is a unit of speed defined as metre divided by picosecond. */
	public static Unit MetrePerPicosecondTime;

	/** The decikelvin is a unit of temperature defined as 1.0e-1 kelvin. */
	public static Unit Decikelvin;

	public static Unit Terabyte;

	public static Unit Nanolux;

	public static Unit MicrosecondTimeSquared;

	/** The yoctoampere is a unit of electric current defined as 1.0e-24 ampere. */
	public static Unit Yoctoampere;

	/** Mole per teralitre is a unit of amount of substance concentration defined as mole divided by teralitre. */
	public static Unit MolePerTeralitre;

	/** The ATA point is a unit of length defined as 0.3514598e-3 metre. */
	public static Unit PointATA;

	public static Unit Microsteradian;

	/** The foot poundal is a unit of energy defined as 4.214011e-2 joule. */
	public static Unit FootPoundal;

	/** The attodegree Celsius is a unit of temperature defined as 1.0e-18 degree Celsius. */
	public static Unit AttodegreeCelsius;

	/** The statmho is a unit of electrical conductance defined as 1.112650e-12 siemens. */
	public static Unit Statmho;

	/** Metre per gigasecond squared is a unit of acceleration defined as metre divided by gigasecond squared. */
	public static Unit MetrePerGigasecondTimeSquared;

	/** The yottacandela is a unit of luminous intensity defined as 1.0e24 candela. */
	public static Unit Yottacandela;

	/** The long ton is a unit of mass defined as 1.016047e3 kilogram. */
	public static Unit TonLong;

	public static Unit Attomole;

	/** Yottametre per second is a unit of speed defined as yottametre divided by second. */
	public static Unit YottametrePerSecondTime;

	public static Unit MolePerYottametre;

	public static Unit Picolux;

	/** The mean British thermal unit is a unit of energy defined as 1.05587e3 joule. */
	public static Unit BritishThermalUnitMean;

	/** The centibecquerel is a unit of activity defined as 1.0e-2 becquerel. */
	public static Unit Centibecquerel;

	public static Unit Milliohm;

	/** The nautical mile is a unit of length defined as 1852 metre. */
	public static Unit NauticalMile;

	public static Unit JoulePerKelvinKilogram;

	/** Metre per terasecond squared is a unit of acceleration defined as metre divided by terasecond squared. */
	public static Unit MetrePerTerasecondTimeSquared;

	/** The decametre is a unit of length defined as 1.0e1 metre. */
	public static Unit Decametre;

	public static Unit Centiwatt;

	public static Unit SquareZettametre;

	/** The decajoule is a unit of energy defined as 1.0e1 joule. */
	public static Unit Decajoule;

	public static Unit Gigalumen;

	/** The nanojoule is a unit of energy defined as 1.0e-9 joule. */
	public static Unit Nanojoule;

	public static Unit Yoctotesla;

	/** The standard atmosphere is a unit of pressure defined as 1.01325e5 pascal. */
	public static Unit AtmosphereStandard;

	/** Kilogram per cubic decimetre is a unit of density defined as kilogram divided by cubic decimetre. */
	public static Unit KilogramPerCubicDecimetre;

	/** The yoctofarad is a unit of capacitance defined as 1.0e-24 farad. */
	public static Unit Yoctofarad;

	public static Unit Yottasiemens;

	public static Unit ColonyFormingUnitPerGram;

	public static Unit Deciwatt;

	public static Unit Attosiemens;

	/** Zettametre per second squared is a unit of acceleration defined as zettametre divided by second squared. */
	public static Unit ZettametrePerSecondTimeSquared;

	/** The hectocandela is a unit of luminous intensity defined as 1.0e2 candela. */
	public static Unit Hectocandela;

	/** Yottagram per litre is a unit of density defined as yottagram divided by litre. */
	public static Unit YottagramPerLitre;

	public static Unit Gigalitre;

	/** The megakatal is a unit of catalytic activity defined as 1.0e6 katal. */
	public static Unit Megakatal;

	public static Unit Centipascal;

	public static Unit MolePerAttometre;

	/** The second is a unit of time defined as the duration of 9 192 631 770 periods of the radiation corresponding to the transition between the two hyperfine levels of the ground state of the cesium 133 atom. */
	public static Unit SecondTime;

	/** The ohm is a unit of electrical resistance defined as volt divided by ampere = square metre times kilogram divided by second to the power 3 times ampere squared. */
	public static Unit Ohm;

	public static Unit AttosecondTimeSquared;

	/** The millicoulomb is a unit of electric charge defined as 1.0e-3 coulomb. */
	public static Unit Millicoulomb;

	public static Unit GramPerHectogram;

	public static Unit SquareNanometre;

	public static Unit CubicMillimetrePerCubicMillimetre;

	/** The attobecquerel is a unit of activity defined as 1.0e-18 becquerel. */
	public static Unit Attobecquerel;

	/** The gigaelectronvolt is a unit of energy defined as 1.0e9 electronvolt. */
	public static Unit Gigaelectronvolt;

	/** Ampere per metre is a unit of magnetic field defined as ampere divided by metre. */
	public static Unit AmperePerMetre;

	public static Unit CubicAttometre;

	/** The mil (length) is a unit of length defined as 2.54e-5 metre. */
	public static Unit MilLength;

	public static Unit Kilohm;

	/** The mil (angle) is a unit of angle defined as 9.817477e-4 radian. */
	public static Unit MilAngle;

	/** The femtodegree Celsius is a unit of temperature defined as 1.0e-15 degree Celsius. */
	public static Unit FemtodegreeCelsius;

	/** The stilb is a unit of luminance defined as 1.0e4 candela per square metre. */
	public static Unit Stilb;

	public static Unit Centivolt;

	public static Unit SteradianSquareMetreHertz;

	public static Unit PicosecondTimeSquared;

	public static Unit SquareKilometre;

	public static Unit Petanewton;

	public static Unit KelvinPerWatt;

	public static Unit CoulombPerSquareMetre;

	public static Unit MetreKelvin;

	/** The microbecquerel is a unit of activity defined as 1.0e-6 becquerel. */
	public static Unit Microbecquerel;

	public static Unit CubicParsec;

	public static Unit Centistokes;

	public static Unit Attovolt;

	public static Unit MegajoulePerSquareMetre;

	public static Unit Centipoise;

	/** The zeptkelvin is a unit of temperature defined as 1.0e-21 kelvin. */
	public static Unit Zeptokelvin;

	public static Unit N1000ColonyFormingUnitPerMillilitre;

	/** The attogray is a unit of absorbed dose defined as 1.0e-18 gray. */
	public static Unit Attogray;

	public static Unit Hectonewton;

	/** Mole per picolitre is a unit of amount of substance concentration defined as mole divided by picolitre. */
	public static Unit MolePerPicolitre;

	public static Unit CubicFemtometre;

	/** The yoctometre is a unit of length defined as 1.0e-24 metre. */
	public static Unit Yoctometre;

	public static Unit Yottasievert;

	public static Unit Gigalux;

	/** The femtohenry is a unit of inductance defined as 1.0e-15 henry. */
	public static Unit Femtohenry;

	public static Unit Teralux;

	/** The attogram is a unit of mass defined as 1.0e-18 gram. */
	public static Unit Attogram;

	public static Unit SquareDecametre;

	public static Unit Hectotesla;

	public static Unit Hectosievert;

	public static Unit TonnePerCubicmetre;

	/** Gram per zettalitre is a unit of density defined as gram divided by zettalitre. */
	public static Unit GramPerZettalitre;

	/** Centimetre per second is a unit of speed defined as centimetre divided by second. */
	public static Unit CentimetrePerSecondTime;

	/** The footlambert is a unit of luminance defined as 3.426259 candela per square metre. */
	public static Unit Footlambert;

	/** Kilogram per litre is a unit of density defined as kilogram divided by litre. */
	public static Unit KilogramPerLitre;

	/** The teaspoon is a unit of volume defined as 4.928922e-6 cubic metre. */
	public static Unit Teaspoon;

	/** The megaelectronvolt is a unit of energy defined as 1.0e6 electronvolt. */
	public static Unit Megaelectronvolt;

	/** The US dry quart is a unit of volume defined as 1.101221e-3 cubic metre. */
	public static Unit DryQuartUS;

	public static Unit MoleMicrometre;

	/** The zeptkatal is a unit of catalytic activity defined as 1.0e-21 katal. */
	public static Unit Zeptokatal;

	/** The acre is a unit of area defined as 4.046873e3 square metre. */
	public static Unit Acre;

	/** The barrel is a unit of volume defined as 1.589873e-1 cubic metre. */
	public static Unit Barrel;

	/** The kilohenry is a unit of inductance defined as 1.0e3 henry. */
	public static Unit Kilohenry;

	public static Unit Petaohm;

	public static Unit SecondTimeAmpere;

	public static Unit Attosievert;

	/** The centigram is a unit of mass defined as 1.0e-2 gram. */
	public static Unit Centigram;

	/** Metre per second squared is a unit of acceleration defined as metre divided by second squared. */
	public static Unit MetrePerSecondTimeSquared;

	/** The nanodegree Celsius is a unit of temperature defined as 1.0e-9 degree Celsius. */
	public static Unit NanodegreeCelsius;

	public static Unit NanokatalPerMilligram;

	/** The yottahenry is a unit of inductance defined as 1.0e24 henry. */
	public static Unit Yottahenry;

	public static Unit RadianPerSecondTime;

	/** The yottagray is a unit of absorbed dose defined as 1.0e24 gray. */
	public static Unit Yottagray;

	/** The sievert is a unit of dose equivalent defined as joule divided by kilogram = square metre divided by second squared. */
	public static Unit Sievert;

	/** The zettahertz is a unit of frequency defined as 1.0e21 hertz. */
	public static Unit Zettahertz;

	public static Unit KilosecondTimeSquared;

	/** The yottagram is a unit of mass defined as 1.0e24 gram. */
	public static Unit Yottagram;

	public static Unit Zeptolux;

	public static Unit WattPerSquareMetreNanometre;

	public static Unit WattPerSteradianSquareMetre;

	/** The light year is a unit of length defined as 9.46073e15 metre. */
	public static Unit LightYear;

	/** The zettacandela is a unit of luminous intensity defined as 1.0e21 candela. */
	public static Unit Zettacandela;

	/** Gram per cubic metre is a unit of density defined as gram divided by cubic metre. */
	public static Unit GramPerCubicmetre;

	/** The volt is a unit of electric potential defined as watt divided by ampere = joule divided by coulomb = newton times metre divided by ampere times second = kilogram times square metre divided by ampere times second to the power 3. */
	public static Unit Volt;

	public static Unit SquareMetreHertz;

	/** The kilometre is a unit of length defined as 1.0e3 metre. */
	public static Unit Kilometre;

	/** The US dry pint is a unit of volume defined as 5.506105e-4 cubic metre. */
	public static Unit DryPintUS;

	/** The attokatal is a unit of catalytic activity defined as 1.0e-18 katal. */
	public static Unit Attokatal;

	/** Femtomole per litre is a unit of amount of substance concentration defined as femtomole divided by litre. */
	public static Unit FemtomolePerLitre;

	/** The month is a unit of time. */
	public static Unit Month;

	/** The statcoulomb is a unit of electric charge defined as 3.335641e-10 coulomb. */
	public static Unit Statcoulomb;

	/** The mho is a unit of electrical conductance defined as 1 siemens. */
	public static Unit Mho;

	/** The weber is a unit of magnetic flux defined as kilogram times square metre divided by second squared times ampere = volt times second = joule divided by ampere. */
	public static Unit Weber;

	public static Unit Exbibit;

	public static Unit Attoohm;

	/** The pascal is a unit of pressure and stress defined as newton divided by square metre = joule divided by cubic metre = kilogram divided by metre second squared. */
	public static Unit Pascal;

	public static Unit MilligramPerKilometre;

	public static Unit SquareFemtometre;

	/** The centiare is a unit of area defined as 1.0e-2 are. */
	public static Unit Centiare;

	/** The tablespoon is a unit of volume defined as 1.478676e-5 cubic metre. */
	public static Unit Tablespoon;

	public static Unit KatalPerCubicmetre;

	/** The teragram is a unit of mass defined as 1.0e12 gram. */
	public static Unit Teragram;

	/** Zeptomole per litre is a unit of amount of substance concentration defined as zeptomole divided by litre. */
	public static Unit ZeptomolePerLitre;

	/** The parsec is a unit of length defined as 3.08567802e16 metre. */
	public static Unit Parsec;

	public static Unit ReciprocalHour;

	public static Unit CubicDecametre;

	/** The metric horsepower is a unit of power defined as 7.354988e2 watt. */
	public static Unit HorsepowerMetric;

	/** The millimetre is a unit of length defined as 1.0e-3 metre. */
	public static Unit Millimetre;

	/** The katal is a unit of catalytic activity defined as mole divided by second. */
	public static Unit Katal;

	/** The zettaampere is a unit of electric current defined as 1.0e21 ampere. */
	public static Unit Zettaampere;

	/** The zeptcoulomb is a unit of electric charge defined as 1.0e-21 coulomb. */
	public static Unit Zeptocoulomb;

	public static Unit Gigatesla;

	/** The teragray is a unit of absorbed dose defined as 1.0e12 gray. */
	public static Unit Teragray;

	/** The footcandle is a unit of illuminance defined as 1.076391e1 lux. */
	public static Unit Footcandle;

	/** The picohertz is a unit of frequency defined as 1.0e-12 hertz. */
	public static Unit Picohertz;

	public static Unit SquareGigametre;

	public static Unit MicrosecondTime;

	public static Unit PascalSecondTimeSquareMetre;

	public static Unit Femtosiemens;

	/** The kayser is a unit of wavenumber defined as 100 reciprocal metre. */
	public static Unit Kayser;

	public static Unit Gigaohm;

	/** The steradian is a unit of solid angle defined as the solid angle subtended at the center of a sphere by a portion of the surface of the sphere that has an area equal to the square of the radius of the sphere. */
	public static Unit Steradian;

	/** The torr is a unit of pressure defined as 1.333224e2 pascal. */
	public static Unit Torr;

	/** The yoctogray is a unit of absorbed dose defined as 1.0e-24 gray. */
	public static Unit Yoctogray;

	/** Gram per millilitre is a unit of density defined as gram divided by millilitre. */
	public static Unit GramPerMillilitre;

	public static Unit Attonewton;

	/** The centimetre of mercury is a unit of pressure defined as 1.0e-2 metre of mercury. */
	public static Unit CentimetreOfMercury;

	/** The imperial gallon is a unit of volume defined as 4.54609e-3 cubic metre. */
	public static Unit GallonImperial;

	public static Unit Gibibyte;

	/** Unit one is a unit of dimension one. */
	public static Unit One;

	/** Hectometre per second is a unit of speed defined as hectometre divided by second. */
	public static Unit HectometrePerSecondTime;

	public static Unit AmperePerWatt;

	public static Unit Yoctowatt;

	public static Unit CubicMetrePerSecondTime;

	public static Unit Microradian;

	public static Unit Petapascal;

	/** The gauss is a unit of magnetic flux density defined as 1.0e-4 tesla. */
	public static Unit Gauss;

	public static Unit Teravolt;

	/** Mole per microlitre is a unit of amount of substance concentration defined as mole divided by microlitre. */
	public static Unit MolePerMicrolitre;

	public static Unit Attoweber;

	/** Femtogram per litre is a unit of density defined as femtogram divided by litre. */
	public static Unit FemtogramPerLitre;

	/** The International Table calorie is a unit of energy defined as 4.1868 joule. */
	public static Unit CalorieInternationalTable;

	public static Unit MetreKilogramPerSecondTimeSquared;

	/** The gram is a unit of mass defined as 1.0e-3 kilogram. */
	public static Unit Gram;

	public static Unit SquareMetreKelvinPerWatt;

	/** The attomolair is a unit of amount of substance concentration defined as 1.0e-18 molair. */
	public static Unit Attomolair;

	/** The hectokelvin is a unit of thermodynamic temperature defined as 1.0e2 kelvin. */
	public static Unit Hectokelvin;

	/** The terakatal is a unit of catalytic activity defined as 1.0e12 katal. */
	public static Unit Terakatal;

	/** The zepthertz is a unit of frequency defined as 1.0e-21 hertz. */
	public static Unit Zeptohertz;

	public static Unit Decavolt;

	/** Gram per decalitre is a unit of density defined as gram divided by decalitre. */
	public static Unit GramPerDecalitre;

	public static Unit VoltPerWatt;

	/** Yoctometre per second squared is a unit of acceleration defined as yoctometre divided by second squared. */
	public static Unit YoctometrePerSecondTimeSquared;

	/** The nanocandela is a unit of luminous intensity defined as 1.0e-9 candela. */
	public static Unit Nanocandela;

	public static Unit Gigavolt;

	public static Unit Zeptowatt;

	public static Unit Yoctomole;

	public static Unit Zeptopascal;

	/** The exaampere is a unit of electric current defined as 1.0e18 ampere. */
	public static Unit Exaampere;

	/** Mole per litre is a unit of amount of substance concentration defined as mole divided by litre. */
	public static Unit MolePerLitre;

	public static Unit WattPerHertz;

	/** The hectohertz is a unit of frequency defined as 1.0e2 hertz. */
	public static Unit Hectohertz;

	/** Ampere per square metre is a unit of current density defined as ampere divided by square metre. */
	public static Unit AmperePerSquareMetre;

	public static Unit SquareMetreSecondTime;

	/** The terabecquerel is a unit of activity defined as 1.0e12 becquerel. */
	public static Unit Terabecquerel;

	/** The amount of stellar mass created per cubic kiloparsec in each billion years. */
	public static Unit SolarMassPerGigayearCubicKiloparsec;

	public static Unit MolePerExametre;

	public static Unit KilojoulePerHectogram;

	public static Unit CubicMetreKelvin;

	public static Unit MillisecondTimeSquared;

	public static Unit MilligramPerKilogram;

	/** The decicandela is a unit of luminous intensity defined as 1.0e-1 candela. */
	public static Unit Decicandela;

	public static Unit MolePerMillimetre;

	/** The decagram is a unit of mass defined as 1.0e1 gram. */
	public static Unit Decagram;

	/** Yoctomole per litre is a unit of amount of substance concentration defined as yoctomole divided by litre. */
	public static Unit YoctomolePerLitre;

	public static Unit CandelaPerSquareCentimetre;

	public static Unit Yoctovolt;

	/** The gigagray is a unit of absorbed dose defined as 1.0e9 gray. */
	public static Unit Gigagray;

	/** The US gallon is a unit of volume defined as 3.785412e-3 cubic metre. */
	public static Unit GallonUS;

	public static Unit Exalitre;

	/** The kilogray is a unit of absorbed dose defined as 1.0e3 gray. */
	public static Unit Kilogray;

	public static Unit CoulombPerKilogram;

	public static Unit ReciprocalPartsPerMillionPerYear;

	/** The gigagram is a unit of mass defined as 1.0e9 gram. */
	public static Unit Gigagram;

	public static Unit TerasecondTime;

	/** The mole is a unit of amount of substance defined as the amount of substance of a system that contains as many elementary entities as there are atoms in 0.012 kilogram of carbon 12. */
	public static Unit Mole;

	/** The British horsepower is a unit of power defined as 7.4570e2 watt. */
	public static Unit HorsepowerBritish;

	/** The exafarad is a unit of capacitance defined as 1.0e18 farad. */
	public static Unit Exafarad;

	/** The petahertz is a unit of frequency defined as 1.0e15 hertz. */
	public static Unit Petahertz;

	/** The abfarad is a unit of capacitance defined as 1.0e9 farad. */
	public static Unit Abfarad;

	/** The gray is a unit of absorbed dose defined as joule divided by kilogram = square metre divided by second squared. */
	public static Unit Gray;

	/** Centimole per litre is a unit of amount of substance concentration defined as centimole divided by litre. */
	public static Unit CentimolePerLitre;

	public static Unit ZettamolePerMetre;

	/** The kilogram is a unit of mass defined as the mass of the international prototype of the kilogram. */
	public static Unit Kilogram;

	/** The kilohertz is a unit of frequency defined as 1.0e3 hertz. */
	public static Unit Kilohertz;

	/** Kilometre per second is a unit of speed defined as kilometre divided by second. */
	public static Unit KilometrePerSecondTime;

	/** The decacandela is a unit of luminous intensity defined as 1.0e1 candela. */
	public static Unit Decacandela;

	/** Gram per litre is a unit of density defined as gram divided by litre. */
	public static Unit GramPerLitre;

	/** The millifarad is a unit of capacitance defined as 1.0e-3 farad. */
	public static Unit Millifarad;

	/** Wordt gebruikt als hoek (360°=864000) voor o.a. rechte klimming. De s wordt meestal als superscript achter de waarde gezet. Zoals in 5h34m12s09. Vaak wordt de fractie in seconden zonder punt geschreven, de s wordt als afscheiding gebruikt (http://en.wikipedia.org/wiki/Right_ascension). */
	public static Unit SecondHourAngle;

	public static Unit GramPerSquareMetre;

	public static Unit Kilotesla;

	/** The gal is a unit of acceleration defined as centimetre per second (time) squared. */
	public static Unit Gal;

	/** The kip is a unit of force defined as 4.448222e3 newton. */
	public static Unit Kip;

	/** The centicandela is a unit of luminous intensity defined as 1.0e-2 candela. */
	public static Unit Centicandela;

	/** The hectohenry is a unit of inductance defined as 1.0e2 henry. */
	public static Unit Hectohenry;

	public static Unit Microlitre;

	public static Unit YoctosecondTimeSquared;

	public static Unit Centinewton;

	public static Unit Zeptomole;

	/** The megabecquerel is a unit of activity defined as 1.0e6 becquerel. */
	public static Unit Megabecquerel;

	public static Unit Microwatt;

	/** The decagray is a unit of absorbed dose defined as 1.0e1 gray. */
	public static Unit Decagray;

	/** The kiloelectronvolt is a unit of energy defined as 1.0e3 electronvolt. */
	public static Unit Kiloelectronvolt;

	public static Unit MegasecondTime;

	/** Gram per femtolitre is a unit of density defined as gram divided by femtolitre. */
	public static Unit GramPerFemtolitre;

	/** The millijoule is a unit of energy defined as 1.0e-3 joule. */
	public static Unit Millijoule;

	/** The watt is a unit of power defined as joule divided by second = newton times metre divided by second = volt times ampere = kilogram times square metre divided by second to the power 3. */
	public static Unit Watt;

	/** The mean calorie is a unit of energy defined as 4.19002 joule. */
	public static Unit CalorieMean;

	/** Metre per nanosecond is a unit of speed defined as metre divided by nanosecond. */
	public static Unit MetrePerNanosecondTime;

	public static Unit Decamole;

	/** Petamole per litre is a unit of amount of substance concentration defined as petamole divided by litre. */
	public static Unit PetamolePerLitre;

	public static Unit Yobibyte;

	/** The decibar is a unit of pressure defined as 1.0e-1 bar. */
	public static Unit Decibar;

	/** The microgray is a unit of absorbed dose defined as 1.0e-6 gray. */
	public static Unit Microgray;

	/** The zeptgram is a unit of mass defined as 1.0e-21 gram. */
	public static Unit Zeptogram;

	public static Unit Zettanewton;

	/** Mole per nanolitre is a unit of amount of substance concentration defined as mole divided by nanolitre. */
	public static Unit MolePerNanolitre;

	/** The yoctogram is a unit of mass defined as 1.0e-24 gram. */
	public static Unit Yoctogram;

	/** Eenheid waarmee de helderheid van sterren wordt aangegeven. Meestal wordt het symbool niet aangeduid (http://en.wikipedia.org/wiki/Magnitude_(astronomy)). */
	public static Unit Magnitude;

	public static Unit Decilux;

	/** Gram per teralitre is a unit of density defined as gram divided by teralitre. */
	public static Unit GramPerTeralitre;

	public static Unit SteradianSquareMetre;

	/** Yottamole per litre is a unit of amount of substance concentration defined as yottamole divided by litre. */
	public static Unit YottamolePerLitre;

	public static Unit Gigabit;

	/** The millibar is a unit of pressure defined as 1.0e-3 bar. */
	public static Unit Millibar;

	public static Unit MillinewtonMetre;

	public static Unit Millilux;

	/** The sidereal day is a unit of time defined as 8.616409e4 second. */
	public static Unit DaySidereal;

	public static Unit MolePerKilogram;

	/** Kilometre per hour is a unit of speed defined as kilometre divided by hour. */
	public static Unit KilometrePerHour;

	public static Unit YottasecondTimeSquared;

	public static Unit Gigamole;

	public static Unit Decipascal;

	public static Unit Yoctosteradian;

	public static Unit Femtosteradian;

	public static Unit CubicZettametre;

	public static Unit Megatesla;

	/** The examolair is a unit of amount of substance concentration defined as 1.0e18 molair. */
	public static Unit Examolair;

	/** The percent is a unit of dimension one defined as 1/100. */
	public static Unit Percent;

	/** Mole per zettalitre is a unit of amount of substance concentration defined as mole divided by zettalitre. */
	public static Unit MolePerZettalitre;

	/** The picohenry is a unit of inductance defined as 1.0e-12 henry. */
	public static Unit Picohenry;

	public static Unit KilogramPerPascalSecondTimeSquareMetre;

	/** The slug is a unit of mass defined as 1.459390e1 kilogram. */
	public static Unit Slug;

	public static Unit Decaweber;

	public static Unit Micromole;

	/** Gram per attolitre is a unit of density defined as gram divided by attolitre. */
	public static Unit GramPerAttolitre;

	/** The zettajoule is a unit of energy defined as 1.0e21 joule. */
	public static Unit Zettajoule;

	/** Picometre per second is a unit of speed defined as picometre divided by second. */
	public static Unit PicometrePerSecondTime;

	/** The zettafarad is a unit of capacitance defined as 1.0e21 farad. */
	public static Unit Zettafarad;

	/** The zettametre is a unit of length defined as 1.0e21 metre. */
	public static Unit Zettametre;

	public static Unit CubicExametre;

	/** The zeptgray is a unit of absorbed dose defined as 1.0e-21 gray. */
	public static Unit Zeptogray;

	public static Unit Decilitre;

	public static Unit MolePerCentimetre;

	/** The US gill is a unit of volume defined as 1.182941e-4 cubic metre. */
	public static Unit GillUS;

	public static Unit Nanoradian;

	public static Unit ReciprocalCubicParsec;

	public static Unit KilogramSquareMetre;

	/** Petagram per litre is a unit of density defined as petagram divided by litre. */
	public static Unit PetagramPerLitre;

	public static Unit DeltaA450;

	/** Mole per petalitre is a unit of amount of substance concentration defined as mole divided by petalitre. */
	public static Unit MolePerPetalitre;

	/** The coulomb is a unit of electric charge defined as ampere times second = farad times volt. */
	public static Unit Coulomb;

	public static Unit CubicTerametre;

	/** The micron is a unit of length defined as 1.0e-6 metre. */
	public static Unit Micron;

	public static Unit AmperePerVolt;

	public static Unit Decapascal;

	public static Unit GigasecondTime;

	public static Unit Yoctoweber;

	public static Unit N100Kilometre;

	public static Unit RadianPerSecondTimeSquared;

	/** The US therm is a unit of energy defined as 1.054804e8 joule. */
	public static Unit ThermUS;

	public static Unit Decilumen;

	public static Unit Yottaweber;

	/** The exacandela is a unit of luminous intensity defined as 1.0e18 candela. */
	public static Unit Exacandela;

	public static Unit ReciprocalSquareCentimetre;

	public static Unit CubicKiloparsec;

	public static Unit SquareMetreDay;

	public static Unit SquareCentimetre;

	/** The degree Réaumur is a unit of temperature defined as 1.25 kelvin. */
	public static Unit DegreeReaumur;

	/** The hectocoulomb is a unit of electric charge defined as 1.0e2 coulomb. */
	public static Unit Hectocoulomb;

	/** The radian is a unit of angle defined as the angle subtended at the center of a circle by an arc that is equal in length to the radius of the circle. */
	public static Unit Radian;

	/** Examole per litre is a unit of amount of substance concentration defined as examole divided by litre. */
	public static Unit ExamolePerLitre;

	public static Unit Centiweber;

	/** The microgram is a unit of mass defined as 1.0e-6 gram. */
	public static Unit Microgram;

	/** The exajoule is a unit of energy defined as 1.0e18 joule. */
	public static Unit Exajoule;

	/** Metre per yoctosecond squared is a unit of acceleration defined as metre divided by yoctosecond squared. */
	public static Unit MetrePerYoctosecondTimeSquared;

	/** The ångström is a unit of length defined as 1.0e-10 metre. The unit is often used for wavelengths of electromagnetic radiation or to express the sizes of atoms and molecules. */
	public static Unit Angstrom;

	public static Unit Yottanewton;

	public static Unit Milliweber;

	public static Unit DeltaA450PerSecondTimePerMilligram;

	public static Unit WattSquareMetre;

	/** The yottabecquerel is a unit of activity defined as 1.0e24 becquerel. */
	public static Unit Yottabecquerel;

	/** The furlong is a unit of length defined as 201.168 metre. */
	public static Unit Furlong;

	public static Unit GigamolePerMetre;

	public static Unit Gigabyte;

	public static Unit WeberPerAmpere;

	public static Unit Petalux;

	public static Unit CubicCentimetre;

	public static Unit SquareYoctometre;

	/** The yottakatal is a unit of catalytic activity defined as 1.0e24 katal. */
	public static Unit Yottakatal;

	public static Unit Femtoradian;

	/** Metre per attosecond is a unit of speed defined as metre divided by attosecond. */
	public static Unit MetrePerAttosecondTime;

	/** The yottamolair is a unit of amount of substance concentration defined as 1.0e24 molair. */
	public static Unit Yottamolair;

	public static Unit SquareMillimetre;

	public static Unit SquareTerametre;

	public static Unit SecondTimePerDay;

	public static Unit Zettatesla;

	/** Solar luminosity is a unit used in astronomy to denote stellar or galactic radiant fluxes (http://en.wikipedia.org/wiki/SolarLuminosity). */
	public static Unit SolarLuminosity;

	/** The megajoule is a unit of energy defined as 1.0e6 joule. */
	public static Unit Megajoule;

	/** The 0 °C perm is a unit ofpermeance defined as 5.72135e-11 kilogram per pascal second (time) square metre. */
	public static Unit Perm0C;

	/** Metre per zettasecond is a unit of speed defined as metre divided by zettasecond. */
	public static Unit MetrePerZettasecondTime;

	/** The US survey foot is a unit of length defined as 3.048006e-1 metre. */
	public static Unit FootUSSurvey;

	public static Unit GramMetreToThePower2ReciprocalMetre;

	/** Centigram per litre is a unit of density defined as centigram divided by litre. */
	public static Unit CentigramPerLitre;

	public static Unit Microvolt;

	public static Unit JoulePerCubicMetreKelvin;

	/** The yard is a unit of length defined as 9.144e-1 metre. */
	public static Unit Yard;

	/** The yoctokatal is a unit of catalytic activity defined as 1.0e-24 katal. */
	public static Unit Yoctokatal;

	/** Exagram per litre is a unit of density defined as exagram divided by litre. */
	public static Unit ExagramPerLitre;

	public static Unit Yottaohm;

	/** Gigagram per litre is a unit of density defined as gigagram divided by litre. */
	public static Unit GigagramPerLitre;

	public static Unit JoulePerKilogram;

	/** The megametre is a unit of length defined as 1.0e6 metre. */
	public static Unit Megametre;

	/** The megaampere is a unit of electric current defined as 1.0e6 ampere. */
	public static Unit Megaampere;

	/** The ton of TNT is a unit of energy defined as 4.184e9 joule. */
	public static Unit TonOfTNT;

	/** The hectare is a unit of area defined as 1.0e2 are. */
	public static Unit Hectare;

	public static Unit Terawatt;

	public static Unit Picoohm;

	/** The centidegree Celsius is a unit of temperature defined as 1.0e-2 degree Celsius. */
	public static Unit CentidegreeCelsius;

	/** The shannon is a unit of information capacity defined as 1 bit. */
	public static Unit Shannon;

	/** The picobecquerel is a unit of activity defined as 1.0e-12 becquerel. */
	public static Unit Picobecquerel;

	/** The decakatal is a unit of catalytic activity defined as 1.0e1 katal. */
	public static Unit Decakatal;

	public static Unit Nanoohm;

	/** The brightness (in magnitudes) of an area on the celestial sphere of 1 arcsecond by 1 arcsecond. */
	public static Unit MagnitudePerSecondAngleSquared;

	/** Gram per centilitre is a unit of density defined as gram divided by centilitre. */
	public static Unit GramPerCentilitre;

	/** The gamma is a unit of magnetic flux density defined as 1.0e-9 tesla. */
	public static Unit Gamma;

	public static Unit Teraweber;

	/** Teramole per litre is a unit of amount of substance concentration defined as teramole divided by litre. */
	public static Unit TeramolePerLitre;

	public static Unit Exanewton;

	/** The poundal is a unit of force defined as 1.382550e-1 newton. */
	public static Unit Poundal;

	/** The zeptbecquerel is a unit of activity defined as 1.0e-21 becquerel. */
	public static Unit Zeptobecquerel;

	/** Mole per attolitre is a unit of amount of substance concentration defined as mole divided by attolitre. */
	public static Unit MolePerAttolitre;

	public static Unit NanounifiedAtomicMassUnit;

	public static Unit VoltSecondTime;

	/** The attoampere is a unit of electric current defined as 1.0e-18 ampere. */
	public static Unit Attoampere;

	/** The gigaparsec is a unit of length defined as 1.0e9 parsec. Gebruikt voor de afstand op de schaal van het heelal. */
	public static Unit Gigaparsec;

	public static Unit SquareMetrePerGram;

	/** The gigametre is a unit of length defined as 1.0e9 metre. */
	public static Unit Gigametre;

	/** The nanokatal is a unit of catalytic activity defined as 1.0e-9 katal. */
	public static Unit Nanokatal;

	/** The zepthenry is a unit of inductance defined as 1.0e-21 henry. */
	public static Unit Zeptohenry;

	/** Exametre per second squared is a unit of acceleration defined as exametre divided by second squared. */
	public static Unit ExametrePerSecondTimeSquared;

	public static Unit KilogramPerSquareMetre;

	public static Unit MolePerDecimetre;

	public static Scale KelvinScale;

	public static Unit Meganewton;

	/** The fathom is a unit of length defined as 1.828804 metre. */
	public static Unit Fathom;

	public static Unit Exabyte;

	public static Unit Micropascal;

	public static Unit Decaohm;

	public static Unit Gigapascal;

	/** The statampere is a unit of electric current defined as 3.335641e-10 ampere. */
	public static Unit Statampere;

	public static Unit Centisievert;

	/** Metre per gigasecond is a unit of speed defined as metre divided by gigasecond. */
	public static Unit MetrePerGigasecondTime;

	public static Unit Kilopascal;

	/** The 20 °C calorie is a unit of energy defined as 4.18190 joule. */
	public static Unit Calorie20C;

	/** The kiloparsec is a unit of length defined as 1.0e3 parsec. Gebruikt voor afstanden op de schaal van het melkwegstelsel. */
	public static Unit Kiloparsec;

	/** Gigametre per second squared is a unit of acceleration defined as gigametre divided by second squared. */
	public static Unit GigametrePerSecondTimeSquared;

	/** The attokelvin is a unit of temperature defined as 1.0e-18 kelvin. */
	public static Unit Attokelvin;

	public static Unit HectosecondTime;

	public static Unit Hectolumen;

	/** The avoirdupois ounce is a unit of mass defined as 2.834952e-2 kilogram. */
	public static Unit OunceAvoirdupois;

	public static Unit MolePerPicometre;

	public static Unit Picolumen;

	public static Unit Teramole;

	/** Zeptogram per litre is a unit of density defined as zeptogram divided by litre. */
	public static Unit ZeptogramPerLitre;

	/** Metre per yottasecond squared is a unit of acceleration defined as metre divided by yottasecond squared. */
	public static Unit MetrePerYottasecondTimeSquared;

	public static Unit LitrePerMole;

	/** The decihertz is a unit of frequency defined as 1.0e-1 hertz. */
	public static Unit Decihertz;

	/** The gigafarad is a unit of capacitance defined as 1.0e9 farad. */
	public static Unit Gigafarad;

	public static Unit Microlumen;

	public static Unit Yottabit;

	public static Unit VoltPerAmpere;

	/** The Didot point is a unit of length defined as 0.3759e-3 metre. */
	public static Unit PointDidot;

	/** Attometre per second squared is a unit of acceleration defined as attometre divided by second squared. */
	public static Unit AttometrePerSecondTimeSquared;

	/** The megakelvin is a unit of thermodynamic temperature defined as 1.0e6 kelvin. */
	public static Unit Megakelvin;

	/** The centimolair is a unit of amount of substance concentration defined as 1.0e-2 molair. */
	public static Unit Centimolair;

	public static Unit Kilotonne;

	public static Unit Petabyte;

	public static Unit Decisiemens;

	/** The gigajoule is a unit of energy defined as 1.0e9 joule. */
	public static Unit Gigajoule;

	public static Unit Exalux;

	/** The hartley is a unit of information capacity defined as 3.321928095 bit. */
	public static Unit Hartley;

	public static Unit Picopascal;

	/** The bushel is a unit of volume defined as 3.523907e-2 cubic metre. */
	public static Unit Bushel;

	/** Metre per millisecond squared is a unit of acceleration defined as metre divided by millisecond squared. */
	public static Unit MetrePerMillisecondTimeSquared;

	public static Unit FemtosecondTimeSquared;

	public static Unit Centisiemens;

	/** The petahenry is a unit of inductance defined as 1.0e15 henry. */
	public static Unit Petahenry;

	/** The cicero is a unit of length defined as 12 point (Didot). */
	public static Unit Cicero;

	public static Unit SquareMegametre;

	/** The stere is a unit of volume defined as cubic metre. */
	public static Unit Stere;

	/** The rad is a unit of absorbed dose defined as 1.0e-2 gray. */
	public static Unit Rad;

	public static Unit Kilobyte;

	/** Metre per centisecond is a unit of speed defined as metre divided by centisecond. */
	public static Unit MetrePerCentisecondTime;

	/** The pound-force is a unit of force defined as 4.448222 newton. */
	public static Unit PoundForce;

	/** The register ton is a unit of volume defined as 2.831658 cubic metre. */
	public static Unit TonRegister;

	public static Unit GigayearCubicKiloparsec;

	public static Unit Femtolux;

	public static Unit InternationalUnit;



    /**
     * Initializes the set by creating all units and scales in the set using the specified factory.
     * @param factory The factory to create units and scales.
     */
    @Override
    public void initialize(UnitAndScaleFactory factory) {
        if(Metre!=null) return; // has already been initialised! 
		Metre = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/metre", "metre", "m", nl.wur.fbr.om.model.dimensions.SIBaseDimension.LENGTH);
		Metre.addAlternativeName("meter","nl");
		Metre.addAlternativeName("米","zh");
		Gram = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gram", "gram", "g" );
		Kilogram = factory.createPrefixedBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogram","kilogram","kg", nl.wur.fbr.om.model.dimensions.SIBaseDimension.MASS,(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Kilogram.addAlternativeName("千克","zh");
		MetreKilogram = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/metreKilogram","metre kilogram","m.kg",Metre, Kilogram);
		MetreKilogram.addAlternativeName("meter kilogram","nl");
		MetreKilogram.addAlternativeSymbol("m kg");
		MetreKilogram.addAlternativeSymbol("m·kg");
		SecondTime = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/second-Time", "second", "s", nl.wur.fbr.om.model.dimensions.SIBaseDimension.TIME);
		SecondTime.addAlternativeName("seconde","nl");
		SecondTime.addAlternativeName("秒","zh");
		SecondTime.addAlternativeName("sec","");
		SecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/second-TimeSquared","second squared","s2",SecondTime, 2.0);
		SecondTimeSquared.addAlternativeName("seconde kwadraat","nl");
		MetreKilogramPerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metreKilogramPerSecond-TimeSquared","metre kilogram per second squared","m.kg/s2",MetreKilogram, SecondTimeSquared);
		MetreKilogramPerSecondTimeSquared.addAlternativeName("meter kilogram per seconde kwadraat","nl");
		MetreKilogramPerSecondTimeSquared.addAlternativeSymbol("m kg/s2");
		MetreKilogramPerSecondTimeSquared.addAlternativeSymbol("m kg s-2");
		MetreKilogramPerSecondTimeSquared.addAlternativeSymbol("m·kg/s2");
		MetreKilogramPerSecondTimeSquared.addAlternativeSymbol("m·kg·s-2");
		Newton = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/newton", "newton", "N", MetreKilogramPerSecondTimeSquared, 1.0 );
		NewtonMetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/newtonMetre","newton metre","N.m",Newton, Metre);
		NewtonMetre.addAlternativeName("newton meter","nl");
		NewtonMetre.addAlternativeSymbol("N m");
		NewtonMetre.addAlternativeSymbol("N·m");
		Joule = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/joule", "joule", "J", NewtonMetre, 1.0 );
		JoulePerKilogram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/joulePerKilogram","joule per kilogram","J/kg",Joule, Kilogram);
		JoulePerKilogram.addAlternativeSymbol("J kg-1");
		JoulePerKilogram.addAlternativeSymbol("J·kg-1");
		Sievert = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/sievert", "sievert", "Sv", JoulePerKilogram, 1.0 );
		Decasievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decasievert","decasievert","daSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		JoulePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/joulePerSecond-Time","joule per second","J/s",Joule, SecondTime);
		JoulePerSecondTime.addAlternativeName("joule per seconde","nl");
		JoulePerSecondTime.addAlternativeSymbol("J s-1");
		JoulePerSecondTime.addAlternativeSymbol("J·s-1");
		Watt = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/watt", "watt", "W", JoulePerSecondTime, 1.0 );
		Ampere = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/ampere", "ampere", "A", nl.wur.fbr.om.model.dimensions.SIBaseDimension.ELECTRIC_CURRENT);
		Ampere.addAlternativeName("ampère","nl");
		WattPerAmpere = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerAmpere","watt per ampere","W/A",Watt, Ampere);
		WattPerAmpere.addAlternativeName("watt per ampère","nl");
		WattPerAmpere.addAlternativeSymbol("W A-1");
		WattPerAmpere.addAlternativeSymbol("W·A-1");
		Volt = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/volt", "volt", "V", WattPerAmpere, 1.0 );
		Statvolt = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/statvolt", "statvolt", "statV", Volt, 299.7925 );
		Megametre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megametre","megametre","Mm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Megametre.addAlternativeName("megameter","nl");
		MegametrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/megametrePerSecond-Time","megametre per second","Mm/s",Megametre, SecondTime);
		MegametrePerSecondTime.addAlternativeName("megameter per seconde","nl");
		MegametrePerSecondTime.addAlternativeSymbol("Mm s-1");
		MegametrePerSecondTime.addAlternativeSymbol("Mm·s-1");
		ReciprocalSecondTime = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalSecond-Time","reciprocal second","s1/-1",SecondTime, -1.0);
		ReciprocalSecondTime.addAlternativeName("omgekeerde seconde","nl");
		ReciprocalSecondTime.addAlternativeSymbol("s-1");
		Hertz = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hertz", "hertz", "Hz", ReciprocalSecondTime, 1.0 );
		Attohertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attohertz","attohertz","aHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Gray = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gray", "gray", "Gy", JoulePerKilogram, 1.0 );
		Petagray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petagray","petagray","PGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Terametre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terametre","terametre","Tm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Terametre.addAlternativeName("terameter","nl");
		Terametre.addAlternativeName("10^9 km","");
		YottasecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottasecond-Time","yottasecond","Ys",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		YottasecondTime.addAlternativeName("yottaseconde","nl");
		MetrePerYottasecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerYottasecond-Time","metre per yottasecond","m/Ys",Metre, YottasecondTime);
		MetrePerYottasecondTime.addAlternativeName("meter per yottaseconde","nl");
		MetrePerYottasecondTime.addAlternativeSymbol("m Ys-1");
		MetrePerYottasecondTime.addAlternativeSymbol("m·Ys-1");
		Yoctosievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctosievert","yoctosievert","ySv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		AmperePerVolt = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/amperePerVolt","ampere per volt","A/V",Ampere, Volt);
		AmperePerVolt.addAlternativeName("ampère per volt","nl");
		AmperePerVolt.addAlternativeSymbol("A V-1");
		AmperePerVolt.addAlternativeSymbol("A·V-1");
		Siemens = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/siemens", "siemens", "S", AmperePerVolt, 1.0 );
		Gigasiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigasiemens","gigasiemens","GS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		DecasecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decasecond-Time","decasecond","das",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		DecasecondTime.addAlternativeName("decaseconde","nl");
		DecasecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/decasecond-TimeSquared","decasecond squared","das2",DecasecondTime, 2.0);
		DecasecondTimeSquared.addAlternativeName("decaseconde kwadraat","nl");
		MicrosecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microsecond-Time","microsecond","μs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		MicrosecondTime.addAlternativeName("microseconde","nl");
		MicrosecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/microsecond-TimeSquared","microsecond squared","μs2",MicrosecondTime, 2.0);
		MicrosecondTimeSquared.addAlternativeName("microseconde kwadraat","nl");
		MetrePerMicrosecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerMicrosecond-TimeSquared","metre per microsecond squared","m/μs2",Metre, MicrosecondTimeSquared);
		MetrePerMicrosecondTimeSquared.addAlternativeName("meter per microseconde kwadraat","nl");
		MetrePerMicrosecondTimeSquared.addAlternativeSymbol("m μs-2");
		MetrePerMicrosecondTimeSquared.addAlternativeSymbol("m·μs-2");
		Bit = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/bit", "bit", "bit", null);
		Zebibit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zebibit","zebibit","Zibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.ZEBI);
		Jansky = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/jansky", "jansky", "Jy", null);
		OunceApothecaries = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/ounceApothecaries", "ounce (apothecaries')", "oz (ap.)", Kilogram, 0.03110348 );
		OunceApothecaries.addAlternativeSymbol("oz (apoth)");
		VoltSecondTime = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/voltSecond-Time","volt second","V.s",Volt, SecondTime);
		VoltSecondTime.addAlternativeName("volt seconde","nl");
		VoltSecondTime.addAlternativeSymbol("V s");
		VoltSecondTime.addAlternativeSymbol("V·s");
		Weber = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/weber", "weber", "Wb", VoltSecondTime, 1.0 );
		WeberPerAmpere = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/weberPerAmpere","weber per ampere","Wb/A",Weber, Ampere);
		WeberPerAmpere.addAlternativeName("weber per ampère","nl");
		WeberPerAmpere.addAlternativeSymbol("Wb A-1");
		WeberPerAmpere.addAlternativeSymbol("Wb·A-1");
		Henry = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/henry", "henry", "H", WeberPerAmpere, 1.0 );
		Yoctohenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctohenry","yoctohenry","yH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		AmperePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/amperePerMetre","ampere per metre","A/m",Ampere, Metre);
		AmperePerMetre.addAlternativeName("ampère per meter","nl");
		AmperePerMetre.addAlternativeSymbol("A m-1");
		AmperePerMetre.addAlternativeSymbol("A·m-1");
		Oersted = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/oersted", "oersted", "Oe", AmperePerMetre, 79.57747 );
		Gigaweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigaweber","gigaweber","GWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Zettagram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettagram","zettagram","ZG",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		CubicMetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicMetre","cubic metre","m3",Metre, 3.0);
		CubicMetre.addAlternativeName("kubieke meter","nl");
		CubicMetre.addAlternativeName("立方米","zh");
		Litre = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/litre", "litre", "l", CubicMetre, 0.001 );
		Litre.addAlternativeName("liter","nl");
		Litre.addAlternativeSymbol("L");
		ZettagramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/zettagramPerLitre","zettagram per litre","ZG/l",Zettagram, Litre);
		ZettagramPerLitre.addAlternativeName("zettagram per liter","nl");
		ZettagramPerLitre.addAlternativeSymbol("Zg/l");
		ZettagramPerLitre.addAlternativeSymbol("Zg l-1");
		ZettagramPerLitre.addAlternativeSymbol("Zg·l-1");
		Microhertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microhertz","microhertz","μHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Yottajoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottajoule","yottajoule","YJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		MegasecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megasecond-Time","megasecond","Ms",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		MegasecondTime.addAlternativeName("megaseconde","nl");
		MegasecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/megasecond-TimeSquared","megasecond squared","Ms2",MegasecondTime, 2.0);
		MegasecondTimeSquared.addAlternativeName("megaseconde kwadraat","nl");
		MetrePerMegasecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerMegasecond-TimeSquared","metre per megasecond squared","m/Ms2",Metre, MegasecondTimeSquared);
		MetrePerMegasecondTimeSquared.addAlternativeName("meter per megaseconde kwadraat","nl");
		MetrePerMegasecondTimeSquared.addAlternativeSymbol("m Ms-2");
		MetrePerMegasecondTimeSquared.addAlternativeSymbol("m·Ms-2");
		Mole = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/mole", "mole", "mol", nl.wur.fbr.om.model.dimensions.SIBaseDimension.AMOUNT_OF_SUBSTANCE);
		Mole.addAlternativeName("mol","nl");
		MolePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerSecond-Time","mole per second","mol/s",Mole, SecondTime);
		MolePerSecondTime.addAlternativeName("mol per seconde","nl");
		MolePerSecondTime.addAlternativeSymbol("mol s-1");
		MolePerSecondTime.addAlternativeSymbol("mol·s-1");
		Katal = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/katal", "katal", "kat", MolePerSecondTime, 1.0 );
		Gigakatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigakatal","gigakatal","Gkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Kelvin = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kelvin", "kelvin", "K", nl.wur.fbr.om.model.dimensions.SIBaseDimension.THERMODYNAMIC_TEMPERATURE);
		Decakelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decakelvin","decakelvin","daK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Megasiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megasiemens","megasiemens","MS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Petaampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petaampere","petaampere","PA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Petaampere.addAlternativeName("petaampère","nl");
		Yoctolitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctolitre","yoctolitre","yl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Yoctolitre.addAlternativeName("yoctoliter","nl");
		GramPerYoctolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerYoctolitre","gram per yoctolitre","g/yl",Gram, Yoctolitre);
		GramPerYoctolitre.addAlternativeName("gram per yoctoliter","nl");
		GramPerYoctolitre.addAlternativeSymbol("g yl-1");
		GramPerYoctolitre.addAlternativeSymbol("g·yl-1");
		Picokatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picokatal","picokatal","pkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Candela = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/candela", "candela", "cd", nl.wur.fbr.om.model.dimensions.SIBaseDimension.LUMINOUS_INTENSITY);
		SquareMetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMetre","square metre","m2",Metre, 2.0);
		SquareMetre.addAlternativeName("vierkante meter","nl");
		SquareMetre.addAlternativeName("平方米","zh");
		SquareMetrePerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMetrePerSquareMetre","square metre per square metre","m2/m2",SquareMetre, SquareMetre);
		SquareMetrePerSquareMetre.addAlternativeName("vierkante meter per vierkante meter","nl");
		SquareMetrePerSquareMetre.addAlternativeSymbol("m2 m-2");
		SquareMetrePerSquareMetre.addAlternativeSymbol("m2·m-2");
		Steradian = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/steradian", "steradian", "sr", SquareMetrePerSquareMetre, 1.0 );
		Steradian.addAlternativeName("steradiaal","nl");
		Steradian.addAlternativeName("球面度","zh");
		CandelaSteradian = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/candelaSteradian","candela steradian","cd.sr",Candela, Steradian);
		CandelaSteradian.addAlternativeName("candela steradiaal","nl");
		CandelaSteradian.addAlternativeSymbol("cd sr");
		CandelaSteradian.addAlternativeSymbol("cd·sr");
		Lumen = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/lumen", "lumen", "lm", CandelaSteradian, 1.0 );
		LumenPerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/lumenPerSquareMetre","lumen per square metre","lm/m2",Lumen, SquareMetre);
		LumenPerSquareMetre.addAlternativeName("lumen per vierkante meter","nl");
		LumenPerSquareMetre.addAlternativeSymbol("lm m-2");
		LumenPerSquareMetre.addAlternativeSymbol("lm·m-2");
		Lux = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/lux", "lux", "lx", LumenPerSquareMetre, 1.0 );
		Kilolux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilolux","kilolux","klx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		HectosecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectosecond-Time","hectosecond","hs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		HectosecondTime.addAlternativeName("hectoseconde","nl");
		HectosecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/hectosecond-TimeSquared","hectosecond squared","hs2",HectosecondTime, 2.0);
		HectosecondTimeSquared.addAlternativeName("hectoseconde kwadraat","nl");
		MetrePerHectosecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerHectosecond-TimeSquared","metre per hectosecond squared","m/hs2",Metre, HectosecondTimeSquared);
		MetrePerHectosecondTimeSquared.addAlternativeName("meter per hectoseconde kwadraat","nl");
		MetrePerHectosecondTimeSquared.addAlternativeSymbol("m hs-2");
		MetrePerHectosecondTimeSquared.addAlternativeSymbol("m·hs-2");
		Picoweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picoweber","picoweber","pWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Decisievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decisievert","decisievert","dSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Micrometre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/micrometre","micrometre","μm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Micrometre.addAlternativeName("micrometer","nl");
		SquareMicrometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMicrometre","square micrometre","μm2",Micrometre, 2.0);
		SquareMicrometre.addAlternativeName("vierkante micrometer","nl");
		Becquerel = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/becquerel", "becquerel", "Bq", ReciprocalSecondTime, 1.0 );
		Hectobecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectobecquerel","hectobecquerel","hBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		WattPerCubicmetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerCubicmetre","watt per cubic metre","W/m3",Watt, CubicMetre);
		WattPerCubicmetre.addAlternativeName("watt per kubieke meter","nl");
		WattPerCubicmetre.addAlternativeSymbol("W m-3");
		WattPerCubicmetre.addAlternativeSymbol("W·m-3");
		Petagram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petagram","petagram","Pg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Teaspoon = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teaspoon", "teaspoon", "null", CubicMetre, 4.928922E-6 );
		Dessertspoon = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/dessertspoon", "dessertspoon", "null", Teaspoon, 2.0 );
		CubicMegametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicMegametre","cubic megametre","Mm3",Megametre, 3.0);
		CubicMegametre.addAlternativeName("kubieke megameter","nl");
		DecisecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decisecond-Time","decisecond","ds",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		DecisecondTime.addAlternativeName("deciseconde","nl");
		WeberPerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/weberPerSquareMetre","weber per square metre","Wb/m2",Weber, SquareMetre);
		WeberPerSquareMetre.addAlternativeName("weber per vierkante meter","nl");
		WeberPerSquareMetre.addAlternativeSymbol("Wb m-2");
		WeberPerSquareMetre.addAlternativeSymbol("Wb·m-2");
		Tesla = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/tesla", "tesla", "T", WeberPerSquareMetre, 1.0 );
		PoundAvoirdupois = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/poundAvoirdupois", "pound (avoirdupois)", "lb", Kilogram, 0.45359237 );
		Femtomole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtomole","femtomole","fmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Femtomole.addAlternativeName("femtomol","nl");
		FemtomolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/femtomolePerMetre","femtomole per metre","fmol/m",Femtomole, Metre);
		FemtomolePerMetre.addAlternativeName("femtomole per meter","nl");
		FemtomolePerMetre.addAlternativeSymbol("fm s-1");
		FemtomolePerMetre.addAlternativeSymbol("fm·s-1");
		Kilolitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilolitre","kilolitre","kl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Kilolitre.addAlternativeName("kiloliter","nl");
		Yottametre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottametre","yottametre","Ym",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Yottametre.addAlternativeName("yottameter","nl");
		Exasievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exasievert","exasievert","ESv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		MolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerLitre","mole per litre","mol/l",Mole, Litre);
		MolePerLitre.addAlternativeName("mole per liter","nl");
		MolePerLitre.addAlternativeSymbol("mol l-1");
		MolePerLitre.addAlternativeSymbol("mol·l-1");
		Molair = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/molair", "molair", "M", MolePerLitre, 1.0 );
		Petamolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petamolair","petamolair","PM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		NewtonPerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/newtonPerSquareMetre","newton per square metre","N/m2",Newton, SquareMetre);
		NewtonPerSquareMetre.addAlternativeName("newton per vierkante meter","nl");
		NewtonPerSquareMetre.addAlternativeSymbol("N m-2");
		NewtonPerSquareMetre.addAlternativeSymbol("N·m-2");
		Pascal = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/pascal", "pascal", "Pa", NewtonPerSquareMetre, 1.0 );
		MetreOfMercury = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/metreOfMercury", "metre of mercury", "m Hg", Pascal, 133.322 );
		MetreOfMercury.addAlternativeName("meter kwik","nl");
		MillimetreOfMercury = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millimetreOfMercury","millimetre of mercury","mm Hg",(SingularUnit)MetreOfMercury, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MillimetreOfMercury.addAlternativeName("millimeter kwik","nl");
		Nanolitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanolitre","nanolitre","nl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Nanolitre.addAlternativeName("nanoliter","nl");
		GramPerNanolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerNanolitre","gram per nanolitre","g/nl",Gram, Nanolitre);
		GramPerNanolitre.addAlternativeName("gram per nanoliter","nl");
		GramPerNanolitre.addAlternativeSymbol("g nl-1");
		GramPerNanolitre.addAlternativeSymbol("g·nl-1");
		Inch = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/inch", "inch", "in", Metre, 0.0254 );
		Megabit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megabit","megabit","Mbit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		PicosecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picosecond-Time","picosecond","ps",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		PicosecondTime.addAlternativeName("picoseconde","nl");
		Day = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/day", "day", "d", SecondTime, 86400.0 );
		Day.addAlternativeName("dag","nl");
		SquareMetrePerSquareMetreDay = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMetrePerSquareMetreDay","square metre per square metre day","m2/m2/d",SquareMetrePerSquareMetre, Day);
		SquareMetrePerSquareMetreDay.addAlternativeSymbol("m2/(m2 d)");
		SquareMetrePerSquareMetreDay.addAlternativeSymbol("m2 m-2 d-1");
		SquareMetrePerSquareMetreDay.addAlternativeSymbol("m2·m-2·d-1");
		Nanopascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanopascal","nanopascal","nPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Tonne = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/tonne", "tonne", "t", Kilogram, 1000.0 );
		Tonne.addAlternativeName("ton","nl");
		Are = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/are", "are", "a", SquareMetre, 100.0 );
		Hectare = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectare","hectare","ha",(SingularUnit)Are, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		TonnePerHectare = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/tonnePerHectare","tonne per hectare","t/ha",Tonne, Hectare);
		TonnePerHectare.addAlternativeSymbol("t ha-1");
		TonnePerHectare.addAlternativeSymbol("t·ha-1");
		Megasievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megasievert","megasievert","MSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Hectolitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectolitre","hectolitre","hl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Hectolitre.addAlternativeName("hectoliter","nl");
		Hectometre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectometre","hectometre","hm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Hectometre.addAlternativeName("hectometer","nl");
		HectometrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/hectometrePerSecond-TimeSquared","hectometre per second squared","hm/s2",Hectometre, SecondTimeSquared);
		HectometrePerSecondTimeSquared.addAlternativeName("hectometer per seconde kwadraat","nl");
		HectometrePerSecondTimeSquared.addAlternativeSymbol("hm s-2");
		HectometrePerSecondTimeSquared.addAlternativeSymbol("hm·s-2");
		BritishThermalUnitInternationalTable = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/BritishThermalUnit-InternationalTable", "British thermal unit (International Table)", "Btu_IT", Joule, 1055.056 );
		DegreeCelsius = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/degreeCelsius", "degree Celsius", "°C", Kelvin, 1.0 );
		DegreeCelsius.addAlternativeName("graad Celsius","nl");
		Hour = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hour", "hour", "h", SecondTime, 3600.0 );
		Hour.addAlternativeName("uur","nl");
		Hour.addAlternativeSymbol("u");
		DegreeCelsiusPerHour = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/degreeCelsiusPerHour","degree Celsius per hour","°C/h",DegreeCelsius, Hour);
		DegreeCelsiusPerHour.addAlternativeName("graad Celsius per uur","nl");
		DegreeCelsiusPerHour.addAlternativeSymbol("°C h-1");
		DegreeCelsiusPerHour.addAlternativeSymbol("°C·h-1");
		Centimetre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centimetre","centimetre","cm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Centimetre.addAlternativeName("centimeter","nl");
		CubicCentimetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicCentimetre","cubic centimetre","cm3",Centimetre, 3.0);
		CubicCentimetre.addAlternativeName("kubieke centimeter","nl");
		GramPerCubicCentimetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerCubicCentimetre","gram per cubic centimetre","g/cm3",Gram, CubicCentimetre);
		GramPerCubicCentimetre.addAlternativeName("gram per kubieke centimeter","nl");
		GramPerCubicCentimetre.addAlternativeSymbol("g cm-3");
		GramPerCubicCentimetre.addAlternativeSymbol("g·cm-3");
		Exatesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exatesla","exatesla","ET",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Centikelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centikelvin","centikelvin","cK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Exakelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exakelvin","exakelvin","EK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Gigasievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigasievert","gigasievert","GSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Millimole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millimole","millimole","mmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Millimole.addAlternativeName("millimol","nl");
		MillimolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/millimolePerMetre","millimole per metre","mmol/m",Millimole, Metre);
		MillimolePerMetre.addAlternativeName("millimole per meter","nl");
		MillimolePerMetre.addAlternativeSymbol("mmol m-1");
		MillimolePerMetre.addAlternativeSymbol("mmol·m-1");
		MetrePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerMetre","metre per metre","m/m",Metre, Metre);
		MetrePerMetre.addAlternativeName("meter per meter","nl");
		MetrePerMetre.addAlternativeSymbol("m m-1");
		MetrePerMetre.addAlternativeSymbol("m·m-1");
		Radian = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/radian", "radian", "rad", MetrePerMetre, 1.0 );
		Radian.addAlternativeName("radiaal","nl");
		Radian.addAlternativeName("弧度","zh");
		Gon = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gon", "gon", "gon", Radian, 0.01570796 );
		MolePerMicrometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerMicrometre","mole per micrometre","mol/μm",Mole, Micrometre);
		MolePerMicrometre.addAlternativeName("mole per micrometer","nl");
		MolePerMicrometre.addAlternativeSymbol("mol μm-1");
		MolePerMicrometre.addAlternativeSymbol("mol·μm-1");
		Zettapascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettapascal","zettapascal","ZPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Millivolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millivolt","millivolt","mV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Petamole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petamole","petamole","Pmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Petamole.addAlternativeName("petamol","nl");
		Exasiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exasiemens","exasiemens","ES",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Centihenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centihenry","centihenry","cH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		LumenSecondTime = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/lumenSecond-Time","lumen second","lm.s",Lumen, SecondTime);
		LumenSecondTime.addAlternativeName("lumen seconde","nl");
		LumenSecondTime.addAlternativeSymbol("lm s");
		LumenSecondTime.addAlternativeSymbol("lm·s");
		SecondTimeAmpere = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/second-TimeAmpere","second ampere","s.A",SecondTime, Ampere);
		SecondTimeAmpere.addAlternativeName("seconde ampère","nl");
		SecondTimeAmpere.addAlternativeSymbol("s A");
		SecondTimeAmpere.addAlternativeSymbol("s·A");
		Coulomb = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/coulomb", "coulomb", "C", SecondTimeAmpere, 1.0 );
		CoulombPerVolt = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/coulombPerVolt","coulomb per volt","C/V",Coulomb, Volt);
		CoulombPerVolt.addAlternativeSymbol("C V-1");
		CoulombPerVolt.addAlternativeSymbol("C·V-1");
		Farad = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/farad", "farad", "F", CoulombPerVolt, 1.0 );
		Megafarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megafarad","megafarad","MF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Rem = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/rem", "rem", "rem", Sievert, 0.01 );
		ReciprocalHenry = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalHenry","reciprocal henry","H1/-1",Henry, -1.0);
		ReciprocalHenry.addAlternativeName("omgekeerde henry","nl");
		ReciprocalHenry.addAlternativeSymbol("H-1");
		Femtocandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtocandela","femtocandela","fcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Teratesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teratesla","teratesla","TT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Zeptolitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptolitre","zeptolitre","zl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Zeptolitre.addAlternativeName("zeptoliter","nl");
		Decahertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decahertz","decahertz","daHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Exametre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exametre","exametre","Em",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Exametre.addAlternativeName("exameter","nl");
		SquareExametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareExametre","square exametre","Em2",Exametre, 2.0);
		SquareExametre.addAlternativeName("vierkante exameter","nl");
		Zeptocandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptocandela","zeptocandela","zcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		CircularMil = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/circularMil", "circular mil", "null", SquareMetre, 5.067075E-10 );
		Exalitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exalitre","exalitre","El",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Exalitre.addAlternativeName("exaliter","nl");
		MolePerExalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerExalitre","mole per exalitre","mol/El",Mole, Exalitre);
		MolePerExalitre.addAlternativeName("mole per exaliter","nl");
		MolePerExalitre.addAlternativeSymbol("mol El-1");
		MolePerExalitre.addAlternativeSymbol("mol·El-1");
		AstronomicalUnit = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/astronomicalUnit", "astronomical unit", "AU", Metre, 1.495978707E11 );
		KelvinKilogram = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/kelvinKilogram","kelvin kilogram","K.kg",Kelvin, Kilogram);
		KelvinKilogram.addAlternativeSymbol("K kg");
		KelvinKilogram.addAlternativeSymbol("K·kg");
		DegreeRankine = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/degreeRankine", "degree Rankine", "°R", Kelvin, 0.5555556 );
		DegreeRankine.addAlternativeName("graad Rankine","nl");
		DegreeRankine.addAlternativeSymbol("°Ra");
		KelvinScale = factory.createScale("http://www.ontology-of-units-of-measure.org/resource/om-2/KelvinScale","Kelvin scale","null", Kelvin);
		Point pointKelvinScale1 = new PointImpl(1234.93, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale1);
		Point pointKelvinScale2 = new PointImpl(13.8033, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale2);
		Point pointKelvinScale3 = new PointImpl(1337.33, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale3);
		Point pointKelvinScale4 = new PointImpl(1357.77, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale4);
		Point pointKelvinScale5 = new PointImpl(234.3156, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale5);
		Point pointKelvinScale6 = new PointImpl(24.5561, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale6);
		Point pointKelvinScale7 = new PointImpl(273.16, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale7);
		Point pointKelvinScale8 = new PointImpl(302.9146, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale8);
		Point pointKelvinScale9 = new PointImpl(Range.between(3.0, 5.0), KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale9);
		Point pointKelvinScale10 = new PointImpl(429.7485, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale10);
		Point pointKelvinScale11 = new PointImpl(505.078, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale11);
		Point pointKelvinScale12 = new PointImpl(54.3584, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale12);
		Point pointKelvinScale13 = new PointImpl(692.677, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale13);
		Point pointKelvinScale14 = new PointImpl(83.8058, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale14);
		Point pointKelvinScale15 = new PointImpl(933.473, KelvinScale);
		KelvinScale.addDefinitionPoint(pointKelvinScale15);
		KelvinScale.addAlternativeName("Kelvinschaal","nl");
		RankineScale = factory.createScale("http://www.ontology-of-units-of-measure.org/resource/om-2/RankineScale","Rankine scale","null",KelvinScale, 0.0, 1.8, DegreeRankine);
		RankineScale.addAlternativeName("Rankineschaal","nl");
		Exavolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exavolt","exavolt","EV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		MillisecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millisecond-Time","millisecond","ms",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MillisecondTime.addAlternativeName("milliseconde","nl");
		MolePerCubicmetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerCubicmetre","mole per cubic metre","mol/m3",Mole, CubicMetre);
		MolePerCubicmetre.addAlternativeName("mol per kubieke meter","nl");
		MolePerCubicmetre.addAlternativeSymbol("mol m-3");
		MolePerCubicmetre.addAlternativeSymbol("mol·m-3");
		Zettasiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettasiemens","zettasiemens","ZS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Millisteradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millisteradian","millisteradian","msr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Millisteradian.addAlternativeName("millisteradiaal","nl");
		Decihenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decihenry","decihenry","dH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Nanoweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanoweber","nanoweber","nWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Biot = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/biot", "biot", "Bi", Ampere, 10.0 );
		One = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/one", "one", "1", null);
		PartsPerMillion = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/partsPerMillion", "parts per million", "ppm", One, 1.0E-6 );
		Abampere = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/abampere", "abampere", "abA", Ampere, 10.0 );
		Abampere.addAlternativeName("abampère","nl");
		Zettasievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettasievert","zettasievert","ZSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Yottatesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottatesla","yottatesla","YT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Terajoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terajoule","terajoule","TJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Milliwatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/milliwatt","milliwatt","mW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		DegreeCelsiusDay = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/degreeCelsiusDay","degree Celsius day","°C.d",DegreeCelsius, Day);
		DegreeCelsiusDay.addAlternativeName("graad Celsius dag","nl");
		DegreeCelsiusDay.addAlternativeSymbol("°C d");
		DegreeCelsiusDay.addAlternativeSymbol("°C·d");
		ReciprocalDegreeCelsiusDay = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalDegreeCelsiusDay","reciprocal degree Celsius day","°C.d1/-1",DegreeCelsiusDay, -1.0);
		ReciprocalDegreeCelsiusDay.addAlternativeName("omgekeerde graad Celsius dag","nl");
		ReciprocalDegreeCelsiusDay.addAlternativeSymbol("(°C d)-1");
		Year = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/year", "year", "a", SecondTime, 3.1536E7 );
		Year.addAlternativeName("jaar","nl");
		Year.addAlternativeSymbol("y");
		Year.addAlternativeSymbol("yr");
		Gigayear = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigayear","gigayear","Gyr",(SingularUnit)Year, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Gigayear.addAlternativeName("gigajaar","nl");
		Byte = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/byte", "byte", "B", Bit, 8.0 );
		Exbibyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exbibyte","exbibyte","EiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.EXBI);
		Nanocoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanocoulomb","nanocoulomb","nC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		DryGallonUS = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/dryGallon-US", "dry gallon (US)", "gal", CubicMetre, 0.00440488377086 );
		Foot = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/foot", "foot", "ft", Metre, 0.3048 );
		SecondAngle = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/second-Angle", "second (angle)", "\"", Radian, 4.848137E-6 );
		SecondAngle.addAlternativeName("seconde (hoek)","nl");
		SecondAngle.addAlternativeName("boogseconde","nl");
		SecondAngle.addAlternativeName("seconde (hoek)","nl");
		SecondAngle.addAlternativeName("boogseconde","nl");
		MicrosecondAngle = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microsecond-Angle","microsecond (angle)","μas",(SingularUnit)SecondAngle, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MicrosecondAngle.addAlternativeName("microseconde (hoek)","nl");
		MicrosecondAngle.addAlternativeName("microboogseconde","nl");
		MicrosecondAngle.addAlternativeName("microseconde (hoek)","nl");
		MicrosecondAngle.addAlternativeName("microboogseconde","nl");
		ReciprocalYear = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalYear","reciprocal year","a1/-1",Year, -1.0);
		ReciprocalYear.addAlternativeName("omgekeerd jaar","nl");
		ReciprocalYear.addAlternativeSymbol("a-1");
		Statfarad = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/statfarad", "statfarad", "statF", Farad, 1.11265E-12 );
		Femtometre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtometre","femtometre","fm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Femtometre.addAlternativeName("femtometer","nl");
		FemtometrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/femtometrePerSecond-Time","femtometre per second","fm/s",Femtometre, SecondTime);
		FemtometrePerSecondTime.addAlternativeName("femtometer per seconde","nl");
		FemtometrePerSecondTime.addAlternativeSymbol("fm s-1");
		FemtometrePerSecondTime.addAlternativeSymbol("fm·s-1");
		Femtopascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtopascal","femtopascal","fPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Centimole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centimole","centimole","cmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Centimole.addAlternativeName("centimol","nl");
		CentimolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/centimolePerMetre","centimole per metre","cmol/m",Centimole, Metre);
		CentimolePerMetre.addAlternativeName("centimole per meter","nl");
		CentimolePerMetre.addAlternativeSymbol("cmol m-1");
		CentimolePerMetre.addAlternativeSymbol("cmol·m-1");
		Deciradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/deciradian","deciradian","drad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Deciradian.addAlternativeName("deciradiaal","nl");
		Picolitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picolitre","picolitre","pl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Picolitre.addAlternativeName("picoliter","nl");
		GramPerPicolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerPicolitre","gram per picolitre","g/pl",Gram, Picolitre);
		GramPerPicolitre.addAlternativeName("gram per picoliter","nl");
		GramPerPicolitre.addAlternativeSymbol("g pl-1");
		GramPerPicolitre.addAlternativeSymbol("g·pl-1");
		Megawatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megawatt","megawatt","MW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Micromole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/micromole","micromole","μmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Micromole.addAlternativeName("micromol","nl");
		MicromolePerMole = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/micromolePerMole","micromole per mole","μmol/mol",Micromole, Mole);
		MicromolePerMole.addAlternativeName("micromol per mol","nl");
		MicromolePerMole.addAlternativeSymbol("μmol mol-1");
		MicromolePerMole.addAlternativeSymbol("μmol·mol-1");
		Erg = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/erg", "erg", "erg", Joule, 1.0E-7 );
		ErgSecondTime = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/ergSecond-Time","erg second","erg.s",Erg, SecondTime);
		ErgSecondTime.addAlternativeName("erg seconde","nl");
		ErgSecondTime.addAlternativeSymbol("erg s");
		ErgSecondTime.addAlternativeSymbol("erg·s");
		Millilitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millilitre","millilitre","ml",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Millilitre.addAlternativeName("milliliter","nl");
		MolePerMillilitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerMillilitre","mole per millilitre","mol/ml",Mole, Millilitre);
		MolePerMillilitre.addAlternativeName("mole per milliliter","nl");
		MolePerMillilitre.addAlternativeSymbol("mol ml-1");
		MolePerMillilitre.addAlternativeSymbol("mol·ml-1");
		SecondTimeToThePower2 = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/second-TimeToThePower-2","second to the power -2","s1/-0.5",SecondTime, -2.0);
		SecondTimeToThePower2.addAlternativeName("seconde tot de macht -2","nl");
		SecondTimeToThePower2.addAlternativeSymbol("s-2");
		NanosecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanosecond-Time","nanosecond","ns",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		NanosecondTime.addAlternativeName("nanoseconde","nl");
		NanosecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/nanosecond-TimeSquared","nanosecond squared","ns2",NanosecondTime, 2.0);
		NanosecondTimeSquared.addAlternativeName("nanoseconde kwadraat","nl");
		ZeptosecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptosecond-Time","zeptosecond","zs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		ZeptosecondTime.addAlternativeName("zeptoseconde","nl");
		Attohenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attohenry","attohenry","aH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Milligray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/milligray","milligray","mGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Millimetre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millimetre","millimetre","mm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Millimetre.addAlternativeName("millimeter","nl");
		CubicMillimetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicMillimetre","cubic millimetre","mm3",Millimetre, 3.0);
		CubicMillimetre.addAlternativeName("kubieke millimeter","nl");
		Hectomolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectomolair","hectomolair","hM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Yottakelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottakelvin","yottakelvin","YK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		PascalSecondTime = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/pascalSecond-Time","pascal second","Pa.s",Pascal, SecondTime);
		PascalSecondTime.addAlternativeName("pascal seconde","nl");
		PascalSecondTime.addAlternativeSymbol("Pa s");
		PascalSecondTime.addAlternativeSymbol("Pa·s");
		ReciprocalPascalSecondTime = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalPascalSecond-Time","reciprocal pascal second","Pa.s1/-1",PascalSecondTime, -1.0);
		ReciprocalPascalSecondTime.addAlternativeName("omgekeerde pascal seconde","nl");
		ReciprocalPascalSecondTime.addAlternativeSymbol("Pa-1 s-1");
		ReciprocalPascalSecondTime.addAlternativeSymbol("(Pa s)-1");
		ReciprocalPascalSecondTime.addAlternativeSymbol("(Pa·s)-1");
		ReciprocalPascalSecondTime.addAlternativeSymbol("Pa-1·s-1");
		Rhe = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/rhe", "rhe", "null", ReciprocalPascalSecondTime, 10.0 );
		JoulePerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/joulePerSquareMetre","joule per square metre","J/m2",Joule, SquareMetre);
		JoulePerSquareMetre.addAlternativeName("joule per vierkante meter","nl");
		JoulePerSquareMetre.addAlternativeSymbol("J m-2");
		JoulePerSquareMetre.addAlternativeSymbol("J·m-2");
		PetasecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petasecond-Time","petasecond","Ps",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		PetasecondTime.addAlternativeName("petaseconde","nl");
		PetasecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/petasecond-TimeSquared","petasecond squared","Ps2",PetasecondTime, 2.0);
		PetasecondTimeSquared.addAlternativeName("petaseconde kwadraat","nl");
		MetrePerPetasecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerPetasecond-TimeSquared","metre per petasecond squared","m/Ps2",Metre, PetasecondTimeSquared);
		MetrePerPetasecondTimeSquared.addAlternativeName("meter per petaseconde kwadraat","nl");
		MetrePerPetasecondTimeSquared.addAlternativeSymbol("m Ps-2");
		MetrePerPetasecondTimeSquared.addAlternativeSymbol("m·Ps-2");
		Milligram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/milligram","milligram","mg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Kilometre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilometre","kilometre","km",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Kilometre.addAlternativeName("kilometer","nl");
		MolePerKilometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerKilometre","mole per kilometre","mol/km",Mole, Kilometre);
		MolePerKilometre.addAlternativeName("mole per kilometer","nl");
		MolePerKilometre.addAlternativeSymbol("mol km-1");
		MolePerKilometre.addAlternativeSymbol("mol·km-1");
		Kilolumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilolumen","kilolumen","klm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Yoctosiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctosiemens","yoctosiemens","yS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Zeptolumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptolumen","zeptolumen","zlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Terafarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terafarad","terafarad","TF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Exabit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exabit","exabit","Ebit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		MetrePerMegasecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerMegasecond-Time","metre per megasecond","m/Ms",Metre, MegasecondTime);
		MetrePerMegasecondTime.addAlternativeName("meter per megaseconde","nl");
		MetrePerMegasecondTime.addAlternativeSymbol("m Ms-1");
		MetrePerMegasecondTime.addAlternativeSymbol("m·Ms-1");
		Zeptoradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptoradian","zeptoradian","zrad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Zeptoradian.addAlternativeName("zeptoradiaal","nl");
		Stattesla = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/stattesla", "stattesla", "statT", Tesla, 2997900.0 );
		Yoctohertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctohertz","yoctohertz","yHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		YoctodegreeCelsius = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctodegreeCelsius","yoctodegree Celsius","y°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		YoctodegreeCelsius.addAlternativeName("yoctograad Celsius","nl");
		N100Kilometre = factory.createUnitMultiple("http://www.ontology-of-units-of-measure.org/resource/om-2/_100Kilometre","100 kilometre","100 km",Kilometre, 100.0);
		N100Kilometre.addAlternativeName("100 kilometer","nl");
		LitrePer100Kilometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/litrePer100Kilometre","litre per 100 kilometre","l/100 km",Litre, N100Kilometre);
		Teragram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teragram","teragram","Tg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		TeragramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/teragramPerLitre","teragram per litre","Tg/l",Teragram, Litre);
		TeragramPerLitre.addAlternativeName("teragram per liter","nl");
		TeragramPerLitre.addAlternativeSymbol("Tg l-1");
		TeragramPerLitre.addAlternativeSymbol("Tg·l-1");
		Microhenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microhenry","microhenry","μH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Yottaampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottaampere","yottaampere","YA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Yottaampere.addAlternativeName("yottaampère","nl");
		Zettamole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettamole","zettamole","Zmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Zettamole.addAlternativeName("zettamol","nl");
		ZettamolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/zettamolePerLitre","zettamole per litre","Zmol/l",Zettamole, Litre);
		ZettamolePerLitre.addAlternativeName("zettamole per liter","nl");
		ZettamolePerLitre.addAlternativeSymbol("Zmol l-1");
		ZettamolePerLitre.addAlternativeSymbol("Zmol·l-1");
		Zettabecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettabecquerel","zettabecquerel","ZBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Decalitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decalitre","decalitre","dal",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Decalitre.addAlternativeName("decaliter","nl");
		MolePerDecalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerDecalitre","mole per decalitre","mol/dal",Mole, Decalitre);
		MolePerDecalitre.addAlternativeName("mole per decaliter","nl");
		MolePerDecalitre.addAlternativeSymbol("mol dal-1");
		MolePerDecalitre.addAlternativeSymbol("mol·dal-1");
		Decametre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decametre","decametre","dam",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Decametre.addAlternativeName("decameter","nl");
		DecametrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/decametrePerSecond-Time","decametre per second","dam/s",Decametre, SecondTime);
		DecametrePerSecondTime.addAlternativeName("decameter per seconde","nl");
		DecametrePerSecondTime.addAlternativeSymbol("dam s-1");
		DecametrePerSecondTime.addAlternativeSymbol("dam·s-1");
		Microcoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microcoulomb","microcoulomb","μC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Megamole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megamole","megamole","Mmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Megamole.addAlternativeName("megamol","nl");
		Petavolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petavolt","petavolt","PV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Nanometre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanometre","nanometre","nm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Nanometre.addAlternativeName("nanometer","nl");
		WattPerNanometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerNanometre","watt per nanometre","W/nm",Watt, Nanometre);
		WattPerNanometre.addAlternativeName("watt per nanometer","nl");
		WattPerNanometre.addAlternativeSymbol("W nm-1");
		WattPerNanometre.addAlternativeSymbol("W·nm-1");
		Yoctoradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctoradian","yoctoradian","yrad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Yoctoradian.addAlternativeName("yoctoradiaal","nl");
		Decalumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decalumen","decalumen","dalm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		LiquidQuartUS = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/liquidQuart-US", "liquid quart (US)", "liq qt", CubicMetre, 9.463529E-4 );
		KilometrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilometrePerSecond-Time","kilometre per second","km/s",Kilometre, SecondTime);
		KilometrePerSecondTime.addAlternativeName("kilometer per seconde","nl");
		KilometrePerSecondTime.addAlternativeSymbol("km s-1");
		KilometrePerSecondTime.addAlternativeSymbol("km·s-1");
		Parsec = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/parsec", "parsec", "pc", Metre, 3.08567802E16 );
		Megaparsec = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megaparsec","megaparsec","Mpc",(SingularUnit)Parsec, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		KilometrePerSecondTimePerMegaparsec = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilometrePerSecond-TimePerMegaparsec","kilometre per second per megaparsec","km/s/Mpc",KilometrePerSecondTime, Megaparsec);
		KilometrePerSecondTimePerMegaparsec.addAlternativeName("kilometer per seconde per megaparsec","nl");
		KilometrePerSecondTimePerMegaparsec.addAlternativeSymbol("km s-1 Mpc-1");
		MegaeuroPerMegawatt = null;
		CubicKilometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicKilometre","cubic kilometre","km3",Kilometre, 3.0);
		CubicKilometre.addAlternativeName("kubieke kilometer","nl");
		Centikatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centikatal","centikatal","ckat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Petacoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petacoulomb","petacoulomb","PC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		CoulombPerCubicmetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/coulombPerCubicmetre","coulomb per cubic metre","C/m3",Coulomb, CubicMetre);
		CoulombPerCubicmetre.addAlternativeName("coulomb per kubieke meter","nl");
		CoulombPerCubicmetre.addAlternativeSymbol("C m-3");
		CoulombPerCubicmetre.addAlternativeSymbol("C·m-3");
		Hectovolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectovolt","hectovolt","hV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Kilovolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilovolt","kilovolt","kV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Terasiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terasiemens","terasiemens","TS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Petalitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petalitre","petalitre","Pl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Petalitre.addAlternativeName("petaliter","nl");
		GramPerPetalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerPetalitre","gram per petalitre","g/Pl",Gram, Petalitre);
		GramPerPetalitre.addAlternativeName("gram per petaliter","nl");
		GramPerPetalitre.addAlternativeSymbol("g Pl-1");
		GramPerPetalitre.addAlternativeSymbol("g·Pl-1");
		SolarMass = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/solarMass", "solar mass", "M_☉", Kilogram, 1.98892E30 );
		SolarMass.addAlternativeName("zonsmassa","nl");
		CubicParsec = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicParsec","cubic parsec","pc3",Parsec, 3.0);
		CubicParsec.addAlternativeName("kubieke parsec","nl");
		GigayearCubicParsec = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/gigayearCubicParsec","gigayear cubic parsec","Gyr.pc3",Gigayear, CubicParsec);
		GigayearCubicParsec.addAlternativeName("gigajaar kubieke parsec","nl");
		GigayearCubicParsec.addAlternativeSymbol("Gyr pc3");
		GigayearCubicParsec.addAlternativeSymbol("Gyr·pc3");
		SolarMassPerGigayearCubicParsec = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/solarMassPerGigayearCubicParsec","solar mass per gigayear cubic parsec","M_☉/Gyr.pc3",SolarMass, GigayearCubicParsec);
		SolarMassPerGigayearCubicParsec.addAlternativeSymbol("M_☉/(Gyr pc3)");
		SolarMassPerGigayearCubicParsec.addAlternativeSymbol("M_☉ Gyr-1 pc-3");
		SolarMassPerGigayearCubicParsec.addAlternativeSymbol("M_☉·Gyr-1·pc-3");
		Exagray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exagray","exagray","EGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Centilitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centilitre","centilitre","cl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Centilitre.addAlternativeName("centiliter","nl");
		MolePerCentilitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerCentilitre","mole per centilitre","mol/cl",Mole, Centilitre);
		MolePerCentilitre.addAlternativeName("mole per centiliter","nl");
		MolePerCentilitre.addAlternativeSymbol("mol cl-1");
		MolePerCentilitre.addAlternativeSymbol("mol·cl-1");
		Megalitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megalitre","megalitre","Ml",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Megalitre.addAlternativeName("megaliter","nl");
		Attolumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attolumen","attolumen","alm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		KilosecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilosecond-Time","kilosecond","ks",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		KilosecondTime.addAlternativeName("kiloseconde","nl");
		MetrePerKilosecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerKilosecond-Time","metre per kilosecond","m/ks",Metre, KilosecondTime);
		MetrePerKilosecondTime.addAlternativeName("meter per kiloseconde","nl");
		MetrePerKilosecondTime.addAlternativeSymbol("m ks-1");
		MetrePerKilosecondTime.addAlternativeSymbol("m·ks-1");
		Zettalux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettalux","zettalux","Zlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Exagram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exagram","exagram","Eg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		ThermEC = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/therm-EC", "therm (EC)", "null", Joule, 1.05506E8 );
		Hectogram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectogram","hectogram","hg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		HectogramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/hectogramPerLitre","hectogram per litre","hg/l",Hectogram, Litre);
		HectogramPerLitre.addAlternativeName("hectogram per liter","nl");
		HectogramPerLitre.addAlternativeSymbol("hg l-1");
		HectogramPerLitre.addAlternativeSymbol("hg·l-1");
		Kilofarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilofarad","kilofarad","kF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		FluidOunceUS = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/fluidOunce-US", "fluid ounce (US)", "fl oz", CubicMetre, 2.957353E-5 );
		Megamolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megamolair","megamolair","MM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Decawatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decawatt","decawatt","daW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Kilobit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilobit","kilobit","kbit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Examole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/examole","examole","Emol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Examole.addAlternativeName("examol","nl");
		ExamolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/examolePerMetre","examole per metre","Emol/m",Examole, Metre);
		ExamolePerMetre.addAlternativeName("examole per meter","nl");
		ExamolePerMetre.addAlternativeSymbol("Emol m-1");
		ExamolePerMetre.addAlternativeSymbol("Emol·m-1");
		Terasievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terasievert","terasievert","TSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		SquareMetreKelvin = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMetreKelvin","square metre kelvin","m2.K",SquareMetre, Kelvin);
		SquareMetreKelvin.addAlternativeName("vierkante meter kelvin","nl");
		SquareMetreKelvin.addAlternativeSymbol("m2 K");
		SquareMetreKelvin.addAlternativeSymbol("m2·K");
		Petaweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petaweber","petaweber","PWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		CubicCentimetrePerCubicCentimetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicCentimetrePerCubicCentimetre","cubic centimetre per cubic centimetre","cm3/cm3",CubicCentimetre, CubicCentimetre);
		CubicCentimetrePerCubicCentimetre.addAlternativeName("kubieke centimeter per kubieke centimeter","nl");
		CubicCentimetrePerCubicCentimetre.addAlternativeSymbol("cm3 cm-3");
		CubicCentimetrePerCubicCentimetre.addAlternativeSymbol("cm3·cm-3");
		Zettawatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettawatt","zettawatt","ZW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		GramPerGram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerGram","gram per gram","g/g",Gram, Gram);
		GramPerGram.addAlternativeSymbol("g g-1");
		GramPerGram.addAlternativeSymbol("g·g-1");
		DecametrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/decametrePerSecond-TimeSquared","decametre per second squared","dam/s2",Decametre, SecondTimeSquared);
		DecametrePerSecondTimeSquared.addAlternativeName("decameter per seconde kwadraat","nl");
		DecametrePerSecondTimeSquared.addAlternativeSymbol("dam s-2");
		DecametrePerSecondTimeSquared.addAlternativeSymbol("dam·s-2");
		Femtojoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtojoule","femtojoule","fJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Hectolux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectolux","hectolux","hlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		MetrePerPetasecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerPetasecond-Time","metre per petasecond","m/Ps",Metre, PetasecondTime);
		MetrePerPetasecondTime.addAlternativeName("meter per petaseconde","nl");
		MetrePerPetasecondTime.addAlternativeSymbol("m Ps-1");
		MetrePerPetasecondTime.addAlternativeSymbol("m·Ps-1");
		Hectopascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectopascal","hectopascal","hPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		CandelaPerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/candelaPerSquareMetre","candela per square metre","cd/m2",Candela, SquareMetre);
		CandelaPerSquareMetre.addAlternativeName("candela per vierkante meter","nl");
		CandelaPerSquareMetre.addAlternativeSymbol("cd/m");
		CandelaPerSquareMetre.addAlternativeSymbol("cd m-1");
		CandelaPerSquareMetre.addAlternativeSymbol("cd·m-1");
		Yoctometre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctometre","yoctometre","ym",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Yoctometre.addAlternativeName("yoctometer","nl");
		YoctometrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctometrePerSecond-Time","yoctometre per second","ym/s",Yoctometre, SecondTime);
		YoctometrePerSecondTime.addAlternativeName("yoctometer per seconde","nl");
		YoctometrePerSecondTime.addAlternativeSymbol("ym s-1");
		YoctometrePerSecondTime.addAlternativeSymbol("ym·s-1");
		Milliradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/milliradian","milliradian","mrad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Milliradian.addAlternativeName("milliradiaal","nl");
		ExasecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exasecond-Time","exasecond","Es",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		ExasecondTime.addAlternativeName("exaseconde","nl");
		Megalux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megalux","megalux","Mlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		TerametrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/terametrePerSecond-Time","terametre per second","Tm/s",Terametre, SecondTime);
		TerametrePerSecondTime.addAlternativeName("terameter per seconde","nl");
		TerametrePerSecondTime.addAlternativeSymbol("Tm s-1");
		TerametrePerSecondTime.addAlternativeSymbol("Tm·s-1");
		SquareMetreSecondTime = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMetreSecond-Time","square metre second","m2.s",SquareMetre, SecondTime);
		SquareMetreSecondTime.addAlternativeName("vierkante meter seconde","nl");
		SquareMetreSecondTime.addAlternativeSymbol("m2 s");
		SquareMetreSecondTime.addAlternativeSymbol("m2·s");
		GramPerSquareMetreSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerSquareMetreSecond-Time","gram per square metre second","g/m2.s",Gram, SquareMetreSecondTime);
		GramPerSquareMetreSecondTime.addAlternativeName("gram per vierkante meter seconde","nl");
		GramPerSquareMetreSecondTime.addAlternativeSymbol("g/(m2 s)");
		GramPerSquareMetreSecondTime.addAlternativeSymbol("g m-2 s-1");
		GramPerSquareMetreSecondTime.addAlternativeSymbol("g·m-2·s-1");
		UnifiedAtomicMassUnit = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/unifiedAtomicMassUnit", "unified atomic mass unit", "u", nl.wur.fbr.om.model.dimensions.SIBaseDimension.MASS);
		Yoctogram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctogram","yoctogram","yg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		YoctogramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctogramPerLitre","yoctogram per litre","yg/l",Yoctogram, Litre);
		YoctogramPerLitre.addAlternativeName("yoctogram per liter","nl");
		YoctogramPerLitre.addAlternativeSymbol("yg l-1");
		YoctogramPerLitre.addAlternativeSymbol("yg·l-1");
		Decamolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decamolair","decamolair","daM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		MegaeuroPerMegatonne = null;
		Hectomole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectomole","hectomole","hmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Hectomole.addAlternativeName("hectomol","nl");
		HectomolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/hectomolePerMetre","hectomole per metre","hmol/m",Hectomole, Metre);
		HectomolePerMetre.addAlternativeName("hectomole per meter","nl");
		HectomolePerMetre.addAlternativeSymbol("hmol m-1");
		HectomolePerMetre.addAlternativeSymbol("hmol·m-1");
		Zettaweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettaweber","zettaweber","ZWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		SquareMetreDay = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMetreDay","square metre day","m2.d",SquareMetre, Day);
		SquareMetreDay.addAlternativeName("vierkante meter dag","nl");
		SquareMetreDay.addAlternativeSymbol("m2 d");
		SquareMetreDay.addAlternativeSymbol("m2·d");
		JoulePerSquareMetreDay = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/joulePerSquareMetreDay","joule per square metre day","J/m2.d",Joule, SquareMetreDay);
		JoulePerSquareMetreDay.addAlternativeName("joule per vierkante meter dag","nl");
		JoulePerSquareMetreDay.addAlternativeSymbol("J/(m2 d)");
		JoulePerSquareMetreDay.addAlternativeSymbol("J m-2 d-1");
		JoulePerSquareMetreDay.addAlternativeSymbol("J·m-2·d-1");
		MetrePerDecasecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerDecasecond-TimeSquared","metre per decasecond squared","m/das2",Metre, DecasecondTimeSquared);
		MetrePerDecasecondTimeSquared.addAlternativeName("meter per decaseconde kwadraat","nl");
		MetrePerDecasecondTimeSquared.addAlternativeSymbol("m das-2");
		MetrePerDecasecondTimeSquared.addAlternativeSymbol("m·das-2");
		Poise = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/poise", "poise", "P", PascalSecondTime, 0.1 );
		Microgram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microgram","microgram","μg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Microgram.addAlternativeName("mcg","");
		Microgram.addAlternativeName("ug","");
		Microgram.addAlternativeName("mcg","");
		Microgram.addAlternativeName("ug","");
		MicrogramPerSquareMetreSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/microgramPerSquareMetreSecond-Time","microgram per square metre second","μg/m2.s",Microgram, SquareMetreSecondTime);
		MicrogramPerSquareMetreSecondTime.addAlternativeName("microgram per vierkante meter seconde","nl");
		MicrogramPerSquareMetreSecondTime.addAlternativeSymbol("mg/(m2 s)");
		MicrogramPerSquareMetreSecondTime.addAlternativeSymbol("mg m-2 s-1");
		MicrogramPerSquareMetreSecondTime.addAlternativeSymbol("mg·m-2·s-1");
		Nanohertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanohertz","nanohertz","nHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Hectoampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectoampere","hectoampere","hA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Hectoampere.addAlternativeName("hectoampère","nl");
		AcreFoot = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/acreFoot", "acre foot", "null", CubicMetre, 1233.489 );
		CalorieThermochemical = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/calorie-Thermochemical", "calorie (thermochemical)", "cal_th", Joule, 4.184 );
		MetreKilogramPerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metreKilogramPerSecond-Time","metre kilogram per second","m.kg/s",MetreKilogram, SecondTime);
		MetreKilogramPerSecondTime.addAlternativeName("meter kilogram per seconde","nl");
		MetreKilogramPerSecondTime.addAlternativeSymbol("m kg/s");
		MetreKilogramPerSecondTime.addAlternativeSymbol("m kg s-1");
		MetreKilogramPerSecondTime.addAlternativeSymbol("m·kg/s");
		MetreKilogramPerSecondTime.addAlternativeSymbol("m·kg·s-1");
		Kilocoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilocoulomb","kilocoulomb","kC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Hectofarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectofarad","hectofarad","hF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Millikatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millikatal","millikatal","mkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Decimetre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decimetre","decimetre","dm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Decimetre.addAlternativeName("decimeter","nl");
		DecimetrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/decimetrePerSecond-TimeSquared","decimetre per second squared","dm/s2",Decimetre, SecondTimeSquared);
		DecimetrePerSecondTimeSquared.addAlternativeName("decimeter per seconde kwadraat","nl");
		DecimetrePerSecondTimeSquared.addAlternativeSymbol("dm s-2");
		DecimetrePerSecondTimeSquared.addAlternativeSymbol("dm·s-2");
		CentisecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centisecond-Time","centisecond","cs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		CentisecondTime.addAlternativeName("centiseconde","nl");
		CentisecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/centisecond-TimeSquared","centisecond squared","cs2",CentisecondTime, 2.0);
		CentisecondTimeSquared.addAlternativeName("centiseconde kwadraat","nl");
		BitPerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/bitPerSecond-Time","bit per second","bit/s",Bit, SecondTime);
		BitPerSecondTime.addAlternativeName("bit per seconde","nl");
		BitPerSecondTime.addAlternativeSymbol("bit s-1");
		BitPerSecondTime.addAlternativeSymbol("bit·s-1");
		VoltPerAmpere = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/voltPerAmpere","volt per ampere","V/A",Volt, Ampere);
		VoltPerAmpere.addAlternativeName("volt per ampère","nl");
		VoltPerAmpere.addAlternativeSymbol("V A-1");
		VoltPerAmpere.addAlternativeSymbol("V·A-1");
		Ohm = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/ohm", "ohm", "Ω", VoltPerAmpere, 1.0 );
		Exaohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exaohm","exaohm","EΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Hectojoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectojoule","hectojoule","hJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Maxwell = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/maxwell", "maxwell", "Mx", Weber, 1.0E-8 );
		Picosievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picosievert","picosievert","pSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		SecondTimePerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/second-TimePerSquareMetre","second per square metre","s/m2",SecondTime, SquareMetre);
		SecondTimePerSquareMetre.addAlternativeSymbol("s m-2");
		SecondTimePerSquareMetre.addAlternativeSymbol("s·m-2");
		Millitesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millitesla","millitesla","mT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Yottafarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottafarad","yottafarad","YF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		ZeptosecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptosecond-TimeSquared","zeptosecond squared","zs2",ZeptosecondTime, 2.0);
		ZeptosecondTimeSquared.addAlternativeName("zeptoseconde kwadraat","nl");
		MetrePerZeptosecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerZeptosecond-TimeSquared","metre per zeptosecond squared","m/zs2",Metre, ZeptosecondTimeSquared);
		MetrePerZeptosecondTimeSquared.addAlternativeName("meter per zeptoseconde kwadraat","nl");
		MetrePerZeptosecondTimeSquared.addAlternativeSymbol("m zs-2");
		MetrePerZeptosecondTimeSquared.addAlternativeSymbol("m·zs-2");
		Abmho = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/abmho", "abmho", "null", Siemens, 1.0E9 );
		CentimetrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/centimetrePerSecond-TimeSquared","centimetre per second squared","cm/s2",Centimetre, SecondTimeSquared);
		CentimetrePerSecondTimeSquared.addAlternativeName("centimeter per seconde kwadraat","nl");
		CentimetrePerSecondTimeSquared.addAlternativeSymbol("cm s-2");
		CentimetrePerSecondTimeSquared.addAlternativeSymbol("cm·s-2");
		Kilojoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilojoule","kilojoule","kJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Decilitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decilitre","decilitre","dl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Decilitre.addAlternativeName("deciliter","nl");
		MolePerDecilitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerDecilitre","mole per decilitre","mol/dl",Mole, Decilitre);
		MolePerDecilitre.addAlternativeName("mole per deciliter","nl");
		MolePerDecilitre.addAlternativeSymbol("mol dl-1");
		MolePerDecilitre.addAlternativeSymbol("mol·dl-1");
		MetreKelvin = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/metreKelvin","metre kelvin","m.K",Metre, Kelvin);
		MetreKelvin.addAlternativeName("meter kelvin","nl");
		MetreKelvin.addAlternativeSymbol("m K");
		MetreKelvin.addAlternativeSymbol("m·K");
		WattPerMetreKelvin = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerMetreKelvin","watt per metre kelvin","W/m.K",Watt, MetreKelvin);
		WattPerMetreKelvin.addAlternativeName("watt per meter kelvin","nl");
		WattPerMetreKelvin.addAlternativeSymbol("W/(m K)");
		WattPerMetreKelvin.addAlternativeSymbol("W m-1 K-1");
		WattPerMetreKelvin.addAlternativeSymbol("W/(m·K)");
		WattPerMetreKelvin.addAlternativeSymbol("W·m-1·K-1");
		Centiampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centiampere","centiampere","cA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Centiampere.addAlternativeName("centiampère","nl");
		Hectogray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectogray","hectogray","hGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Picometre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picometre","picometre","pm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Picometre.addAlternativeName("picometer","nl");
		PicometrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/picometrePerSecond-TimeSquared","picometre per second squared","pm/s2",Picometre, SecondTimeSquared);
		PicometrePerSecondTimeSquared.addAlternativeName("picometer per seconde kwadraat","nl");
		PicometrePerSecondTimeSquared.addAlternativeSymbol("pm s-2");
		PicometrePerSecondTimeSquared.addAlternativeSymbol("pm·s-2");
		Kilomole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilomole","kilomole","kmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Kilomole.addAlternativeName("kilomol","nl");
		Gauss = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gauss", "gauss", "G", Tesla, 1.0E-4 );
		Gauss.addAlternativeSymbol("Gs");
		Milligauss = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/milligauss","milligauss","mG",(SingularUnit)Gauss, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Petakatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petakatal","petakatal","Pkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Rod = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/rod", "rod", "rd", Metre, 5.02921 );
		Nanohenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanohenry","nanohenry","nH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		PicodegreeCelsius = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picodegreeCelsius","picodegree Celsius","p°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		PicodegreeCelsius.addAlternativeName("picograad Celsius","nl");
		OhmMetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/ohmMetre","ohm metre","Ω.m",Ohm, Metre);
		OhmMetre.addAlternativeName("ohm meter","nl");
		OhmMetre.addAlternativeSymbol("Ω m");
		OhmMetre.addAlternativeSymbol("Ω·m");
		Zettagray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettagray","zettagray","ZGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		SquareMetrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMetrePerSecond-Time","square metre per second","m2/s",SquareMetre, SecondTime);
		SquareMetrePerSecondTime.addAlternativeName("vierkante meter per seconde","nl");
		SquareMetrePerSecondTime.addAlternativeSymbol("m2 s-1");
		SquareMetrePerSecondTime.addAlternativeSymbol("m2·s-1");
		Stokes = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/stokes", "stokes", "St", SquareMetrePerSecondTime, 1.0E-4 );
		Yoctokelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctokelvin","yoctokelvin","yK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		MolePerYoctometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerYoctometre","mole per yoctometre","mol/ym",Mole, Yoctometre);
		MolePerYoctometre.addAlternativeName("mole per yoctometer","nl");
		MolePerYoctometre.addAlternativeSymbol("mol ym-1");
		MolePerYoctometre.addAlternativeSymbol("mol·ym-1");
		Petabecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petabecquerel","petabecquerel","PBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Petawatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petawatt","petawatt","PW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Decinewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decinewton","decinewton","dN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Attolux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attolux","attolux","alx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Picomolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picomolair","picomolair","pM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		FemtosecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtosecond-Time","femtosecond","fs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		FemtosecondTime.addAlternativeName("femtoseconde","nl");
		Zettamolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettamolair","zettamolair","ZM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Teraampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teraampere","teraampere","TA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Teraampere.addAlternativeName("teraampère","nl");
		Pennyweight = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/pennyweight", "pennyweight", "dwt", Kilogram, 0.001555174 );
		Centilux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centilux","centilux","clx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Decahenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decahenry","decahenry","daH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Gigamolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigamolair","gigamolair","GM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Magnitude = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/magnitude", "magnitude", "mag", One, 1.0 );
		Millimagnitude = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millimagnitude","millimagnitude","mmag",(SingularUnit)Magnitude, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Picosiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picosiemens","picosiemens","pS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Femtofarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtofarad","femtofarad","fF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Kilowatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilowatt","kilowatt","kW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		VoltPerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/voltPerMetre","volt per metre","V/m",Volt, Metre);
		VoltPerMetre.addAlternativeName("volt per meter","nl");
		VoltPerMetre.addAlternativeSymbol("V m-1");
		VoltPerMetre.addAlternativeSymbol("V·m-1");
		Decasiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decasiemens","decasiemens","daS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Decalux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decalux","decalux","dalx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Megatonne = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megatonne","megatonne","Mt",(SingularUnit)Tonne, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Megatonne.addAlternativeName("megaton","nl");
		Phot = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/phot", "phot", "ph", Lux, 10000.0 );
		MetrePerNanosecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerNanosecond-TimeSquared","metre per nanosecond squared","m/ns2",Metre, NanosecondTimeSquared);
		MetrePerNanosecondTimeSquared.addAlternativeName("meter per nanoseconde kwadraat","nl");
		MetrePerNanosecondTimeSquared.addAlternativeSymbol("m ns-2");
		MetrePerNanosecondTimeSquared.addAlternativeSymbol("m·ns-2");
		Exawatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exawatt","exawatt","EW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Gigajoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigajoule","gigajoule","GJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		KilogramPerGigajoule = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramPerGigajoule","kikogram per gigajoule","kg/GJ",Kilogram, Gigajoule);
		KilogramPerGigajoule.addAlternativeName("kilogram per gigajoule","nl");
		KilogramPerGigajoule.addAlternativeSymbol("kg GJ-1");
		KilogramPerGigajoule.addAlternativeSymbol("kg·GJ-1");
		Gigalitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigalitre","gigalitre","Gl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Gigalitre.addAlternativeName("gigaliter","nl");
		GramPerGigalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerGigalitre","gram per gigalitre","g/Gl",Gram, Gigalitre);
		GramPerGigalitre.addAlternativeName("gram per gigaliter","nl");
		GramPerGigalitre.addAlternativeSymbol("g Gl-1");
		GramPerGigalitre.addAlternativeSymbol("g·Gl-1");
		TerametrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/terametrePerSecond-TimeSquared","terametre per second squared","Tm/s2",Terametre, SecondTimeSquared);
		TerametrePerSecondTimeSquared.addAlternativeName("terameter per seconde kwadraat","nl");
		TerametrePerSecondTimeSquared.addAlternativeSymbol("Tm s-2");
		TerametrePerSecondTimeSquared.addAlternativeSymbol("Tm·s-2");
		Zeptonewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptonewton","zeptonewton","zN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Petakelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petakelvin","petakelvin","PK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		ZeptodegreeCelsius = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptodegreeCelsius","zeptodegree Celsius","z°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		ZeptodegreeCelsius.addAlternativeName("zeptograad Celsius","nl");
		Femtosievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtosievert","femtosievert","fSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		CubicYoctometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicYoctometre","cubic yoctometre","ym3",Yoctometre, 3.0);
		CubicYoctometre.addAlternativeName("kubieke yoctometer","nl");
		KelvinMole = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/kelvinMole","kelvin mole","K.mol",Kelvin, Mole);
		KelvinMole.addAlternativeName("kelvin mol","nl");
		KelvinMole.addAlternativeSymbol("K mol");
		KelvinMole.addAlternativeSymbol("K·mol");
		Teramole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teramole","teramole","Tmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Teramole.addAlternativeName("teramol","nl");
		TeramolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/teramolePerMetre","teramole per metre","Tmol/m",Teramole, Metre);
		TeramolePerMetre.addAlternativeName("teramole per meter","nl");
		TeramolePerMetre.addAlternativeSymbol("Tmol m-1");
		TeramolePerMetre.addAlternativeSymbol("Tmol·m-1");
		MicromolePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/micromolePerSecond-Time","micromole per second","μmol/s",Micromole, SecondTime);
		MicromolePerSecondTime.addAlternativeName("micromol per seconde","nl");
		MicromolePerSecondTime.addAlternativeSymbol("μmol s-1");
		MicromolePerSecondTime.addAlternativeSymbol("μmol·s-1");
		MicromolePerSecondTimeGram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/micromolePerSecond-TimeGram","micromole per second gram","μmol/s/g",MicromolePerSecondTime, Gram);
		MicromolePerSecondTimeGram.addAlternativeSymbol("μmol/(s g)");
		MicromolePerSecondTimeGram.addAlternativeSymbol("μmol s-1 g-1");
		MicromolePerSecondTimeGram.addAlternativeSymbol("μmol·s-1·g-1");
		NanometrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/nanometrePerSecond-Time","nanometre per second","nm/s",Nanometre, SecondTime);
		NanometrePerSecondTime.addAlternativeName("nanometer per seconde","nl");
		NanometrePerSecondTime.addAlternativeSymbol("nm s-1");
		NanometrePerSecondTime.addAlternativeSymbol("nm·s-1");
		Zebibyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zebibyte","zebibyte","ZiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.ZEBI);
		CalorieMean = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/calorie-Mean", "calorie (mean)", "cal", Joule, 4.19002 );
		CalorieMean.addAlternativeSymbol("c");
		KilocalorieMean = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilocalorie-Mean","kilocalorie (mean)","kcal",(SingularUnit)CalorieMean, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		MillidegreeCelsius = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millidegreeCelsius","millidegree Celsius","m°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MillidegreeCelsius.addAlternativeName("milligraad Celsius","nl");
		Barye = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/barye", "barye", "ba", Pascal, 0.1 );
		Yoctonewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctonewton","yoctonewton","yN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Micronewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/micronewton","micronewton","μN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		MicronewtonMetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/micronewtonMetre","micronewton metre","μN.m",Micronewton, Metre);
		MicronewtonMetre.addAlternativeName("micronewton meter","nl");
		MicronewtonMetre.addAlternativeSymbol("μN m");
		MicronewtonMetre.addAlternativeSymbol("μN·m");
		ExametrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/exametrePerSecond-Time","exametre per second","Em/s",Exametre, SecondTime);
		ExametrePerSecondTime.addAlternativeName("exameter per seconde","nl");
		ExametrePerSecondTime.addAlternativeSymbol("Em s-1");
		ExametrePerSecondTime.addAlternativeSymbol("Em·s-1");
		Zeptometre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptometre","zeptometre","zm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Zeptometre.addAlternativeName("zeptometer","nl");
		ZeptometrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptometrePerSecond-Time","zeptometre per second","zm/s",Zeptometre, SecondTime);
		ZeptometrePerSecondTime.addAlternativeName("zeptometer per seconde","nl");
		ZeptometrePerSecondTime.addAlternativeSymbol("zm s-1");
		ZeptometrePerSecondTime.addAlternativeSymbol("zm·s-1");
		DegreeCelsiusPerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/degreeCelsiusPerSecond-Time","degree Celsius per second","°C/s",DegreeCelsius, SecondTime);
		DegreeCelsiusPerSecondTime.addAlternativeName("graad Celsius per seconde","nl");
		DegreeCelsiusPerSecondTime.addAlternativeSymbol("°C s-1");
		DegreeCelsiusPerSecondTime.addAlternativeSymbol("°C·s-1");
		DegreeReaumur = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/degreeReaumur", "degree Réaumur", "°Ré", Kelvin, 1.25 );
		DegreeReaumur.addAlternativeName("graad Réaumur","nl");
		DegreeReaumur.addAlternativeSymbol("°R");
		DegreeReaumur.addAlternativeSymbol("°Re");
		ReaumurScale = factory.createScale("http://www.ontology-of-units-of-measure.org/resource/om-2/ReaumurScale","Réaumur scale","null",KelvinScale, -218.52, 1.0, DegreeReaumur);
		ReaumurScale.addAlternativeName("Réaumurschaal","nl");
		Faraday = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/faraday", "faraday", "null", Coulomb, 96485.31 );
		Terakelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terakelvin","terakelvin","TK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Franklin = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/franklin", "franklin", "Fr", Coulomb, 3.335641E-10 );
		MolePerFemtometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerFemtometre","mole per femtometre","mol/fm",Mole, Femtometre);
		MolePerFemtometre.addAlternativeName("mole per femtometer","nl");
		MolePerFemtometre.addAlternativeSymbol("mol fm-1");
		MolePerFemtometre.addAlternativeSymbol("mol·fm-1");
		GramPerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerSquareMetre","gram per square metre","g/m2",Gram, SquareMetre);
		GramPerSquareMetre.addAlternativeName("gram per vierkante meter","nl");
		GramPerSquareMetre.addAlternativeSymbol("g m-2");
		GramPerSquareMetre.addAlternativeSymbol("g·m-2");
		GramPerSquareMetreMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerSquareMetreMetre","gram per square metre metre","g/m2/m",GramPerSquareMetre, Metre);
		GramPerSquareMetreMetre.addAlternativeSymbol("g/(m2 m)");
		GramPerSquareMetreMetre.addAlternativeSymbol("g m-2 m-1");
		GramPerSquareMetreMetre.addAlternativeSymbol("g·m-2·m-1");
		GigasecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigasecond-Time","gigasecond","Gs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		GigasecondTime.addAlternativeName("gigaseconde","nl");
		GigasecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/gigasecond-TimeSquared","gigasecond squared","Gs2",GigasecondTime, 2.0);
		GigasecondTimeSquared.addAlternativeName("gigaseconde kwadraat","nl");
		Femtohertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtohertz","femtohertz","fHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		CubicMicrometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicMicrometre","cubic micrometre","μm3",Micrometre, 3.0);
		CubicMicrometre.addAlternativeName("kubieke micrometer","nl");
		ReciprocalCubicCentimetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalCubicCentimetre","reciprocal cubic centimetre","cm1/-0.3333333333333333",Centimetre, -3.0);
		ReciprocalCubicCentimetre.addAlternativeName("omgekeerde kubieke centimeter","nl");
		ReciprocalCubicCentimetre.addAlternativeSymbol("cm-3");
		Exaweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exaweber","exaweber","EWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Femtotesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtotesla","femtotesla","fT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Centilumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centilumen","centilumen","clm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Tebibit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/tebibit","tebibit","Tibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.TEBI);
		Attomole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attomole","attomole","amol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Attomole.addAlternativeName("attomol","nl");
		AttomolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/attomolePerMetre","attomole per metre","amol/m",Attomole, Metre);
		AttomolePerMetre.addAlternativeName("attomole per meter","nl");
		AttomolePerMetre.addAlternativeSymbol("amol m-1");
		AttomolePerMetre.addAlternativeSymbol("amol·m-1");
		Zettavolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettavolt","zettavolt","ZV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Abohm = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/abohm", "abohm", "abΩ", Ohm, 1.0E-9 );
		Decigram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decigram","decigram","dg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		MolePerMole = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerMole","mole per mole","mol/mol",Mole, Mole);
		MolePerMole.addAlternativeName("mol per mol","nl");
		MolePerMole.addAlternativeSymbol("mol mol-1");
		MolePerMole.addAlternativeSymbol("mol·mol-1");
		Zeptosievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptosievert","zeptosievert","zSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Femtocoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtocoulomb","femtocoulomb","fC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Zettabit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettabit","zettabit","Zbit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Gigahertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigahertz","gigahertz","GHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Megajoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megajoule","megajoule","MJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		MegajoulePerSquareMetreDay = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/megajoulePerSquareMetreDay","megajoule per square metre day","MJ/m2.d",Megajoule, SquareMetreDay);
		MegajoulePerSquareMetreDay.addAlternativeName("megajoule per vierkante meter dag","nl");
		MegajoulePerSquareMetreDay.addAlternativeSymbol("MJ/(m2 d)");
		MegajoulePerSquareMetreDay.addAlternativeSymbol("MJ m-2 d-1");
		MegajoulePerSquareMetreDay.addAlternativeSymbol("MJ·m-2·d-1");
		GramPerExalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerExalitre","gram per exalitre","g/El",Gram, Exalitre);
		GramPerExalitre.addAlternativeName("gram per exaliter","nl");
		GramPerExalitre.addAlternativeSymbol("g El-1");
		GramPerExalitre.addAlternativeSymbol("g·El-1");
		ZeptometrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptometrePerSecond-TimeSquared","zeptometre per second squared","zm/s2",Zeptometre, SecondTimeSquared);
		ZeptometrePerSecondTimeSquared.addAlternativeName("zeptometer per seconde kwadraat","nl");
		ZeptometrePerSecondTimeSquared.addAlternativeSymbol("zm s-2");
		ZeptometrePerSecondTimeSquared.addAlternativeSymbol("zm·s-2");
		Cup = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/cup", "cup", "null", CubicMetre, 2.365882E-4 );
		SquarePicometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squarePicometre","square picometre","pm2",Picometre, 2.0);
		SquarePicometre.addAlternativeName("vierkante picometer","nl");
		Teranewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teranewton","teranewton","TN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		MileUSSurvey = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/mile-USSurvey", "mile (US survey)", "null", Metre, 1609.347 );
		Shake = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/shake", "shake", "null", SecondTime, 1.0E-8 );
		Decigray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decigray","decigray","dGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		CubicMetrePerMole = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicMetrePerMole","cubic metre per mole","m3/mol",CubicMetre, Mole);
		CubicMetrePerMole.addAlternativeName("kubieke meter per mol","nl");
		CubicMetrePerMole.addAlternativeSymbol("m3 mol-1");
		CubicMetrePerMole.addAlternativeSymbol("m3·mol-1");
		Nanogram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanogram","nanogram","ng",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		NanogramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/nanogramPerLitre","nanogram per litre","ng/l",Nanogram, Litre);
		NanogramPerLitre.addAlternativeName("nanogram per liter","nl");
		NanogramPerLitre.addAlternativeSymbol("ng l-1");
		NanogramPerLitre.addAlternativeSymbol("ng·l-1");
		Millibecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millibecquerel","millibecquerel","mBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Degree = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/degree", "degree", "°", Radian, 0.01745329 );
		Degree.addAlternativeName("graad","nl");
		HourHourAngle = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hour-HourAngle", "hour (hour angle)", "h", Degree, 15.0 );
		HourHourAngle.addAlternativeName("uur (uurhoek)","nl");
		Picotesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picotesla","picotesla","pT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		MetrePerHectosecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerHectosecond-Time","metre per hectosecond","m/hs",Metre, HectosecondTime);
		MetrePerHectosecondTime.addAlternativeName("meter per hectoseconde","nl");
		MetrePerHectosecondTime.addAlternativeSymbol("m hs-1");
		MetrePerHectosecondTime.addAlternativeSymbol("m·hs-1");
		Microweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microweber","microweber","μWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		MetreToThePower2 = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/metreToThePower-2","metre to the power -2","m1/-0.5",Metre, -2.0);
		MetreToThePower2.addAlternativeName("meter tot de macht -2","nl");
		MetreToThePower2.addAlternativeSymbol("m-2");
		ReciprocalMetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalMetre","reciprocal metre","m1/-1",Metre, -1.0);
		ReciprocalMetre.addAlternativeName("omgekeerder meter","nl");
		ReciprocalMetre.addAlternativeSymbol("m-1");
		MetreToThePower2ReciprocalMetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/metreToThePower-2ReciprocalMetre","metre to the power -2 reciprocal metre","m1/-0.5.m1/-1",MetreToThePower2, ReciprocalMetre);
		MetreToThePower2ReciprocalMetre.addAlternativeName("meter tot de macht -2 omgekeerde meter","nl");
		MetreToThePower2ReciprocalMetre.addAlternativeSymbol("m-2 m-1");
		MetreToThePower2ReciprocalMetre.addAlternativeSymbol("m-2·m-1");
		MoleMicrometre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/moleMicrometre","mole micrometre","mol.μm",Mole, Micrometre);
		MoleMicrometre.addAlternativeName("mol micrometer","nl");
		MoleMicrometre.addAlternativeSymbol("mol μm");
		MoleMicrometre.addAlternativeSymbol("mol·μm");
		ReciprocalSquareCentimetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalSquareCentimetre","reciprocal square centimetre","cm1/-0.5",Centimetre, -2.0);
		ReciprocalSquareCentimetre.addAlternativeName("omgekeerde vierkante centimeter","nl");
		ReciprocalSquareCentimetre.addAlternativeSymbol("cm-2");
		MoleMicrometreReciprocalSquareCentimetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/moleMicrometreReciprocalSquareCentimetre","mole micrometre reciprocal square centimetre","mol.μm.cm1/-0.5",MoleMicrometre, ReciprocalSquareCentimetre);
		MoleMicrometreReciprocalSquareCentimetre.addAlternativeName("mol micrometer omgekeerde vierkante centimeter","nl");
		MoleMicrometreReciprocalSquareCentimetre.addAlternativeSymbol("mol μm cm-2");
		MoleMicrometreReciprocalSquareCentimetre.addAlternativeSymbol("mol·μm·cm-2");
		Yottamole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottamole","yottamole","Ymol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Yottamole.addAlternativeName("yottamol","nl");
		Zeptosiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptosiemens","zeptosiemens","zS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Attoradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attoradian","attoradian","arad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Attoradian.addAlternativeName("attoradiaal","nl");
		Decisteradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decisteradian","decisteradian","dsr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Decisteradian.addAlternativeName("decisteradiaal","nl");
		Pebibyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/pebibyte","pebibyte","PiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.PEBI);
		MolePerHectometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerHectometre","mole per hectometre","mol/hm",Mole, Hectometre);
		MolePerHectometre.addAlternativeName("mole per hectometer","nl");
		MolePerHectometre.addAlternativeSymbol("mol hm-1");
		MolePerHectometre.addAlternativeSymbol("mol·hm-1");
		Megabyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megabyte","megabyte","MB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Decafarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decafarad","decafarad","daF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		GramPerZeptolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerZeptolitre","gram per zeptolitre","g/zl",Gram, Zeptolitre);
		GramPerZeptolitre.addAlternativeName("gram per zeptoliter","nl");
		GramPerZeptolitre.addAlternativeSymbol("g zl-1");
		GramPerZeptolitre.addAlternativeSymbol("g·zl-1");
		Tebibyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/tebibyte","tebibyte","TiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.TEBI);
		Picokelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picokelvin","picokelvin","pK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Petametre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petametre","petametre","Pm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Petametre.addAlternativeName("petameter","nl");
		Hectowatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectowatt","hectowatt","hW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		MegametrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/megametrePerSecond-TimeSquared","megametre per second squared","Mm/s2",Megametre, SecondTimeSquared);
		MegametrePerSecondTimeSquared.addAlternativeName("megameter per seconde kwadraat","nl");
		MegametrePerSecondTimeSquared.addAlternativeSymbol("Mm s-2");
		MegametrePerSecondTimeSquared.addAlternativeSymbol("Mm·s-2");
		MolePerGigalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerGigalitre","mole per gigalitre","mol/Gl",Mole, Gigalitre);
		MolePerGigalitre.addAlternativeName("mole per gigaliter","nl");
		MolePerGigalitre.addAlternativeSymbol("mol Gl-1");
		MolePerGigalitre.addAlternativeSymbol("mol·Gl-1");
		SecondAngleSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/second-AngleSquared","second (angle) squared","\"2",SecondAngle, 2.0);
		SecondAngleSquared.addAlternativeSymbol("arcsec2");
		Kibibyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kibibyte","kibibyte","KiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.KIBI);
		Microkatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microkatal","microkatal","μkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Petajoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petajoule","petajoule","PJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		HenryPerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/henryPerMetre","henry per metre","H/m",Henry, Metre);
		HenryPerMetre.addAlternativeName("henry per meter","nl");
		HenryPerMetre.addAlternativeSymbol("H m-1");
		HenryPerMetre.addAlternativeSymbol("H·m-1");
		Picosteradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picosteradian","picosteradian","psr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Picosteradian.addAlternativeName("picosteradiaal","nl");
		MillimolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/millimolePerLitre","millimole per litre","mmol/l",Millimole, Litre);
		MillimolePerLitre.addAlternativeName("millimole per liter","nl");
		MillimolePerLitre.addAlternativeSymbol("mmol l-1");
		MillimolePerLitre.addAlternativeSymbol("mmol·l-1");
		PointATA = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/point-ATA", "point (ATA)", "pt", Metre, 3.514598E-4 );
		PicaATA = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/pica-ATA", "pica (ATA)", "null", PointATA, 12.0 );
		JoulePerKelvinMole = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/joulePerKelvinMole","joule per kelvin mole","J/K.mol",Joule, KelvinMole);
		JoulePerKelvinMole.addAlternativeName("joule per kelvin mol","nl");
		JoulePerKelvinMole.addAlternativeSymbol("J/(K mol)");
		JoulePerKelvinMole.addAlternativeSymbol("J K-1 mol-1");
		JoulePerKelvinMole.addAlternativeSymbol("J/(K·mol)");
		JoulePerKelvinMole.addAlternativeSymbol("J·K-1·mol-1");
		Decikatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decikatal","decikatal","dkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Megapascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megapascal","megapascal","MPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Millimolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millimolair","millimolair","mM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Teramolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teramolair","teramolair","TM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Picomole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picomole","picomole","pmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Picomole.addAlternativeName("picomol","nl");
		PicomolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/picomolePerMetre","picomole per metre","pmol/m",Picomole, Metre);
		PicomolePerMetre.addAlternativeName("picomole per meter","nl");
		PicomolePerMetre.addAlternativeSymbol("pmol m-1");
		PicomolePerMetre.addAlternativeSymbol("pmol·m-1");
		Deciweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/deciweber","deciweber","dWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Micromolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/micromolair","micromolair","μM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Decimole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decimole","decimole","dmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Decimole.addAlternativeName("decimol","nl");
		Exakatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exakatal","exakatal","Ekat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		JoulePerMole = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/joulePerMole","joule per mole","J/mol",Joule, Mole);
		JoulePerMole.addAlternativeName("joule per mol","nl");
		JoulePerMole.addAlternativeSymbol("J mol-1");
		JoulePerMole.addAlternativeSymbol("J·mol-1");
		GramPerHectolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerHectolitre","gram per hectolitre","g/hl",Gram, Hectolitre);
		GramPerHectolitre.addAlternativeName("gram per hectoliter","nl");
		GramPerHectolitre.addAlternativeSymbol("g hl-1");
		GramPerHectolitre.addAlternativeSymbol("g·hl-1");
		Attocandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attocandela","attocandela","acd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		MoleMicrometreReciprocalSquareCentimetreReciprocalSecondTime = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/moleMicrometreReciprocalSquareCentimetreReciprocalSecond-Time","mole micrometre reciprocal square centimetre reciprocal second","mol.μm.cm1/-0.5.s1/-1",MoleMicrometreReciprocalSquareCentimetre, ReciprocalSecondTime);
		MoleMicrometreReciprocalSquareCentimetreReciprocalSecondTime.addAlternativeName("mol micrometer omgekeerde vierkante centimeter omgekeerde seconde","nl");
		MoleMicrometreReciprocalSquareCentimetreReciprocalSecondTime.addAlternativeSymbol("mol μm cm-2 s-1");
		MoleMicrometreReciprocalSquareCentimetreReciprocalSecondTime.addAlternativeSymbol("mol·μm·cm-2·s-1");
		Yottawatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottawatt","yottawatt","YW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Decabecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decabecquerel","decabecquerel","daBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Nanoampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanoampere","nanoampere","nA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Nanoampere.addAlternativeName("nanoampère","nl");
		MetrePerMillisecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerMillisecond-Time","metre per millisecond","m/ms",Metre, MillisecondTime);
		MetrePerMillisecondTime.addAlternativeName("meter per milliseconde","nl");
		MetrePerMillisecondTime.addAlternativeSymbol("m ms-1");
		MetrePerMillisecondTime.addAlternativeSymbol("m·ms-1");
		Microlux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microlux","microlux","μlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Decanewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decanewton","decanewton","daN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Bar = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/bar", "bar", "bar", Pascal, 100000.0 );
		Microbar = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microbar","microbar","μbar",(SingularUnit)Bar, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Femtoampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtoampere","femtoampere","fA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Femtoampere.addAlternativeName("femtoampère","nl");
		LitrePerHour = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/litrePerHour","litre per hour","l/h",Litre, Hour);
		LitrePerHour.addAlternativeName("liter per uur","nl");
		LitrePerHour.addAlternativeSymbol("l h-1");
		LitrePerHour.addAlternativeSymbol("l·h-1");
		PartsPerMillionPerYear = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/partsPerMillionPerYear","parts per million per year","ppm/a",PartsPerMillion, Year);
		PartsPerMillionPerYear.addAlternativeSymbol("ppm a-1");
		PartsPerMillionPerYear.addAlternativeSymbol("ppm y-1");
		PartsPerMillionPerYear.addAlternativeSymbol("ppm yr-1");
		PartsPerMillionPerYear.addAlternativeSymbol("ppm/y");
		PartsPerMillionPerYear.addAlternativeSymbol("ppm/yr");
		PartsPerMillionPerYear.addAlternativeSymbol("ppm·a-1");
		PartsPerMillionPerYear.addAlternativeSymbol("ppm·y-1");
		PartsPerMillionPerYear.addAlternativeSymbol("ppm·yr-1");
		NauticalMile = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nauticalMile", "nautical mile", "nmi", Metre, 1852.0 );
		NauticalMile.addAlternativeName("zeemijl","nl");
		NauticalMile.addAlternativeSymbol("M");
		NauticalMile.addAlternativeSymbol("NM");
		NauticalMile.addAlternativeSymbol("nm");
		NauticalMilePerHour = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/nauticalMilePerHour","nautical mile per hour","nmi/h",NauticalMile, Hour);
		NauticalMilePerHour.addAlternativeName("zeemijl per uur","nl");
		NauticalMilePerHour.addAlternativeSymbol("M/h");
		NauticalMilePerHour.addAlternativeSymbol("M h-1");
		NauticalMilePerHour.addAlternativeSymbol("M·h-1");
		NauticalMilePerHour.addAlternativeSymbol("NM h-1");
		NauticalMilePerHour.addAlternativeSymbol("NM/h");
		NauticalMilePerHour.addAlternativeSymbol("NM·h-1");
		NauticalMilePerHour.addAlternativeSymbol("nm h-1");
		NauticalMilePerHour.addAlternativeSymbol("nm/h");
		NauticalMilePerHour.addAlternativeSymbol("nmi h-1");
		NauticalMilePerHour.addAlternativeSymbol("nmi·h-1");
		NauticalMilePerHour.addAlternativeSymbol("nm·h-1");
		Knot = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/knot", "knot", "null", NauticalMilePerHour, 1.0 );
		Knot.addAlternativeName("knoop","nl");
		SquareMetreNanometre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMetreNanometre","square metre nanometre","m2.nm",SquareMetre, Nanometre);
		SquareMetreNanometre.addAlternativeName("vierkante meter nanometer","nl");
		SquareMetreNanometre.addAlternativeSymbol("m2 nm");
		SquareMetreNanometre.addAlternativeSymbol("m2·nm");
		WattPerSteradian = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerSteradian","watt per steradian","W/sr",Watt, Steradian);
		WattPerSteradian.addAlternativeName("watt per steradiaal","nl");
		WattPerSteradian.addAlternativeSymbol("W sr-1");
		WattPerSteradian.addAlternativeSymbol("W·sr-1");
		Zeptojoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptojoule","zeptojoule","zJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Femtobecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtobecquerel","femtobecquerel","fBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		MetrePerExasecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerExasecond-Time","metre per exasecond","m/Es",Metre, ExasecondTime);
		MetrePerExasecondTime.addAlternativeName("meter per exaseconde","nl");
		MetrePerExasecondTime.addAlternativeSymbol("m Es-1");
		MetrePerExasecondTime.addAlternativeSymbol("m·Es-1");
		Gigacandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigacandela","gigacandela","Gcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Yottalumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottalumen","yottalumen","Ylm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		GramPerMegajoule = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerMegajoule","gram per megajoule","g/MJ",Gram, Megajoule);
		GramPerMegajoule.addAlternativeSymbol("g MJ-1");
		GramPerMegajoule.addAlternativeSymbol("g·MJ-1");
		Teracandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teracandela","teracandela","Tcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		MetrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerSecond-Time","metre per second","m/s",Metre, SecondTime);
		MetrePerSecondTime.addAlternativeName("meter per seconde","nl");
		MetrePerSecondTime.addAlternativeSymbol("m s-1");
		MetrePerSecondTime.addAlternativeSymbol("mps");
		MetrePerSecondTime.addAlternativeSymbol("m·s-1");
		MetrePerSecondTimePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerSecond-TimePerMetre","metre per second per metre","m/s/m",MetrePerSecondTime, Metre);
		MetrePerSecondTimePerMetre.addAlternativeName("meter per seconde per metre","nl");
		MetrePerDecisecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerDecisecond-Time","metre per decisecond","m/ds",Metre, DecisecondTime);
		MetrePerDecisecondTime.addAlternativeName("meter per deciseconde","nl");
		MetrePerDecisecondTime.addAlternativeSymbol("m ds-1");
		MetrePerDecisecondTime.addAlternativeSymbol("m·ds-1");
		HorsepowerWater = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/horsepower-Water", "horsepower (water)", "null", Watt, 746.043 );
		KilomolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilomolePerMetre","kilomole per metre","kmol/m",Kilomole, Metre);
		KilomolePerMetre.addAlternativeName("kilomole per meter","nl");
		KilomolePerMetre.addAlternativeSymbol("kmol m-1");
		KilomolePerMetre.addAlternativeSymbol("kmol·m-1");
		MinuteSidereal = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/minute-Sidereal", "minute (sidereal)", "null", SecondTime, 59.83617 );
		Abcoulomb = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/abcoulomb", "abcoulomb", "abC", Coulomb, 10.0 );
		ZettasecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettasecond-Time","zettasecond","Zs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		ZettasecondTime.addAlternativeName("zettaseconde","nl");
		ZettasecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/zettasecond-TimeSquared","zettasecond squared","Zs2",ZettasecondTime, 2.0);
		ZettasecondTimeSquared.addAlternativeName("zettaseconde kwadraat","nl");
		Yoctolumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctolumen","yoctolumen","ylm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		ReciprocalGram = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalGram","reciprocal gram","g1/-1",Gram, -1.0);
		ReciprocalGram.addAlternativeName("omgekeerde gram","nl");
		ReciprocalGram.addAlternativeSymbol("g-1");
		Microfarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microfarad","microfarad","μF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		KilowattHour = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/kilowattHour","kilowatt hour","kW.h",Kilowatt, Hour);
		KilowattHour.addAlternativeSymbol("kW h");
		KilowattHour.addAlternativeSymbol("kWh");
		KilowattHour.addAlternativeSymbol("kW·h");
		Petatesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petatesla","petatesla","PT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		ColonyFormingUnit = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/colonyFormingUnit", "colony forming unit", "CFU", null);
		N1000ColonyFormingUnit = factory.createUnitMultiple("http://www.ontology-of-units-of-measure.org/resource/om-2/_1000ColonyFormingUnit","1000 colony forming unit","1000 CFU",ColonyFormingUnit, 1000.0);
		CaratMass = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/carat-Mass", "carat (mass)", "null", Kilogram, 2.0E-4 );
		CaratMass.addAlternativeName("karaat (massa)","nl");
		MicrogramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/microgramPerLitre","microgram per litre","μg/l",Microgram, Litre);
		MicrogramPerLitre.addAlternativeName("microgram per liter","nl");
		MicrogramPerLitre.addAlternativeSymbol("μg l-1");
		MicrogramPerLitre.addAlternativeSymbol("μg·l-1");
		MolePerZeptometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerZeptometre","mole per zeptometre","mol/zm",Mole, Zeptometre);
		MolePerZeptometre.addAlternativeName("mole per zeptometer","nl");
		MolePerZeptometre.addAlternativeSymbol("mol zm-1");
		MolePerZeptometre.addAlternativeSymbol("mol·zm-1");
		Zettahenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettahenry","zettahenry","ZH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		HorsepowerBoiler = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/horsepower-Boiler", "horsepower (boiler)", "null", Watt, 9809.5 );
		SolarRadius = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/solarRadius", "solar radius", "R_☉", Metre, 6.955E8 );
		MilligramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/milligramPerLitre","milligram per litre","mg/l",Milligram, Litre);
		MilligramPerLitre.addAlternativeName("milligram per liter","nl");
		MilligramPerLitre.addAlternativeSymbol("mg l-1");
		MilligramPerLitre.addAlternativeSymbol("mg·l-1");
		Attometre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attometre","attometre","am",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Attometre.addAlternativeName("attometer","nl");
		AttometrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/attometrePerSecond-Time","attometre per second","am/s",Attometre, SecondTime);
		AttometrePerSecondTime.addAlternativeName("attometer per seconde","nl");
		AttometrePerSecondTime.addAlternativeSymbol("am s-1");
		AttometrePerSecondTime.addAlternativeSymbol("am·s-1");
		Barn = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/barn", "barn", "b", SquareMetre, 1.0E-28 );
		HectareDay = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/hectareDay","hectare day","ha.d",Hectare, Day);
		HectareDay.addAlternativeName("hectare dag","nl");
		HectareDay.addAlternativeSymbol("ha d");
		HectareDay.addAlternativeSymbol("ha·d");
		KilogramPerHectareDay = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramPerHectareDay","kilogram per hectare day","kg/ha.d",Kilogram, HectareDay);
		KilogramPerHectareDay.addAlternativeName("kilogram per hectare dag","nl");
		KilogramPerHectareDay.addAlternativeSymbol("kg/(ha d)");
		KilogramPerHectareDay.addAlternativeSymbol("kg ha-1 d-1");
		KilogramPerHectareDay.addAlternativeSymbol("kg·ha-1·d-1");
		MolePerKilolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerKilolitre","mole per kilolitre","mol/kl",Mole, Kilolitre);
		MolePerKilolitre.addAlternativeName("mole per kiloliter","nl");
		MolePerKilolitre.addAlternativeSymbol("mol kl-1");
		MolePerKilolitre.addAlternativeSymbol("mol·kl-1");
		Millihenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millihenry","millihenry","mH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Terabit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terabit","terabit","Tbit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Nanotesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanotesla","nanotesla","nT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		JoulePerSquareMetreSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/joulePerSquareMetreSecond-Time","joule per square metre second","J/m2.s",Joule, SquareMetreSecondTime);
		JoulePerSquareMetreSecondTime.addAlternativeName("joule per vierkante meter seconde","nl");
		JoulePerSquareMetreSecondTime.addAlternativeSymbol("J/(m2 s)");
		JoulePerSquareMetreSecondTime.addAlternativeSymbol("J m-2 s-1");
		JoulePerSquareMetreSecondTime.addAlternativeSymbol("J·m-2·s-1");
		KilogramPerCubicmetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramPerCubicmetre","kilogram per cubic metre","kg/m3",Kilogram, CubicMetre);
		KilogramPerCubicmetre.addAlternativeName("kilogram per kubieke meter","nl");
		KilogramPerCubicmetre.addAlternativeSymbol("kg m-3");
		KilogramPerCubicmetre.addAlternativeSymbol("kg·m-3");
		YearTropical = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/year-Tropical", "year (tropical)", "null", SecondTime, 3.155693E7 );
		Yottapascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottapascal","yottapascal","YPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Attofarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attofarad","attofarad","aF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Decivolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decivolt","decivolt","dV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		LiquidPintUS = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/liquidPint-US", "liquid pint (US)", "liq pt", CubicMetre, 4.731765E-4 );
		Picocandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picocandela","picocandela","pcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Megacandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megacandela","megacandela","Mcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		N25Millilitre = factory.createUnitMultiple("http://www.ontology-of-units-of-measure.org/resource/om-2/_25Millilitre","25 millilitre","25 ml",Millilitre, 25.0);
		N25Millilitre.addAlternativeName("25 milliliter","nl");
		Kilosievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilosievert","kilosievert","kSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Nanomolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanomolair","nanomolair","nM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Megalumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megalumen","megalumen","Mlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Femtokelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtokelvin","femtokelvin","fK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Microcandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microcandela","microcandela","μcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		CentimetrePerDay = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/centimetrePerDay","centimetre per day","cm/d",Centimetre, Day);
		CentimetrePerDay.addAlternativeName("centimeter per dag","nl");
		CentimetrePerDay.addAlternativeSymbol("cm d-1");
		CentimetrePerDay.addAlternativeSymbol("cm·d-1");
		Nanomole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanomole","nanomole","nmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Nanomole.addAlternativeName("nanomol","nl");
		NanomolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/nanomolePerLitre","nanomole per litre","nmol/l",Nanomole, Litre);
		NanomolePerLitre.addAlternativeName("nanomole per liter","nl");
		NanomolePerLitre.addAlternativeSymbol("nmol l-1");
		NanomolePerLitre.addAlternativeSymbol("nmol·l-1");
		MinuteTime = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/minute-Time", "minute", "min", SecondTime, 60.0 );
		MinuteTime.addAlternativeName("minuut","nl");
		Abhenry = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/abhenry", "abhenry", "abH", Henry, 1.0E-9 );
		Teralitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teralitre","teralitre","Tl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Teralitre.addAlternativeName("teraliter","nl");
		GramPerDecilitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerDecilitre","gram per decilitre","g/dl",Gram, Decilitre);
		GramPerDecilitre.addAlternativeName("gram per deciliter","nl");
		GramPerDecilitre.addAlternativeSymbol("g dl-1");
		GramPerDecilitre.addAlternativeSymbol("g·dl-1");
		Nanolumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanolumen","nanolumen","nlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Zeptotesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptotesla","zeptotesla","zT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		SquareZeptometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareZeptometre","square zeptometre","zm2",Zeptometre, 2.0);
		SquareZeptometre.addAlternativeName("vierkante zeptometer","nl");
		Attolitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attolitre","attolitre","al",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Attolitre.addAlternativeName("attoliter","nl");
		MolePerDecametre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerDecametre","mole per decametre","mol/dam",Mole, Decametre);
		MolePerDecametre.addAlternativeName("mole per decameter","nl");
		MolePerDecametre.addAlternativeSymbol("mol dam-1");
		MolePerDecametre.addAlternativeSymbol("mol·dam-1");
		JoulePerCubicmetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/joulePerCubicmetre","joule per cubic metre","J/m3",Joule, CubicMetre);
		JoulePerCubicmetre.addAlternativeName("joule per kubieke meter","nl");
		JoulePerCubicmetre.addAlternativeSymbol("J m-3");
		JoulePerCubicmetre.addAlternativeSymbol("J·m-3");
		DecidegreeCelsius = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decidegreeCelsius","decidegree Celsius","d°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		DecidegreeCelsius.addAlternativeName("decigraad Celsius","nl");
		PintImperial = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/pint-Imperial", "pint (imperial)", "null", Millilitre, 568.26125 );
		MolePerMegalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerMegalitre","mole per megalitre","mol/Ml",Mole, Megalitre);
		MolePerMegalitre.addAlternativeName("mole per megaliter","nl");
		MolePerMegalitre.addAlternativeSymbol("mol Ml-1");
		MolePerMegalitre.addAlternativeSymbol("mol·Ml-1");
		Yobibit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yobibit","yobibit","Yibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.YOBI);
		Zeptosteradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptosteradian","zeptosteradian","zsr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Zeptosteradian.addAlternativeName("zeptosteradiaal","nl");
		HorsepowerElectric = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/horsepower-Electric", "horsepower (electric)", "null", Watt, 746.0 );
		MegaeuroPerPetajoule = null;
		Millicandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millicandela","millicandela","mcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		ReciprocalWatt = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalWatt","reciprocal watt","W1/-1",Watt, -1.0);
		ReciprocalWatt.addAlternativeName("omgekeerde watt","nl");
		ReciprocalWatt.addAlternativeSymbol("W-1");
		Zettabyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettabyte","zettabyte","ZB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Gigametre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigametre","gigametre","Gm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Gigametre.addAlternativeName("gigameter","nl");
		GigametrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gigametrePerSecond-Time","gigametre per second","Gm/s",Gigametre, SecondTime);
		GigametrePerSecondTime.addAlternativeName("gigameter per seconde","nl");
		GigametrePerSecondTime.addAlternativeSymbol("Gm s-1");
		GigametrePerSecondTime.addAlternativeSymbol("Gm·s-1");
		Millinewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millinewton","millinewton","mN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MetreToThePower2ReciprocalGram = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/metreToThePower-2ReciprocalGram","metre to the power -2 reciprocal gram","m1/-0.5.g1/-1",MetreToThePower2, ReciprocalGram);
		MetreToThePower2ReciprocalGram.addAlternativeName("meter tot de macht -2 omgekeerde gram","nl");
		MetreToThePower2ReciprocalGram.addAlternativeSymbol("m-2 g-1");
		MetreToThePower2ReciprocalGram.addAlternativeSymbol("m-2·g-1");
		WattPerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerSquareMetre","watt per square metre","W/m2",Watt, SquareMetre);
		WattPerSquareMetre.addAlternativeName("watt per vierkante meter","nl");
		WattPerSquareMetre.addAlternativeSymbol("W m-2");
		WattPerSquareMetre.addAlternativeSymbol("W·m-2");
		KilogramPerKilogram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramPerKilogram","kilogram per kilogram","kg/kg",Kilogram, Kilogram);
		KilogramPerKilogram.addAlternativeSymbol("kg kg-1");
		KilogramPerKilogram.addAlternativeSymbol("kg·kg-1");
		Decaampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decaampere","decaampere","daA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Decaampere.addAlternativeName("decaampère","nl");
		DeltaA450 = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/deltaA450", "delta A450", "null", null);
		DeltaA450PerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/deltaA450PerSecond-Time","delta A450 per second","1/s",DeltaA450, SecondTime);
		DeltaA450PerSecondTime.addAlternativeName("delta A450 per seconde","nl");
		MetrePerDay = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerDay","metre per day","m/d",Metre, Day);
		MetrePerDay.addAlternativeName("meter per dag","nl");
		MetrePerDay.addAlternativeSymbol("m d-1");
		MetrePerDay.addAlternativeSymbol("m·d-1");
		CoulombMetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/coulombMetre","coulomb metre","C.m",Coulomb, Metre);
		CoulombMetre.addAlternativeName("coulomb meter","nl");
		CoulombMetre.addAlternativeSymbol("C m");
		CoulombMetre.addAlternativeSymbol("C·m");
		MillimetrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/millimetrePerSecond-Time","millimetre per second","mm/s",Millimetre, SecondTime);
		MillimetrePerSecondTime.addAlternativeName("millimeter per seconde","nl");
		MillimetrePerSecondTime.addAlternativeSymbol("mm s-1");
		MillimetrePerSecondTime.addAlternativeSymbol("mm·s-1");
		GramPerSquareMetreCentimetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerSquareMetreCentimetre","gram per square metre centimetre","g/m2/cm",GramPerSquareMetre, Centimetre);
		GramPerSquareMetreCentimetre.addAlternativeSymbol("g/(m2 cm)");
		GramPerSquareMetreCentimetre.addAlternativeSymbol("g m-2 cm-1");
		GramPerSquareMetreCentimetre.addAlternativeSymbol("g·m-2·cm-1");
		DecimetrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/decimetrePerSecond-Time","decimetre per second","dm/s",Decimetre, SecondTime);
		DecimetrePerSecondTime.addAlternativeName("decimeter per seconde","nl");
		DecimetrePerSecondTime.addAlternativeSymbol("dm s-1");
		DecimetrePerSecondTime.addAlternativeSymbol("dm·s-1");
		Euro = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/euro", "euro", "null", null);
		Megagray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megagray","megagray","MGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Lambert = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/lambert", "lambert", "null", CandelaPerSquareMetre, 3183.099 );
		Baud = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/baud", "baud", "Bd", null);
		CubicDecimetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicDecimetre","cubic decimetre","dm3",Decimetre, 3.0);
		CubicDecimetre.addAlternativeName("kubieke decimeter","nl");
		Femtovolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtovolt","femtovolt","fV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Megagram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megagram","megagram","Mg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Centihertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centihertz","centihertz","cHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Gibibit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gibibit","gibibit","Gibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.GIBI);
		KilosecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/kilosecond-TimeSquared","kilosecond squared","ks2",KilosecondTime, 2.0);
		KilosecondTimeSquared.addAlternativeName("kiloseconde kwadraat","nl");
		MetrePerKilosecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerKilosecond-TimeSquared","metre per kilosecond squared","m/ks2",Metre, KilosecondTimeSquared);
		MetrePerKilosecondTimeSquared.addAlternativeName("meter per kiloseconde kwadraat","nl");
		MetrePerKilosecondTimeSquared.addAlternativeSymbol("m ks-2");
		MetrePerKilosecondTimeSquared.addAlternativeSymbol("m·ks-2");
		Femtolumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtolumen","femtolumen","flm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Picoampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picoampere","picoampere","pA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Picoampere.addAlternativeName("picoampère","nl");
		SquarePetametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squarePetametre","square petametre","Pm2",Petametre, 2.0);
		SquarePetametre.addAlternativeName("vierkante petameter","nl");
		FluidOunceImperial = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/fluidOunce-Imperial", "fluid ounce (imperial)", "fl oz", CubicMetre, 2.841306E-5 );
		MegagramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/megagramPerLitre","megagram per litre","Mg/l",Megagram, Litre);
		MegagramPerLitre.addAlternativeName("megagram per liter","nl");
		MegagramPerLitre.addAlternativeSymbol("Mg l-1");
		MegagramPerLitre.addAlternativeSymbol("Mg·l-1");
		Microsievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microsievert","microsievert","μSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Yoctolux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctolux","yoctolux","ylx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		GramPerKilolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerKilolitre","gram per kilolitre","g/kl",Gram, Kilolitre);
		GramPerKilolitre.addAlternativeName("gram per kiloliter","nl");
		GramPerKilolitre.addAlternativeSymbol("g kl-1");
		GramPerKilolitre.addAlternativeSymbol("g·kl-1");
		CubicPetametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicPetametre","cubic petametre","Pm3",Petametre, 3.0);
		CubicPetametre.addAlternativeName("kubieke petameter","nl");
		Mebibyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/mebibyte","mebibyte","MiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.MEBI);
		Kilobecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilobecquerel","kilobecquerel","kBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		MillimetrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/millimetrePerSecond-TimeSquared","millimetre per second squared","mm/s2",Millimetre, SecondTimeSquared);
		MillimetrePerSecondTimeSquared.addAlternativeName("millimeter per seconde kwadraat","nl");
		MillimetrePerSecondTimeSquared.addAlternativeSymbol("mm s-2");
		MillimetrePerSecondTimeSquared.addAlternativeSymbol("mm·s-2");
		MolePerTerametre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerTerametre","mole per terametre","mol/Tm",Mole, Terametre);
		MolePerTerametre.addAlternativeName("mole per terameter","nl");
		MolePerTerametre.addAlternativeSymbol("mol Tm-1");
		MolePerTerametre.addAlternativeSymbol("mol·Tm-1");
		Attopascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attopascal","attopascal","aPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Zettakatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettakatal","zettakatal","Zkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		DecimolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/decimolePerLitre","decimole per litre","dmol/l",Decimole, Litre);
		DecimolePerLitre.addAlternativeName("decimole per liter","nl");
		DecimolePerLitre.addAlternativeSymbol("dmol l-1");
		DecimolePerLitre.addAlternativeSymbol("dmol·l-1");
		WattPerSquareMetreKelvin = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerSquareMetreKelvin","watt per square metre kelvin","W/m2.K",Watt, SquareMetreKelvin);
		WattPerSquareMetreKelvin.addAlternativeName("watt per vierkante meter kelvin","nl");
		WattPerSquareMetreKelvin.addAlternativeSymbol("W/m2 K");
		WattPerSquareMetreKelvin.addAlternativeSymbol("W-1 m2 K");
		WattPerSquareMetreKelvin.addAlternativeSymbol("W-1·m2·K");
		WattPerSquareMetreKelvin.addAlternativeSymbol("W/(m2·K)");
		Gigahenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigahenry","gigahenry","GH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		MilligramPerHectogram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/milligramPerHectogram","milligram per hectogram","mg/hg",Milligram, Hectogram);
		MilligramPerHectogram.addAlternativeSymbol("mg hg-1");
		MilligramPerHectogram.addAlternativeSymbol("mg·hg-1");
		Microlitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microlitre","microlitre","μl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Microlitre.addAlternativeName("microliter","nl");
		Microlitre.addAlternativeName("ul","");
		GramPerMicrolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerMicrolitre","gram per microlitre","g/μl",Gram, Microlitre);
		GramPerMicrolitre.addAlternativeName("gram per microliter","nl");
		GramPerMicrolitre.addAlternativeSymbol("g μl-1");
		GramPerMicrolitre.addAlternativeSymbol("g·μl-1");
		Yottalitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottalitre","yottalitre","Yl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Yottalitre.addAlternativeName("yottaliter","nl");
		MolePerYottalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerYottalitre","mole per yottalitre","mol/Yl",Mole, Yottalitre);
		MolePerYottalitre.addAlternativeName("mole per yottaliter","nl");
		MolePerYottalitre.addAlternativeSymbol("mol Yl-1");
		MolePerYottalitre.addAlternativeSymbol("mol·Yl-1");
		Nanokelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanokelvin","nanokelvin","nK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		PointPostscript = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/point-Postscript", "point (Postscript)", "pt", Inch, 0.013888888888888888 );
		PicaPostscript = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/pica-Postscript", "pica (Postscript)", "null", PointPostscript, 12.0 );
		GrayPerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/grayPerSecond-Time","gray per second","Gy/s",Gray, SecondTime);
		GrayPerSecondTime.addAlternativeName("gray per seconde","nl");
		GrayPerSecondTime.addAlternativeSymbol("Gy s-1");
		GrayPerSecondTime.addAlternativeSymbol("Gy·s-1");
		Zeptofarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptofarad","zeptofarad","zF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		HectomolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/hectomolePerLitre","hectomole per litre","hmol/l",Hectomole, Litre);
		HectomolePerLitre.addAlternativeName("hectomole per liter","nl");
		HectomolePerLitre.addAlternativeSymbol("hmol l-1");
		HectomolePerLitre.addAlternativeSymbol("hmol·l-1");
		Teraohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teraohm","teraohm","TΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Megavolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megavolt","megavolt","MV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		MicromolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/micromolePerLitre","micromole per litre","μmol/l",Micromole, Litre);
		MicromolePerLitre.addAlternativeName("micromole per liter","nl");
		MicromolePerLitre.addAlternativeSymbol("μmol l-1");
		MicromolePerLitre.addAlternativeSymbol("μmol·l-1");
		Megahertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megahertz","megahertz","MHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		NanometrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/nanometrePerSecond-TimeSquared","nanometre per second squared","nm/s2",Nanometre, SecondTimeSquared);
		NanometrePerSecondTimeSquared.addAlternativeName("nanometer per seconde kwadraat","nl");
		NanometrePerSecondTimeSquared.addAlternativeSymbol("nm s-2");
		NanometrePerSecondTimeSquared.addAlternativeSymbol("nm·s-2");
		Decamole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decamole","decamole","damol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Decamole.addAlternativeName("decamol","nl");
		DecamolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/decamolePerLitre","decamole per litre","damol/l",Decamole, Litre);
		DecamolePerLitre.addAlternativeName("decamole per liter","nl");
		DecamolePerLitre.addAlternativeSymbol("damol l-1");
		DecamolePerLitre.addAlternativeSymbol("damol·l-1");
		Femtomolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtomolair","femtomolair","fM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		PicosecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/picosecond-TimeSquared","picosecond squared","ps2",PicosecondTime, 2.0);
		PicosecondTimeSquared.addAlternativeName("picoseconde kwadraat","nl");
		MetrePerPicosecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerPicosecond-TimeSquared","metre per picosecond squared","m/ps2",Metre, PicosecondTimeSquared);
		MetrePerPicosecondTimeSquared.addAlternativeName("meter per picoseconde kwadraat","nl");
		MetrePerPicosecondTimeSquared.addAlternativeSymbol("m ps-2");
		MetrePerPicosecondTimeSquared.addAlternativeSymbol("m·ps-2");
		Gigakelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigakelvin","gigakelvin","GK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		CubicZeptometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicZeptometre","cubic zeptometre","zm3",Zeptometre, 3.0);
		CubicZeptometre.addAlternativeName("kubieke zeptometer","nl");
		SolarMassPerCubicParsec = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/solarMassPerCubicParsec","solar mass per cubic parsec","M_☉/pc3",SolarMass, CubicParsec);
		SolarMassPerCubicParsec.addAlternativeName("zonsmassa per kubieke parsec","nl");
		SolarMassPerCubicParsec.addAlternativeSymbol("M_☉ pc-3");
		SolarMassPerCubicParsec.addAlternativeSymbol("M_☉·pc-3");
		MegamolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/megamolePerMetre","megamole per metre","Mmol/m",Megamole, Metre);
		MegamolePerMetre.addAlternativeName("megamole per meter","nl");
		MegamolePerMetre.addAlternativeSymbol("Mmol m-1");
		MegamolePerMetre.addAlternativeSymbol("Mmol·m-1");
		BritishThermalUnit59F = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/BritishThermalUnit-59F", "British thermal unit (59 °F)", "Btu", Joule, 1054.8 );
		Centiohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centiohm","centiohm","cΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Attocoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attocoulomb","attocoulomb","aC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Mebibit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/mebibit","mebibit","Mibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.MEBI);
		SiemensPerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/siemensPerMetre","siemens per metre","S/m",Siemens, Metre);
		SiemensPerMetre.addAlternativeName("siemens per meter","nl");
		SiemensPerMetre.addAlternativeSymbol("S m-1");
		SiemensPerMetre.addAlternativeSymbol("S·m-1");
		Hectoohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectoohm","hectoohm","hΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Kilocandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilocandela","kilocandela","kcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Kilokelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilokelvin","kilokelvin","kK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Yottacoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottacoulomb","yottacoulomb","YC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Zettacoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettacoulomb","zettacoulomb","ZC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		MicrometrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/micrometrePerSecond-TimeSquared","micrometre per second squared","μm/s2",Micrometre, SecondTimeSquared);
		MicrometrePerSecondTimeSquared.addAlternativeName("micrometer per seconde kwadraat","nl");
		MicrometrePerSecondTimeSquared.addAlternativeSymbol("μm s-2");
		MicrometrePerSecondTimeSquared.addAlternativeSymbol("μm·s-2");
		Microampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microampere","microampere","μA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Microampere.addAlternativeName("microampère","nl");
		AtmosphereTechnical = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/atmosphere-Technical", "atmosphere (technical)", "at", Pascal, 98066.5 );
		Gigaampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigaampere","gigaampere","GA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Gigaampere.addAlternativeName("gigaampère","nl");
		Kilonewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilonewton","kilonewton","kN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Millihertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millihertz","millihertz","mHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Microsiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microsiemens","microsiemens","μS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Millisiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millisiemens","millisiemens","mS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Pebibit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/pebibit","pebibit","Pibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.PEBI);
		Femtolitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtolitre","femtolitre","fl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Femtolitre.addAlternativeName("femtoliter","nl");
		ColonyFormingUnitPer25Millilitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/colonyFormingUnitPer25Millilitre","colony forming unit per 25 millilitre","CFU/25 ml",ColonyFormingUnit, N25Millilitre);
		ColonyFormingUnitPer25Millilitre.addAlternativeSymbol("CFU/ml");
		MetrePerMicrosecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerMicrosecond-Time","metre per microsecond","m/μs",Metre, MicrosecondTime);
		MetrePerMicrosecondTime.addAlternativeName("meter per microseconde","nl");
		MetrePerMicrosecondTime.addAlternativeSymbol("m μs-1");
		MetrePerMicrosecondTime.addAlternativeSymbol("m·μs-1");
		ExasecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/exasecond-TimeSquared","exasecond squared","Es2",ExasecondTime, 2.0);
		ExasecondTimeSquared.addAlternativeName("exaseconde kwadraat","nl");
		DegreeFahrenheit = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/degreeFahrenheit", "degree Fahrenheit", "°F", Kelvin, 0.5555556 );
		DegreeFahrenheit.addAlternativeName("graad Fahrenheit","nl");
		FahrenheitScale = factory.createScale("http://www.ontology-of-units-of-measure.org/resource/om-2/FahrenheitScale","Fahrenheit scale","null",KelvinScale, -459.67, 1.8, DegreeFahrenheit);
		FahrenheitScale.addAlternativeName("Fahrenheitschaal","nl");
		HundredweightBritish = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hundredweight-British", "hundredweight (British)", "null", Kilogram, 50.80235 );
		HourSidereal = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hour-Sidereal", "hour (sidereal)", "null", SecondTime, 3590.17 );
		YottametrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/yottametrePerSecond-TimeSquared","yottametre per second squared","Ym/s2",Yottametre, SecondTimeSquared);
		YottametrePerSecondTimeSquared.addAlternativeName("yottameter per seconde kwadraat","nl");
		YottametrePerSecondTimeSquared.addAlternativeSymbol("Ym s-2");
		YottametrePerSecondTimeSquared.addAlternativeSymbol("Ym·s-2");
		Terahertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terahertz","terahertz","THz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		KilogramSecondTimeToThePower2 = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramSecond-TimeToThePower-2","reciprocal metre kilogram","kg.s1/-0.5",Kilogram, SecondTimeToThePower2);
		KilogramSecondTimeToThePower2.addAlternativeName("omgekeerde meter kilogram","nl");
		KilogramSecondTimeToThePower2.addAlternativeSymbol("m-1 kg");
		KilogramSecondTimeToThePower2.addAlternativeSymbol("m-1·kg");
		DecigramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/decigramPerLitre","decigram per litre","dg/l",Decigram, Litre);
		DecigramPerLitre.addAlternativeName("decigram per liter","nl");
		DecigramPerLitre.addAlternativeSymbol("dg l-1");
		DecigramPerLitre.addAlternativeSymbol("dg·l-1");
		Yoctocandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctocandela","yoctocandela","ycd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Cord = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/cord", "cord", "null", CubicMetre, 3.624556 );
		Picogram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picogram","picogram","pg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		PicogramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/picogramPerLitre","picogram per litre","pg/l",Picogram, Litre);
		PicogramPerLitre.addAlternativeName("picogram per liter","nl");
		PicogramPerLitre.addAlternativeSymbol("pg l-1");
		PicogramPerLitre.addAlternativeSymbol("pg·l-1");
		Petafarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petafarad","petafarad","PF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Kilokatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilokatal","kilokatal","kkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Teralumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teralumen","teralumen","Tlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		GramPerKilogram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerKilogram","gram per kilogram","g/kg",Gram, Kilogram);
		GramPerKilogram.addAlternativeSymbol("g kg-1");
		GramPerKilogram.addAlternativeSymbol("g·kg-1");
		MolePermegametre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePermegametre","mole per megametre","mol/Mm",Mole, Megametre);
		MolePermegametre.addAlternativeName("mole per megameter","nl");
		MolePermegametre.addAlternativeSymbol("mol Mm-1");
		MolePermegametre.addAlternativeSymbol("mol·Mm-1");
		MolePerYoctolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerYoctolitre","mole per yoctolitre","mol/yl",Mole, Yoctolitre);
		MolePerYoctolitre.addAlternativeName("mole per yoctoliter","nl");
		MolePerYoctolitre.addAlternativeSymbol("mol yl-1");
		MolePerYoctolitre.addAlternativeSymbol("mol·yl-1");
		MetrePerZettasecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerZettasecond-TimeSquared","metre per zettasecond squared","m/Zs2",Metre, ZettasecondTimeSquared);
		MetrePerZettasecondTimeSquared.addAlternativeName("meter per zettaseconde kwadraat","nl");
		MetrePerZettasecondTimeSquared.addAlternativeSymbol("m Zs-2");
		MetrePerZettasecondTimeSquared.addAlternativeSymbol("m·Zs-2");
		Megahenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megahenry","megahenry","MH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Decagram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decagram","decagram","dag",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		DecagramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/decagramPerLitre","decagram per litre","dag/l",Decagram, Litre);
		DecagramPerLitre.addAlternativeName("decagram per liter","nl");
		DecagramPerLitre.addAlternativeSymbol("dag l-1");
		DecagramPerLitre.addAlternativeSymbol("dag·l-1");
		Millilumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millilumen","millilumen","mlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Zettaohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettaohm","zettaohm","ZΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		ReciprocalKelvin = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalKelvin","reciprocal kelvin","K1/-1",Kelvin, -1.0);
		ReciprocalKelvin.addAlternativeName("omgekeerde kelvin","nl");
		ReciprocalKelvin.addAlternativeSymbol("K-1");
		KilogramPerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramPerSecond-Time","kilogram per second","kg/s",Kilogram, SecondTime);
		KilogramPerSecondTime.addAlternativeName("kilogram per seconde","nl");
		KilogramPerSecondTime.addAlternativeSymbol("kg s-1");
		KilogramPerSecondTime.addAlternativeSymbol("kg·s-1");
		Centiradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centiradian","centiradian","crad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Centiradian.addAlternativeName("centiradiaal","nl");
		Picovolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picovolt","picovolt","pV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		SteradianSquareMetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/steradianSquareMetre","steradian square metre","sr.m2",Steradian, SquareMetre);
		SteradianSquareMetre.addAlternativeName("steradiaal vierkante meter","nl");
		SteradianSquareMetre.addAlternativeSymbol("sr m2");
		SteradianSquareMetre.addAlternativeSymbol("sr·m2");
		SteradianSquareMetreHertz = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/steradianSquareMetreHertz","steradian square metre hertz","sr.m2.Hz",SteradianSquareMetre, Hertz);
		SteradianSquareMetreHertz.addAlternativeName("steradiaal vierkante meter hertz","nl");
		SteradianSquareMetreHertz.addAlternativeSymbol("sr m2 Hz");
		SteradianSquareMetreHertz.addAlternativeSymbol("sr·m2·Hz");
		WattPerSteradianSquareMetreHertz = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerSteradianSquareMetreHertz","watt per steradian square metre hertz","W/sr.m2.Hz",Watt, SteradianSquareMetreHertz);
		WattPerSteradianSquareMetreHertz.addAlternativeName("watt per steradiaal vierkante meter hertz","nl");
		WattPerSteradianSquareMetreHertz.addAlternativeSymbol("W/(sr m2 Hz)");
		WattPerSteradianSquareMetreHertz.addAlternativeSymbol("W sr-1 m-2 Hz-1");
		WattPerSteradianSquareMetreHertz.addAlternativeSymbol("W·sr-1·m-2·Hz-1");
		DegreeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/degreeSquared","degree squared","°2",Degree, 2.0);
		GramPerSquareMetreDay = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerSquareMetreDay","gram per square metre day","g/m2.d",Gram, SquareMetreDay);
		GramPerSquareMetreDay.addAlternativeName("gram per vierkante meter dag","nl");
		GramPerSquareMetreDay.addAlternativeSymbol("g/(m2 d)");
		GramPerSquareMetreDay.addAlternativeSymbol("g m-2 d-1");
		GramPerSquareMetreDay.addAlternativeSymbol("g·m-2·d-1");
		MilligramRAE = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/milligramRAE", "milligram RAE", "null", nl.wur.fbr.om.model.dimensions.SIBaseDimension.MASS);
		PointTeX = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/point-TeX", "point (TeX)", "pt", Inch, 0.013837000138370002 );
		PascalSecondTimeSquareMetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/pascalSecond-TimeSquareMetre","pascal second square metre","Pa.s.m2",PascalSecondTime, SquareMetre);
		PascalSecondTimeSquareMetre.addAlternativeName("pascal seconde vierkante meter","nl");
		PascalSecondTimeSquareMetre.addAlternativeSymbol("Pa s m2");
		PascalSecondTimeSquareMetre.addAlternativeSymbol("Pa·s·m2");
		KilogramPerPascalSecondTimeSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramPerPascalSecond-TimeSquareMetre","kilogram per pascal second square metre","kg/Pa.s.m2",Kilogram, PascalSecondTimeSquareMetre);
		KilogramPerPascalSecondTimeSquareMetre.addAlternativeName("kilogram per pascal seconde vierkante meter","nl");
		KilogramPerPascalSecondTimeSquareMetre.addAlternativeSymbol("kg Pa-1 s-1 m-2");
		KilogramPerPascalSecondTimeSquareMetre.addAlternativeSymbol("kg/(Pa s m2)");
		KilogramPerPascalSecondTimeSquareMetre.addAlternativeSymbol("kg/(Pa·s·m2)");
		KilogramPerPascalSecondTimeSquareMetre.addAlternativeSymbol("kg·Pa-1·s-1·m-2");
		Perm23C = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/perm-23C", "perm (23 °C)", "null", KilogramPerPascalSecondTimeSquareMetre, 5.74525E-11 );
		Nanonewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanonewton","nanonewton","nN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		FaradPerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/faradPerMetre","farad per metre","F/m",Farad, Metre);
		FaradPerMetre.addAlternativeName("farad per meter","nl");
		FaradPerMetre.addAlternativeSymbol("F m-1");
		FaradPerMetre.addAlternativeSymbol("F·m-1");
		Millisievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millisievert","millisievert","mSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		SquareHectometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareHectometre","square hectometre","hm2",Hectometre, 2.0);
		SquareHectometre.addAlternativeName("vierkante hectometer","nl");
		Milliampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/milliampere","milliampere","mA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Milliampere.addAlternativeName("milliampère","nl");
		WattPerSecondAngleSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerSecond-AngleSquared","watt per second (angle) squared","W/\"2",Watt, SecondAngleSquared);
		WattPerSecondAngleSquared.addAlternativeSymbol("W/arcsec2");
		WattPerSecondAngleSquared.addAlternativeSymbol("W arcsec-2");
		WattPerSecondAngleSquared.addAlternativeSymbol("W·arcsec-2");
		Hectoweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectoweber","hectoweber","hWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Kiloampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kiloampere","kiloampere","kA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Kiloampere.addAlternativeName("kiloampère","nl");
		NewtonPerCoulomb = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/newtonPerCoulomb","newton per coulomb","N/C",Newton, Coulomb);
		NewtonPerCoulomb.addAlternativeSymbol("N C-1");
		NewtonPerCoulomb.addAlternativeSymbol("N·C-1");
		YoctosecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctosecond-Time","yoctosecond","ys",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		YoctosecondTime.addAlternativeName("yoctoseconde","nl");
		MetrePerYoctosecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerYoctosecond-Time","metre per yoctosecond","m/ys",Metre, YoctosecondTime);
		MetrePerYoctosecondTime.addAlternativeName("meter per yoctoseconde","nl");
		MetrePerYoctosecondTime.addAlternativeSymbol("m ys-1");
		MetrePerYoctosecondTime.addAlternativeSymbol("m·ys-1");
		Millikelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millikelvin","millikelvin","mK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MicrogramPerCubicCentimetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/microgramPerCubicCentimetre","microgram per cubic centimetre","μg/cm3",Microgram, CubicCentimetre);
		MicrogramPerCubicCentimetre.addAlternativeName("microgram per kubieke centimeter","nl");
		MicrogramPerCubicCentimetre.addAlternativeSymbol("μg cm-3");
		MicrogramPerCubicCentimetre.addAlternativeSymbol("μg·cm-3");
		Microkelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microkelvin","microkelvin","μK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		BritishThermalUnit39F = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/BritishThermalUnit-39F", "British thermal unit (39 °F)", "Btu", Joule, 1059.67 );
		HundredweightUS = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hundredweight-US", "hundredweight (US)", "null", Kilogram, 45.35924 );
		MinuteHourAngle = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/minute-HourAngle", "minute (hour angle)", "m", Degree, 0.25 );
		MinuteHourAngle.addAlternativeName("minuut (uurhoek)","nl");
		TonForce = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/ton-Force", "ton-force", "null", Newton, 8896.443 );
		Femtokatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtokatal","femtokatal","fkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Microohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microohm","microohm","μΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		BritishThermalUnit60F = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/BritishThermalUnit-60F", "British thermal unit (60 °F)", "Btu", Joule, 1054.68 );
		CubicNanometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicNanometre","cubic nanometre","nm3",Nanometre, 3.0);
		CubicNanometre.addAlternativeName("kubieke nanometer","nl");
		Electronvolt = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/electronvolt", "electronvolt", "eV", Joule, 1.602177E-19 );
		SquareMetreSteradian = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMetreSteradian","square metre steradian","m2.sr",SquareMetre, Steradian);
		SquareMetreSteradian.addAlternativeName("vierkante meter steradian","nl");
		SquareMetreSteradian.addAlternativeSymbol("m2 sr");
		SquareMetreSteradian.addAlternativeSymbol("m2·sr");
		WattPerSquareMetreSteradian = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerSquareMetreSteradian","watt per square metre steradian","W/m2.sr",Watt, SquareMetreSteradian);
		WattPerSquareMetreSteradian.addAlternativeName("watt per vierkante meter steradiaal","nl");
		WattPerSquareMetreSteradian.addAlternativeSymbol("W/(m2 sr)");
		WattPerSquareMetreSteradian.addAlternativeSymbol("W m-2 sr-1");
		WattPerSquareMetreSteradian.addAlternativeSymbol("W/(m2·sr)");
		WattPerSquareMetreSteradian.addAlternativeSymbol("W·m-2·sr-1");
		Yoctobecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctobecquerel","yoctobecquerel","yBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Attosteradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attosteradian","attosteradian","asr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Attosteradian.addAlternativeName("attosteradiaal","nl");
		GramPerYottalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerYottalitre","gram per yottalitre","g/Yl",Gram, Yottalitre);
		GramPerYottalitre.addAlternativeName("gram per yottaliter","nl");
		GramPerYottalitre.addAlternativeSymbol("g Yl-1");
		GramPerYottalitre.addAlternativeSymbol("g·Yl-1");
		Centicoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centicoulomb","centicoulomb","cC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Decicoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decicoulomb","decicoulomb","dC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		AttomolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/attomolePerLitre","attomole per litre","amol/l",Attomole, Litre);
		AttomolePerLitre.addAlternativeName("attomole per liter","nl");
		AttomolePerLitre.addAlternativeSymbol("amol l-1");
		AttomolePerLitre.addAlternativeSymbol("amol·l-1");
		Picogray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picogray","picogray","pGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Exahertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exahertz","exahertz","EHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		ColonyFormingUnitPerMillilitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/colonyFormingUnitPerMillilitre","colony forming unit per millilitre","CFU/ml",ColonyFormingUnit, Millilitre);
		ReciprocalDay = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalDay","reciprocal day","d1/-1",Day, -1.0);
		ReciprocalDay.addAlternativeName("omgekeerde dag","nl");
		ReciprocalDay.addAlternativeSymbol("d-1");
		NanomolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/nanomolePerMetre","nanomole per metre","nmol/m",Nanomole, Metre);
		NanomolePerMetre.addAlternativeName("nanomole per meter","nl");
		NanomolePerMetre.addAlternativeSymbol("nmol m-1");
		NanomolePerMetre.addAlternativeSymbol("nmol·m-1");
		Deciampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/deciampere","deciampere","dA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Deciampere.addAlternativeName("deciampère","nl");
		KilogramPerMole = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramPerMole","kilogram per mole","kg/mol",Kilogram, Mole);
		KilogramPerMole.addAlternativeName("kilogram per mol","nl");
		KilogramPerMole.addAlternativeSymbol("kg mol-1");
		KilogramPerMole.addAlternativeSymbol("kg·mol-1");
		MilligramPerCubicmetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/milligramPerCubicmetre","milligram per cubic metre","mg/m3",Milligram, CubicMetre);
		MilligramPerCubicmetre.addAlternativeName("milligram per kubieke meter","nl");
		MilligramPerCubicmetre.addAlternativeSymbol("mg m-3");
		MilligramPerCubicmetre.addAlternativeSymbol("mg·m-3");
		Yoctojoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctojoule","yoctojoule","yJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		PetametrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/petametrePerSecond-TimeSquared","petametre per second squared","Pm/s2",Petametre, SecondTimeSquared);
		PetametrePerSecondTimeSquared.addAlternativeName("petameter per seconde kwadraat","nl");
		PetametrePerSecondTimeSquared.addAlternativeSymbol("Pm s-2");
		PetametrePerSecondTimeSquared.addAlternativeSymbol("Pm·s-2");
		Zeptoampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptoampere","zeptoampere","zA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Zeptoampere.addAlternativeName("zeptoampère","nl");
		TonAssay = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/ton-Assay", "ton (assay)", "null", Kilogram, 0.02916667 );
		MillimetrePerDay = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/millimetrePerDay","millimetre per day","mm/d",Millimetre, Day);
		MillimetrePerDay.addAlternativeName("millimeter per dag","nl");
		MillimetrePerDay.addAlternativeSymbol("mm d-1");
		MillimetrePerDay.addAlternativeSymbol("mm·d-1");
		Yoctocoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctocoulomb","yoctocoulomb","yC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Millipascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millipascal","millipascal","mPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		TerasecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terasecond-Time","terasecond","Ts",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		TerasecondTime.addAlternativeName("teraseconde","nl");
		TerasecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/terasecond-TimeSquared","terasecond squared","Ts2",TerasecondTime, 2.0);
		TerasecondTimeSquared.addAlternativeName("teraseconde kwadraat","nl");
		Megacoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megacoulomb","megacoulomb","MC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		PetametrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/petametrePerSecond-Time","petametre per second","Pm/s",Petametre, SecondTime);
		PetametrePerSecondTime.addAlternativeName("petameter per seconde","nl");
		PetametrePerSecondTime.addAlternativeSymbol("Pm s-1");
		PetametrePerSecondTime.addAlternativeSymbol("Pm·s-1");
		Centifarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centifarad","centifarad","cF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Week = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/week", "week", "null", SecondTime, 604800.0 );
		LumenPerWatt = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/lumenPerWatt","lumen per watt","lm/W",Lumen, Watt);
		LumenPerWatt.addAlternativeSymbol("lm W-1");
		LumenPerWatt.addAlternativeSymbol("lm·W-1");
		MolePerFemtolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerFemtolitre","mole per femtolitre","mol/fl",Mole, Femtolitre);
		MolePerFemtolitre.addAlternativeName("mole per femtoliter","nl");
		MolePerFemtolitre.addAlternativeSymbol("mol fl-1");
		MolePerFemtolitre.addAlternativeSymbol("mol·fl-1");
		Zeptoohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptoohm","zeptoohm","zΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Yottabyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottabyte","yottabyte","YB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		MicrodegreeCelsius = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microdegreeCelsius","microdegree Celsius","μ°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		MicrodegreeCelsius.addAlternativeName("micrograad Celsius","nl");
		Fermi = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/fermi", "fermi", "null", Metre, 1.0E-15 );
		SquareAttometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareAttometre","square attometre","am2",Attometre, 2.0);
		SquareAttometre.addAlternativeName("vierkante attometer","nl");
		Grain = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/grain", "grain", "gr", Kilogram, 6.479891E-5 );
		PoundApothecaries = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/poundApothecaries", "pound (apthecaries')", "lb", Kilogram, 0.3732417 );
		CelsiusScale = factory.createScale("http://www.ontology-of-units-of-measure.org/resource/om-2/CelsiusScale","Celsius scale","null",KelvinScale, -273.15, 1.0, DegreeCelsius);
		Point pointCelsiusScale1 = new PointImpl(-189.3442, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale1);
		Point pointCelsiusScale2 = new PointImpl(-218.7916, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale2);
		Point pointCelsiusScale3 = new PointImpl(-248.5939, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale3);
		Point pointCelsiusScale4 = new PointImpl(-259.3467, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale4);
		Point pointCelsiusScale5 = new PointImpl(Range.between(-270.15, -268.15), CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale5);
		Point pointCelsiusScale6 = new PointImpl(-38.8344, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale6);
		Point pointCelsiusScale7 = new PointImpl(0.01, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale7);
		Point pointCelsiusScale8 = new PointImpl(1064.18, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale8);
		Point pointCelsiusScale9 = new PointImpl(1084.62, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale9);
		Point pointCelsiusScale10 = new PointImpl(156.5985, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale10);
		Point pointCelsiusScale11 = new PointImpl(231.928, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale11);
		Point pointCelsiusScale12 = new PointImpl(29.7646, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale12);
		Point pointCelsiusScale13 = new PointImpl(419.527, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale13);
		Point pointCelsiusScale14 = new PointImpl(660.323, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale14);
		Point pointCelsiusScale15 = new PointImpl(961.78, CelsiusScale);
		CelsiusScale.addDefinitionPoint(pointCelsiusScale15);
		CelsiusScale.addAlternativeName("Celsiusschaal","nl");
		MillisecondAngle = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millisecond-Angle","millisecond (angle)","mas",(SingularUnit)SecondAngle, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MillisecondAngle.addAlternativeName("milliseconde (hoek)","nl");
		MillisecondAngle.addAlternativeName("milliboogseconde","nl");
		MillisecondAngle.addAlternativeName("milliseconde (hoek)","nl");
		MillisecondAngle.addAlternativeName("milliboogseconde","nl");
		MillimetrePerHour = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/millimetrePerHour","millimetre per hour","mm/h",Millimetre, Hour);
		MillimetrePerHour.addAlternativeName("millimeter per uur","nl");
		MillimetrePerHour.addAlternativeSymbol("mm h-1");
		MillimetrePerHour.addAlternativeSymbol("mm·h-1");
		Microtesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microtesla","microtesla","μT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Gigabecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigabecquerel","gigabecquerel","GBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		MolePerHectolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerHectolitre","mole per hectolitre","mol/hl",Mole, Hectolitre);
		MolePerHectolitre.addAlternativeName("mole per hectoliter","nl");
		MolePerHectolitre.addAlternativeSymbol("mol hl-1");
		MolePerHectolitre.addAlternativeSymbol("mol·hl-1");
		GillImperial = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gill-Imperial", "gill (imperial)", "gi", CubicMetre, 1.420653E-4 );
		Piconewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/piconewton","piconewton","pN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		MinuteAngle = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/minute-Angle", "minute (angle)", "'", Radian, 2.908882E-4 );
		MinuteAngle.addAlternativeName("minuut (hoek)","nl");
		MinuteAngle.addAlternativeName("arcminuut","nl");
		MinuteAngle.addAlternativeName("minuut (hoek)","nl");
		MinuteAngle.addAlternativeName("arcminuut","nl");
		MolePerZeptolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerZeptolitre","mole per zeptolitre","mol/zl",Mole, Zeptolitre);
		MolePerZeptolitre.addAlternativeName("mole per zeptoliter","nl");
		MolePerZeptolitre.addAlternativeSymbol("mol zl-1");
		MolePerZeptolitre.addAlternativeSymbol("mol·zl-1");
		Femtoohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtoohm","femtoohm","fΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Femtoweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtoweber","femtoweber","fWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		KilogramPerHectare = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramPerHectare","kilogram per hectare","kg/ha",Kilogram, Hectare);
		KilogramPerHectare.addAlternativeSymbol("kg ha-1");
		KilogramPerHectare.addAlternativeSymbol("kg·ha-1");
		Petabit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petabit","petabit","Pbit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Decacoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decacoulomb","decacoulomb","daC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Attogram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attogram","attogram","ag",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		AttogramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/attogramPerLitre","attogram per litre","ag/l",Attogram, Litre);
		AttogramPerLitre.addAlternativeName("attogram per liter","nl");
		AttogramPerLitre.addAlternativeSymbol("ag l-1");
		AttogramPerLitre.addAlternativeSymbol("ag·l-1");
		Picoradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picoradian","picoradian","prad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Picoradian.addAlternativeName("picoradiaal","nl");
		KilogramSecondTimeToThePower2ReciprocalMetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramSecond-TimeToThePower-2ReciprocalMetre","reciprocal metre kilogram second to the power -2","kg.s1/-0.5.m1/-1",KilogramSecondTimeToThePower2, ReciprocalMetre);
		KilogramSecondTimeToThePower2ReciprocalMetre.addAlternativeName("omgekeerde meter kilogram seconde tot de macht -2","nl");
		KilogramSecondTimeToThePower2ReciprocalMetre.addAlternativeSymbol("m-1 kg s-2");
		KilogramSecondTimeToThePower2ReciprocalMetre.addAlternativeSymbol("m-1·kg·s-2");
		BritishThermalUnitThermochemical = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/BritishThermalUnit-Thermochemical", "British thermal unit (thermochemical)", "Btu_th", Joule, 1054.35 );
		DecisecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/decisecond-TimeSquared","decisecond squared","ds2",DecisecondTime, 2.0);
		DecisecondTimeSquared.addAlternativeName("deciseconde kwadraat","nl");
		PicomolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/picomolePerLitre","picomole per litre","pmol/l",Picomole, Litre);
		PicomolePerLitre.addAlternativeName("picomole per liter","nl");
		PicomolePerLitre.addAlternativeSymbol("pmol l-1");
		PicomolePerLitre.addAlternativeSymbol("pmol·l-1");
		Nanofarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanofarad","nanofarad","nF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Femtowatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtowatt","femtowatt","fW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		KilojoulePerSquareMetreDay = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilojoulePerSquareMetreDay","kilojoule per square metre day","kJ/m2.d",Kilojoule, SquareMetreDay);
		KilojoulePerSquareMetreDay.addAlternativeName("kilojoule per vierkante meter dag","nl");
		KilojoulePerSquareMetreDay.addAlternativeSymbol("kJ/(m2 d)");
		KilojoulePerSquareMetreDay.addAlternativeSymbol("kJ m-2 d-1");
		KilojoulePerSquareMetreDay.addAlternativeSymbol("kJ·m-2·d-1");
		MetrePerDecasecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerDecasecond-Time","metre per decasecond","m/das",Metre, DecasecondTime);
		MetrePerDecasecondTime.addAlternativeName("meter per decaseconde","nl");
		MetrePerDecasecondTime.addAlternativeSymbol("m das-1");
		MetrePerDecasecondTime.addAlternativeSymbol("m·das-1");
		Zettalumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettalumen","zettalumen","Zlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		MicrometrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/micrometrePerSecond-Time","micrometre per second","μm/s",Micrometre, SecondTime);
		MicrometrePerSecondTime.addAlternativeName("micrometer per seconde","nl");
		MicrometrePerSecondTime.addAlternativeSymbol("μm s-1");
		MicrometrePerSecondTime.addAlternativeSymbol("μm·s-1");
		MolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerMetre","mole per metre","mol/m",Mole, Metre);
		MolePerMetre.addAlternativeName("mole per meter","nl");
		MolePerMetre.addAlternativeSymbol("mol m-1");
		MolePerMetre.addAlternativeSymbol("mol·m-1");
		AttosecondTime = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attosecond-Time","attosecond","as",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		AttosecondTime.addAlternativeName("attoseconde","nl");
		Stathenry = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/stathenry", "stathenry", "statH", Henry, 8.987552E11 );
		MolePerGigametre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerGigametre","mole per gigametre","mol/Gm",Mole, Gigametre);
		MolePerGigametre.addAlternativeName("mole per gigameter","nl");
		MolePerGigametre.addAlternativeSymbol("mol Gm-1");
		MolePerGigametre.addAlternativeSymbol("mol·Gm-1");
		ReciprocalCubicMetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalCubicMetre","reciprocal cubic metre","m1/-0.3333333333333333",Metre, -3.0);
		ReciprocalCubicMetre.addAlternativeName("omgekeerde kubieke meter","nl");
		ReciprocalCubicMetre.addAlternativeSymbol("m-3");
		GramPerMegalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerMegalitre","gram per megalitre","g/Ml",Gram, Megalitre);
		GramPerMegalitre.addAlternativeName("gram per megaliter","nl");
		GramPerMegalitre.addAlternativeSymbol("g Ml-1");
		GramPerMegalitre.addAlternativeSymbol("g·Ml-1");
		Kilomolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilomolair","kilomolair","kM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		MetrePerCentisecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerCentisecond-TimeSquared","metre per centisecond squared","m/cs2",Metre, CentisecondTimeSquared);
		MetrePerCentisecondTimeSquared.addAlternativeName("meter per centiseconde kwadraat","nl");
		MetrePerCentisecondTimeSquared.addAlternativeSymbol("m cs-2");
		MetrePerCentisecondTimeSquared.addAlternativeSymbol("m·cs-2");
		Decitesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decitesla","decitesla","dT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Attotesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attotesla","attotesla","aT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Nanowatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanowatt","nanowatt","nW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		SquareDecimetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareDecimetre","square decimetre","dm2",Decimetre, 2.0);
		SquareDecimetre.addAlternativeName("vierkante decimeter","nl");
		Revolution = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/revolution", "revolution", "r", Radian, 6.283185 );
		Picowatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picowatt","picowatt","pW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Megohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megohm","megohm","MΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		CubicPicometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicPicometre","cubic picometre","pm3",Picometre, 3.0);
		CubicPicometre.addAlternativeName("kubieke picometer","nl");
		KilometrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilometrePerSecond-TimeSquared","kilometre per second squared","km/s2",Kilometre, SecondTimeSquared);
		KilometrePerSecondTimeSquared.addAlternativeName("kilometer per seconde kwadraat","nl");
		KilometrePerSecondTimeSquared.addAlternativeSymbol("km s-2");
		KilometrePerSecondTimeSquared.addAlternativeSymbol("km·s-2");
		AmylaseUnit = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/amylaseUnit", "amylase unit", "AU", null);
		AmylaseUnit.addAlternativeSymbol("U");
		CubicMetrePerYear = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicMetrePerYear","cubic metre per year","m3/a",CubicMetre, Year);
		CubicMetrePerYear.addAlternativeName("kubieke meter per jaar","nl");
		Kiloweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kiloweber","kiloweber","kWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Zeptoweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptoweber","zeptoweber","zWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Petalumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petalumen","petalumen","Plm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		ReciprocalDegreeCelsius = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalDegreeCelsius","reciprocal degree Celsius","°C1/-1",DegreeCelsius, -1.0);
		ReciprocalDegreeCelsius.addAlternativeName("omgekeerde graad Celsius","nl");
		ReciprocalDegreeCelsius.addAlternativeSymbol("°C-1");
		CubicHectometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicHectometre","cubic hectometre","hm3",Hectometre, 3.0);
		CubicHectometre.addAlternativeName("kubieke hectometer","nl");
		Femtogram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtogram","femtogram","fg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		AtmosphereStandard = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/atmosphere-Standard", "atmosphere (standard)", "atm", Pascal, 101325.0 );
		AtmosphereStandard.addAlternativeName("atmosfeer (standaard)","nl");
		ReciprocalAtmosphereStandard = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalAtmosphere-Standard","reciprocal atmosphere (standard)","atm1/-1",AtmosphereStandard, -1.0);
		ReciprocalAtmosphereStandard.addAlternativeName("omgekeerde atmosfeer (standaard)","nl");
		ReciprocalAtmosphereStandard.addAlternativeSymbol("atm-1");
		Petacandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petacandela","petacandela","Pcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		TonOfRefridgeration = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/tonOfRefridgeration", "ton of refridgeration", "null", Watt, 3516.853 );
		ReciprocalSquareMetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalSquareMetre","reciprocal square metre","m1/-0.5",Metre, -2.0);
		ReciprocalSquareMetre.addAlternativeName("omgekeerde vierkante meter","nl");
		ReciprocalSquareMetre.addAlternativeSymbol("m-2");
		CubicGigametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicGigametre","cubic gigametre","Gm3",Gigametre, 3.0);
		CubicGigametre.addAlternativeName("kubieke gigameter","nl");
		FemtometrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/femtometrePerSecond-TimeSquared","femtometre per second squared","fm/s2",Femtometre, SecondTimeSquared);
		FemtometrePerSecondTimeSquared.addAlternativeName("femtometer per seconde kwadraat","nl");
		FemtometrePerSecondTimeSquared.addAlternativeSymbol("fm s-2");
		FemtometrePerSecondTimeSquared.addAlternativeSymbol("fm·s-2");
		Decatesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decatesla","decatesla","daT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		DegreeCelsiusPerMinuteTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/degreeCelsiusPerMinute-Time","degree Celsius per minute","°C/min",DegreeCelsius, MinuteTime);
		DegreeCelsiusPerMinuteTime.addAlternativeName("graad Celsius per minuut","nl");
		DegreeCelsiusPerMinuteTime.addAlternativeSymbol("°C min-1");
		DegreeCelsiusPerMinuteTime.addAlternativeSymbol("°C·min-1");
		Kibibit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kibibit","kibibit","Kibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.KIBI);
		Femtogray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtogray","femtogray","fGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Decijoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decijoule","decijoule","dJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Femtonewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtonewton","femtonewton","fN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		MetrePerExasecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerExasecond-TimeSquared","metre per exasecond squared","m/Es2",Metre, ExasecondTimeSquared);
		MetrePerExasecondTimeSquared.addAlternativeName("meter per exaseconde kwadraat","nl");
		MetrePerExasecondTimeSquared.addAlternativeSymbol("m Es-2");
		MetrePerExasecondTimeSquared.addAlternativeSymbol("m·Es-2");
		Megaeuro = null;
		Deciohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/deciohm","deciohm","dΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		MegametrePerKilojoule = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/megametrePerKilojoule","megametre per kilojoule","Mm/kJ",Megametre, Kilojoule);
		MegametrePerKilojoule.addAlternativeName("1000 km/kJ","");
		Picofarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picofarad","picofarad","pF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		KilomolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilomolePerLitre","kilomole per litre","kmol/l",Kilomole, Litre);
		KilomolePerLitre.addAlternativeName("kilomole per liter","nl");
		KilomolePerLitre.addAlternativeSymbol("kmol l-1");
		KilomolePerLitre.addAlternativeSymbol("kmol·l-1");
		CoulombPerKilogram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/coulombPerKilogram","coulomb per kilogram","C/kg",Coulomb, Kilogram);
		CoulombPerKilogram.addAlternativeSymbol("C kg-1");
		CoulombPerKilogram.addAlternativeSymbol("C·kg-1");
		Röntgen = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/röntgen", "röntgen", "R", CoulombPerKilogram, 2.58E-4 );
		Yottahertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottahertz","yottahertz","YHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Nanosiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanosiemens","nanosiemens","nS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		SecondSidereal = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/second-Sidereal", "second (sidereal)", "null", SecondTime, 0.9972696 );
		Yoctomole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctomole","yoctomole","ymol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Yoctomole.addAlternativeName("yoctomol","nl");
		YoctomolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctomolePerMetre","yoctomole per metre","ymol/m",Yoctomole, Metre);
		YoctomolePerMetre.addAlternativeName("yoctomole per meter","nl");
		YoctomolePerMetre.addAlternativeSymbol("ymol m-1");
		YoctomolePerMetre.addAlternativeSymbol("ymol·m-1");
		GramPerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerMetre","gram per metre","g/m",Gram, Metre);
		GramPerMetre.addAlternativeName("gram per meter","nl");
		GramPerMetre.addAlternativeSymbol("g m-1");
		GramPerMetre.addAlternativeSymbol("g·m-1");
		Centisteradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centisteradian","centisteradian","csr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Centisteradian.addAlternativeName("centisteradiaal","nl");
		Nanobecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanobecquerel","nanobecquerel","nBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Picocoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picocoulomb","picocoulomb","pC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Exapascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exapascal","exapascal","EPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Zeptomolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptomolair","zeptomolair","zM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		CubicMetrePerCubicmetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicMetrePerCubicmetre","cubic metre per cubic metre","m3/m3",CubicMetre, CubicMetre);
		CubicMetrePerCubicmetre.addAlternativeName("kubieke meter per kubieke meter","nl");
		CubicMetrePerCubicmetre.addAlternativeSymbol("m3 m-3");
		CubicMetrePerCubicmetre.addAlternativeSymbol("m3·m-3");
		Zettakelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettakelvin","zettakelvin","ZK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Nanosievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanosievert","nanosievert","nSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Hectokatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectokatal","hectokatal","hkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Zettalitre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettalitre","zettalitre","Zl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Zettalitre.addAlternativeName("zettaliter","nl");
		SquareYottametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareYottametre","square yottametre","Ym2",Yottametre, 2.0);
		SquareYottametre.addAlternativeName("vierkante yottameter","nl");
		Terawatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terawatt","terawatt","TW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		TerawattHour = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/terawattHour","terawatt hour","TW.h",Terawatt, Hour);
		TerawattHour.addAlternativeSymbol("TW h");
		TerawattHour.addAlternativeSymbol("TWh");
		TerawattHour.addAlternativeSymbol("TW·h");
		FemtosecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/femtosecond-TimeSquared","femtosecond squared","fs2",FemtosecondTime, 2.0);
		FemtosecondTimeSquared.addAlternativeName("femtoseconde kwadraat","nl");
		MetrePerFemtosecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerFemtosecond-TimeSquared","metre per femtosecond squared","m/fs2",Metre, FemtosecondTimeSquared);
		MetrePerFemtosecondTimeSquared.addAlternativeName("meter per femtoseconde kwadraat","nl");
		MetrePerFemtosecondTimeSquared.addAlternativeSymbol("m fs-2");
		MetrePerFemtosecondTimeSquared.addAlternativeSymbol("m·fs-2");
		Centijoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centijoule","centijoule","cJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Giganewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/giganewton","giganewton","GN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		MillisecondAnglePerYear = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/millisecond-AnglePerYear","millisecond (angle) per year","mas/a",MillisecondAngle, Year);
		MillisecondAnglePerYear.addAlternativeName("milliseconde (hoek) per jaar","nl");
		MillisecondAnglePerYear.addAlternativeSymbol("mas/yr");
		JouleSecondTime = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/jouleSecond-Time","joule second","J.s",Joule, SecondTime);
		JouleSecondTime.addAlternativeName("joule seconde","nl");
		JouleSecondTime.addAlternativeSymbol("J s");
		JouleSecondTime.addAlternativeSymbol("J·s");
		YearSidereal = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/year-Sidereal", "year (sidereal)", "null", SecondTime, 3.155815E7 );
		Zettametre = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettametre","zettametre","Zm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Zettametre.addAlternativeName("zettameter","nl");
		MolePerZettametre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerZettametre","mole per zettametre","mol/Zm",Mole, Zettametre);
		MolePerZettametre.addAlternativeName("mole per zettameter","nl");
		MolePerZettametre.addAlternativeSymbol("mol Zm-1");
		MolePerZettametre.addAlternativeSymbol("mol·Zm-1");
		JoulePerKelvin = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/joulePerKelvin","joule per kelvin","J/K",Joule, Kelvin);
		JoulePerKelvin.addAlternativeSymbol("J K-1");
		JoulePerKelvin.addAlternativeSymbol("J·K-1");
		PetamolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/petamolePerMetre","petamole per metre","Pmol/m",Petamole, Metre);
		PetamolePerMetre.addAlternativeName("petamole per meter","nl");
		PetamolePerMetre.addAlternativeSymbol("Pmol m-1");
		PetamolePerMetre.addAlternativeSymbol("Pmol·m-1");
		Attojoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attojoule","attojoule","aJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Decimolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decimolair","decimolair","dM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Yoctomolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctomolair","yoctomolair","yM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		GramPerJoule = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerJoule","gram per joule","g/J",Gram, Joule);
		GramPerJoule.addAlternativeSymbol("g J-1");
		GramPerJoule.addAlternativeSymbol("g·J-1");
		YottamolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/yottamolePerMetre","yottamole per metre","Ymol/m",Yottamole, Metre);
		YottamolePerMetre.addAlternativeName("yottamole per meter","nl");
		YottamolePerMetre.addAlternativeSymbol("Ymol m-1");
		YottamolePerMetre.addAlternativeSymbol("Ymol·m-1");
		Terahenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terahenry","terahenry","TH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Yottalux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottalux","yottalux","Ylx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Petasievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petasievert","petasievert","PSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Curie = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/curie", "curie", "Ci", Becquerel, 3.7E10 );
		MetrePerDecisecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerDecisecond-TimeSquared","metre per decisecond squared","m/ds2",Metre, DecisecondTimeSquared);
		MetrePerDecisecondTimeSquared.addAlternativeName("meter per deciseconde kwadraat","nl");
		MetrePerDecisecondTimeSquared.addAlternativeSymbol("m ds-2");
		MetrePerDecisecondTimeSquared.addAlternativeSymbol("m·ds-2");
		QuartImperial = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/quart-Imperial", "quart (imperial)", "null", Litre, 1.1365 );
		MicrogramPerJoule = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/microgramPerJoule","microgram per joule","μg/J",Microgram, Joule);
		MicrogramPerJoule.addAlternativeSymbol("mg/J");
		MicrogramPerJoule.addAlternativeSymbol("mg J-1");
		MicrogramPerJoule.addAlternativeSymbol("mg·J-1");
		Statohm = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/statohm", "statohm", "statΩ", Ohm, 8.987552E11 );
		Exabecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exabecquerel","exabecquerel","EBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Exahenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exahenry","exahenry","EH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Calorie15C = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/calorie-15C", "calorie (15 °C)", "cal_15", Joule, 4.1858 );
		Nanogray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanogray","nanogray","nGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Zeptomole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptomole","zeptomole","zmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Zeptomole.addAlternativeName("zeptomol","nl");
		ZeptomolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptomolePerMetre","zeptomole per metre","zmol/m",Zeptomole, Metre);
		ZeptomolePerMetre.addAlternativeName("zeptomole per meter","nl");
		ZeptomolePerMetre.addAlternativeSymbol("zmol m-1");
		ZeptomolePerMetre.addAlternativeSymbol("zmol·m-1");
		PicaTeX = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/pica-TeX", "pica (TeX)", "null", PointTeX, 12.0 );
		LuxSecondTime = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/luxSecond-Time","lux second","lx.s",Lux, SecondTime);
		LuxSecondTime.addAlternativeName("lux seconde","nl");
		LuxSecondTime.addAlternativeSymbol("lx s");
		LuxSecondTime.addAlternativeSymbol("lx·s");
		Nanosteradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanosteradian","nanosteradian","nsr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Nanosteradian.addAlternativeName("nanosteradiaal","nl");
		MolePerNanometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerNanometre","mole per nanometre","mol/nm",Mole, Nanometre);
		MolePerNanometre.addAlternativeName("mole per nanometer","nl");
		MolePerNanometre.addAlternativeSymbol("mol nm-1");
		MolePerNanometre.addAlternativeSymbol("mol·nm-1");
		Exacoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exacoulomb","exacoulomb","EC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Kilosiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilosiemens","kilosiemens","kS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Gigacoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigacoulomb","gigacoulomb","GC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Megaerg = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megaerg","megaerg","Merg",(SingularUnit)Erg, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		MileStatute = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/mile-Statute", "mile (statute)", "mi", Metre, 1609.344 );
		MileStatutePerHour = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/mile-StatutePerHour","mile (statute) per hour","mi/h",MileStatute, Hour);
		MileStatutePerHour.addAlternativeName("mijl per uur","nl");
		MileStatutePerHour.addAlternativeSymbol("mi h-1");
		MileStatutePerHour.addAlternativeSymbol("mi·h-1");
		Megaweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megaweber","megaweber","MWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Teracoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teracoulomb","teracoulomb","TC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		MetrePerCubicmetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerCubicmetre","metre per cubic metre","m/m3",Metre, CubicMetre);
		MetrePerCubicmetre.addAlternativeName("meter per kubieke meter","nl");
		MetrePerCubicmetre.addAlternativeSymbol("m m-3");
		MetrePerCubicmetre.addAlternativeSymbol("m·m-3");
		NewtonPerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/newtonPerMetre","newton per metre","N/m",Newton, Metre);
		NewtonPerMetre.addAlternativeName("newton per meter","nl");
		NewtonPerMetre.addAlternativeSymbol("N m-1");
		NewtonPerMetre.addAlternativeSymbol("N·m-1");
		MetrePerZeptosecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerZeptosecond-Time","metre per zeptosecond","m/zs",Metre, ZeptosecondTime);
		MetrePerZeptosecondTime.addAlternativeName("meter per zeptoseconde","nl");
		MetrePerZeptosecondTime.addAlternativeSymbol("m zs-1");
		MetrePerZeptosecondTime.addAlternativeSymbol("m·zs-1");
		Petasiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petasiemens","petasiemens","PS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Dyne = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/dyne", "dyne", "dyn", Newton, 1.0E-5 );
		MegamolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/megamolePerLitre","megamole per litre","Mmol/l",Megamole, Litre);
		MegamolePerLitre.addAlternativeName("megamole per liter","nl");
		MegamolePerLitre.addAlternativeSymbol("Mmol l-1");
		MegamolePerLitre.addAlternativeSymbol("Mmol·l-1");
		ZettametrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/zettametrePerSecond-Time","zettametre per second","Zm/s",Zettametre, SecondTime);
		ZettametrePerSecondTime.addAlternativeName("zettameter per seconde","nl");
		ZettametrePerSecondTime.addAlternativeSymbol("Zm s-1");
		ZettametrePerSecondTime.addAlternativeSymbol("Zm·s-1");
		MetrePerFemtosecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerFemtosecond-Time","metre per femtosecond","m/fs",Metre, FemtosecondTime);
		MetrePerFemtosecondTime.addAlternativeName("meter per femtoseconde","nl");
		MetrePerFemtosecondTime.addAlternativeSymbol("m fs-1");
		MetrePerFemtosecondTime.addAlternativeSymbol("m·fs-1");
		MolePerPetametre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerPetametre","mole per petametre","mol/Pm",Mole, Petametre);
		MolePerPetametre.addAlternativeName("mole per petameter","nl");
		MolePerPetametre.addAlternativeSymbol("mol Pm-1");
		MolePerPetametre.addAlternativeSymbol("mol·Pm-1");
		Microjoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microjoule","microjoule","μJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Centigray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centigray","centigray","cGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		AttosecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/attosecond-TimeSquared","attosecond squared","as2",AttosecondTime, 2.0);
		AttosecondTimeSquared.addAlternativeName("attoseconde kwadraat","nl");
		MetrePerAttosecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerAttosecond-TimeSquared","metre per attosecond squared","m/as2",Metre, AttosecondTimeSquared);
		MetrePerAttosecondTimeSquared.addAlternativeName("meter per attoseconde kwadraat","nl");
		MetrePerAttosecondTimeSquared.addAlternativeSymbol("m as-2");
		MetrePerAttosecondTimeSquared.addAlternativeSymbol("m·as-2");
		Gigawatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigawatt","gigawatt","GW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Decifarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decifarad","decifarad","dF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Peck = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/peck", "peck", "pk", CubicMetre, 0.008809768 );
		UnitPole = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/unitPole", "unit pole", "null", Weber, 1.256637E-7 );
		MicromolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/micromolePerMetre","micromole per metre","μmol/m",Micromole, Metre);
		MicromolePerMetre.addAlternativeName("micromole per meter","nl");
		MicromolePerMetre.addAlternativeSymbol("μmol m-1");
		MicromolePerMetre.addAlternativeSymbol("μmol·m-1");
		Attowatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attowatt","attowatt","aW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Centitesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centitesla","centitesla","cT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Picojoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picojoule","picojoule","pJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Zeptovolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptovolt","zeptovolt","zV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		MetrePerTerasecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerTerasecond-Time","metre per terasecond","m/Ts",Metre, TerasecondTime);
		MetrePerTerasecondTime.addAlternativeName("meter per teraseconde","nl");
		MetrePerTerasecondTime.addAlternativeSymbol("m Ts-1");
		MetrePerTerasecondTime.addAlternativeSymbol("m·Ts-1");
		TonShort = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/ton-Short", "ton (short)", "null", Kilogram, 907.1847 );
		Terapascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terapascal","terapascal","TPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Decibecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decibecquerel","decibecquerel","dBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		CubicYottametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicYottametre","cubic yottametre","Ym3",Yottametre, 3.0);
		CubicYottametre.addAlternativeName("kubieke yottameter","nl");
		Yottavolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottavolt","yottavolt","YV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Yoctoohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctoohm","yoctoohm","yΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Statweber = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/statweber", "statweber", "statWb", Weber, 299.79 );
		Hectosiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectosiemens","hectosiemens","hS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Exalumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exalumen","exalumen","Elm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Nanovolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanovolt","nanovolt","nV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		CubicMetrePerKilogram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicMetrePerKilogram","cubic metre per kilogram","m3/kg",CubicMetre, Kilogram);
		CubicMetrePerKilogram.addAlternativeName("kubieke meter per kilogram","nl");
		CubicMetrePerKilogram.addAlternativeSymbol("m3 kg-1");
		CubicMetrePerKilogram.addAlternativeSymbol("m3·kg-1");
		DecimolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/decimolePerMetre","decimole per metre","dmol/m",Decimole, Metre);
		DecimolePerMetre.addAlternativeName("decimole per meter","nl");
		DecimolePerMetre.addAlternativeSymbol("dmol m-1");
		DecimolePerMetre.addAlternativeSymbol("dmol·m-1");
		Gigamole = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigamole","gigamole","Gmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Gigamole.addAlternativeName("gigamol","nl");
		GigamolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gigamolePerLitre","gigamole per litre","Gmol/l",Gigamole, Litre);
		GigamolePerLitre.addAlternativeName("gigamole per liter","nl");
		GigamolePerLitre.addAlternativeSymbol("Gmol l-1");
		GigamolePerLitre.addAlternativeSymbol("Gmol·l-1");
		Debye = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/debye", "debye", "D", CoulombMetre, 3.33564E-30 );
		Chain = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/chain", "chain", "ch", Metre, 20.11684 );
		Quad = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/quad", "quad", "null", BritishThermalUnitInternationalTable, 1.0E15 );
		SquareMetreHertz = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMetreHertz","square metre hertz","m2.Hz",SquareMetre, Hertz);
		SquareMetreHertz.addAlternativeName("vierkante meter hertz","nl");
		SquareMetreHertz.addAlternativeSymbol("m2 Hz");
		SquareMetreHertz.addAlternativeSymbol("m2·Hz");
		WattPerSquareMetreHertz = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerSquareMetreHertz","watt per square metre hertz","W/m2.Hz",Watt, SquareMetreHertz);
		WattPerSquareMetreHertz.addAlternativeName("watt per vierkante meter hertz","nl");
		WattPerSquareMetreHertz.addAlternativeSymbol("W/(m2 Hz)");
		WattPerSquareMetreHertz.addAlternativeSymbol("W m-2 Hz-1");
		WattPerSquareMetreHertz.addAlternativeSymbol("W·m-2·Hz-1");
		Abvolt = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/abvolt", "abvolt", "abV", Volt, 1.0E-8 );
		Darcy = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/darcy", "darcy", "null", SquareMetre, 9.869233E-13 );
		DecamolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/decamolePerMetre","decamole per metre","damol/m",Decamole, Metre);
		DecamolePerMetre.addAlternativeName("decamole per meter","nl");
		DecamolePerMetre.addAlternativeSymbol("damol m-1");
		DecamolePerMetre.addAlternativeSymbol("damol·m-1");
		Gilbert = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gilbert", "gilbert", "Gb", Ampere, 0.7957747 );
		Micromagnitude = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/micromagnitude","micromagnitude","μmag",(SingularUnit)Magnitude, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Yoctopascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctopascal","yoctopascal","yPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		MetrePerPicosecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerPicosecond-Time","metre per picosecond","m/ps",Metre, PicosecondTime);
		MetrePerPicosecondTime.addAlternativeName("meter per picoseconde","nl");
		MetrePerPicosecondTime.addAlternativeSymbol("m ps-1");
		MetrePerPicosecondTime.addAlternativeSymbol("m·ps-1");
		Decikelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decikelvin","decikelvin","dK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Terabyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terabyte","terabyte","TB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Nanolux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanolux","nanolux","nlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Yoctoampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctoampere","yoctoampere","yA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Yoctoampere.addAlternativeName("yoctoampère","nl");
		MolePerTeralitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerTeralitre","mole per teralitre","mol/Tl",Mole, Teralitre);
		MolePerTeralitre.addAlternativeName("mole per teraliter","nl");
		MolePerTeralitre.addAlternativeSymbol("mol Tl-1");
		MolePerTeralitre.addAlternativeSymbol("mol·Tl-1");
		Microsteradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microsteradian","microsteradian","μsr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Microsteradian.addAlternativeName("microsteradiaal","nl");
		FootPoundal = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/footPoundal", "foot poundal", "null", Joule, 0.04214011 );
		AttodegreeCelsius = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attodegreeCelsius","attodegree Celsius","a°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		AttodegreeCelsius.addAlternativeName("attograad Celsius","nl");
		Statmho = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/statmho", "statmho", "null", Siemens, 1.11265E-12 );
		MetrePerGigasecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerGigasecond-TimeSquared","metre per gigasecond squared","m/Gs2",Metre, GigasecondTimeSquared);
		MetrePerGigasecondTimeSquared.addAlternativeName("meter per gigaseconde kwadraat","nl");
		MetrePerGigasecondTimeSquared.addAlternativeSymbol("m Gs-2");
		MetrePerGigasecondTimeSquared.addAlternativeSymbol("m·Gs-2");
		Yottacandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottacandela","yottacandela","Ycd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		TonLong = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/ton-Long", "ton (long)", "null", Kilogram, 1016.047 );
		YottametrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/yottametrePerSecond-Time","yottametre per second","Ym/s",Yottametre, SecondTime);
		YottametrePerSecondTime.addAlternativeName("yottameter per seconde","nl");
		YottametrePerSecondTime.addAlternativeSymbol("Ym s-1");
		YottametrePerSecondTime.addAlternativeSymbol("Ym·s-1");
		MolePerYottametre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerYottametre","mole per yottametre","mol/Ym",Mole, Yottametre);
		MolePerYottametre.addAlternativeName("mole per yottameter","nl");
		MolePerYottametre.addAlternativeSymbol("mol Ym-1");
		MolePerYottametre.addAlternativeSymbol("mol·Ym-1");
		Picolux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picolux","picolux","plx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		BritishThermalUnitMean = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/BritishThermalUnit-Mean", "British thermal unit (mean)", "Btu", Joule, 1055.87 );
		Centibecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centibecquerel","centibecquerel","cBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Milliohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/milliohm","milliohm","mΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		JoulePerKelvinKilogram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/joulePerKelvinKilogram","joule per kelvin kilogram","J/K.kg",Joule, KelvinKilogram);
		JoulePerKelvinKilogram.addAlternativeSymbol("J/(K kg)");
		JoulePerKelvinKilogram.addAlternativeSymbol("J K-1 kg-1");
		JoulePerKelvinKilogram.addAlternativeSymbol("J/(K·kg)");
		JoulePerKelvinKilogram.addAlternativeSymbol("J·K-1·kg-1");
		MetrePerTerasecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerTerasecond-TimeSquared","metre per terasecond squared","m/Ts2",Metre, TerasecondTimeSquared);
		MetrePerTerasecondTimeSquared.addAlternativeName("meter per teraseconde kwadraat","nl");
		MetrePerTerasecondTimeSquared.addAlternativeSymbol("m Ts-2");
		MetrePerTerasecondTimeSquared.addAlternativeSymbol("m·Ts-2");
		Centiwatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centiwatt","centiwatt","cW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		SquareZettametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareZettametre","square zettametre","Zm2",Zettametre, 2.0);
		SquareZettametre.addAlternativeName("vierkante zettameter","nl");
		Decajoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decajoule","decajoule","daJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Gigalumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigalumen","gigalumen","Glm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Nanojoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanojoule","nanojoule","nJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Yoctotesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctotesla","yoctotesla","yT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		KilogramPerCubicDecimetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramPerCubicDecimetre","kilogram per cubic decimetre","kg/dm3",Kilogram, CubicDecimetre);
		KilogramPerCubicDecimetre.addAlternativeName("kilogram per kubieke decimeter","nl");
		KilogramPerCubicDecimetre.addAlternativeSymbol("kg dm-3");
		KilogramPerCubicDecimetre.addAlternativeSymbol("kg·dm-3");
		Yoctofarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctofarad","yoctofarad","yF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Yottasiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottasiemens","yottasiemens","YS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		ColonyFormingUnitPerGram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/colonyFormingUnitPerGram","colony forming unit per gram","CFU/g",ColonyFormingUnit, Gram);
		Deciwatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/deciwatt","deciwatt","dW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Attosiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attosiemens","attosiemens","aS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		ZettametrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/zettametrePerSecond-TimeSquared","zettametre per second squared","Zm/s2",Zettametre, SecondTimeSquared);
		ZettametrePerSecondTimeSquared.addAlternativeName("zettameter per seconde kwadraat","nl");
		ZettametrePerSecondTimeSquared.addAlternativeSymbol("Zm s-2");
		ZettametrePerSecondTimeSquared.addAlternativeSymbol("Zm·s-2");
		Hectocandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectocandela","hectocandela","hcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Yottagram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottagram","yottagram","YG",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		YottagramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/yottagramPerLitre","yottagram per litre","YG/l",Yottagram, Litre);
		YottagramPerLitre.addAlternativeName("yottagram per liter","nl");
		YottagramPerLitre.addAlternativeSymbol("Yg/l");
		YottagramPerLitre.addAlternativeSymbol("Yg l-1");
		YottagramPerLitre.addAlternativeSymbol("Yg·l-1");
		Megakatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megakatal","megakatal","Mkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Centipascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centipascal","centipascal","cPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		MolePerAttometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerAttometre","mole per attometre","mol/am",Mole, Attometre);
		MolePerAttometre.addAlternativeName("mole per attometer","nl");
		MolePerAttometre.addAlternativeSymbol("mol am-1");
		MolePerAttometre.addAlternativeSymbol("mol·am-1");
		Millicoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millicoulomb","millicoulomb","mC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		GramPerHectogram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerHectogram","gram per hectogram","g/hg",Gram, Hectogram);
		GramPerHectogram.addAlternativeSymbol("g hg-1");
		GramPerHectogram.addAlternativeSymbol("g·hg-1");
		SquareNanometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareNanometre","square nanometre","nm2",Nanometre, 2.0);
		SquareNanometre.addAlternativeName("vierkante nanometer","nl");
		CubicMillimetrePerCubicMillimetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicMillimetrePerCubicMillimetre","cubic millimetre per cubic millimetre","mm3/mm3",CubicMillimetre, CubicMillimetre);
		CubicMillimetrePerCubicMillimetre.addAlternativeName("kubieke millimeter per kubieke millimeter","nl");
		CubicMillimetrePerCubicMillimetre.addAlternativeSymbol("mm3 mm-3");
		CubicMillimetrePerCubicMillimetre.addAlternativeSymbol("mm3·mm-3");
		Attobecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attobecquerel","attobecquerel","aBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Gigaelectronvolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigaelectronvolt","gigaelectronvolt","GeV",(SingularUnit)Electronvolt, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		CubicAttometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicAttometre","cubic attometre","am3",Attometre, 3.0);
		CubicAttometre.addAlternativeName("kubieke attometer","nl");
		MilLength = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/mil-Length", "mil (length)", "null", Metre, 2.54E-5 );
		Kilohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilohm","kilohm","kΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		MilAngle = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/mil-Angle", "mil (angle)", "null", Radian, 9.817477E-4 );
		FemtodegreeCelsius = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtodegreeCelsius","femtodegree Celsius","f°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		FemtodegreeCelsius.addAlternativeName("femtograad Celsius","nl");
		Stilb = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/stilb", "stilb", "sb", CandelaPerSquareMetre, 10000.0 );
		Centivolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centivolt","centivolt","cV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		SquareKilometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareKilometre","square kilometre","km2",Kilometre, 2.0);
		SquareKilometre.addAlternativeName("vierkante kilometer","nl");
		SquareKilometre.addAlternativeName("10^6 m2","");
		Petanewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petanewton","petanewton","PN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		KelvinPerWatt = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kelvinPerWatt","kelvin per watt","K/W",Kelvin, Watt);
		KelvinPerWatt.addAlternativeSymbol("K W-1");
		KelvinPerWatt.addAlternativeSymbol("K·W-1");
		CoulombPerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/coulombPerSquareMetre","coulomb per square metre","C/m2",Coulomb, SquareMetre);
		CoulombPerSquareMetre.addAlternativeName("coulomb per vierkante meter","nl");
		CoulombPerSquareMetre.addAlternativeSymbol("C m-2");
		CoulombPerSquareMetre.addAlternativeSymbol("C·m-2");
		Microbecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microbecquerel","microbecquerel","μBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Centistokes = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centistokes","centistokes","cSt",(SingularUnit)Stokes, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Attovolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attovolt","attovolt","aV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		MegajoulePerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/megajoulePerSquareMetre","megajoule per square metre","MJ/m2",Megajoule, SquareMetre);
		MegajoulePerSquareMetre.addAlternativeName("megajoule per vierkante meter","nl");
		MegajoulePerSquareMetre.addAlternativeSymbol("MJ m-2");
		MegajoulePerSquareMetre.addAlternativeSymbol("MJ·m-2");
		Centipoise = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centipoise","centipoise","cP",(SingularUnit)Poise, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Zeptokelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptokelvin","zeptokelvin","zK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		N1000ColonyFormingUnitPerMillilitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/_1000ColonyFormingUnitPerMillilitre","1000 colony forming unit per millilitre","1000 CFU/ml",N1000ColonyFormingUnit, Millilitre);
		N1000ColonyFormingUnitPerMillilitre.addAlternativeName("1000 CFU/ml","");
		Attogray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attogray","attogray","aGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Hectonewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectonewton","hectonewton","hN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		MolePerPicolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerPicolitre","mole per picolitre","mol/pl",Mole, Picolitre);
		MolePerPicolitre.addAlternativeName("mole per picoliter","nl");
		MolePerPicolitre.addAlternativeSymbol("mol pl-1");
		MolePerPicolitre.addAlternativeSymbol("mol·pl-1");
		CubicFemtometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicFemtometre","cubic femtometre","fm3",Femtometre, 3.0);
		CubicFemtometre.addAlternativeName("kubieke femtometer","nl");
		Yottasievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottasievert","yottasievert","YSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Gigalux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigalux","gigalux","Glx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Femtohenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtohenry","femtohenry","fH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Teralux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teralux","teralux","Tlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		SquareDecametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareDecametre","square decametre","dam2",Decametre, 2.0);
		SquareDecametre.addAlternativeName("vierkante decameter","nl");
		Hectotesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectotesla","hectotesla","hT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Hectosievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectosievert","hectosievert","hSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		TonnePerCubicmetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/tonnePerCubicmetre","tonne per cubic metre","t/m3",Tonne, CubicMetre);
		TonnePerCubicmetre.addAlternativeName("ton per kubieke meter","nl");
		TonnePerCubicmetre.addAlternativeSymbol("t m-3");
		TonnePerCubicmetre.addAlternativeSymbol("t·m-3");
		GramPerZettalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerZettalitre","gram per zettalitre","g/Zl",Gram, Zettalitre);
		GramPerZettalitre.addAlternativeName("gram per zettaliter","nl");
		GramPerZettalitre.addAlternativeSymbol("g Zl-1");
		GramPerZettalitre.addAlternativeSymbol("g·Zl-1");
		CentimetrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/centimetrePerSecond-Time","centimetre per second","cm/s",Centimetre, SecondTime);
		CentimetrePerSecondTime.addAlternativeName("centimeter per seconde","nl");
		CentimetrePerSecondTime.addAlternativeSymbol("cm s-1");
		CentimetrePerSecondTime.addAlternativeSymbol("cm·s-1");
		Footlambert = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/footlambert", "footlambert", "null", CandelaPerSquareMetre, 3.426259 );
		KilogramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramPerLitre","kilogram per litre","kg/l",Kilogram, Litre);
		KilogramPerLitre.addAlternativeName("kilogram per liter","nl");
		KilogramPerLitre.addAlternativeSymbol("kg l-1");
		KilogramPerLitre.addAlternativeSymbol("kg·l-1");
		Megaelectronvolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megaelectronvolt","megaelectronvolt","MeV",(SingularUnit)Electronvolt, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		DryQuartUS = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/dryQuart-US", "dry quart (US)", "dry qt", CubicMetre, 0.001101221 );
		Zeptokatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptokatal","zeptokatal","zkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Acre = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/acre", "acre", "null", SquareMetre, 4046.873 );
		Barrel = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/barrel", "barrel", "bbl", CubicMetre, 0.1589873 );
		Kilohenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilohenry","kilohenry","kH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Petaohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petaohm","petaohm","PΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Attosievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attosievert","attosievert","aSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Centigram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centigram","centigram","cg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		MetrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerSecond-TimeSquared","metre per second squared","m/s2",Metre, SecondTimeSquared);
		MetrePerSecondTimeSquared.addAlternativeName("meter per seconde kwadraat","nl");
		MetrePerSecondTimeSquared.addAlternativeSymbol("m s-2");
		MetrePerSecondTimeSquared.addAlternativeSymbol("m·s-2");
		NanodegreeCelsius = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanodegreeCelsius","nanodegree Celsius","n°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		NanodegreeCelsius.addAlternativeName("nanograad Celsius","nl");
		Nanokatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanokatal","nanokatal","nkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		NanokatalPerMilligram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/nanokatalPerMilligram","nanokatal per milligram","nkat/mg",Nanokatal, Milligram);
		NanokatalPerMilligram.addAlternativeSymbol("nkat mg-1");
		NanokatalPerMilligram.addAlternativeSymbol("nkat·mg-1");
		Yottahenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottahenry","yottahenry","YH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		RadianPerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/radianPerSecond-Time","radian per second","rad/s",Radian, SecondTime);
		RadianPerSecondTime.addAlternativeName("radiaal per seconde","nl");
		RadianPerSecondTime.addAlternativeSymbol("rad s-1");
		RadianPerSecondTime.addAlternativeSymbol("rad·s-1");
		Yottagray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottagray","yottagray","YGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Zettahertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettahertz","zettahertz","ZHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Zeptolux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptolux","zeptolux","zlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		WattPerSquareMetreNanometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerSquareMetreNanometre","watt per square metre nanometre","W/m2.nm",Watt, SquareMetreNanometre);
		WattPerSquareMetreNanometre.addAlternativeName("watt per vierkante meter nanometer","nl");
		WattPerSquareMetreNanometre.addAlternativeSymbol("W/(m2 nm)");
		WattPerSquareMetreNanometre.addAlternativeSymbol("W m-2 nm-1");
		WattPerSquareMetreNanometre.addAlternativeSymbol("W·m-2·nm-1");
		WattPerSteradianSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerSteradianSquareMetre","watt per steradian square metre","W/sr.m2",Watt, SteradianSquareMetre);
		WattPerSteradianSquareMetre.addAlternativeName("watt per steradiaal vierkante meter","nl");
		WattPerSteradianSquareMetre.addAlternativeSymbol("W/(sr m2)");
		WattPerSteradianSquareMetre.addAlternativeSymbol("W sr-1 m-2");
		WattPerSteradianSquareMetre.addAlternativeSymbol("W·sr-1·m-2");
		LightYear = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/lightYear", "light year", "ly", Metre, 9.46073E15 );
		LightYear.addAlternativeName("lichtjaar","nl");
		Zettacandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettacandela","zettacandela","Zcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		GramPerCubicmetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerCubicmetre","gram per cubic metre","g/m3",Gram, CubicMetre);
		GramPerCubicmetre.addAlternativeName("gram per kubieke meter","nl");
		GramPerCubicmetre.addAlternativeSymbol("g m-3");
		GramPerCubicmetre.addAlternativeSymbol("g·m-3");
		DryPintUS = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/dryPint-US", "dry pint (US)", "dry pt", CubicMetre, 5.506105E-4 );
		Attokatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attokatal","attokatal","akat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		FemtomolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/femtomolePerLitre","femtomole per litre","fmol/l",Femtomole, Litre);
		FemtomolePerLitre.addAlternativeName("femtomole per liter","nl");
		FemtomolePerLitre.addAlternativeSymbol("fm s-1");
		FemtomolePerLitre.addAlternativeSymbol("fm·s-1");
		Month = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/month", "month", "null", nl.wur.fbr.om.model.dimensions.SIBaseDimension.TIME);
		Month.addAlternativeName("maand","nl");
		Statcoulomb = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/statcoulomb", "statcoulomb", "statC", Coulomb, 3.335641E-10 );
		Mho = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/mho", "mho", "null", Siemens, 1.0 );
		Exbibit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exbibit","exbibit","Eibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.EXBI);
		Attoohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attoohm","attoohm","aΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		MilligramPerKilometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/milligramPerKilometre","milligram per kilometre","mg/km",Milligram, Kilometre);
		MilligramPerKilometre.addAlternativeName("milligram per kilometer","nl");
		MilligramPerKilometre.addAlternativeSymbol("mg km-1");
		MilligramPerKilometre.addAlternativeSymbol("mg·km-1");
		SquareFemtometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareFemtometre","square femtometre","fm2",Femtometre, 2.0);
		SquareFemtometre.addAlternativeName("vierkante femtometer","nl");
		Centiare = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centiare","centiare","ca",(SingularUnit)Are, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Tablespoon = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/tablespoon", "tablespoon", "null", CubicMetre, 1.478676E-5 );
		KatalPerCubicmetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/katalPerCubicmetre","katal per cubic metre","kat/m3",Katal, CubicMetre);
		KatalPerCubicmetre.addAlternativeName("katal per kubieke meter","nl");
		KatalPerCubicmetre.addAlternativeSymbol("kat m-3");
		KatalPerCubicmetre.addAlternativeSymbol("kat·m-3");
		ZeptomolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptomolePerLitre","zeptomole per litre","zmol/l",Zeptomole, Litre);
		ZeptomolePerLitre.addAlternativeName("zeptomole per liter","nl");
		ZeptomolePerLitre.addAlternativeSymbol("zmol l-1");
		ZeptomolePerLitre.addAlternativeSymbol("zmol·l-1");
		ReciprocalHour = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalHour","reciprocal hour","h1/-1",Hour, -1.0);
		ReciprocalHour.addAlternativeName("omgekeerd uur","nl");
		ReciprocalHour.addAlternativeSymbol("h-1");
		CubicDecametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicDecametre","cubic decametre","dam3",Decametre, 3.0);
		CubicDecametre.addAlternativeName("kubieke decameter","nl");
		HorsepowerMetric = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/horsepower-Metric", "horsepower (metric)", "PS", Watt, 735.4988 );
		Zettaampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettaampere","zettaampere","ZA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Zettaampere.addAlternativeName("zettaampère","nl");
		Zeptocoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptocoulomb","zeptocoulomb","zC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Gigatesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigatesla","gigatesla","GT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Teragray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teragray","teragray","TGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Footcandle = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/footcandle", "footcandle", "null", Lux, 10.76391 );
		Picohertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picohertz","picohertz","pHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		SquareGigametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareGigametre","square gigametre","Gm2",Gigametre, 2.0);
		SquareGigametre.addAlternativeName("vierkante gigameter","nl");
		Femtosiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtosiemens","femtosiemens","fS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Kayser = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kayser", "kayser", "null", ReciprocalMetre, 100.0 );
		Gigaohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigaohm","gigaohm","GΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Torr = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/torr", "torr", "Torr", Pascal, 133.322368421053 );
		Yoctogray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctogray","yoctogray","yGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		GramPerMillilitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerMillilitre","gram per millilitre","g/ml",Gram, Millilitre);
		GramPerMillilitre.addAlternativeName("gram per milliliter","nl");
		GramPerMillilitre.addAlternativeSymbol("g ml-1");
		GramPerMillilitre.addAlternativeSymbol("g·ml-1");
		Attonewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attonewton","attonewton","aN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		CentimetreOfMercury = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centimetreOfMercury","centimetre of mercury","cm Hg",(SingularUnit)MetreOfMercury, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		CentimetreOfMercury.addAlternativeName("centimeter kwik","nl");
		GallonImperial = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gallon-Imperial", "gallon (imperial)", "gal", CubicMetre, 0.00454609 );
		Gibibyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gibibyte","gibibyte","GiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.GIBI);
		HectometrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/hectometrePerSecond-Time","hectometre per second","hm/s",Hectometre, SecondTime);
		HectometrePerSecondTime.addAlternativeName("hectometer per seconde","nl");
		HectometrePerSecondTime.addAlternativeSymbol("hm s-1");
		HectometrePerSecondTime.addAlternativeSymbol("hm·s-1");
		AmperePerWatt = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/amperePerWatt","ampere per watt","A/W",Ampere, Watt);
		AmperePerWatt.addAlternativeSymbol("A W-1");
		AmperePerWatt.addAlternativeSymbol("A·W-1");
		Yoctowatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctowatt","yoctowatt","yW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		CubicMetrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicMetrePerSecond-Time","cubic metre per second","m3/s",CubicMetre, SecondTime);
		CubicMetrePerSecondTime.addAlternativeName("kubieke meter per seconde","nl");
		CubicMetrePerSecondTime.addAlternativeSymbol("m3 s-1");
		CubicMetrePerSecondTime.addAlternativeSymbol("m3·s-1");
		Microradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microradian","microradian","μrad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Microradian.addAlternativeName("microradiaal","nl");
		Petapascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petapascal","petapascal","PPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Teravolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teravolt","teravolt","TV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		MolePerMicrolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerMicrolitre","mole per microlitre","mol/μl",Mole, Microlitre);
		MolePerMicrolitre.addAlternativeName("mole per microliter","nl");
		MolePerMicrolitre.addAlternativeSymbol("mol μl-1");
		MolePerMicrolitre.addAlternativeSymbol("mol·μl-1");
		Attoweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attoweber","attoweber","aWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		FemtogramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/femtogramPerLitre","femtogram per litre","fg/l",Femtogram, Litre);
		FemtogramPerLitre.addAlternativeName("femtogram per liter","nl");
		FemtogramPerLitre.addAlternativeSymbol("fm s-1");
		FemtogramPerLitre.addAlternativeSymbol("fm·s-1");
		CalorieInternationalTable = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/calorie-InternationalTable", "calorie (International Table)", "cal_IT", Joule, 4.1868 );
		SquareMetreKelvinPerWatt = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMetreKelvinPerWatt","square metre kelvin per watt","m2.K/W",SquareMetreKelvin, Watt);
		SquareMetreKelvinPerWatt.addAlternativeName("vierkante meter kelvin per watt","nl");
		SquareMetreKelvinPerWatt.addAlternativeSymbol("m2 K/W");
		SquareMetreKelvinPerWatt.addAlternativeSymbol("m2 K W-1");
		SquareMetreKelvinPerWatt.addAlternativeSymbol("m2·K/W");
		SquareMetreKelvinPerWatt.addAlternativeSymbol("m2·K·W-1");
		Attomolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attomolair","attomolair","aM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Hectokelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectokelvin","hectokelvin","hK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Terakatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terakatal","terakatal","Tkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Zeptohertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptohertz","zeptohertz","zHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Decavolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decavolt","decavolt","daV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		GramPerDecalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerDecalitre","gram per decalitre","g/dal",Gram, Decalitre);
		GramPerDecalitre.addAlternativeName("gram per decaliter","nl");
		GramPerDecalitre.addAlternativeSymbol("g dal-1");
		GramPerDecalitre.addAlternativeSymbol("g·dal-1");
		VoltPerWatt = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/voltPerWatt","volt per watt","V/W",Volt, Watt);
		VoltPerWatt.addAlternativeSymbol("V W-1");
		VoltPerWatt.addAlternativeSymbol("V·W-1");
		YoctometrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctometrePerSecond-TimeSquared","yoctometre per second squared","ym/s2",Yoctometre, SecondTimeSquared);
		YoctometrePerSecondTimeSquared.addAlternativeName("yoctometer per seconde kwadraat","nl");
		YoctometrePerSecondTimeSquared.addAlternativeSymbol("ym s-2");
		YoctometrePerSecondTimeSquared.addAlternativeSymbol("ym·s-2");
		Nanocandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanocandela","nanocandela","ncd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Gigavolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigavolt","gigavolt","GV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Zeptowatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptowatt","zeptowatt","zW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Zeptopascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptopascal","zeptopascal","zPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Exaampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exaampere","exaampere","EA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Exaampere.addAlternativeName("exaampère","nl");
		WattPerHertz = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/wattPerHertz","watt per hertz","W/Hz",Watt, Hertz);
		WattPerHertz.addAlternativeSymbol("W Hz-1");
		WattPerHertz.addAlternativeSymbol("W·Hz-1");
		Hectohertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectohertz","hectohertz","hHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		AmperePerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/amperePerSquareMetre","ampere per square metre","A/m2",Ampere, SquareMetre);
		AmperePerSquareMetre.addAlternativeName("ampère per vierkante meter","nl");
		AmperePerSquareMetre.addAlternativeSymbol("A m-2");
		AmperePerSquareMetre.addAlternativeSymbol("A·m-2");
		Terabecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/terabecquerel","terabecquerel","TBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Kiloparsec = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kiloparsec","kiloparsec","kpc",(SingularUnit)Parsec, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		CubicKiloparsec = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicKiloparsec","cubic kiloparsec","kpc3",Kiloparsec, 3.0);
		CubicKiloparsec.addAlternativeName("kubieke kiloparsec","nl");
		GigayearCubicKiloparsec = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/gigayearCubicKiloparsec","gigayear cubic kiloparsec","Gyr.kpc3",Gigayear, CubicKiloparsec);
		GigayearCubicKiloparsec.addAlternativeName("gigajaar kubieke kiloparsec","nl");
		GigayearCubicKiloparsec.addAlternativeSymbol("Gyr kpc3");
		GigayearCubicKiloparsec.addAlternativeSymbol("Gyr·kpc3");
		SolarMassPerGigayearCubicKiloparsec = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/solarMassPerGigayearCubicKiloparsec","solar mass per gigayear cubic kiloparsec","M_☉/Gyr.kpc3",SolarMass, GigayearCubicKiloparsec);
		SolarMassPerGigayearCubicKiloparsec.addAlternativeSymbol("M_☉/(Gyr kpc3)");
		SolarMassPerGigayearCubicKiloparsec.addAlternativeSymbol("M_☉ Gyr-1 kpc-3");
		SolarMassPerGigayearCubicKiloparsec.addAlternativeSymbol("M_☉·Gyr-1·kpc-3");
		MolePerExametre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerExametre","mole per exametre","mol/Em",Mole, Exametre);
		MolePerExametre.addAlternativeName("mole per exameter","nl");
		MolePerExametre.addAlternativeSymbol("mol Em-1");
		MolePerExametre.addAlternativeSymbol("mol·Em-1");
		KilojoulePerHectogram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilojoulePerHectogram","kilojoule per hectogram","kJ/hg",Kilojoule, Hectogram);
		KilojoulePerHectogram.addAlternativeSymbol("kJ hg-1");
		KilojoulePerHectogram.addAlternativeSymbol("kJ·hg-1");
		CubicMetreKelvin = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicMetreKelvin","cubic metre kelvin","m3.K",CubicMetre, Kelvin);
		CubicMetreKelvin.addAlternativeSymbol("m3 K");
		CubicMetreKelvin.addAlternativeSymbol("m3·K");
		MillisecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/millisecond-TimeSquared","millisecond squared","ms2",MillisecondTime, 2.0);
		MillisecondTimeSquared.addAlternativeName("milliseconde kwadraat","nl");
		MilligramPerKilogram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/milligramPerKilogram","milligram per kilogram","mg/kg",Milligram, Kilogram);
		MilligramPerKilogram.addAlternativeSymbol("mg kg-1");
		MilligramPerKilogram.addAlternativeSymbol("mg·kg-1");
		Decicandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decicandela","decicandela","dcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		MolePerMillimetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerMillimetre","mole per millimetre","mol/mm",Mole, Millimetre);
		MolePerMillimetre.addAlternativeName("mole per millimeter","nl");
		MolePerMillimetre.addAlternativeSymbol("mol mm-1");
		MolePerMillimetre.addAlternativeSymbol("mol·mm-1");
		YoctomolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctomolePerLitre","yoctomole per litre","ymol/l",Yoctomole, Litre);
		YoctomolePerLitre.addAlternativeName("yoctomole per liter","nl");
		YoctomolePerLitre.addAlternativeSymbol("ymol l-1");
		YoctomolePerLitre.addAlternativeSymbol("ymol·l-1");
		SquareCentimetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareCentimetre","square centimetre","cm2",Centimetre, 2.0);
		SquareCentimetre.addAlternativeName("vierkante centimeter","nl");
		CandelaPerSquareCentimetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/candelaPerSquareCentimetre","candela per square centimetre","cd/cm2",Candela, SquareCentimetre);
		CandelaPerSquareCentimetre.addAlternativeName("candela per vierkante centimeter","nl");
		CandelaPerSquareCentimetre.addAlternativeSymbol("cd/cm");
		CandelaPerSquareCentimetre.addAlternativeSymbol("cd cm-1");
		CandelaPerSquareCentimetre.addAlternativeSymbol("cd·cm-1");
		Yoctovolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctovolt","yoctovolt","yV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Gigagray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigagray","gigagray","GGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		GallonUS = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gallon-US", "gallon (US)", "gal", CubicMetre, 0.003785412 );
		Kilogray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogray","kilogray","kGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		ReciprocalPartsPerMillionPerYear = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalPartsPerMillionPerYear","reciprocal parts per million","ppm1/-1",PartsPerMillion, -1.0);
		ReciprocalPartsPerMillionPerYear.addAlternativeSymbol("ppm-1");
		Gigagram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigagram","gigagram","Gg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		HorsepowerBritish = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/horsepower-British", "horsepower (British)", "null", Watt, 745.7 );
		Exafarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exafarad","exafarad","EF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Petahertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petahertz","petahertz","PHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Abfarad = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/abfarad", "abfarad", "abF", Farad, 1.0E9 );
		CentimolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/centimolePerLitre","centimole per litre","cmol/l",Centimole, Litre);
		CentimolePerLitre.addAlternativeName("centimole per liter","nl");
		CentimolePerLitre.addAlternativeSymbol("cmol l-1");
		CentimolePerLitre.addAlternativeSymbol("cmol·l-1");
		ZettamolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/zettamolePerMetre","zettamole per metre","Zmol/m",Zettamole, Metre);
		ZettamolePerMetre.addAlternativeName("zettamole per meter","nl");
		ZettamolePerMetre.addAlternativeSymbol("Zmol m-1");
		ZettamolePerMetre.addAlternativeSymbol("Zmol·m-1");
		Kilohertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilohertz","kilohertz","kHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Decacandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decacandela","decacandela","dacd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		GramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerLitre","gram per litre","g/l",Gram, Litre);
		GramPerLitre.addAlternativeName("gram per liter","nl");
		GramPerLitre.addAlternativeSymbol("g l-1");
		GramPerLitre.addAlternativeSymbol("g·l-1");
		Millifarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millifarad","millifarad","mF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		SecondHourAngle = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/second-HourAngle", "second (hour angle)", "s", Degree, 0.0041666667 );
		SecondHourAngle.addAlternativeName("seconde (uurhoek)","nl");
		Kilotesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilotesla","kilotesla","kT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Gal = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gal", "gal", "Gal", CentimetrePerSecondTimeSquared, 1.0 );
		Kip = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kip", "kip", "null", Newton, 4448.222 );
		Centicandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centicandela","centicandela","ccd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Hectohenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectohenry","hectohenry","hH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		YoctosecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctosecond-TimeSquared","yoctosecond squared","ys2",YoctosecondTime, 2.0);
		YoctosecondTimeSquared.addAlternativeName("yoctoseconde kwadraat","nl");
		Centinewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centinewton","centinewton","cN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Megabecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megabecquerel","megabecquerel","MBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Microwatt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microwatt","microwatt","μW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Decagray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decagray","decagray","daGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Kiloelectronvolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kiloelectronvolt","kiloelectronvolt","keV",(SingularUnit)Electronvolt, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		GramPerFemtolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerFemtolitre","gram per femtolitre","g/fl",Gram, Femtolitre);
		GramPerFemtolitre.addAlternativeName("gram per femtoliter","nl");
		GramPerFemtolitre.addAlternativeSymbol("g fl-1");
		GramPerFemtolitre.addAlternativeSymbol("g·fl-1");
		Millijoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millijoule","millijoule","mJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MetrePerNanosecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerNanosecond-Time","metre per nanosecond","m/ns",Metre, NanosecondTime);
		MetrePerNanosecondTime.addAlternativeName("meter per nanoseconde","nl");
		MetrePerNanosecondTime.addAlternativeSymbol("m ns-1");
		MetrePerNanosecondTime.addAlternativeSymbol("m·ns-1");
		PetamolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/petamolePerLitre","petamole per litre","Pmol/l",Petamole, Litre);
		PetamolePerLitre.addAlternativeName("petamole per liter","nl");
		PetamolePerLitre.addAlternativeSymbol("Pmol l-1");
		PetamolePerLitre.addAlternativeSymbol("Pmol·l-1");
		Yobibyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yobibyte","yobibyte","YiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.YOBI);
		Decibar = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decibar","decibar","dbar",(SingularUnit)Bar, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Microgray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microgray","microgray","μGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Zeptogram = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptogram","zeptogram","zg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Zettanewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettanewton","zettanewton","ZN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		MolePerNanolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerNanolitre","mole per nanolitre","mol/nl",Mole, Nanolitre);
		MolePerNanolitre.addAlternativeName("mole per nanoliter","nl");
		MolePerNanolitre.addAlternativeSymbol("mol nl-1");
		MolePerNanolitre.addAlternativeSymbol("mol·nl-1");
		Decilux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decilux","decilux","dlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		GramPerTeralitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerTeralitre","gram per teralitre","g/Tl",Gram, Teralitre);
		GramPerTeralitre.addAlternativeName("gram per teraliter","nl");
		GramPerTeralitre.addAlternativeSymbol("g Tl-1");
		GramPerTeralitre.addAlternativeSymbol("g·Tl-1");
		YottamolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/yottamolePerLitre","yottamole per litre","Ymol/l",Yottamole, Litre);
		YottamolePerLitre.addAlternativeName("yottamole per liter","nl");
		YottamolePerLitre.addAlternativeSymbol("Ymol l-1");
		YottamolePerLitre.addAlternativeSymbol("Ymol·l-1");
		Gigabit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigabit","gigabit","Gbit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Millibar = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millibar","millibar","mbar",(SingularUnit)Bar, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MillinewtonMetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/millinewtonMetre","millinewton metre","mN.m",Millinewton, Metre);
		MillinewtonMetre.addAlternativeName("millinewton meter","nl");
		MillinewtonMetre.addAlternativeSymbol("mN m");
		MillinewtonMetre.addAlternativeSymbol("mN·m");
		Millilux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/millilux","millilux","mlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		DaySidereal = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/day-Sidereal", "day (sidereal)", "null", SecondTime, 86164.09 );
		MolePerKilogram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerKilogram","mole per kilogram","mol/kg",Mole, Kilogram);
		MolePerKilogram.addAlternativeName("mol per kilogram","nl");
		MolePerKilogram.addAlternativeSymbol("mol kg-1");
		MolePerKilogram.addAlternativeSymbol("mol·kg-1");
		KilometrePerHour = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilometrePerHour","kilometre per hour","km/h",Kilometre, Hour);
		KilometrePerHour.addAlternativeName("kilometer per uur","nl");
		KilometrePerHour.addAlternativeSymbol("km h-1");
		KilometrePerHour.addAlternativeSymbol("km·h-1");
		YottasecondTimeSquared = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/yottasecond-TimeSquared","yottasecond squared","Ys2",YottasecondTime, 2.0);
		YottasecondTimeSquared.addAlternativeName("yottaseconde kwadraat","nl");
		Decipascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decipascal","decipascal","dPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Yoctosteradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctosteradian","yoctosteradian","ysr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Yoctosteradian.addAlternativeName("yoctosteradiaal","nl");
		Femtosteradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtosteradian","femtosteradian","fsr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Femtosteradian.addAlternativeName("femtosteradiaal","nl");
		CubicZettametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicZettametre","cubic zettametre","Zm3",Zettametre, 3.0);
		CubicZettametre.addAlternativeName("kubieke zettameter","nl");
		Megatesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megatesla","megatesla","MT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Examolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/examolair","examolair","EM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Percent = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/percent", "percent", "%", One, 0.01 );
		Percent.addAlternativeName("procent","nl");
		MolePerZettalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerZettalitre","mole per zettalitre","mol/Zl",Mole, Zettalitre);
		MolePerZettalitre.addAlternativeName("mole per zettaliter","nl");
		MolePerZettalitre.addAlternativeSymbol("mol Zl-1");
		MolePerZettalitre.addAlternativeSymbol("mol·Zl-1");
		Picohenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picohenry","picohenry","pH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Slug = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/slug", "slug", "slug", Kilogram, 14.5939 );
		Decaweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decaweber","decaweber","daWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		GramPerAttolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerAttolitre","gram per attolitre","g/al",Gram, Attolitre);
		GramPerAttolitre.addAlternativeName("gram per attoliter","nl");
		GramPerAttolitre.addAlternativeSymbol("g al-1");
		GramPerAttolitre.addAlternativeSymbol("g·al-1");
		Zettajoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettajoule","zettajoule","ZJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		PicometrePerSecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/picometrePerSecond-Time","picometre per second","pm/s",Picometre, SecondTime);
		PicometrePerSecondTime.addAlternativeName("picometer per seconde","nl");
		PicometrePerSecondTime.addAlternativeSymbol("pm s-1");
		PicometrePerSecondTime.addAlternativeSymbol("pm·s-1");
		Zettafarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettafarad","zettafarad","ZF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		CubicExametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicExametre","cubic exametre","Em3",Exametre, 3.0);
		CubicExametre.addAlternativeName("kubieke exameter","nl");
		Zeptogray = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptogray","zeptogray","zGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		MolePerCentimetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerCentimetre","mole per centimetre","mol/cm",Mole, Centimetre);
		MolePerCentimetre.addAlternativeName("mole per centimeter","nl");
		MolePerCentimetre.addAlternativeSymbol("mol cm-1");
		MolePerCentimetre.addAlternativeSymbol("mol·cm-1");
		GillUS = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gill-US", "gill (US)", "gi", CubicMetre, 1.182941E-4 );
		Nanoradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanoradian","nanoradian","nrad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Nanoradian.addAlternativeName("nanoradiaal","nl");
		ReciprocalCubicParsec = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/reciprocalCubicParsec","reciprocal cubic parsec","pc1/-0.3333333333333333",Parsec, -3.0);
		ReciprocalCubicParsec.addAlternativeName("omgekeerde kubieke parsec","nl");
		ReciprocalCubicParsec.addAlternativeSymbol("pc-3");
		KilogramSquareMetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramSquareMetre","kilogram square metre","kg.m2",Kilogram, SquareMetre);
		KilogramSquareMetre.addAlternativeName("kilogram vierkante meter","nl");
		KilogramSquareMetre.addAlternativeSymbol("kg m2");
		KilogramSquareMetre.addAlternativeSymbol("kg·m2");
		PetagramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/petagramPerLitre","petagram per litre","Pg/l",Petagram, Litre);
		PetagramPerLitre.addAlternativeName("petagram per liter","nl");
		PetagramPerLitre.addAlternativeSymbol("Pg l-1");
		PetagramPerLitre.addAlternativeSymbol("Pg·l-1");
		MolePerPetalitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerPetalitre","mole per petalitre","mol/Pl",Mole, Petalitre);
		MolePerPetalitre.addAlternativeName("mole per petaliter","nl");
		MolePerPetalitre.addAlternativeSymbol("mol Pl-1");
		MolePerPetalitre.addAlternativeSymbol("mol·Pl-1");
		CubicTerametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/cubicTerametre","cubic terametre","Tm3",Terametre, 3.0);
		CubicTerametre.addAlternativeName("kubieke terameter","nl");
		Micron = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/micron", "micron", "μ", Metre, 1.0E-6 );
		Decapascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decapascal","decapascal","daPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Yoctoweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctoweber","yoctoweber","yWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		RadianPerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/radianPerSecond-TimeSquared","radian per second squared","rad/s2",Radian, SecondTimeSquared);
		RadianPerSecondTimeSquared.addAlternativeName("radiaal per seconde kwadraat","nl");
		RadianPerSecondTimeSquared.addAlternativeSymbol("rad s-2");
		RadianPerSecondTimeSquared.addAlternativeSymbol("rad·s-2");
		ThermUS = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/therm-US", "therm (US)", "null", Joule, 1.054804E8 );
		Decilumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decilumen","decilumen","dlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Yottaweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottaweber","yottaweber","YWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Exacandela = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exacandela","exacandela","Ecd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Hectocoulomb = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectocoulomb","hectocoulomb","hC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		ExamolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/examolePerLitre","examole per litre","Emol/l",Examole, Litre);
		ExamolePerLitre.addAlternativeName("examole per liter","nl");
		ExamolePerLitre.addAlternativeSymbol("Emol l-1");
		ExamolePerLitre.addAlternativeSymbol("Emol·l-1");
		Centiweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centiweber","centiweber","cWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Exajoule = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exajoule","exajoule","EJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		MetrePerYoctosecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerYoctosecond-TimeSquared","metre per yoctosecond squared","m/ys2",Metre, YoctosecondTimeSquared);
		MetrePerYoctosecondTimeSquared.addAlternativeName("meter per yoctoseconde kwadraat","nl");
		MetrePerYoctosecondTimeSquared.addAlternativeSymbol("m ys-2");
		MetrePerYoctosecondTimeSquared.addAlternativeSymbol("m·ys-2");
		Angstrom = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/angstrom", "ångström", "Å", Metre, 1.0E-10 );
		Yottanewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottanewton","yottanewton","YN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Milliweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/milliweber","milliweber","mWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		DeltaA450PerSecondTimePerMilligram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/deltaA450PerSecond-TimePerMilligram","delta A450 per second per milligram","1/s/mg",DeltaA450PerSecondTime, Milligram);
		DeltaA450PerSecondTimePerMilligram.addAlternativeName("delta A450 per seconde per milligram","nl");
		WattSquareMetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/wattSquareMetre","watt square metre","W.m2",Watt, SquareMetre);
		WattSquareMetre.addAlternativeName("watt vierkante meter","nl");
		WattSquareMetre.addAlternativeSymbol("W m2");
		WattSquareMetre.addAlternativeSymbol("W·m2");
		Yottabecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottabecquerel","yottabecquerel","YBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Furlong = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/furlong", "furlong", "null", Metre, 201.168 );
		GigamolePerMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gigamolePerMetre","gigamole per metre","Gmol/m",Gigamole, Metre);
		GigamolePerMetre.addAlternativeName("gigamole per meter","nl");
		GigamolePerMetre.addAlternativeSymbol("Gmol m-1");
		GigamolePerMetre.addAlternativeSymbol("Gmol·m-1");
		Gigabyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigabyte","gigabyte","GB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Petalux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petalux","petalux","Plx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		SquareYoctometre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareYoctometre","square yoctometre","ym2",Yoctometre, 2.0);
		SquareYoctometre.addAlternativeName("vierkante yoctometer","nl");
		Yottakatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottakatal","yottakatal","Ykat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Femtoradian = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtoradian","femtoradian","frad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Femtoradian.addAlternativeName("femtoradiaal","nl");
		MetrePerAttosecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerAttosecond-Time","metre per attosecond","m/as",Metre, AttosecondTime);
		MetrePerAttosecondTime.addAlternativeName("meter per attoseconde","nl");
		MetrePerAttosecondTime.addAlternativeSymbol("m as-1");
		MetrePerAttosecondTime.addAlternativeSymbol("m·as-1");
		Yottamolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottamolair","yottamolair","YM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		SquareMillimetre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMillimetre","square millimetre","mm2",Millimetre, 2.0);
		SquareMillimetre.addAlternativeName("vierkante millimeter","nl");
		SquareTerametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareTerametre","square terametre","Tm2",Terametre, 2.0);
		SquareTerametre.addAlternativeName("vierkante terameter","nl");
		SecondTimePerDay = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/second-TimePerDay","second per day","s/d",SecondTime, Day);
		SecondTimePerDay.addAlternativeName("seconde per dag","nl");
		SecondTimePerDay.addAlternativeSymbol("s d-1");
		SecondTimePerDay.addAlternativeSymbol("s·d-1");
		Zettatesla = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zettatesla","zettatesla","ZT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		SolarLuminosity = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/solarLuminosity", "solar luminosity", "L_☉", Watt, 3.839E26 );
		Perm0C = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/perm-0C", "perm (0 °C)", "null", KilogramPerPascalSecondTimeSquareMetre, 5.72135E-11 );
		MetrePerZettasecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerZettasecond-Time","metre per zettasecond","m/Zs",Metre, ZettasecondTime);
		MetrePerZettasecondTime.addAlternativeName("meter per zettaseconde","nl");
		MetrePerZettasecondTime.addAlternativeSymbol("m Zs-1");
		MetrePerZettasecondTime.addAlternativeSymbol("m·Zs-1");
		FootUSSurvey = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/foot-USSurvey", "foot (US survey)", "ft", Metre, 0.3048006 );
		GramMetreToThePower2ReciprocalMetre = factory.createUnitMultiplication("http://www.ontology-of-units-of-measure.org/resource/om-2/gramMetreToThePower-2ReciprocalMetre","gram metre to the power -2 reciprocal metre","g.m1/-0.5",Gram, MetreToThePower2);
		GramMetreToThePower2ReciprocalMetre.addAlternativeName("gram meter tot de macht -2 omgekeerde meter","nl");
		GramMetreToThePower2ReciprocalMetre.addAlternativeSymbol("g m-2 m-1");
		GramMetreToThePower2ReciprocalMetre.addAlternativeSymbol("g·m-2·m-1");
		CentigramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/centigramPerLitre","centigram per litre","cg/l",Centigram, Litre);
		CentigramPerLitre.addAlternativeName("centigram per liter","nl");
		CentigramPerLitre.addAlternativeSymbol("cg l-1");
		CentigramPerLitre.addAlternativeSymbol("cg·l-1");
		Microvolt = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microvolt","microvolt","μV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		JoulePerCubicMetreKelvin = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/joulePerCubicMetreKelvin","joule per cubic metre kelvin","J/m3.K",Joule, CubicMetreKelvin);
		JoulePerCubicMetreKelvin.addAlternativeName("joule per kubieke meter kelvin","nl");
		JoulePerCubicMetreKelvin.addAlternativeSymbol("J/m3 K");
		JoulePerCubicMetreKelvin.addAlternativeSymbol("J-1 m3 K");
		JoulePerCubicMetreKelvin.addAlternativeSymbol("J-1·m3·K");
		JoulePerCubicMetreKelvin.addAlternativeSymbol("J/(m3·K)");
		Yard = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yard", "yard", "yd", Metre, 0.9144 );
		Yoctokatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yoctokatal","yoctokatal","ykat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		ExagramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/exagramPerLitre","exagram per litre","Eg/l",Exagram, Litre);
		ExagramPerLitre.addAlternativeName("exagram per liter","nl");
		ExagramPerLitre.addAlternativeSymbol("Eg l-1");
		ExagramPerLitre.addAlternativeSymbol("Eg·l-1");
		Yottaohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottaohm","yottaohm","YΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		GigagramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gigagramPerLitre","gigagram per litre","Gg/l",Gigagram, Litre);
		GigagramPerLitre.addAlternativeName("gigagram per liter","nl");
		GigagramPerLitre.addAlternativeSymbol("Gg l-1");
		GigagramPerLitre.addAlternativeSymbol("Gg·l-1");
		Megaampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megaampere","megaampere","MA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Megaampere.addAlternativeName("megaampère","nl");
		TonOfTNT = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/tonOfTNT", "ton of TNT", "null", Joule, 4.184E9 );
		Picoohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picoohm","picoohm","pΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		CentidegreeCelsius = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centidegreeCelsius","centidegree Celsius","c°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		CentidegreeCelsius.addAlternativeName("centigraad Celsius","nl");
		Shannon = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/shannon", "shannon", "Sh", Bit, 1.0 );
		Picobecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picobecquerel","picobecquerel","pBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Decakatal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decakatal","decakatal","dakat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Nanoohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanoohm","nanoohm","nΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		MagnitudePerSecondAngleSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/magnitudePerSecond-AngleSquared","magnitude per second (angle) squared","mag/\"2",Magnitude, SecondAngleSquared);
		MagnitudePerSecondAngleSquared.addAlternativeSymbol("mag/arcsec2");
		MagnitudePerSecondAngleSquared.addAlternativeSymbol("mag arcsec-2");
		MagnitudePerSecondAngleSquared.addAlternativeSymbol("mag·arcsec-2");
		GramPerCentilitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gramPerCentilitre","gram per centilitre","g/cl",Gram, Centilitre);
		GramPerCentilitre.addAlternativeName("gram per centiliter","nl");
		GramPerCentilitre.addAlternativeSymbol("g cl-1");
		GramPerCentilitre.addAlternativeSymbol("g·cl-1");
		Gamma = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gamma", "gamma", "γ", Tesla, 1.0E-9 );
		Teraweber = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/teraweber","teraweber","TWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		TeramolePerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/teramolePerLitre","teramole per litre","Tmol/l",Teramole, Litre);
		TeramolePerLitre.addAlternativeName("teramole per liter","nl");
		TeramolePerLitre.addAlternativeSymbol("Tmol l-1");
		TeramolePerLitre.addAlternativeSymbol("Tmol·l-1");
		Exanewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exanewton","exanewton","EN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Poundal = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/poundal", "poundal", "null", Newton, 0.138255 );
		Zeptobecquerel = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptobecquerel","zeptobecquerel","zBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		MolePerAttolitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerAttolitre","mole per attolitre","mol/al",Mole, Attolitre);
		MolePerAttolitre.addAlternativeName("mole per attoliter","nl");
		MolePerAttolitre.addAlternativeSymbol("mol al-1");
		MolePerAttolitre.addAlternativeSymbol("mol·al-1");
		NanounifiedAtomicMassUnit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/nanounifiedAtomicMassUnit","nanounified atomic mass unit","nu",(SingularUnit)UnifiedAtomicMassUnit, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Attoampere = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attoampere","attoampere","aA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Attoampere.addAlternativeName("attoampère","nl");
		Gigaparsec = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigaparsec","gigaparsec","Gpc",(SingularUnit)Parsec, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		SquareMetrePerGram = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMetrePerGram","square metre per gram","m2/g",SquareMetre, Gram);
		SquareMetrePerGram.addAlternativeName("vierkante meter per gram","nl");
		SquareMetrePerGram.addAlternativeSymbol("m2 g-1");
		SquareMetrePerGram.addAlternativeSymbol("m2·g-1");
		Zeptohenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptohenry","zeptohenry","zH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		ExametrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/exametrePerSecond-TimeSquared","exametre per second squared","Em/s2",Exametre, SecondTimeSquared);
		ExametrePerSecondTimeSquared.addAlternativeName("exameter per seconde kwadraat","nl");
		ExametrePerSecondTimeSquared.addAlternativeSymbol("Em s-2");
		ExametrePerSecondTimeSquared.addAlternativeSymbol("Em·s-2");
		KilogramPerSquareMetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/kilogramPerSquareMetre","kilogram per square metre","kg/m2",Kilogram, SquareMetre);
		KilogramPerSquareMetre.addAlternativeName("kilogram per vierkante meter","nl");
		KilogramPerSquareMetre.addAlternativeSymbol("kg m-2");
		KilogramPerSquareMetre.addAlternativeSymbol("kg·m-2");
		MolePerDecimetre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerDecimetre","mole per decimetre","mol/dm",Mole, Decimetre);
		MolePerDecimetre.addAlternativeName("mole per decimeter","nl");
		MolePerDecimetre.addAlternativeSymbol("mol dm-1");
		MolePerDecimetre.addAlternativeSymbol("mol·dm-1");
		Meganewton = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/meganewton","meganewton","MN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Fathom = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/fathom", "fathom", "null", Metre, 1.828804 );
		Exabyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exabyte","exabyte","EB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Micropascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/micropascal","micropascal","μPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Decaohm = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decaohm","decaohm","daΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Gigapascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigapascal","gigapascal","GPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Statampere = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/statampere", "statampere", "statA", Ampere, 3.335641E-10 );
		Statampere.addAlternativeName("statampère","nl");
		Centisievert = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centisievert","centisievert","cSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		MetrePerGigasecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerGigasecond-Time","metre per gigasecond","m/Gs",Metre, GigasecondTime);
		MetrePerGigasecondTime.addAlternativeName("meter per gigaseconde","nl");
		MetrePerGigasecondTime.addAlternativeSymbol("m Gs-1");
		MetrePerGigasecondTime.addAlternativeSymbol("m·Gs-1");
		Kilopascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilopascal","kilopascal","kPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Calorie20C = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/calorie-20C", "calorie (20 °C)", "cal_20", Joule, 4.1819 );
		GigametrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/gigametrePerSecond-TimeSquared","gigametre per second squared","Gm/s2",Gigametre, SecondTimeSquared);
		GigametrePerSecondTimeSquared.addAlternativeName("gigameter per seconde kwadraat","nl");
		GigametrePerSecondTimeSquared.addAlternativeSymbol("Gm s-2");
		GigametrePerSecondTimeSquared.addAlternativeSymbol("Gm·s-2");
		Attokelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/attokelvin","attokelvin","aK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Hectolumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hectolumen","hectolumen","hlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		OunceAvoirdupois = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/ounceAvoirdupois", "ounce (avoirdupois)", "oz", Kilogram, 0.02834952 );
		OunceAvoirdupois.addAlternativeSymbol("oz (av.)");
		OunceAvoirdupois.addAlternativeSymbol("oz avdp");
		MolePerPicometre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/molePerPicometre","mole per picometre","mol/pm",Mole, Picometre);
		MolePerPicometre.addAlternativeName("mole per picometer","nl");
		MolePerPicometre.addAlternativeSymbol("mol pm-1");
		MolePerPicometre.addAlternativeSymbol("mol·pm-1");
		Picolumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picolumen","picolumen","plm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		ZeptogramPerLitre = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/zeptogramPerLitre","zeptogram per litre","zg/l",Zeptogram, Litre);
		ZeptogramPerLitre.addAlternativeName("zeptogram per liter","nl");
		ZeptogramPerLitre.addAlternativeSymbol("zg l-1");
		ZeptogramPerLitre.addAlternativeSymbol("zg·l-1");
		MetrePerYottasecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerYottasecond-TimeSquared","metre per yottasecond squared","m/Ys2",Metre, YottasecondTimeSquared);
		MetrePerYottasecondTimeSquared.addAlternativeName("meter per yottaseconde kwadraat","nl");
		MetrePerYottasecondTimeSquared.addAlternativeSymbol("m Ys-2");
		MetrePerYottasecondTimeSquared.addAlternativeSymbol("m·Ys-2");
		LitrePerMole = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/litrePerMole","litre per mole","l/mol",Litre, Mole);
		LitrePerMole.addAlternativeName("liter per mol","nl");
		LitrePerMole.addAlternativeSymbol("l mol-1");
		LitrePerMole.addAlternativeSymbol("l·mol-1");
		Decihertz = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decihertz","decihertz","dHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Gigafarad = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/gigafarad","gigafarad","GF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Microlumen = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/microlumen","microlumen","μlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Yottabit = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/yottabit","yottabit","Ybit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		PointDidot = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/point-Didot", "point (Didot)", "pt", Metre, 3.759E-4 );
		AttometrePerSecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/attometrePerSecond-TimeSquared","attometre per second squared","am/s2",Attometre, SecondTimeSquared);
		AttometrePerSecondTimeSquared.addAlternativeName("attometer per seconde kwadraat","nl");
		AttometrePerSecondTimeSquared.addAlternativeSymbol("am s-2");
		AttometrePerSecondTimeSquared.addAlternativeSymbol("am·s-2");
		Megakelvin = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/megakelvin","megakelvin","MK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Centimolair = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centimolair","centimolair","cM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Kilotonne = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilotonne","kilotonne","kt",(SingularUnit)Tonne, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Kilotonne.addAlternativeName("kiloton","nl");
		Petabyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petabyte","petabyte","PB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Decisiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/decisiemens","decisiemens","dS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Exalux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/exalux","exalux","Elx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Hartley = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/hartley", "hartley", "Hart", Bit, 3.321928095 );
		Picopascal = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/picopascal","picopascal","pPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Bushel = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/bushel", "bushel", "bu", CubicMetre, 0.03523907 );
		MetrePerMillisecondTimeSquared = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerMillisecond-TimeSquared","metre per millisecond squared","m/ms2",Metre, MillisecondTimeSquared);
		MetrePerMillisecondTimeSquared.addAlternativeName("meter per milliseconde kwadraat","nl");
		MetrePerMillisecondTimeSquared.addAlternativeSymbol("m ms-2");
		MetrePerMillisecondTimeSquared.addAlternativeSymbol("m·ms-2");
		Centisiemens = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/centisiemens","centisiemens","cS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Petahenry = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/petahenry","petahenry","PH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Cicero = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/cicero", "cicero", "null", PointDidot, 12.0 );
		SquareMegametre = factory.createUnitExponentiation("http://www.ontology-of-units-of-measure.org/resource/om-2/squareMegametre","square megametre","Mm2",Megametre, 2.0);
		SquareMegametre.addAlternativeName("vierkante megameter","nl");
		Stere = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/stere", "stere", "null", CubicMetre, 1.0 );
		Rad = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/rad", "rad", "rad", Gray, 0.01 );
		Kilobyte = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/kilobyte","kilobyte","kB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		MetrePerCentisecondTime = factory.createUnitDivision("http://www.ontology-of-units-of-measure.org/resource/om-2/metrePerCentisecond-Time","metre per centisecond","m/cs",Metre, CentisecondTime);
		MetrePerCentisecondTime.addAlternativeName("meter per centiseconde","nl");
		MetrePerCentisecondTime.addAlternativeSymbol("m cs-1");
		MetrePerCentisecondTime.addAlternativeSymbol("m·cs-1");
		PoundForce = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/pound-Force", "pound-force", "lbf", Newton, 4.448222 );
		TonRegister = factory.createSingularUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/ton-Register", "ton (register)", "null", CubicMetre, 2.831658 );
		Femtolux = factory.createPrefixedUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/femtolux","femtolux","flx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		InternationalUnit = factory.createBaseUnit("http://www.ontology-of-units-of-measure.org/resource/om-2/InternationalUnit", "International Unit", "IU", nl.wur.fbr.om.model.dimensions.SIBaseDimension.MASS);
	}

    /**
     * Returns all units in this set.
     *
     * @return All units.
     */
    @Override
    public Set<Unit> getAllUnits() {
        Set<Unit> units = new HashSet<>();
        units.add(Decasievert);
        units.add(Statvolt);
        units.add(MegametrePerSecondTime);
        units.add(Attohertz);
        units.add(Petagray);
        units.add(Terametre);
        units.add(MetrePerYottasecondTime);
        units.add(Yoctosievert);
        units.add(Gigasiemens);
        units.add(DecasecondTimeSquared);
        units.add(MetrePerMicrosecondTimeSquared);
        units.add(Zebibit);
        units.add(Jansky);
        units.add(OunceApothecaries);
        units.add(Yoctohenry);
        units.add(Oersted);
        units.add(Gigaweber);
        units.add(ZettagramPerLitre);
        units.add(Microhertz);
        units.add(Yottajoule);
        units.add(MetrePerMegasecondTimeSquared);
        units.add(Gigakatal);
        units.add(Decakelvin);
        units.add(Megasiemens);
        units.add(Petaampere);
        units.add(GramPerYoctolitre);
        units.add(Picokatal);
        units.add(Kilolux);
        units.add(Ampere);
        units.add(MetrePerHectosecondTimeSquared);
        units.add(Picoweber);
        units.add(Decisievert);
        units.add(CandelaSteradian);
        units.add(SquareMicrometre);
        units.add(Hectobecquerel);
        units.add(WattPerCubicmetre);
        units.add(Petagram);
        units.add(Dessertspoon);
        units.add(CubicMegametre);
        units.add(DecisecondTime);
        units.add(Tesla);
        units.add(PoundAvoirdupois);
        units.add(FemtomolePerMetre);
        units.add(Kilolitre);
        units.add(Yottametre);
        units.add(Exasievert);
        units.add(Petamolair);
        units.add(MillimetreOfMercury);
        units.add(GramPerNanolitre);
        units.add(Inch);
        units.add(Megabit);
        units.add(PicosecondTime);
        units.add(SquareMetrePerSquareMetreDay);
        units.add(Nanopascal);
        units.add(TonnePerHectare);
        units.add(Megasievert);
        units.add(Hectolitre);
        units.add(HectometrePerSecondTimeSquared);
        units.add(BritishThermalUnitInternationalTable);
        units.add(DegreeCelsiusPerHour);
        units.add(GramPerCubicCentimetre);
        units.add(Exatesla);
        units.add(Centikelvin);
        units.add(Exakelvin);
        units.add(Gigasievert);
        units.add(MillimolePerMetre);
        units.add(Gon);
        units.add(MolePerMicrometre);
        units.add(Zettapascal);
        units.add(Millivolt);
        units.add(Petamole);
        units.add(Exasiemens);
        units.add(Centihenry);
        units.add(LumenSecondTime);
        units.add(Megafarad);
        units.add(Rem);
        units.add(ReciprocalHenry);
        units.add(Femtocandela);
        units.add(Teratesla);
        units.add(Zeptolitre);
        units.add(Decahertz);
        units.add(SquareMetrePerSquareMetre);
        units.add(Metre);
        units.add(SquareExametre);
        units.add(Zeptocandela);
        units.add(CircularMil);
        units.add(MolePerExalitre);
        units.add(AstronomicalUnit);
        units.add(KelvinKilogram);
        units.add(Exavolt);
        units.add(MillisecondTime);
        units.add(MolePerCubicmetre);
        units.add(MegasecondTimeSquared);
        units.add(Millimole);
        units.add(Zettasiemens);
        units.add(Millisteradian);
        units.add(Decihenry);
        units.add(Nanoweber);
        units.add(Biot);
        units.add(PartsPerMillion);
        units.add(Abampere);
        units.add(Zettasievert);
        units.add(Yottatesla);
        units.add(Terajoule);
        units.add(Milliwatt);
        units.add(ReciprocalDegreeCelsiusDay);
        units.add(Gigayear);
        units.add(Exbibyte);
        units.add(Nanocoulomb);
        units.add(DryGallonUS);
        units.add(Foot);
        units.add(MicrosecondAngle);
        units.add(Exametre);
        units.add(ReciprocalYear);
        units.add(Statfarad);
        units.add(SecondTimeSquared);
        units.add(FemtometrePerSecondTime);
        units.add(Femtopascal);
        units.add(CentimolePerMetre);
        units.add(Deciradian);
        units.add(GramPerPicolitre);
        units.add(Megawatt);
        units.add(MicromolePerMole);
        units.add(ErgSecondTime);
        units.add(MolePerMillilitre);
        units.add(SecondTimeToThePower2);
        units.add(NanosecondTimeSquared);
        units.add(ZeptosecondTime);
        units.add(Attohenry);
        units.add(Milligray);
        units.add(CubicMillimetre);
        units.add(Hectomolair);
        units.add(Yottakelvin);
        units.add(NanosecondTime);
        units.add(Rhe);
        units.add(JoulePerSquareMetre);
        units.add(MetrePerPetasecondTimeSquared);
        units.add(Milligram);
        units.add(MolePerKilometre);
        units.add(Kilolumen);
        units.add(Yoctosiemens);
        units.add(Zeptolumen);
        units.add(Terafarad);
        units.add(Exabit);
        units.add(MetrePerMegasecondTime);
        units.add(Zeptoradian);
        units.add(Stattesla);
        units.add(Yoctohertz);
        units.add(YoctodegreeCelsius);
        units.add(LitrePer100Kilometre);
        units.add(TeragramPerLitre);
        units.add(Microhenry);
        units.add(Yottaampere);
        units.add(ZettamolePerLitre);
        units.add(ReciprocalPascalSecondTime);
        units.add(Zettabecquerel);
        units.add(MolePerDecalitre);
        units.add(DecametrePerSecondTime);
        units.add(Microcoulomb);
        units.add(Megamole);
        units.add(Petavolt);
        units.add(WattPerNanometre);
        units.add(Yoctoradian);
        units.add(Decalumen);
        units.add(LiquidQuartUS);
        units.add(KilometrePerSecondTimePerMegaparsec);
        units.add(MegaeuroPerMegawatt);
        units.add(CubicKilometre);
        units.add(Centikatal);
        units.add(Petacoulomb);
        units.add(CoulombPerCubicmetre);
        units.add(Hectovolt);
        units.add(Kilovolt);
        units.add(Terasiemens);
        units.add(GramPerPetalitre);
        units.add(SolarMassPerGigayearCubicParsec);
        units.add(Exagray);
        units.add(MolePerCentilitre);
        units.add(Megalitre);
        units.add(Attolumen);
        units.add(MetrePerKilosecondTime);
        units.add(Kelvin);
        units.add(Zettalux);
        units.add(Exagram);
        units.add(ThermEC);
        units.add(HectogramPerLitre);
        units.add(Kilofarad);
        units.add(FluidOunceUS);
        units.add(Megamolair);
        units.add(Decawatt);
        units.add(Kilobit);
        units.add(ExamolePerMetre);
        units.add(Terasievert);
        units.add(SquareMetreKelvin);
        units.add(Petaweber);
        units.add(CubicCentimetrePerCubicCentimetre);
        units.add(Zettawatt);
        units.add(GramPerGram);
        units.add(DecametrePerSecondTimeSquared);
        units.add(Femtojoule);
        units.add(Erg);
        units.add(Hectolux);
        units.add(MolePerSecondTime);
        units.add(MetrePerPetasecondTime);
        units.add(Hectopascal);
        units.add(PetasecondTime);
        units.add(CandelaPerSquareMetre);
        units.add(YoctometrePerSecondTime);
        units.add(Milliradian);
        units.add(ExasecondTime);
        units.add(Megalux);
        units.add(TerametrePerSecondTime);
        units.add(Farad);
        units.add(GramPerSquareMetreSecondTime);
        units.add(UnifiedAtomicMassUnit);
        units.add(YoctogramPerLitre);
        units.add(DecasecondTime);
        units.add(Decamolair);
        units.add(MegaeuroPerMegatonne);
        units.add(Candela);
        units.add(HectomolePerMetre);
        units.add(Zettaweber);
        units.add(JoulePerSquareMetreDay);
        units.add(MetrePerDecasecondTimeSquared);
        units.add(Poise);
        units.add(MicrogramPerSquareMetreSecondTime);
        units.add(Nanohertz);
        units.add(PascalSecondTime);
        units.add(Hectoampere);
        units.add(AcreFoot);
        units.add(Joule);
        units.add(CalorieThermochemical);
        units.add(MetreKilogramPerSecondTime);
        units.add(Kilocoulomb);
        units.add(Hectofarad);
        units.add(Millikatal);
        units.add(DecimetrePerSecondTimeSquared);
        units.add(CentisecondTimeSquared);
        units.add(BitPerSecondTime);
        units.add(Exaohm);
        units.add(Hectojoule);
        units.add(Maxwell);
        units.add(Picosievert);
        units.add(SecondTimePerSquareMetre);
        units.add(Millitesla);
        units.add(Yottafarad);
        units.add(MetrePerZeptosecondTimeSquared);
        units.add(Abmho);
        units.add(CentimetrePerSecondTimeSquared);
        units.add(Kilojoule);
        units.add(MolePerDecilitre);
        units.add(WattPerMetreKelvin);
        units.add(Centiampere);
        units.add(Hectogray);
        units.add(PicometrePerSecondTimeSquared);
        units.add(Hectomole);
        units.add(Kilomole);
        units.add(Milligauss);
        units.add(Petakatal);
        units.add(Rod);
        units.add(Femtometre);
        units.add(Nanohenry);
        units.add(PicodegreeCelsius);
        units.add(PetasecondTimeSquared);
        units.add(OhmMetre);
        units.add(Zettagray);
        units.add(Stokes);
        units.add(Yoctokelvin);
        units.add(MolePerYoctometre);
        units.add(Petabecquerel);
        units.add(Petawatt);
        units.add(Decinewton);
        units.add(Attolux);
        units.add(Picomolair);
        units.add(FemtosecondTime);
        units.add(Zettagram);
        units.add(Zettamolair);
        units.add(Teraampere);
        units.add(Pennyweight);
        units.add(Centilux);
        units.add(Decahenry);
        units.add(Gigamolair);
        units.add(Millimagnitude);
        units.add(Picosiemens);
        units.add(Femtofarad);
        units.add(Kilowatt);
        units.add(VoltPerMetre);
        units.add(Decasiemens);
        units.add(SolarMass);
        units.add(Decalux);
        units.add(Megatonne);
        units.add(Examole);
        units.add(Phot);
        units.add(MetrePerNanosecondTimeSquared);
        units.add(Exawatt);
        units.add(KilogramPerGigajoule);
        units.add(GramPerGigalitre);
        units.add(TerametrePerSecondTimeSquared);
        units.add(Zeptonewton);
        units.add(Petakelvin);
        units.add(ZeptodegreeCelsius);
        units.add(Femtosievert);
        units.add(CubicYoctometre);
        units.add(Hectogram);
        units.add(Zettamole);
        units.add(KelvinMole);
        units.add(TeramolePerMetre);
        units.add(MicromolePerSecondTimeGram);
        units.add(NanometrePerSecondTime);
        units.add(Zebibyte);
        units.add(KilocalorieMean);
        units.add(MillidegreeCelsius);
        units.add(Barye);
        units.add(Yoctonewton);
        units.add(MicronewtonMetre);
        units.add(ExametrePerSecondTime);
        units.add(ZeptometrePerSecondTime);
        units.add(DegreeCelsiusPerSecondTime);
        units.add(Faraday);
        units.add(Terakelvin);
        units.add(MetrePerMetre);
        units.add(Franklin);
        units.add(MolePerFemtometre);
        units.add(GramPerSquareMetreMetre);
        units.add(GigasecondTimeSquared);
        units.add(Femtohertz);
        units.add(CubicMicrometre);
        units.add(ReciprocalCubicCentimetre);
        units.add(Exaweber);
        units.add(Femtotesla);
        units.add(Centilumen);
        units.add(Tebibit);
        units.add(Zeptometre);
        units.add(AttomolePerMetre);
        units.add(Zettavolt);
        units.add(Abohm);
        units.add(Decigram);
        units.add(MolePerMole);
        units.add(Zeptosievert);
        units.add(Femtocoulomb);
        units.add(Zettabit);
        units.add(Gigahertz);
        units.add(MegajoulePerSquareMetreDay);
        units.add(GramPerExalitre);
        units.add(ZeptometrePerSecondTimeSquared);
        units.add(Cup);
        units.add(SquarePicometre);
        units.add(Teranewton);
        units.add(MileUSSurvey);
        units.add(Shake);
        units.add(Hour);
        units.add(Decigray);
        units.add(CubicMetrePerMole);
        units.add(NanogramPerLitre);
        units.add(Millibecquerel);
        units.add(HourHourAngle);
        units.add(Picotesla);
        units.add(MetrePerHectosecondTime);
        units.add(Microweber);
        units.add(Are);
        units.add(MetreToThePower2ReciprocalMetre);
        units.add(MoleMicrometreReciprocalSquareCentimetre);
        units.add(Yottamole);
        units.add(Zeptosiemens);
        units.add(Attoradian);
        units.add(Decisteradian);
        units.add(Pebibyte);
        units.add(MolePerHectometre);
        units.add(Megabyte);
        units.add(Decafarad);
        units.add(GramPerZeptolitre);
        units.add(Tebibyte);
        units.add(Picokelvin);
        units.add(Petametre);
        units.add(CoulombPerVolt);
        units.add(Hectowatt);
        units.add(MegametrePerSecondTimeSquared);
        units.add(MolePerGigalitre);
        units.add(WattPerAmpere);
        units.add(SecondAngleSquared);
        units.add(Kibibyte);
        units.add(Microkatal);
        units.add(Petajoule);
        units.add(HenryPerMetre);
        units.add(Picosteradian);
        units.add(MillimolePerLitre);
        units.add(Hectometre);
        units.add(PicaATA);
        units.add(JoulePerKelvinMole);
        units.add(Decikatal);
        units.add(Megapascal);
        units.add(Millimolair);
        units.add(Teramolair);
        units.add(PicomolePerMetre);
        units.add(Deciweber);
        units.add(Micromolair);
        units.add(Decimole);
        units.add(Exakatal);
        units.add(JoulePerMole);
        units.add(GramPerHectolitre);
        units.add(Attocandela);
        units.add(MoleMicrometreReciprocalSquareCentimetreReciprocalSecondTime);
        units.add(Yottawatt);
        units.add(Decabecquerel);
        units.add(Nanoampere);
        units.add(MetrePerMillisecondTime);
        units.add(Microlux);
        units.add(CubicMetre);
        units.add(Decanewton);
        units.add(Microbar);
        units.add(Femtoampere);
        units.add(LitrePerHour);
        units.add(PartsPerMillionPerYear);
        units.add(WeberPerSquareMetre);
        units.add(Picometre);
        units.add(Litre);
        units.add(Knot);
        units.add(SquareMetreNanometre);
        units.add(WattPerSteradian);
        units.add(Zeptojoule);
        units.add(Centilitre);
        units.add(MetreKilogram);
        units.add(Femtobecquerel);
        units.add(MetrePerExasecondTime);
        units.add(Gigacandela);
        units.add(Yottalumen);
        units.add(GramPerMegajoule);
        units.add(Teracandela);
        units.add(MetrePerSecondTimePerMetre);
        units.add(MetrePerDecisecondTime);
        units.add(HorsepowerWater);
        units.add(KilomolePerMetre);
        units.add(DegreeCelsiusDay);
        units.add(MinuteSidereal);
        units.add(Abcoulomb);
        units.add(ZettasecondTimeSquared);
        units.add(Yoctolumen);
        units.add(ReciprocalGram);
        units.add(Microfarad);
        units.add(KilowattHour);
        units.add(Petatesla);
        units.add(N1000ColonyFormingUnit);
        units.add(CaratMass);
        units.add(MicrogramPerLitre);
        units.add(YottasecondTime);
        units.add(MolePerZeptometre);
        units.add(Zettahenry);
        units.add(HorsepowerBoiler);
        units.add(SolarRadius);
        units.add(MilligramPerLitre);
        units.add(AttometrePerSecondTime);
        units.add(Barn);
        units.add(KilogramPerHectareDay);
        units.add(MolePerKilolitre);
        units.add(Millihenry);
        units.add(Terabit);
        units.add(Nanotesla);
        units.add(JoulePerSquareMetreSecondTime);
        units.add(KilogramPerCubicmetre);
        units.add(YearTropical);
        units.add(Yottapascal);
        units.add(Attofarad);
        units.add(Decivolt);
        units.add(LiquidPintUS);
        units.add(Picocandela);
        units.add(Megacandela);
        units.add(N25Millilitre);
        units.add(Kilosievert);
        units.add(Nanomolair);
        units.add(Megalumen);
        units.add(Femtokelvin);
        units.add(Microcandela);
        units.add(CentimetrePerDay);
        units.add(NanomolePerLitre);
        units.add(MinuteTime);
        units.add(Abhenry);
        units.add(Teralitre);
        units.add(GramPerDecilitre);
        units.add(Nanolumen);
        units.add(Zeptotesla);
        units.add(SquareZeptometre);
        units.add(Attolitre);
        units.add(MolePerDecametre);
        units.add(JoulePerCubicmetre);
        units.add(DecidegreeCelsius);
        units.add(PintImperial);
        units.add(Tonne);
        units.add(MolePerMegalitre);
        units.add(Yobibit);
        units.add(Zeptosteradian);
        units.add(HorsepowerElectric);
        units.add(MegaeuroPerPetajoule);
        units.add(Millicandela);
        units.add(ReciprocalWatt);
        units.add(CentisecondTime);
        units.add(Zettabyte);
        units.add(GigametrePerSecondTime);
        units.add(Nanolitre);
        units.add(Millinewton);
        units.add(MetreToThePower2ReciprocalGram);
        units.add(WattPerSquareMetre);
        units.add(KilogramPerKilogram);
        units.add(Decalitre);
        units.add(Decaampere);
        units.add(NewtonPerSquareMetre);
        units.add(DeltaA450PerSecondTime);
        units.add(Degree);
        units.add(MetrePerDay);
        units.add(CoulombMetre);
        units.add(MillimetrePerSecondTime);
        units.add(GramPerSquareMetreCentimetre);
        units.add(DecimetrePerSecondTime);
        units.add(Euro);
        units.add(Megagray);
        units.add(Lambert);
        units.add(Baud);
        units.add(CubicDecimetre);
        units.add(Femtovolt);
        units.add(Megagram);
        units.add(JoulePerSecondTime);
        units.add(Centihertz);
        units.add(Gibibit);
        units.add(MetrePerKilosecondTimeSquared);
        units.add(Femtolumen);
        units.add(Picoampere);
        units.add(SquarePetametre);
        units.add(FluidOunceImperial);
        units.add(MegagramPerLitre);
        units.add(Microsievert);
        units.add(Yoctolux);
        units.add(GramPerKilolitre);
        units.add(CubicPetametre);
        units.add(Mebibyte);
        units.add(Kilobecquerel);
        units.add(DegreeRankine);
        units.add(MillimetrePerSecondTimeSquared);
        units.add(MolePerTerametre);
        units.add(Attopascal);
        units.add(Zettakatal);
        units.add(DecimolePerLitre);
        units.add(WattPerSquareMetreKelvin);
        units.add(Gigahenry);
        units.add(MilligramPerHectogram);
        units.add(GramPerMicrolitre);
        units.add(Becquerel);
        units.add(MolePerYottalitre);
        units.add(Nanokelvin);
        units.add(PicaPostscript);
        units.add(GrayPerSecondTime);
        units.add(Zeptofarad);
        units.add(HectomolePerLitre);
        units.add(Teraohm);
        units.add(Megavolt);
        units.add(MicromolePerLitre);
        units.add(Megahertz);
        units.add(NanometrePerSecondTimeSquared);
        units.add(DecamolePerLitre);
        units.add(Femtomolair);
        units.add(MetrePerPicosecondTimeSquared);
        units.add(Gigakelvin);
        units.add(CubicZeptometre);
        units.add(SolarMassPerCubicParsec);
        units.add(MegamolePerMetre);
        units.add(BritishThermalUnit59F);
        units.add(Day);
        units.add(Centiohm);
        units.add(Attocoulomb);
        units.add(Mebibit);
        units.add(SiemensPerMetre);
        units.add(Hectoohm);
        units.add(Kilocandela);
        units.add(Kilokelvin);
        units.add(Yottacoulomb);
        units.add(Zettacoulomb);
        units.add(MicrometrePerSecondTimeSquared);
        units.add(Microampere);
        units.add(AtmosphereTechnical);
        units.add(Gigaampere);
        units.add(Kilonewton);
        units.add(Millihertz);
        units.add(Microsiemens);
        units.add(Millisiemens);
        units.add(Pebibit);
        units.add(Molair);
        units.add(Femtolitre);
        units.add(ColonyFormingUnitPer25Millilitre);
        units.add(MetrePerMicrosecondTime);
        units.add(ExasecondTimeSquared);
        units.add(HundredweightBritish);
        units.add(HourSidereal);
        units.add(YottametrePerSecondTimeSquared);
        units.add(Terahertz);
        units.add(KilogramSecondTimeToThePower2);
        units.add(DecigramPerLitre);
        units.add(Yoctocandela);
        units.add(Cord);
        units.add(Micronewton);
        units.add(PicogramPerLitre);
        units.add(Petafarad);
        units.add(Kilokatal);
        units.add(Teralumen);
        units.add(GramPerKilogram);
        units.add(MolePermegametre);
        units.add(Megaparsec);
        units.add(MolePerYoctolitre);
        units.add(MetrePerZettasecondTimeSquared);
        units.add(Megahenry);
        units.add(DecagramPerLitre);
        units.add(Millilumen);
        units.add(Zettaohm);
        units.add(ReciprocalKelvin);
        units.add(KilogramPerSecondTime);
        units.add(Centiradian);
        units.add(Yottalitre);
        units.add(Picovolt);
        units.add(Yoctolitre);
        units.add(WattPerSteradianSquareMetreHertz);
        units.add(DegreeSquared);
        units.add(GramPerSquareMetreDay);
        units.add(MilligramRAE);
        units.add(PointTeX);
        units.add(Perm23C);
        units.add(Nanonewton);
        units.add(FaradPerMetre);
        units.add(Millisievert);
        units.add(Lumen);
        units.add(SquareHectometre);
        units.add(Milliampere);
        units.add(Lux);
        units.add(WattPerSecondAngleSquared);
        units.add(Bar);
        units.add(Hectoweber);
        units.add(Kiloampere);
        units.add(ZettasecondTime);
        units.add(NewtonPerCoulomb);
        units.add(MetrePerYoctosecondTime);
        units.add(Millikelvin);
        units.add(MicrogramPerCubicCentimetre);
        units.add(Microkelvin);
        units.add(BritishThermalUnit39F);
        units.add(HundredweightUS);
        units.add(MinuteHourAngle);
        units.add(TonForce);
        units.add(Femtokatal);
        units.add(Microohm);
        units.add(BritishThermalUnit60F);
        units.add(CubicNanometre);
        units.add(DegreeCelsius);
        units.add(Electronvolt);
        units.add(WattPerSquareMetreSteradian);
        units.add(Yoctobecquerel);
        units.add(Attosteradian);
        units.add(Picogram);
        units.add(GramPerYottalitre);
        units.add(MicromolePerSecondTime);
        units.add(Centicoulomb);
        units.add(Decicoulomb);
        units.add(GigayearCubicParsec);
        units.add(Hertz);
        units.add(AttomolePerLitre);
        units.add(Picogray);
        units.add(Exahertz);
        units.add(ColonyFormingUnitPerMillilitre);
        units.add(ReciprocalDay);
        units.add(NanomolePerMetre);
        units.add(Deciampere);
        units.add(MetreToThePower2);
        units.add(KilogramPerMole);
        units.add(MilligramPerCubicmetre);
        units.add(Yoctojoule);
        units.add(PetametrePerSecondTimeSquared);
        units.add(Zeptoampere);
        units.add(TonAssay);
        units.add(MillimetrePerDay);
        units.add(Yoctocoulomb);
        units.add(Millipascal);
        units.add(TerasecondTimeSquared);
        units.add(Megacoulomb);
        units.add(PetametrePerSecondTime);
        units.add(Centifarad);
        units.add(Petalitre);
        units.add(Week);
        units.add(ReciprocalMetre);
        units.add(LumenPerWatt);
        units.add(MolePerFemtolitre);
        units.add(Zeptoohm);
        units.add(Yottabyte);
        units.add(MicrodegreeCelsius);
        units.add(Fermi);
        units.add(SquareAttometre);
        units.add(Grain);
        units.add(PoundApothecaries);
        units.add(MillisecondAngle);
        units.add(MillimetrePerHour);
        units.add(Microtesla);
        units.add(Gigabecquerel);
        units.add(MolePerHectolitre);
        units.add(GillImperial);
        units.add(Femtomole);
        units.add(Piconewton);
        units.add(MinuteAngle);
        units.add(MolePerZeptolitre);
        units.add(Femtoohm);
        units.add(Femtoweber);
        units.add(KilogramPerHectare);
        units.add(Petabit);
        units.add(ReciprocalSecondTime);
        units.add(Decacoulomb);
        units.add(AttogramPerLitre);
        units.add(Picoradian);
        units.add(KilogramSecondTimeToThePower2ReciprocalMetre);
        units.add(BritishThermalUnitThermochemical);
        units.add(DecisecondTimeSquared);
        units.add(PicomolePerLitre);
        units.add(Nanofarad);
        units.add(Femtowatt);
        units.add(KilojoulePerSquareMetreDay);
        units.add(Picomole);
        units.add(MetrePerDecasecondTime);
        units.add(Zettalumen);
        units.add(MicrometrePerSecondTime);
        units.add(MolePerMetre);
        units.add(AttosecondTime);
        units.add(Stathenry);
        units.add(Year);
        units.add(MolePerGigametre);
        units.add(ReciprocalCubicMetre);
        units.add(GramPerMegalitre);
        units.add(Kilomolair);
        units.add(LumenPerSquareMetre);
        units.add(MetrePerCentisecondTimeSquared);
        units.add(Decitesla);
        units.add(HectareDay);
        units.add(Attotesla);
        units.add(Nanowatt);
        units.add(SquareDecimetre);
        units.add(Revolution);
        units.add(Picowatt);
        units.add(Megohm);
        units.add(YoctosecondTime);
        units.add(SquareMetreSteradian);
        units.add(CubicPicometre);
        units.add(KilometrePerSecondTimeSquared);
        units.add(MetrePerSecondTime);
        units.add(AmylaseUnit);
        units.add(NewtonMetre);
        units.add(CubicMetrePerYear);
        units.add(Kiloweber);
        units.add(Zeptoweber);
        units.add(Petalumen);
        units.add(ReciprocalDegreeCelsius);
        units.add(CubicHectometre);
        units.add(MetreOfMercury);
        units.add(Femtogram);
        units.add(ReciprocalAtmosphereStandard);
        units.add(Attometre);
        units.add(Petacandela);
        units.add(PointPostscript);
        units.add(TonOfRefridgeration);
        units.add(ReciprocalSquareMetre);
        units.add(CubicGigametre);
        units.add(FemtometrePerSecondTimeSquared);
        units.add(Decatesla);
        units.add(DegreeCelsiusPerMinuteTime);
        units.add(Kibibit);
        units.add(Femtogray);
        units.add(Decijoule);
        units.add(Femtonewton);
        units.add(SquareMetre);
        units.add(MetrePerExasecondTimeSquared);
        units.add(Megaeuro);
        units.add(Centimetre);
        units.add(Deciohm);
        units.add(MegametrePerKilojoule);
        units.add(Picofarad);
        units.add(KilomolePerLitre);
        units.add(ColonyFormingUnit);
        units.add(Röntgen);
        units.add(Yottahertz);
        units.add(Nanosiemens);
        units.add(SecondSidereal);
        units.add(Picolitre);
        units.add(YoctomolePerMetre);
        units.add(Nanomole);
        units.add(DegreeFahrenheit);
        units.add(KilosecondTime);
        units.add(GramPerMetre);
        units.add(Micrometre);
        units.add(Centisteradian);
        units.add(Nanobecquerel);
        units.add(Picocoulomb);
        units.add(Exapascal);
        units.add(Zeptomolair);
        units.add(CubicMetrePerCubicmetre);
        units.add(Zettakelvin);
        units.add(Nanosievert);
        units.add(Decimetre);
        units.add(Hectokatal);
        units.add(Zettalitre);
        units.add(SquareYottametre);
        units.add(TerawattHour);
        units.add(MetrePerFemtosecondTimeSquared);
        units.add(Centijoule);
        units.add(Giganewton);
        units.add(MillisecondAnglePerYear);
        units.add(JouleSecondTime);
        units.add(YearSidereal);
        units.add(MolePerZettametre);
        units.add(JoulePerKelvin);
        units.add(PetamolePerMetre);
        units.add(Attojoule);
        units.add(Decimolair);
        units.add(Yoctomolair);
        units.add(GramPerJoule);
        units.add(YottamolePerMetre);
        units.add(Terahenry);
        units.add(Yottalux);
        units.add(Petasievert);
        units.add(Curie);
        units.add(MetrePerDecisecondTimeSquared);
        units.add(Henry);
        units.add(QuartImperial);
        units.add(MicrogramPerJoule);
        units.add(Statohm);
        units.add(Exabecquerel);
        units.add(Millilitre);
        units.add(Exahenry);
        units.add(Calorie15C);
        units.add(ZeptosecondTimeSquared);
        units.add(Bit);
        units.add(Nanogray);
        units.add(ZeptomolePerMetre);
        units.add(PicaTeX);
        units.add(LuxSecondTime);
        units.add(Nanogram);
        units.add(Nanosteradian);
        units.add(MolePerNanometre);
        units.add(Exacoulomb);
        units.add(Kilosiemens);
        units.add(Gigacoulomb);
        units.add(Megaerg);
        units.add(MileStatutePerHour);
        units.add(Megaweber);
        units.add(Teracoulomb);
        units.add(MetrePerCubicmetre);
        units.add(NewtonPerMetre);
        units.add(Nanometre);
        units.add(MetrePerZeptosecondTime);
        units.add(Petasiemens);
        units.add(Dyne);
        units.add(SecondAngle);
        units.add(MegamolePerLitre);
        units.add(ZettametrePerSecondTime);
        units.add(MetrePerFemtosecondTime);
        units.add(MolePerPetametre);
        units.add(Microjoule);
        units.add(Centigray);
        units.add(MetrePerAttosecondTimeSquared);
        units.add(Gigawatt);
        units.add(Decifarad);
        units.add(Peck);
        units.add(Siemens);
        units.add(UnitPole);
        units.add(MicromolePerMetre);
        units.add(Attowatt);
        units.add(Centitesla);
        units.add(Picojoule);
        units.add(MileStatute);
        units.add(Zeptovolt);
        units.add(MetrePerTerasecondTime);
        units.add(Centimole);
        units.add(TonShort);
        units.add(Terapascal);
        units.add(Decibecquerel);
        units.add(CubicYottametre);
        units.add(Yottavolt);
        units.add(Yoctoohm);
        units.add(Statweber);
        units.add(Newton);
        units.add(Hectosiemens);
        units.add(Exalumen);
        units.add(Nanovolt);
        units.add(Byte);
        units.add(CubicMetrePerKilogram);
        units.add(DecimolePerMetre);
        units.add(GigamolePerLitre);
        units.add(Debye);
        units.add(SquareMetrePerSecondTime);
        units.add(Chain);
        units.add(Quad);
        units.add(WattPerSquareMetreHertz);
        units.add(Abvolt);
        units.add(Darcy);
        units.add(DecamolePerMetre);
        units.add(Gilbert);
        units.add(HectosecondTimeSquared);
        units.add(Micromagnitude);
        units.add(Yoctopascal);
        units.add(NauticalMilePerHour);
        units.add(MetrePerPicosecondTime);
        units.add(Decikelvin);
        units.add(Terabyte);
        units.add(Nanolux);
        units.add(MicrosecondTimeSquared);
        units.add(Yoctoampere);
        units.add(MolePerTeralitre);
        units.add(PointATA);
        units.add(Microsteradian);
        units.add(FootPoundal);
        units.add(AttodegreeCelsius);
        units.add(Statmho);
        units.add(MetrePerGigasecondTimeSquared);
        units.add(Yottacandela);
        units.add(TonLong);
        units.add(Attomole);
        units.add(YottametrePerSecondTime);
        units.add(MolePerYottametre);
        units.add(Picolux);
        units.add(BritishThermalUnitMean);
        units.add(Centibecquerel);
        units.add(Milliohm);
        units.add(NauticalMile);
        units.add(JoulePerKelvinKilogram);
        units.add(MetrePerTerasecondTimeSquared);
        units.add(Decametre);
        units.add(Centiwatt);
        units.add(SquareZettametre);
        units.add(Decajoule);
        units.add(Gigalumen);
        units.add(Nanojoule);
        units.add(Yoctotesla);
        units.add(AtmosphereStandard);
        units.add(KilogramPerCubicDecimetre);
        units.add(Yoctofarad);
        units.add(Yottasiemens);
        units.add(ColonyFormingUnitPerGram);
        units.add(Deciwatt);
        units.add(Attosiemens);
        units.add(ZettametrePerSecondTimeSquared);
        units.add(Hectocandela);
        units.add(YottagramPerLitre);
        units.add(Gigalitre);
        units.add(Megakatal);
        units.add(Centipascal);
        units.add(MolePerAttometre);
        units.add(SecondTime);
        units.add(Ohm);
        units.add(AttosecondTimeSquared);
        units.add(Millicoulomb);
        units.add(GramPerHectogram);
        units.add(SquareNanometre);
        units.add(CubicMillimetrePerCubicMillimetre);
        units.add(Attobecquerel);
        units.add(Gigaelectronvolt);
        units.add(AmperePerMetre);
        units.add(CubicAttometre);
        units.add(MilLength);
        units.add(Kilohm);
        units.add(MilAngle);
        units.add(FemtodegreeCelsius);
        units.add(Stilb);
        units.add(Centivolt);
        units.add(SteradianSquareMetreHertz);
        units.add(PicosecondTimeSquared);
        units.add(SquareKilometre);
        units.add(Petanewton);
        units.add(KelvinPerWatt);
        units.add(CoulombPerSquareMetre);
        units.add(MetreKelvin);
        units.add(Microbecquerel);
        units.add(CubicParsec);
        units.add(Centistokes);
        units.add(Attovolt);
        units.add(MegajoulePerSquareMetre);
        units.add(Centipoise);
        units.add(Zeptokelvin);
        units.add(N1000ColonyFormingUnitPerMillilitre);
        units.add(Attogray);
        units.add(Hectonewton);
        units.add(MolePerPicolitre);
        units.add(CubicFemtometre);
        units.add(Yoctometre);
        units.add(Yottasievert);
        units.add(Gigalux);
        units.add(Femtohenry);
        units.add(Teralux);
        units.add(Attogram);
        units.add(SquareDecametre);
        units.add(Hectotesla);
        units.add(Hectosievert);
        units.add(TonnePerCubicmetre);
        units.add(GramPerZettalitre);
        units.add(CentimetrePerSecondTime);
        units.add(Footlambert);
        units.add(KilogramPerLitre);
        units.add(Teaspoon);
        units.add(Megaelectronvolt);
        units.add(DryQuartUS);
        units.add(MoleMicrometre);
        units.add(Zeptokatal);
        units.add(Acre);
        units.add(Barrel);
        units.add(Kilohenry);
        units.add(Petaohm);
        units.add(SecondTimeAmpere);
        units.add(Attosievert);
        units.add(Centigram);
        units.add(MetrePerSecondTimeSquared);
        units.add(NanodegreeCelsius);
        units.add(NanokatalPerMilligram);
        units.add(Yottahenry);
        units.add(RadianPerSecondTime);
        units.add(Yottagray);
        units.add(Sievert);
        units.add(Zettahertz);
        units.add(KilosecondTimeSquared);
        units.add(Yottagram);
        units.add(Zeptolux);
        units.add(WattPerSquareMetreNanometre);
        units.add(WattPerSteradianSquareMetre);
        units.add(LightYear);
        units.add(Zettacandela);
        units.add(GramPerCubicmetre);
        units.add(Volt);
        units.add(SquareMetreHertz);
        units.add(Kilometre);
        units.add(DryPintUS);
        units.add(Attokatal);
        units.add(FemtomolePerLitre);
        units.add(Month);
        units.add(Statcoulomb);
        units.add(Mho);
        units.add(Weber);
        units.add(Exbibit);
        units.add(Attoohm);
        units.add(Pascal);
        units.add(MilligramPerKilometre);
        units.add(SquareFemtometre);
        units.add(Centiare);
        units.add(Tablespoon);
        units.add(KatalPerCubicmetre);
        units.add(Teragram);
        units.add(ZeptomolePerLitre);
        units.add(Parsec);
        units.add(ReciprocalHour);
        units.add(CubicDecametre);
        units.add(HorsepowerMetric);
        units.add(Millimetre);
        units.add(Katal);
        units.add(Zettaampere);
        units.add(Zeptocoulomb);
        units.add(Gigatesla);
        units.add(Teragray);
        units.add(Footcandle);
        units.add(Picohertz);
        units.add(SquareGigametre);
        units.add(MicrosecondTime);
        units.add(PascalSecondTimeSquareMetre);
        units.add(Femtosiemens);
        units.add(Kayser);
        units.add(Gigaohm);
        units.add(Steradian);
        units.add(Torr);
        units.add(Yoctogray);
        units.add(GramPerMillilitre);
        units.add(Attonewton);
        units.add(CentimetreOfMercury);
        units.add(GallonImperial);
        units.add(Gibibyte);
        units.add(One);
        units.add(HectometrePerSecondTime);
        units.add(AmperePerWatt);
        units.add(Yoctowatt);
        units.add(CubicMetrePerSecondTime);
        units.add(Microradian);
        units.add(Petapascal);
        units.add(Gauss);
        units.add(Teravolt);
        units.add(MolePerMicrolitre);
        units.add(Attoweber);
        units.add(FemtogramPerLitre);
        units.add(CalorieInternationalTable);
        units.add(MetreKilogramPerSecondTimeSquared);
        units.add(Gram);
        units.add(SquareMetreKelvinPerWatt);
        units.add(Attomolair);
        units.add(Hectokelvin);
        units.add(Terakatal);
        units.add(Zeptohertz);
        units.add(Decavolt);
        units.add(GramPerDecalitre);
        units.add(VoltPerWatt);
        units.add(YoctometrePerSecondTimeSquared);
        units.add(Nanocandela);
        units.add(Gigavolt);
        units.add(Zeptowatt);
        units.add(Yoctomole);
        units.add(Zeptopascal);
        units.add(Exaampere);
        units.add(MolePerLitre);
        units.add(WattPerHertz);
        units.add(Hectohertz);
        units.add(AmperePerSquareMetre);
        units.add(SquareMetreSecondTime);
        units.add(Terabecquerel);
        units.add(SolarMassPerGigayearCubicKiloparsec);
        units.add(MolePerExametre);
        units.add(KilojoulePerHectogram);
        units.add(CubicMetreKelvin);
        units.add(MillisecondTimeSquared);
        units.add(MilligramPerKilogram);
        units.add(Decicandela);
        units.add(MolePerMillimetre);
        units.add(Decagram);
        units.add(YoctomolePerLitre);
        units.add(CandelaPerSquareCentimetre);
        units.add(Yoctovolt);
        units.add(Gigagray);
        units.add(GallonUS);
        units.add(Exalitre);
        units.add(Kilogray);
        units.add(CoulombPerKilogram);
        units.add(ReciprocalPartsPerMillionPerYear);
        units.add(Gigagram);
        units.add(TerasecondTime);
        units.add(Mole);
        units.add(HorsepowerBritish);
        units.add(Exafarad);
        units.add(Petahertz);
        units.add(Abfarad);
        units.add(Gray);
        units.add(CentimolePerLitre);
        units.add(ZettamolePerMetre);
        units.add(Kilogram);
        units.add(Kilohertz);
        units.add(KilometrePerSecondTime);
        units.add(Decacandela);
        units.add(GramPerLitre);
        units.add(Millifarad);
        units.add(SecondHourAngle);
        units.add(GramPerSquareMetre);
        units.add(Kilotesla);
        units.add(Gal);
        units.add(Kip);
        units.add(Centicandela);
        units.add(Hectohenry);
        units.add(Microlitre);
        units.add(YoctosecondTimeSquared);
        units.add(Centinewton);
        units.add(Zeptomole);
        units.add(Megabecquerel);
        units.add(Microwatt);
        units.add(Decagray);
        units.add(Kiloelectronvolt);
        units.add(MegasecondTime);
        units.add(GramPerFemtolitre);
        units.add(Millijoule);
        units.add(Watt);
        units.add(CalorieMean);
        units.add(MetrePerNanosecondTime);
        units.add(Decamole);
        units.add(PetamolePerLitre);
        units.add(Yobibyte);
        units.add(Decibar);
        units.add(Microgray);
        units.add(Zeptogram);
        units.add(Zettanewton);
        units.add(MolePerNanolitre);
        units.add(Yoctogram);
        units.add(Magnitude);
        units.add(Decilux);
        units.add(GramPerTeralitre);
        units.add(SteradianSquareMetre);
        units.add(YottamolePerLitre);
        units.add(Gigabit);
        units.add(Millibar);
        units.add(MillinewtonMetre);
        units.add(Millilux);
        units.add(DaySidereal);
        units.add(MolePerKilogram);
        units.add(KilometrePerHour);
        units.add(YottasecondTimeSquared);
        units.add(Gigamole);
        units.add(Decipascal);
        units.add(Yoctosteradian);
        units.add(Femtosteradian);
        units.add(CubicZettametre);
        units.add(Megatesla);
        units.add(Examolair);
        units.add(Percent);
        units.add(MolePerZettalitre);
        units.add(Picohenry);
        units.add(KilogramPerPascalSecondTimeSquareMetre);
        units.add(Slug);
        units.add(Decaweber);
        units.add(Micromole);
        units.add(GramPerAttolitre);
        units.add(Zettajoule);
        units.add(PicometrePerSecondTime);
        units.add(Zettafarad);
        units.add(Zettametre);
        units.add(CubicExametre);
        units.add(Zeptogray);
        units.add(Decilitre);
        units.add(MolePerCentimetre);
        units.add(GillUS);
        units.add(Nanoradian);
        units.add(ReciprocalCubicParsec);
        units.add(KilogramSquareMetre);
        units.add(PetagramPerLitre);
        units.add(DeltaA450);
        units.add(MolePerPetalitre);
        units.add(Coulomb);
        units.add(CubicTerametre);
        units.add(Micron);
        units.add(AmperePerVolt);
        units.add(Decapascal);
        units.add(GigasecondTime);
        units.add(Yoctoweber);
        units.add(N100Kilometre);
        units.add(RadianPerSecondTimeSquared);
        units.add(ThermUS);
        units.add(Decilumen);
        units.add(Yottaweber);
        units.add(Exacandela);
        units.add(ReciprocalSquareCentimetre);
        units.add(CubicKiloparsec);
        units.add(SquareMetreDay);
        units.add(SquareCentimetre);
        units.add(DegreeReaumur);
        units.add(Hectocoulomb);
        units.add(Radian);
        units.add(ExamolePerLitre);
        units.add(Centiweber);
        units.add(Microgram);
        units.add(Exajoule);
        units.add(MetrePerYoctosecondTimeSquared);
        units.add(Angstrom);
        units.add(Yottanewton);
        units.add(Milliweber);
        units.add(DeltaA450PerSecondTimePerMilligram);
        units.add(WattSquareMetre);
        units.add(Yottabecquerel);
        units.add(Furlong);
        units.add(GigamolePerMetre);
        units.add(Gigabyte);
        units.add(WeberPerAmpere);
        units.add(Petalux);
        units.add(CubicCentimetre);
        units.add(SquareYoctometre);
        units.add(Yottakatal);
        units.add(Femtoradian);
        units.add(MetrePerAttosecondTime);
        units.add(Yottamolair);
        units.add(SquareMillimetre);
        units.add(SquareTerametre);
        units.add(SecondTimePerDay);
        units.add(Zettatesla);
        units.add(SolarLuminosity);
        units.add(Megajoule);
        units.add(Perm0C);
        units.add(MetrePerZettasecondTime);
        units.add(FootUSSurvey);
        units.add(GramMetreToThePower2ReciprocalMetre);
        units.add(CentigramPerLitre);
        units.add(Microvolt);
        units.add(JoulePerCubicMetreKelvin);
        units.add(Yard);
        units.add(Yoctokatal);
        units.add(ExagramPerLitre);
        units.add(Yottaohm);
        units.add(GigagramPerLitre);
        units.add(JoulePerKilogram);
        units.add(Megametre);
        units.add(Megaampere);
        units.add(TonOfTNT);
        units.add(Hectare);
        units.add(Terawatt);
        units.add(Picoohm);
        units.add(CentidegreeCelsius);
        units.add(Shannon);
        units.add(Picobecquerel);
        units.add(Decakatal);
        units.add(Nanoohm);
        units.add(MagnitudePerSecondAngleSquared);
        units.add(GramPerCentilitre);
        units.add(Gamma);
        units.add(Teraweber);
        units.add(TeramolePerLitre);
        units.add(Exanewton);
        units.add(Poundal);
        units.add(Zeptobecquerel);
        units.add(MolePerAttolitre);
        units.add(NanounifiedAtomicMassUnit);
        units.add(VoltSecondTime);
        units.add(Attoampere);
        units.add(Gigaparsec);
        units.add(SquareMetrePerGram);
        units.add(Gigametre);
        units.add(Nanokatal);
        units.add(Zeptohenry);
        units.add(ExametrePerSecondTimeSquared);
        units.add(KilogramPerSquareMetre);
        units.add(MolePerDecimetre);
        units.add(Meganewton);
        units.add(Fathom);
        units.add(Exabyte);
        units.add(Micropascal);
        units.add(Decaohm);
        units.add(Gigapascal);
        units.add(Statampere);
        units.add(Centisievert);
        units.add(MetrePerGigasecondTime);
        units.add(Kilopascal);
        units.add(Calorie20C);
        units.add(Kiloparsec);
        units.add(GigametrePerSecondTimeSquared);
        units.add(Attokelvin);
        units.add(HectosecondTime);
        units.add(Hectolumen);
        units.add(OunceAvoirdupois);
        units.add(MolePerPicometre);
        units.add(Picolumen);
        units.add(Teramole);
        units.add(ZeptogramPerLitre);
        units.add(MetrePerYottasecondTimeSquared);
        units.add(LitrePerMole);
        units.add(Decihertz);
        units.add(Gigafarad);
        units.add(Microlumen);
        units.add(Yottabit);
        units.add(VoltPerAmpere);
        units.add(PointDidot);
        units.add(AttometrePerSecondTimeSquared);
        units.add(Megakelvin);
        units.add(Centimolair);
        units.add(Kilotonne);
        units.add(Petabyte);
        units.add(Decisiemens);
        units.add(Gigajoule);
        units.add(Exalux);
        units.add(Hartley);
        units.add(Picopascal);
        units.add(Bushel);
        units.add(MetrePerMillisecondTimeSquared);
        units.add(FemtosecondTimeSquared);
        units.add(Centisiemens);
        units.add(Petahenry);
        units.add(Cicero);
        units.add(SquareMegametre);
        units.add(Stere);
        units.add(Rad);
        units.add(Kilobyte);
        units.add(MetrePerCentisecondTime);
        units.add(PoundForce);
        units.add(TonRegister);
        units.add(GigayearCubicKiloparsec);
        units.add(Femtolux);
        units.add(InternationalUnit);
        return units;
 	}

    /**
     * Returns all scales in this set.
     *
     * @return All scales.
     */
    @Override
    public Set<Scale> getAllScales() {
        Set<Scale> scales = new HashSet<>();
        scales.add(RankineScale);
        scales.add(ReaumurScale);
        scales.add(FahrenheitScale);
        scales.add(CelsiusScale);
        scales.add(KelvinScale);
        return scales;
 	}


    /**
     * Returns the unit in this set that is equal to the unit one.
     * @return The unit that is one.
     */
    @Override
    public Unit getOne(){
       return One;
    }

    /**
     * Returns the unit that defines the radian unit in this set.
     * The radian unit is needed to implement trigonometric functions.
     * @return The radian unit.
     */
    @Override
    public Unit getRadianUnit(){
       return Radian;
    }
}