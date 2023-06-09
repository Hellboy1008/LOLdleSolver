package enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import constants.ChampionConstants;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum Champion {

	AATROX("Aatrox", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.DARKIN),
			Resource.MANALESS,
			newSingleton(RangeType.MELEE),
			newSet(Region.RUNETERRA, Region.SHURIMA),
			2013),
	AHRI("Ahri", Gender.FEMALE,
			newSingleton(Position.MIDDLE),
			newSingleton(Species.VASTAYAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.IONIA),
			2011),
	AKALI("Akali", Gender.FEMALE,
			newSet(Position.MIDDLE, Position.TOP),
			newSingleton(Species.HUMAN),
			Resource.ENERGY,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IONIA),
			2010),
	AKSHAN("Akshan", Gender.MALE,
			newSet(Position.MIDDLE, Position.TOP),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.SHURIMA),
			2021),
	ALISTAR("Alistar", Gender.MALE,
			newSingleton(Position.SUPPORT),
			newSingleton(Species.MINOTAUR),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.RUNETERRA),
			2009),
	AMUMU("Amumu", Gender.MALE,
			newSet(Position.JUNGLE, Position.SUPPORT),
			newSet(Species.UNDEAD, Species.YORDLE),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.SHURIMA),
			2009),
	ANIVIA("Anivia", Gender.FEMALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.GOD, Species.SPIRIT),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.FRELJORD),
			2009),
	ANNIE("Annie", Gender.FEMALE,
			newSet(Position.MIDDLE, Position.SUPPORT),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.NOXUS, Region.RUNETERRA),
			2009),
	APHELIOS("Aphelios", Gender.MALE,
			newSingleton(Position.BOTTOM),
			newSet(Species.HUMAN, Species.SPIRITUALIST),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.TARGON),
			2019),
	ASHE("Ashe", Gender.FEMALE,
			newSet(Position.BOTTOM, Position.SUPPORT),
			newSet(Species.HUMAN, Species.ICEBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.FRELJORD),
			2009),
	AURELION_SOL("Aurelion Sol", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.CELESTIAL, Species.DRAGON),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.RUNETERRA, Region.TARGON),
			2016),
	AZIR("Azir", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSingleton(Species.GOD_WARRIOR),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.SHURIMA),
			2014),
	BARD("Bard", Gender.MALE,
			newSingleton(Position.SUPPORT),
			newSingleton(Species.CELESTIAL),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.RUNETERRA),
			2015),
	BELVETH("Bel'Veth", Gender.FEMALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.VOID_BEING),
			Resource.MANALESS,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.VOID),
			2022),
	BLITZCRANK("Blitzcrank", Gender.OTHER,
			newSingleton(Position.SUPPORT),
			newSingleton(Species.GOLEM),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.ZAUN),
			2009),
	BRAND("Brand", Gender.MALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.FRELJORD, Region.RUNETERRA),
			2011),
	BRAUM("Braum", Gender.MALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.HUMAN, Species.ICEBORN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.FRELJORD),
			2014),
	CAITLYN("Caitlyn", Gender.FEMALE,
			newSingleton(Position.BOTTOM),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.PILTOVER),
			2011),
	CAMILLE("Camille", Gender.FEMALE,
			newSingleton(Position.TOP),
			newSet(Species.CYBORG, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.PILTOVER),
			2016),
	CASSIOPEIA("Cassiopeia", Gender.FEMALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.NOXUS, Region.SHURIMA),
			2010),
	CHOGATH("Cho'Gath", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.VOID_BEING),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.VOID),
			2009),
	CORKI("Corki", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSingleton(Species.YORDLE),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.BANDLE_CITY, Region.PILTOVER),
			2009),
	DARIUS("Darius", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.NOXUS),
			2012),
	DIANA("Diana", Gender.FEMALE,
			newSet(Position.JUNGLE, Position.MIDDLE),
			newSet(Species.ASPECT, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.TARGON),
			2012),
	DR_MUNDO("Dr. Mundo", Gender.MALE,
			newSingleton(Position.TOP),
			newSet(Species.CHEMICALLY_ALTERED, Species.HUMAN),
			Resource.HEALTH_COSTS,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.ZAUN),
			2009),
	DRAVEN("Draven", Gender.MALE,
			newSingleton(Position.BOTTOM),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.NOXUS),
			2012),
	EKKO("Ekko", Gender.MALE,
			newSet(Position.JUNGLE, Position.MIDDLE),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.ZAUN),
			2015),
	ELISE("Elise", Gender.FEMALE,
			newSingleton(Position.JUNGLE),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSet(RangeType.MELEE, RangeType.RANGED),
			newSet(Region.NOXUS, Region.SHADOW_ISLES),
			2012),
	EVELYNN("Evelynn", Gender.FEMALE,
			newSingleton(Position.JUNGLE),
			newSet(Species.DEMON, Species.SPIRIT),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.RUNETERRA),
			2009),
	EZREAL("Ezreal", Gender.MALE,
			newSingleton(Position.BOTTOM),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.PILTOVER),
			2010),
	FIDDLESTICKS("Fiddlesticks", Gender.OTHER,
			newSingleton(Position.JUNGLE),
			newSet(Species.DEMON, Species.SPIRIT),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.RUNETERRA),
			2009),
	FIORA("Fiora", Gender.FEMALE,
			newSingleton(Position.TOP),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.DEMACIA),
			2012),
	FIZZ("Fizz", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSingleton(Species.YORDLE),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.BILGEWATER),
			2011),
	GALIO("Galio", Gender.MALE,
			newSet(Position.MIDDLE, Position.SUPPORT),
			newSingleton(Species.GOLEM),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.DEMACIA),
			2010),
	GANGPLANK("Gangplank", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.BILGEWATER),
			2009),
	GAREN("Garen", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.HUMAN),
			Resource.MANALESS,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.DEMACIA),
			2010),
	GNAR("Gnar", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.YORDLE),
			Resource.RAGE,
			newSet(RangeType.MELEE, RangeType.RANGED),
			newSingleton(Region.FRELJORD),
			2014),
	GRAGAS("Gragas", Gender.MALE,
			newSet(Position.JUNGLE, Position.TOP),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.FRELJORD),
			2010),
	GRAVES("Graves", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.BILGEWATER),
			2011),
	GWEN("Gwen", Gender.FEMALE,
			newSingleton(Position.TOP),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.CAMAVOR, Region.SHADOW_ISLES),
			2021),
	HECARIM("Hecarim", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.UNDEAD),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.CAMAVOR, Region.SHADOW_ISLES),
			2012),
	HEIMERDINGER("Heimerdinger", Gender.MALE,
			newSet(Position.MIDDLE, Position.SUPPORT),
			newSingleton(Species.YORDLE),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.PILTOVER),
			2009),
	ILLAOI("Illaoi", Gender.FEMALE,
			newSingleton(Position.TOP),
			newSet(Species.HUMAN, Species.SPIRITUALIST),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.BILGEWATER),
			2015),
	IRELIA("Irelia", Gender.FEMALE,
			newSet(Position.MIDDLE, Position.TOP),
			newSet(Species.HUMAN, Species.SPIRITUALIST),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IONIA),
			2010),
	IVERN("Ivern", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.FRELJORD, Region.IONIA),
			2016),
	JANNA("Janna", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.GOD, Species.SPIRIT),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.SHURIMA, Region.ZAUN),
			2009),
	JARVAN_IV("Jarvan IV", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.DEMACIA),
			2011),
	JAX("Jax", Gender.MALE,
			newSet(Position.JUNGLE, Position.TOP),
			newSingleton(Species.UNKNOWN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.ICATHIA, Region.RUNETERRA, Region.SHURIMA),
			2009),
	JAYCE("Jayce", Gender.MALE,
			newSet(Position.MIDDLE, Position.TOP),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSet(RangeType.MELEE, RangeType.RANGED),
			newSingleton(Region.PILTOVER),
			2012),
	JHIN("Jhin", Gender.MALE,
			newSingleton(Position.BOTTOM),
			newSet(Species.HUMAN, Species.SPIRITUALIST),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.IONIA),
			2016),
	JINX("Jinx", Gender.FEMALE,
			newSingleton(Position.BOTTOM),
			newSet(Species.CHEMICALLY_ALTERED, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.ZAUN),
			2013),
	KSANTE("K'Sante", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.SHURIMA),
			2022),
	KAISA("Kai'Sa", Gender.FEMALE,
			newSingleton(Position.BOTTOM),
			newSet(Species.HUMAN, Species.VOID_BEING),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.SHURIMA, Region.VOID),
			2018),
	KALISTA("Kalista", Gender.FEMALE,
			newSingleton(Position.BOTTOM),
			newSingleton(Species.UNDEAD),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.CAMAVOR, Region.SHADOW_ISLES),
			2014),
	KARMA("Karma", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.HUMAN, Species.SPIRITUALIST),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.IONIA),
			2011),
	KARTHUS("Karthus", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.UNDEAD),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.NOXUS, Region.SHADOW_ISLES),
			2009),
	KASSADIN("Kassadin", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.HUMAN, Species.VOID_BEING),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.SHURIMA, Region.VOID),
			2009),
	KATARINA("Katarina", Gender.FEMALE,
			newSingleton(Position.MIDDLE),
			newSingleton(Species.HUMAN),
			Resource.MANALESS,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.NOXUS),
			2009),
	KAYLE("Kayle", Gender.FEMALE,
			newSingleton(Position.TOP),
			newSet(Species.ASPECT, Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSet(RangeType.MELEE, RangeType.RANGED),
			newSet(Region.DEMACIA, Region.TARGON),
			2009),
	KAYN("Kayn", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSet(Species.DARKIN, Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.IONIA, Region.NOXUS, Region.RUNETERRA,
					Region.SHURIMA),
			2017),
	KENNEN("Kennen", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.YORDLE),
			Resource.ENERGY,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.IONIA),
			2010),
	KHAZIX("Kha'Zix", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.VOID_BEING),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.VOID),
			2012),
	KINDRED("Kindred", Gender.OTHER,
			newSingleton(Position.JUNGLE),
			newSet(Species.GOD, Species.SPIRIT),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.RUNETERRA),
			2015),
	KLED("Kled", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.YORDLE),
			Resource.COURAGE,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.NOXUS),
			2016),
	KOGMAW("Kog'Maw", Gender.MALE,
			newSingleton(Position.BOTTOM),
			newSingleton(Species.VOID_BEING),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.VOID),
			2010),
	LEBLANC("LeBlanc", Gender.FEMALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.NOXUS),
			2010),
	LEE_SIN("Lee Sin", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSet(Species.HUMAN, Species.SPIRITUALIST),
			Resource.ENERGY,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IONIA),
			2011),
	LEONA("Leona", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.ASPECT, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.TARGON),
			2011),
	LILLIA("Lillia", Gender.FEMALE,
			newSet(Position.JUNGLE, Position.TOP),
			newSingleton(Species.SPIRIT),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IONIA),
			2020),
	LISSANDRA("LIssandra", Gender.FEMALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.HUMAN, Species.ICEBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.FRELJORD),
			2013),
	LUCIAN("Lucian", Gender.MALE,
			newSingleton(Position.BOTTOM),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.DEMACIA, Region.SHADOW_ISLES),
			2013),
	LULU("Lulu", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSingleton(Species.YORDLE),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.BANDLE_CITY),
			2012),
	LUX("Lux", Gender.FEMALE,
			newSet(Position.MIDDLE, Position.SUPPORT),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.DEMACIA),
			2010),
	MALPHITE("Malphite", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.GOLEM),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.IXTAL, Region.SHURIMA),
			2009),
	MALZAHAR("Malzahar", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.HUMAN, Species.VOID_BEING),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.SHURIMA, Region.VOID),
			2010),
	MAOKAI("Maokai", Gender.MALE,
			newSet(Position.JUNGLE, Position.SUPPORT),
			newSingleton(Species.SPIRIT),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.SHADOW_ISLES),
			2011),
	MASTER_YI("Master Yi", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSet(Species.HUMAN, Species.SPIRITUALIST),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IONIA),
			2009),
	MILIO("Milio", Gender.MALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.IXTAL),
			2023),
	MISS_FORTUNE("Miss Fortune", Gender.FEMALE,
			newSingleton(Position.BOTTOM),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.BILGEWATER),
			2010),
	MORDEKAISER("Mordekaiser", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.REVENANT),
			Resource.SHIELD,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.NOXUS),
			2010),
	MORGANA("Morgana", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.ASPECT, Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.DEMACIA, Region.TARGON),
			2009),
	NAMI("Nami", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSingleton(Species.VASTAYAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.RUNETERRA),
			2012),
	NASUS("Nasus", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.GOD_WARRIOR),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.SHURIMA),
			2009),
	NAUTILUS("Nautilus", Gender.MALE,
			newSingleton(Position.SUPPORT),
			newSingleton(Species.REVENANT),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.BILGEWATER),
			2012),
	NEEKO("Neeko", Gender.FEMALE,
			newSet(Position.MIDDLE, Position.SUPPORT),
			newSingleton(Species.VASTAYAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.IXTAL),
			2018),
	NIDALEE("Nidalee", Gender.FEMALE,
			newSingleton(Position.JUNGLE),
			newSet(Species.HUMAN, Species.SPIRITUALIST),
			Resource.MANA,
			newSet(RangeType.MELEE, RangeType.RANGED),
			newSingleton(Region.IXTAL),
			2009),
	NILAH("Nilah", Gender.FEMALE,
			newSingleton(Position.BOTTOM),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.BILGEWATER),
			2022),
	NOCTURNE("Nocturne", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSet(Species.DEMON, Species.SPIRIT),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.RUNETERRA),
			2011),
	NUNU("Nunu", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSet(Species.HUMAN, Species.YETI),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.FRELJORD),
			2009),
	OLAF("Olaf", Gender.MALE,
			newSet(Position.JUNGLE, Position.TOP),
			newSet(Species.HUMAN, Species.ICEBORN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.FRELJORD),
			2010),
	ORIANNA("Orianna", Gender.FEMALE,
			newSingleton(Position.MIDDLE),
			newSingleton(Species.GOLEM),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.PILTOVER),
			2011),
	ORNN("Ornn", Gender.MALE,
			newSingleton(Position.TOP),
			newSet(Species.GOD, Species.SPIRIT),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.FRELJORD),
			2017),
	PANTHEON("Pantheon", Gender.MALE,
			newSet(Position.JUNGLE, Position.MIDDLE, Position.SUPPORT),
			newSet(Species.ASPECT, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.TARGON),
			2010),
	POPPY("Poppy", Gender.FEMALE,
			newSet(Position.JUNGLE, Position.TOP),
			newSingleton(Species.YORDLE),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.DEMACIA),
			2010),
	PYKE("Pyke", Gender.MALE,
			newSingleton(Position.SUPPORT),
			newSingleton(Species.REVENANT),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.BILGEWATER),
			2018),
	QIYANA("Qiyana", Gender.FEMALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IXTAL),
			2019),
	QUINN("Quinn", Gender.FEMALE,
			newSingleton(Position.TOP),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.DEMACIA),
			2013),
	RAKAN("Rakan", Gender.MALE,
			newSingleton(Position.SUPPORT),
			newSingleton(Species.VASTAYAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IONIA),
			2017),
	RAMMUS("Rammus", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.GOD_WARRIOR),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.SHURIMA),
			2009),
	REKSAI("Rek'Sai", Gender.FEMALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.VOID_BEING),
			Resource.RAGE,
			newSingleton(RangeType.MELEE),
			newSet(Region.SHURIMA, Region.VOID),
			2014),
	RELL("Rell", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.NOXUS),
			2020),
	RENATA_GLASC("Renata Glasc", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.CHEMICALLY_ALTERED, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.ZAUN),
			2022),
	RENEKTON("Renekton", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.GOD_WARRIOR),
			Resource.FURY,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.SHURIMA),
			2011),
	RENGAR("Rengar", Gender.MALE,
			newSet(Position.JUNGLE, Position.TOP),
			newSingleton(Species.VASTAYAN),
			Resource.FEROCITY,
			newSingleton(RangeType.MELEE),
			newSet(Region.IXTAL, Region.SHURIMA),
			2012),
	RIVEN("Riven", Gender.FEMALE,
			newSingleton(Position.TOP),
			newSingleton(Species.HUMAN),
			Resource.MANALESS,
			newSingleton(RangeType.MELEE),
			newSet(Region.IONIA, Region.NOXUS),
			2011),
	RUMBLE("Rumble", Gender.MALE,
			newSet(Position.MIDDLE, Position.TOP),
			newSingleton(Species.YORDLE),
			Resource.HEAT,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.BANDLE_CITY),
			2011),
	RYZE("Ryze", Gender.MALE,
			newSet(Position.MIDDLE, Position.TOP),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.RUNETERRA),
			2009),
	SAMIRA("Samira", Gender.FEMALE,
			newSingleton(Position.BOTTOM),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.NOXUS, Region.SHURIMA),
			2020),
	SEJUANI("Sejuani", Gender.FEMALE,
			newSingleton(Position.JUNGLE),
			newSet(Species.HUMAN, Species.ICEBORN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.FRELJORD),
			2012),
	SENNA("Senna", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.HUMAN, Species.UNDEAD),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.SHADOW_ISLES),
			2019),
	SERAPHINE("Seraphine", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.PILTOVER, Region.ZAUN),
			2020),
	SETT("Sett", Gender.MALE,
			newSingleton(Position.TOP),
			newSet(Species.HUMAN, Species.VASTAYAN),
			Resource.GRIT,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IONIA),
			2020),
	SHACO("Shaco", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.SPIRIT),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.RUNETERRA),
			2009),
	SHEN("Shen", Gender.MALE,
			newSingleton(Position.TOP),
			newSet(Species.HUMAN, Species.SPIRITUALIST),
			Resource.ENERGY,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IONIA),
			2010),
	SHYVANA("Shyvana", Gender.FEMALE,
			newSingleton(Position.JUNGLE),
			newSet(Species.DRAGON, Species.MAGICALLY_ALTERED),
			Resource.FURY,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.DEMACIA),
			2011),
	SINGED("Singed", Gender.MALE,
			newSingleton(Position.TOP),
			newSet(Species.CHEMICALLY_ALTERED, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.PILTOVER, Region.ZAUN),
			2009),
	SION("Sion", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.REVENANT),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.NOXUS),
			2009),
	SIVIR("Sivir", Gender.FEMALE,
			newSingleton(Position.BOTTOM),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.SHURIMA),
			2009),
	SKARNER("Skarner", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.BRACKERN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.SHURIMA),
			2011),
	SONA("Sona", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.DEMACIA, Region.IONIA),
			2010),
	SORAKA("Soraka", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSingleton(Species.CELESTIAL),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.IONIA, Region.TARGON),
			2009),
	SWAIN("Swain", Gender.MALE,
			newSet(Position.MIDDLE, Position.SUPPORT),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.NOXUS),
			2010),
	SYLAS("Sylas", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.DEMACIA, Region.FRELJORD),
			2019),
	SYNDRA("Syndra", Gender.FEMALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.IONIA),
			2012),
	TAHM_KENCH("Tahm Kench", Gender.MALE,
			newSet(Position.SUPPORT, Position.TOP),
			newSet(Species.DEMON, Species.SPIRIT),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.BILGEWATER, Region.RUNETERRA),
			2015),
	TALIYAH("Taliyah", Gender.FEMALE,
			newSet(Position.JUNGLE, Position.MIDDLE),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.SHURIMA),
			2016),
	TALON("Talon", Gender.MALE,
			newSet(Position.JUNGLE, Position.MIDDLE),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.NOXUS),
			2011),
	TARIC("Taric", Gender.MALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.ASPECT, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.DEMACIA, Region.TARGON),
			2009),
	TEEMO("Teemo", Gender.MALE,
			newSingleton(Position.TOP),
			newSingleton(Species.YORDLE),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.BANDLE_CITY),
			2009),
	THRESH("Thresh", Gender.MALE,
			newSingleton(Position.SUPPORT),
			newSingleton(Species.UNDEAD),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.SHADOW_ISLES),
			2013),
	TRISTANA("Tristana", Gender.FEMALE,
			newSingleton(Position.BOTTOM),
			newSingleton(Species.YORDLE),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.BANDLE_CITY),
			2009),
	TRUNDLE("Trundle", Gender.MALE,
			newSet(Position.JUNGLE, Position.TOP),
			newSet(Species.ICEBORN, Species.TROLL),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.FRELJORD),
			2010),
	TRYNDAMERE("Tryndamere", Gender.MALE,
			newSingleton(Position.TOP),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.FURY,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.FRELJORD),
			2009),
	TWISTED_FATE("Twisted Fate", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.BILGEWATER),
			2009),
	TWITCH("Twitch", Gender.MALE,
			newSingleton(Position.BOTTOM),
			newSet(Species.CHEMICALLY_ALTERED, Species.RAT),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.ZAUN),
			2009),
	UDYR("Udyr", Gender.MALE,
			newSet(Position.JUNGLE, Position.TOP),
			newSet(Species.HUMAN, Species.SPIRITUALIST),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.FRELJORD, Region.IONIA),
			2009),
	URGOT("Urgot", Gender.MALE,
			newSingleton(Position.TOP),
			newSet(Species.CHEMICALLY_ALTERED, Species.CYBORG, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.NOXUS, Region.ZAUN),
			2010),
	VARUS("Varus", Gender.MALE,
			newSet(Position.BOTTOM, Position.MIDDLE),
			newSet(Species.DARKIN, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.IONIA, Region.RUNETERRA, Region.SHURIMA),
			2012),
	VAYNE("Vayne", Gender.FEMALE,
			newSet(Position.BOTTOM, Position.TOP),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.DEMACIA),
			2011),
	VEIGAR("Veigar", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSingleton(Species.YORDLE),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.BANDLE_CITY, Region.RUNETERRA),
			2009),
	VELKOZ("Vel'Koz", Gender.MALE,
			newSet(Position.MIDDLE, Position.SUPPORT),
			newSingleton(Species.VOID_BEING),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.VOID),
			2014),
	VEX("Vex", Gender.FEMALE,
			newSingleton(Position.MIDDLE),
			newSingleton(Species.YORDLE),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.BANDLE_CITY, Region.SHADOW_ISLES),
			2021),
	VI("Vi", Gender.FEMALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.PILTOVER, Region.ZAUN),
			2012),
	VIEGO("Viego", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.UNDEAD),
			Resource.MANALESS,
			newSingleton(RangeType.MELEE),
			newSet(Region.CAMAVOR, Region.SHADOW_ISLES),
			2021),
	VIKTOR("Viktor", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.CYBORG, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.PILTOVER, Region.ZAUN),
			2011),
	VLADIMIR("Vladimir", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.BLOODTHIRST,
			newSingleton(RangeType.RANGED),
			newSet(Region.CAMAVOR, Region.NOXUS, Region.SHADOW_ISLES),
			2010),
	VOLIBEAR("Volibear", Gender.MALE,
			newSet(Position.JUNGLE, Position.TOP),
			newSet(Species.GOD, Species.SPIRIT),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.FRELJORD),
			2011),
	WARWICK("Warwick", Gender.MALE,
			newSet(Position.JUNGLE, Position.TOP),
			newSet(Species.CHEMICALLY_ALTERED, Species.CYBORG, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.ZAUN),
			2009),
	WUKONG("Wukong", Gender.MALE,
			newSet(Position.JUNGLE, Position.TOP),
			newSingleton(Species.VASTAYAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IONIA),
			2011),
	XAYAH("Xayah", Gender.FEMALE,
			newSingleton(Position.BOTTOM),
			newSingleton(Species.VASTAYAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.IONIA),
			2017),
	XERATH("Xerath", Gender.MALE,
			newSet(Position.MIDDLE, Position.SUPPORT),
			newSingleton(Species.GOD_WARRIOR),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.SHURIMA),
			2011),
	XIN_ZHAO("Xin Zhao", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSet(Region.DEMACIA, Region.IONIA, Region.NOXUS),
			2010),
	YASUO("Yasuo", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.FLOW,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IONIA),
			2013),
	YONE("Yone", Gender.MALE,
			newSet(Position.MIDDLE, Position.TOP),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANALESS,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IONIA),
			2020),
	YORICK("Yorick", Gender.MALE,
			newSingleton(Position.TOP),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.SHADOW_ISLES),
			2011),
	YUUMI("Yuumi", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.CAT, Species.MAGICALLY_ALTERED),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.BANDLE_CITY),
			2019),
	ZAC("Zac", Gender.MALE,
			newSingleton(Position.JUNGLE),
			newSingleton(Species.GOLEM),
			Resource.HEALTH_COSTS,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.ZAUN),
			2013),
	ZED("Zed", Gender.MALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.HUMAN, Species.MAGICALLY_ALTERED),
			Resource.ENERGY,
			newSingleton(RangeType.MELEE),
			newSingleton(Region.IONIA),
			2012),
	ZERI("Zeri", Gender.FEMALE,
			newSingleton(Position.BOTTOM),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.ZAUN),
			2022),
	ZIGGS("Ziggs", Gender.MALE,
			newSet(Position.BOTTOM, Position.MIDDLE),
			newSingleton(Species.YORDLE),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.ZAUN),
			2012),
	ZILEAN("Zilean", Gender.MALE,
			newSingleton(Position.SUPPORT),
			newSet(Species.HUMAN, Species.MAGICBORN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSet(Region.ICATHIA, Region.RUNETERRA, Region.SHURIMA),
			2009),
	ZOE("Zoe", Gender.FEMALE,
			newSingleton(Position.MIDDLE),
			newSet(Species.ASPECT, Species.HUMAN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.TARGON),
			2017),
	ZYRA("Zyra", Gender.FEMALE,
			newSingleton(Position.SUPPORT),
			newSingleton(Species.UNKNOWN),
			Resource.MANA,
			newSingleton(RangeType.RANGED),
			newSingleton(Region.IXTAL),
			2012);

	private final String championName;
	private final Gender gender;
	private final Set<Position> positions;
	private final Set<Species> species;
	private final Resource resource;
	private final Set<RangeType> rangeType;
	private final Set<Region> regions;
	private final int releaseYear;

	public Object getCategory(String category) {
		Object returnObj;

		switch (category) {
			case ChampionConstants.GENDER:
				returnObj = this.getGender();
				break;
			case ChampionConstants.POSITION:
				returnObj = this.getPositions();
				break;
			case ChampionConstants.SPECIES:
				returnObj = this.getSpecies();
				break;
			case ChampionConstants.RESOURCE:
				returnObj = this.getResource();
				break;
			case ChampionConstants.RANGE_TYPE:
				returnObj = this.getRangeType();
				break;
			case ChampionConstants.REGION:
				returnObj = this.getRegions();
				break;
			default:
				returnObj = null;
		}

		return returnObj;
	}

	/**
	 * Return corresponding Champion enum given champion name if exists.
	 * 
	 * @param championName champion name
	 * @return corresponding Champion or null if not found
	 */
	public static Champion getChampionFromName(String championName) {
		List<Champion> championList = Arrays.asList(Champion.values());
		for (Champion champion : championList) {
			if (championName.equalsIgnoreCase(champion.getChampionName())) {
				return champion;
			}
		}
		return null;
	}

	/**
	 * Create a Set of champion positions.
	 * 
	 * @param positions lane positions of champion
	 * @return Set containing given positions
	 */
	private static final Set<Position> newSet(Position... positions) {
		return Stream.of(positions).collect(Collectors.toSet());
	}

	/**
	 * Create a Set of champion species.
	 * 
	 * @param species species of champion
	 * @return Set containing given species
	 */
	private static final Set<Species> newSet(Species... species) {
		return Stream.of(species).collect(Collectors.toSet());
	}

	/**
	 * Create a Set of champion range types.
	 * 
	 * @param rangeTypes range types of champion
	 * @return Set containing given range types
	 */
	private static final Set<RangeType> newSet(RangeType... rangeTypes) {
		return Stream.of(rangeTypes).collect(Collectors.toSet());
	}

	/**
	 * Create a Set of champion regions.
	 * 
	 * @param regions regions of champion
	 * @return Set containing given regions
	 */
	private static final Set<Region> newSet(Region... regions) {
		return Stream.of(regions).collect(Collectors.toSet());
	}

	/**
	 * Create a singleton Set of champion position.
	 * 
	 * @param position lane position of champion
	 * @return singleton Set containing position
	 */
	private static final Set<Position> newSingleton(Position position) {
		return Collections.singleton(position);
	}

	/**
	 * Create a singleton Set of champion species
	 * 
	 * @param species species of champion
	 * @return singleton Set containing species
	 */
	private static final Set<Species> newSingleton(Species species) {
		return Collections.singleton(species);
	}

	/**
	 * Create a singleton Set of champion range type.
	 * 
	 * @param rangeType range type of champion
	 * @return singleton Set containing range type
	 */
	private static final Set<RangeType> newSingleton(RangeType rangeType) {
		return Collections.singleton(rangeType);
	}

	/**
	 * Create a singleton Set of champion region.
	 * 
	 * @param region region of champion
	 * @return singleton Set containing region
	 */
	private static final Set<Region> newSingleton(Region region) {
		return Collections.singleton(region);
	}
}
