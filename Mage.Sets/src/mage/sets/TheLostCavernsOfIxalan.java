package mage.sets;

import mage.cards.Card;
import mage.cards.ExpansionSet;
import mage.cards.repository.CardInfo;
import mage.constants.Rarity;
import mage.constants.SetType;
import mage.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Susucr
 */
public final class TheLostCavernsOfIxalan extends ExpansionSet {

    private static final TheLostCavernsOfIxalan instance = new TheLostCavernsOfIxalan();

    public static TheLostCavernsOfIxalan getInstance() {
        return instance;
    }

    private TheLostCavernsOfIxalan() {
        super("The Lost Caverns of Ixalan", "LCI", ExpansionSet.buildDate(2023, 11, 17), SetType.EXPANSION);
        this.blockName = "The Lost Caverns of Ixalan"; // for sorting in GUI
        this.hasBasicLands = true;
        this.hasBoosters = true;
        // reference: https://magic.wizards.com/en/news/feature/collecting-the-lost-caverns-of-ixalan
        this.numBoosterCommon = 9;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = (64.0 + 64.0 + 22.0) / 22.0; // 64 rares, 22 mythics
        this.numBoosterLands = 1; // 30% basic (full-art core), 70% common Cave
        this.ratioBoosterSpecialLand = 10;
        this.ratioBoosterSpecialLandNumerator = 7;
        this.numBoosterDoubleFaced = 1; // explicit slot for 5 common + 12 uncommon DFCs
        this.maxCardNumberInBooster = 291;

        cards.add(new SetCardInfo("Abrade", 131, Rarity.COMMON, mage.cards.a.Abrade.class));
        cards.add(new SetCardInfo("Abuelo's Awakening", 1, Rarity.RARE, mage.cards.a.AbuelosAwakening.class));
        cards.add(new SetCardInfo("Abuelo, Ancestral Echo", 219, Rarity.RARE, mage.cards.a.AbueloAncestralEcho.class));
        cards.add(new SetCardInfo("Abyssal Gorestalker", 87, Rarity.UNCOMMON, mage.cards.a.AbyssalGorestalker.class));
        cards.add(new SetCardInfo("Aclazotz, Deepest Betrayal", 88, Rarity.MYTHIC, mage.cards.a.AclazotzDeepestBetrayal.class));
        cards.add(new SetCardInfo("Acolyte of Aclazotz", 89, Rarity.COMMON, mage.cards.a.AcolyteOfAclazotz.class));
        cards.add(new SetCardInfo("Acrobatic Leap", 2, Rarity.COMMON, mage.cards.a.AcrobaticLeap.class));
        cards.add(new SetCardInfo("Adaptive Gemguard", 3, Rarity.COMMON, mage.cards.a.AdaptiveGemguard.class));
        cards.add(new SetCardInfo("Akal Pakal, First Among Equals", 44, Rarity.RARE, mage.cards.a.AkalPakalFirstAmongEquals.class));
        cards.add(new SetCardInfo("Akawalli, the Seething Tower", 220, Rarity.UNCOMMON, mage.cards.a.AkawalliTheSeethingTower.class));
        cards.add(new SetCardInfo("Amalia Benavides Aguirre", 221, Rarity.RARE, mage.cards.a.AmaliaBenavidesAguirre.class));
        cards.add(new SetCardInfo("Ancestors' Aid", 132, Rarity.COMMON, mage.cards.a.AncestorsAid.class));
        cards.add(new SetCardInfo("Ancestral Reminiscence", 45, Rarity.COMMON, mage.cards.a.AncestralReminiscence.class));
        cards.add(new SetCardInfo("Anim Pakal, Thousandth Moon", 223, Rarity.RARE, mage.cards.a.AnimPakalThousandthMoon.class));
        cards.add(new SetCardInfo("Another Chance", 90, Rarity.COMMON, mage.cards.a.AnotherChance.class));
        cards.add(new SetCardInfo("Armored Kincaller", 174, Rarity.COMMON, mage.cards.a.ArmoredKincaller.class));
        cards.add(new SetCardInfo("Attentive Sunscribe", 4, Rarity.COMMON, mage.cards.a.AttentiveSunscribe.class));
        cards.add(new SetCardInfo("Barracks of the Thousand", 39, Rarity.RARE, mage.cards.b.BarracksOfTheThousand.class));
        cards.add(new SetCardInfo("Bartolome del Presidio", 224, Rarity.UNCOMMON, mage.cards.b.BartolomeDelPresidio.class));
        cards.add(new SetCardInfo("Basking Capybara", 175, Rarity.COMMON, mage.cards.b.BaskingCapybara.class));
        cards.add(new SetCardInfo("Bat Colony", 5, Rarity.UNCOMMON, mage.cards.b.BatColony.class));
        cards.add(new SetCardInfo("Bedrock Tortoise", 176, Rarity.RARE, mage.cards.b.BedrockTortoise.class));
        cards.add(new SetCardInfo("Belligerent Yearling", 133, Rarity.UNCOMMON, mage.cards.b.BelligerentYearling.class));
        cards.add(new SetCardInfo("Bitter Triumph", 91, Rarity.UNCOMMON, mage.cards.b.BitterTriumph.class));
        cards.add(new SetCardInfo("Bladewheel Chariot", 36, Rarity.UNCOMMON, mage.cards.b.BladewheelChariot.class));
        cards.add(new SetCardInfo("Bloodletter of Aclazotz", 92, Rarity.MYTHIC, mage.cards.b.BloodletterOfAclazotz.class));
        cards.add(new SetCardInfo("Bloodthorn Flail", 93, Rarity.UNCOMMON, mage.cards.b.BloodthornFlail.class));
        cards.add(new SetCardInfo("Bonehoard Dracosaur", 134, Rarity.MYTHIC, mage.cards.b.BonehoardDracosaur.class));
        cards.add(new SetCardInfo("Brackish Blunder", 46, Rarity.COMMON, mage.cards.b.BrackishBlunder.class));
        cards.add(new SetCardInfo("Braided Net", 47, Rarity.RARE, mage.cards.b.BraidedNet.class));
        cards.add(new SetCardInfo("Braided Quipu", 47, Rarity.RARE, mage.cards.b.BraidedQuipu.class));
        cards.add(new SetCardInfo("Brass's Tunnel-Grinder", 135, Rarity.RARE, mage.cards.b.BrasssTunnelGrinder.class));
        cards.add(new SetCardInfo("Brazen Blademaster", 136, Rarity.COMMON, mage.cards.b.BrazenBlademaster.class));
        cards.add(new SetCardInfo("Breeches, Eager Pillager", 137, Rarity.RARE, mage.cards.b.BreechesEagerPillager.class));
        cards.add(new SetCardInfo("Bringer of the Last Gift", 94, Rarity.RARE, mage.cards.b.BringerOfTheLastGift.class));
        cards.add(new SetCardInfo("Broodrage Mycoid", 95, Rarity.COMMON, mage.cards.b.BroodrageMycoid.class));
        cards.add(new SetCardInfo("Buried Treasure", 246, Rarity.COMMON, mage.cards.b.BuriedTreasure.class));
        cards.add(new SetCardInfo("Burning Sun Cavalry", 138, Rarity.COMMON, mage.cards.b.BurningSunCavalry.class));
        cards.add(new SetCardInfo("Calamitous Cave-In", 139, Rarity.UNCOMMON, mage.cards.c.CalamitousCaveIn.class));
        cards.add(new SetCardInfo("Canonized in Blood", 96, Rarity.UNCOMMON, mage.cards.c.CanonizedInBlood.class));
        cards.add(new SetCardInfo("Caparocti Sunborn", 226, Rarity.UNCOMMON, mage.cards.c.CaparoctiSunborn.class));
        cards.add(new SetCardInfo("Captain Storm, Cosmium Raider", 227, Rarity.UNCOMMON, mage.cards.c.CaptainStormCosmiumRaider.class));
        cards.add(new SetCardInfo("Captivating Cave", 268, Rarity.COMMON, mage.cards.c.CaptivatingCave.class));
        cards.add(new SetCardInfo("Careening Mine Cart", 247, Rarity.UNCOMMON, mage.cards.c.CareeningMineCart.class));
        cards.add(new SetCardInfo("Cartographer's Companion", 248, Rarity.COMMON, mage.cards.c.CartographersCompanion.class));
        cards.add(new SetCardInfo("Cavern Stomper", 177, Rarity.COMMON, mage.cards.c.CavernStomper.class));
        cards.add(new SetCardInfo("Cavern of Souls", 269, Rarity.MYTHIC, mage.cards.c.CavernOfSouls.class));
        cards.add(new SetCardInfo("Cavernous Maw", 270, Rarity.UNCOMMON, mage.cards.c.CavernousMaw.class));
        cards.add(new SetCardInfo("Cenote Scout", 178, Rarity.UNCOMMON, mage.cards.c.CenoteScout.class));
        cards.add(new SetCardInfo("Chart a Course", 48, Rarity.UNCOMMON, mage.cards.c.ChartACourse.class));
        cards.add(new SetCardInfo("Child of the Volcano", 140, Rarity.COMMON, mage.cards.c.ChildOfTheVolcano.class));
        cards.add(new SetCardInfo("Chimil, the Inner Sun", 249, Rarity.MYTHIC, mage.cards.c.ChimilTheInnerSun.class));
        cards.add(new SetCardInfo("Chupacabra Echo", 97, Rarity.UNCOMMON, mage.cards.c.ChupacabraEcho.class));
        cards.add(new SetCardInfo("Clay-Fired Bricks", 6, Rarity.UNCOMMON, mage.cards.c.ClayFiredBricks.class));
        cards.add(new SetCardInfo("Coati Scavenger", 179, Rarity.UNCOMMON, mage.cards.c.CoatiScavenger.class));
        cards.add(new SetCardInfo("Cogwork Wrestler", 49, Rarity.COMMON, mage.cards.c.CogworkWrestler.class));
        cards.add(new SetCardInfo("Colossadactyl", 180, Rarity.UNCOMMON, mage.cards.c.Colossadactyl.class));
        cards.add(new SetCardInfo("Compass Gnome", 250, Rarity.COMMON, mage.cards.c.CompassGnome.class));
        cards.add(new SetCardInfo("Confounding Riddle", 50, Rarity.UNCOMMON, mage.cards.c.ConfoundingRiddle.class));
        cards.add(new SetCardInfo("Consuming Sepulcher", 128, Rarity.COMMON, mage.cards.c.ConsumingSepulcher.class));
        cards.add(new SetCardInfo("Contested Game Ball", 251, Rarity.UNCOMMON, mage.cards.c.ContestedGameBall.class));
        cards.add(new SetCardInfo("Corpses of the Lost", 98, Rarity.RARE, mage.cards.c.CorpsesOfTheLost.class));
        cards.add(new SetCardInfo("Cosmium Blast", 7, Rarity.COMMON, mage.cards.c.CosmiumBlast.class));
        cards.add(new SetCardInfo("Cosmium Confluence", 181, Rarity.RARE, mage.cards.c.CosmiumConfluence.class));
        cards.add(new SetCardInfo("Cosmium Kiln", 6, Rarity.UNCOMMON, mage.cards.c.CosmiumKiln.class));
        cards.add(new SetCardInfo("Council of Echoes", 51, Rarity.UNCOMMON, mage.cards.c.CouncilOfEchoes.class));
        cards.add(new SetCardInfo("Curator of Sun's Creation", 141, Rarity.UNCOMMON, mage.cards.c.CuratorOfSunsCreation.class));
        cards.add(new SetCardInfo("Daring Discovery", 142, Rarity.COMMON, mage.cards.d.DaringDiscovery.class));
        cards.add(new SetCardInfo("Dauntless Dismantler", 8, Rarity.UNCOMMON, mage.cards.d.DauntlessDismantler.class));
        cards.add(new SetCardInfo("Dead Weight", 99, Rarity.COMMON, mage.cards.d.DeadWeight.class));
        cards.add(new SetCardInfo("Deathcap Marionette", 100, Rarity.COMMON, mage.cards.d.DeathcapMarionette.class));
        cards.add(new SetCardInfo("Deconstruction Hammer", 9, Rarity.COMMON, mage.cards.d.DeconstructionHammer.class));
        cards.add(new SetCardInfo("Deep Goblin Skulltaker", 101, Rarity.COMMON, mage.cards.d.DeepGoblinSkulltaker.class));
        cards.add(new SetCardInfo("Deep-Cavern Bat", 102, Rarity.UNCOMMON, mage.cards.d.DeepCavernBat.class));
        cards.add(new SetCardInfo("Deepfathom Echo", 228, Rarity.RARE, mage.cards.d.DeepfathomEcho.class));
        cards.add(new SetCardInfo("Deeproot Pilgrimage", 52, Rarity.RARE, mage.cards.d.DeeprootPilgrimage.class));
        cards.add(new SetCardInfo("Defossilize", 103, Rarity.UNCOMMON, mage.cards.d.Defossilize.class));
        cards.add(new SetCardInfo("Diamond Pick-Axe", 143, Rarity.UNCOMMON, mage.cards.d.DiamondPickAxe.class));
        cards.add(new SetCardInfo("Didact Echo", 53, Rarity.COMMON, mage.cards.d.DidactEcho.class));
        cards.add(new SetCardInfo("Digsite Conservator", 252, Rarity.UNCOMMON, mage.cards.d.DigsiteConservator.class));
        cards.add(new SetCardInfo("Dinotomaton", 144, Rarity.COMMON, mage.cards.d.Dinotomaton.class));
        cards.add(new SetCardInfo("Dire Blunderbuss", 145, Rarity.RARE, mage.cards.d.DireBlunderbuss.class));
        cards.add(new SetCardInfo("Dire Flail", 145, Rarity.RARE, mage.cards.d.DireFlail.class));
        cards.add(new SetCardInfo("Disruptor Wanderglyph", 253, Rarity.COMMON, mage.cards.d.DisruptorWanderglyph.class));
        cards.add(new SetCardInfo("Disturbed Slumber", 182, Rarity.COMMON, mage.cards.d.DisturbedSlumber.class));
        cards.add(new SetCardInfo("Dowsing Device", 146, Rarity.UNCOMMON, mage.cards.d.DowsingDevice.class));
        cards.add(new SetCardInfo("Dread Osseosaur", 129, Rarity.UNCOMMON, mage.cards.d.DreadOsseosaur.class));
        cards.add(new SetCardInfo("Dreadmaw's Ire", 147, Rarity.UNCOMMON, mage.cards.d.DreadmawsIre.class));
        cards.add(new SetCardInfo("Dusk Rose Reliquary", 10, Rarity.UNCOMMON, mage.cards.d.DuskRoseReliquary.class));
        cards.add(new SetCardInfo("Earthshaker Dreadmaw", 183, Rarity.UNCOMMON, mage.cards.e.EarthshakerDreadmaw.class));
        cards.add(new SetCardInfo("Eaten by Piranhas", 54, Rarity.UNCOMMON, mage.cards.e.EatenByPiranhas.class));
        cards.add(new SetCardInfo("Echo of Dusk", 104, Rarity.COMMON, mage.cards.e.EchoOfDusk.class));
        cards.add(new SetCardInfo("Echoing Deeps", 271, Rarity.RARE, mage.cards.e.EchoingDeeps.class));
        cards.add(new SetCardInfo("Enterprising Scallywag", 148, Rarity.UNCOMMON, mage.cards.e.EnterprisingScallywag.class));
        cards.add(new SetCardInfo("Envoy of Okinec Ahau", 11, Rarity.COMMON, mage.cards.e.EnvoyOfOkinecAhau.class));
        cards.add(new SetCardInfo("Etali's Favor", 149, Rarity.COMMON, mage.cards.e.EtalisFavor.class));
        cards.add(new SetCardInfo("Explorer's Cache", 184, Rarity.UNCOMMON, mage.cards.e.ExplorersCache.class));
        cards.add(new SetCardInfo("Family Reunion", 13, Rarity.COMMON, mage.cards.f.FamilyReunion.class));
        cards.add(new SetCardInfo("Fanatical Offering", 105, Rarity.COMMON, mage.cards.f.FanaticalOffering.class));
        cards.add(new SetCardInfo("Forest", 291, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_UST_VARIOUS));
        cards.add(new SetCardInfo("Forest", 401, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forgotten Monument", 272, Rarity.UNCOMMON, mage.cards.f.ForgottenMonument.class));
        cards.add(new SetCardInfo("Frilled Cave-Wurm", 57, Rarity.COMMON, mage.cards.f.FrilledCaveWurm.class));
        cards.add(new SetCardInfo("Fungal Fortitude", 106, Rarity.COMMON, mage.cards.f.FungalFortitude.class));
        cards.add(new SetCardInfo("Gargantuan Leech", 107, Rarity.UNCOMMON, mage.cards.g.GargantuanLeech.class));
        cards.add(new SetCardInfo("Geode Grotto", 146, Rarity.UNCOMMON, mage.cards.g.GeodeGrotto.class));
        cards.add(new SetCardInfo("Geological Appraiser", 150, Rarity.UNCOMMON, mage.cards.g.GeologicalAppraiser.class));
        cards.add(new SetCardInfo("Get Lost", 14, Rarity.RARE, mage.cards.g.GetLost.class));
        cards.add(new SetCardInfo("Ghalta, Stampede Tyrant", 185, Rarity.MYTHIC, mage.cards.g.GhaltaStampedeTyrant.class));
        cards.add(new SetCardInfo("Gishath, Sun's Avatar", 229, Rarity.MYTHIC, mage.cards.g.GishathSunsAvatar.class));
        cards.add(new SetCardInfo("Glimpse the Core", 186, Rarity.UNCOMMON, mage.cards.g.GlimpseTheCore.class));
        cards.add(new SetCardInfo("Glorifier of Suffering", 15, Rarity.COMMON, mage.cards.g.GlorifierOfSuffering.class));
        cards.add(new SetCardInfo("Glowcap Lantern", 187, Rarity.UNCOMMON, mage.cards.g.GlowcapLantern.class));
        cards.add(new SetCardInfo("Goblin Tomb Raider", 151, Rarity.COMMON, mage.cards.g.GoblinTombRaider.class));
        cards.add(new SetCardInfo("Goldfury Strider", 152, Rarity.UNCOMMON, mage.cards.g.GoldfuryStrider.class));
        cards.add(new SetCardInfo("Grasping Shadows", 108, Rarity.UNCOMMON, mage.cards.g.GraspingShadows.class));
        cards.add(new SetCardInfo("Greedy Freebooter", 109, Rarity.COMMON, mage.cards.g.GreedyFreebooter.class));
        cards.add(new SetCardInfo("Growing Rites of Itlimoc", 188, Rarity.RARE, mage.cards.g.GrowingRitesOfItlimoc.class));
        cards.add(new SetCardInfo("Guardian of the Great Door", 16, Rarity.UNCOMMON, mage.cards.g.GuardianOfTheGreatDoor.class));
        cards.add(new SetCardInfo("Guidestone Compass", 62, Rarity.UNCOMMON, mage.cards.g.GuidestoneCompass.class));
        cards.add(new SetCardInfo("Helping Hand", 17, Rarity.UNCOMMON, mage.cards.h.HelpingHand.class));
        cards.add(new SetCardInfo("Hermitic Nautilus", 58, Rarity.UNCOMMON, mage.cards.h.HermiticNautilus.class));
        cards.add(new SetCardInfo("Hidden Cataract", 273, Rarity.COMMON, mage.cards.h.HiddenCataract.class));
        cards.add(new SetCardInfo("Hidden Courtyard", 274, Rarity.COMMON, mage.cards.h.HiddenCourtyard.class));
        cards.add(new SetCardInfo("Hidden Necropolis", 275, Rarity.COMMON, mage.cards.h.HiddenNecropolis.class));
        cards.add(new SetCardInfo("Hidden Nursery", 276, Rarity.COMMON, mage.cards.h.HiddenNursery.class));
        cards.add(new SetCardInfo("Hidden Volcano", 277, Rarity.COMMON, mage.cards.h.HiddenVolcano.class));
        cards.add(new SetCardInfo("Hit the Mother Lode", 153, Rarity.RARE, mage.cards.h.HitTheMotherLode.class));
        cards.add(new SetCardInfo("Hotfoot Gnome", 154, Rarity.COMMON, mage.cards.h.HotfootGnome.class));
        cards.add(new SetCardInfo("Hoverstone Pilgrim", 254, Rarity.UNCOMMON, mage.cards.h.HoverstonePilgrim.class));
        cards.add(new SetCardInfo("Huatli's Final Strike", 190, Rarity.COMMON, mage.cards.h.HuatlisFinalStrike.class));
        cards.add(new SetCardInfo("Huatli, Poet of Unity", 189, Rarity.MYTHIC, mage.cards.h.HuatliPoetOfUnity.class));
        cards.add(new SetCardInfo("Hulking Raptor", 191, Rarity.RARE, mage.cards.h.HulkingRaptor.class));
        cards.add(new SetCardInfo("Hunter's Blowgun", 255, Rarity.COMMON, mage.cards.h.HuntersBlowgun.class));
        cards.add(new SetCardInfo("Hurl into History", 59, Rarity.UNCOMMON, mage.cards.h.HurlIntoHistory.class));
        cards.add(new SetCardInfo("Iceberg Titan", 60, Rarity.COMMON, mage.cards.i.IcebergTitan.class));
        cards.add(new SetCardInfo("Idol of the Deep King", 155, Rarity.COMMON, mage.cards.i.IdolOfTheDeepKing.class));
        cards.add(new SetCardInfo("In the Presence of Ages", 192, Rarity.COMMON, mage.cards.i.InThePresenceOfAges.class));
        cards.add(new SetCardInfo("Inti, Seneschal of the Sun", 156, Rarity.RARE, mage.cards.i.IntiSeneschalOfTheSun.class));
        cards.add(new SetCardInfo("Inverted Iceberg", 60, Rarity.COMMON, mage.cards.i.InvertedIceberg.class));
        cards.add(new SetCardInfo("Ironpaw Aspirant", 18, Rarity.COMMON, mage.cards.i.IronpawAspirant.class));
        cards.add(new SetCardInfo("Island", 288, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_UST_VARIOUS));
        cards.add(new SetCardInfo("Island", 395, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Itlimoc, Cradle of the Sun", 188, Rarity.RARE, mage.cards.i.ItlimocCradleOfTheSun.class));
        cards.add(new SetCardInfo("Itzquinth, Firstborn of Gishath", 230, Rarity.UNCOMMON, mage.cards.i.ItzquinthFirstbornOfGishath.class));
        cards.add(new SetCardInfo("Ixalli's Lorekeeper", 194, Rarity.UNCOMMON, mage.cards.i.IxallisLorekeeper.class));
        cards.add(new SetCardInfo("Jade Seedstones", 195, Rarity.UNCOMMON, mage.cards.j.JadeSeedstones.class));
        cards.add(new SetCardInfo("Jadeheart Attendant", 195, Rarity.UNCOMMON, mage.cards.j.JadeheartAttendant.class));
        cards.add(new SetCardInfo("Jadelight Spelunker", 196, Rarity.RARE, mage.cards.j.JadelightSpelunker.class));
        cards.add(new SetCardInfo("Join the Dead", 110, Rarity.COMMON, mage.cards.j.JoinTheDead.class));
        cards.add(new SetCardInfo("Kaslem's Stonetree", 197, Rarity.COMMON, mage.cards.k.KaslemsStonetree.class));
        cards.add(new SetCardInfo("Kaslem's Strider", 197, Rarity.COMMON, mage.cards.k.KaslemsStrider.class));
        cards.add(new SetCardInfo("Kellan, Daring Traveler", 231, Rarity.RARE, mage.cards.k.KellanDaringTraveler.class));
        cards.add(new SetCardInfo("Kinjalli's Dawnrunner", 19, Rarity.UNCOMMON, mage.cards.k.KinjallisDawnrunner.class));
        cards.add(new SetCardInfo("Kitesail Larcenist", 61, Rarity.RARE, mage.cards.k.KitesailLarcenist.class));
        cards.add(new SetCardInfo("Kutzil's Flanker", 20, Rarity.RARE, mage.cards.k.KutzilsFlanker.class));
        cards.add(new SetCardInfo("Kutzil, Malamet Exemplar", 232, Rarity.UNCOMMON, mage.cards.k.KutzilMalametExemplar.class));
        cards.add(new SetCardInfo("Locus of Enlightenment", 55, Rarity.MYTHIC, mage.cards.l.LocusOfEnlightenment.class));
        cards.add(new SetCardInfo("Lodestone Needle", 62, Rarity.UNCOMMON, mage.cards.l.LodestoneNeedle.class));
        cards.add(new SetCardInfo("Magmatic Galleon", 157, Rarity.RARE, mage.cards.m.MagmaticGalleon.class));
        cards.add(new SetCardInfo("Malamet Battle Glyph", 198, Rarity.UNCOMMON, mage.cards.m.MalametBattleGlyph.class));
        cards.add(new SetCardInfo("Malamet Brawler", 199, Rarity.COMMON, mage.cards.m.MalametBrawler.class));
        cards.add(new SetCardInfo("Malamet Scythe", 200, Rarity.COMMON, mage.cards.m.MalametScythe.class));
        cards.add(new SetCardInfo("Malamet Veteran", 201, Rarity.COMMON, mage.cards.m.MalametVeteran.class));
        cards.add(new SetCardInfo("Malamet War Scribe", 21, Rarity.UNCOMMON, mage.cards.m.MalametWarScribe.class));
        cards.add(new SetCardInfo("Malcolm, Alluring Scoundrel", 63, Rarity.RARE, mage.cards.m.MalcolmAlluringScoundrel.class));
        cards.add(new SetCardInfo("Malicious Eclipse", 111, Rarity.UNCOMMON, mage.cards.m.MaliciousEclipse.class));
        cards.add(new SetCardInfo("Marauding Brinefang", 64, Rarity.COMMON, mage.cards.m.MaraudingBrinefang.class));
        cards.add(new SetCardInfo("Market Gnome", 22, Rarity.UNCOMMON, mage.cards.m.MarketGnome.class));
        cards.add(new SetCardInfo("Master's Guide-Mural", 233, Rarity.UNCOMMON, mage.cards.m.MastersGuideMural.class));
        cards.add(new SetCardInfo("Master's Manufactory", 233, Rarity.UNCOMMON, mage.cards.m.MastersManufactory.class));
        cards.add(new SetCardInfo("Mastercraft Raptor", 164, Rarity.UNCOMMON, mage.cards.m.MastercraftRaptor.class));
        cards.add(new SetCardInfo("Matzalantli, the Great Door", 256, Rarity.RARE, mage.cards.m.MatzalantliTheGreatDoor.class));
        cards.add(new SetCardInfo("Mephitic Draught", 112, Rarity.COMMON, mage.cards.m.MephiticDraught.class));
        cards.add(new SetCardInfo("Merfolk Cave-Diver", 65, Rarity.UNCOMMON, mage.cards.m.MerfolkCaveDiver.class));
        cards.add(new SetCardInfo("Might of the Ancestors", 23, Rarity.UNCOMMON, mage.cards.m.MightOfTheAncestors.class));
        cards.add(new SetCardInfo("Miner's Guidewing", 24, Rarity.COMMON, mage.cards.m.MinersGuidewing.class));
        cards.add(new SetCardInfo("Mineshaft Spider", 202, Rarity.COMMON, mage.cards.m.MineshaftSpider.class));
        cards.add(new SetCardInfo("Mischievous Pup", 25, Rarity.UNCOMMON, mage.cards.m.MischievousPup.class));
        cards.add(new SetCardInfo("Molten Collapse", 234, Rarity.RARE, mage.cards.m.MoltenCollapse.class));
        cards.add(new SetCardInfo("Mountain", 290, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_UST_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 399, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mycoid Maze", 217, Rarity.UNCOMMON, mage.cards.m.MycoidMaze.class));
        cards.add(new SetCardInfo("Nicanzil, Current Conductor", 236, Rarity.UNCOMMON, mage.cards.n.NicanzilCurrentConductor.class));
        cards.add(new SetCardInfo("Nurturing Bristleback", 203, Rarity.COMMON, mage.cards.n.NurturingBristleback.class));
        cards.add(new SetCardInfo("Oaken Siren", 66, Rarity.COMMON, mage.cards.o.OakenSiren.class));
        cards.add(new SetCardInfo("Ojer Axonil, Deepest Might", 158, Rarity.MYTHIC, mage.cards.o.OjerAxonilDeepestMight.class));
        cards.add(new SetCardInfo("Ojer Kaslem, Deepest Growth", 204, Rarity.MYTHIC, mage.cards.o.OjerKaslemDeepestGrowth.class));
        cards.add(new SetCardInfo("Ojer Pakpatiq, Deepest Epoch", 67, Rarity.MYTHIC, mage.cards.o.OjerPakpatiqDeepestEpoch.class));
        cards.add(new SetCardInfo("Ojer Taq, Deepest Foundation", 26, Rarity.MYTHIC, mage.cards.o.OjerTaqDeepestFoundation.class));
        cards.add(new SetCardInfo("Oltec Archaeologists", 27, Rarity.COMMON, mage.cards.o.OltecArchaeologists.class));
        cards.add(new SetCardInfo("Oltec Cloud Guard", 28, Rarity.COMMON, mage.cards.o.OltecCloudGuard.class));
        cards.add(new SetCardInfo("Orazca Puzzle-Door", 68, Rarity.COMMON, mage.cards.o.OrazcaPuzzleDoor.class));
        cards.add(new SetCardInfo("Oteclan Landmark", 29, Rarity.COMMON, mage.cards.o.OteclanLandmark.class));
        cards.add(new SetCardInfo("Oteclan Levitator", 29, Rarity.COMMON, mage.cards.o.OteclanLevitator.class));
        cards.add(new SetCardInfo("Out of Air", 69, Rarity.COMMON, mage.cards.o.OutOfAir.class));
        cards.add(new SetCardInfo("Over the Edge", 205, Rarity.COMMON, mage.cards.o.OverTheEdge.class));
        cards.add(new SetCardInfo("Palani's Hatcher", 237, Rarity.RARE, mage.cards.p.PalanisHatcher.class));
        cards.add(new SetCardInfo("Panicked Altisaur", 159, Rarity.COMMON, mage.cards.p.PanickedAltisaur.class));
        cards.add(new SetCardInfo("Pathfinding Axejaw", 206, Rarity.COMMON, mage.cards.p.PathfindingAxejaw.class));
        cards.add(new SetCardInfo("Petrify", 30, Rarity.COMMON, mage.cards.p.Petrify.class));
        cards.add(new SetCardInfo("Pirate Hat", 70, Rarity.COMMON, mage.cards.p.PirateHat.class));
        cards.add(new SetCardInfo("Pit of Offerings", 278, Rarity.UNCOMMON, mage.cards.p.PitOfOfferings.class));
        cards.add(new SetCardInfo("Plains", 287, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_UST_VARIOUS));
        cards.add(new SetCardInfo("Plains", 393, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plundering Pirate", 160, Rarity.COMMON, mage.cards.p.PlunderingPirate.class));
        cards.add(new SetCardInfo("Poetic Ingenuity", 161, Rarity.RARE, mage.cards.p.PoeticIngenuity.class));
        cards.add(new SetCardInfo("Poison Dart Frog", 207, Rarity.COMMON, mage.cards.p.PoisonDartFrog.class));
        cards.add(new SetCardInfo("Preacher of the Schism", 113, Rarity.RARE, mage.cards.p.PreacherOfTheSchism.class));
        cards.add(new SetCardInfo("Primordial Gnawer", 114, Rarity.COMMON, mage.cards.p.PrimordialGnawer.class));
        cards.add(new SetCardInfo("Promising Vein", 279, Rarity.COMMON, mage.cards.p.PromisingVein.class));
        cards.add(new SetCardInfo("Pugnacious Hammerskull", 208, Rarity.RARE, mage.cards.p.PugnaciousHammerskull.class));
        cards.add(new SetCardInfo("Queen's Bay Paladin", 115, Rarity.RARE, mage.cards.q.QueensBayPaladin.class));
        cards.add(new SetCardInfo("Quicksand Whirlpool", 31, Rarity.COMMON, mage.cards.q.QuicksandWhirlpool.class));
        cards.add(new SetCardInfo("Quintorius Kand", 238, Rarity.MYTHIC, mage.cards.q.QuintoriusKand.class));
        cards.add(new SetCardInfo("Rampaging Ceratops", 162, Rarity.UNCOMMON, mage.cards.r.RampagingCeratops.class));
        cards.add(new SetCardInfo("Rampaging Spiketail", 116, Rarity.COMMON, mage.cards.r.RampagingSpiketail.class));
        cards.add(new SetCardInfo("Ray of Ruin", 117, Rarity.COMMON, mage.cards.r.RayOfRuin.class));
        cards.add(new SetCardInfo("Relic's Roar", 71, Rarity.COMMON, mage.cards.r.RelicsRoar.class));
        cards.add(new SetCardInfo("Resplendent Angel", 32, Rarity.MYTHIC, mage.cards.r.ResplendentAngel.class));
        cards.add(new SetCardInfo("Restless Anchorage", 280, Rarity.RARE, mage.cards.r.RestlessAnchorage.class));
        cards.add(new SetCardInfo("Restless Prairie", 281, Rarity.RARE, mage.cards.r.RestlessPrairie.class));
        cards.add(new SetCardInfo("Restless Reef", 282, Rarity.RARE, mage.cards.r.RestlessReef.class));
        cards.add(new SetCardInfo("Restless Ridgeline", 283, Rarity.RARE, mage.cards.r.RestlessRidgeline.class));
        cards.add(new SetCardInfo("Restless Vents", 284, Rarity.RARE, mage.cards.r.RestlessVents.class));
        cards.add(new SetCardInfo("River Herald Guide", 209, Rarity.COMMON, mage.cards.r.RiverHeraldGuide.class));
        cards.add(new SetCardInfo("River Herald Scout", 72, Rarity.COMMON, mage.cards.r.RiverHeraldScout.class));
        cards.add(new SetCardInfo("Roaming Throne", 258, Rarity.RARE, mage.cards.r.RoamingThrone.class));
        cards.add(new SetCardInfo("Roar of the Fifth People", 189, Rarity.MYTHIC, mage.cards.r.RoarOfTheFifthPeople.class));
        cards.add(new SetCardInfo("Ruin-Lurker Bat", 33, Rarity.UNCOMMON, mage.cards.r.RuinLurkerBat.class));
        cards.add(new SetCardInfo("Rumbling Rockslide", 163, Rarity.COMMON, mage.cards.r.RumblingRockslide.class));
        cards.add(new SetCardInfo("Runaway Boulder", 259, Rarity.COMMON, mage.cards.r.RunawayBoulder.class));
        cards.add(new SetCardInfo("Sage of Days", 73, Rarity.COMMON, mage.cards.s.SageOfDays.class));
        cards.add(new SetCardInfo("Saheeli's Lattice", 164, Rarity.UNCOMMON, mage.cards.s.SaheelisLattice.class));
        cards.add(new SetCardInfo("Saheeli, the Sun's Brilliance", 239, Rarity.MYTHIC, mage.cards.s.SaheeliTheSunsBrilliance.class));
        cards.add(new SetCardInfo("Sanguine Evangelist", 34, Rarity.RARE, mage.cards.s.SanguineEvangelist.class));
        cards.add(new SetCardInfo("Scampering Surveyor", 260, Rarity.UNCOMMON, mage.cards.s.ScamperingSurveyor.class));
        cards.add(new SetCardInfo("Screaming Phantom", 118, Rarity.COMMON, mage.cards.s.ScreamingPhantom.class));
        cards.add(new SetCardInfo("Scytheclaw Raptor", 165, Rarity.UNCOMMON, mage.cards.s.ScytheclawRaptor.class));
        cards.add(new SetCardInfo("Seeker of Sunlight", 210, Rarity.COMMON, mage.cards.s.SeekerOfSunlight.class));
        cards.add(new SetCardInfo("Seismic Monstrosaur", 166, Rarity.COMMON, mage.cards.s.SeismicMonstrosaur.class));
        cards.add(new SetCardInfo("Self-Reflection", 74, Rarity.UNCOMMON, mage.cards.s.SelfReflection.class));
        cards.add(new SetCardInfo("Sentinel of the Nameless City", 211, Rarity.RARE, mage.cards.s.SentinelOfTheNamelessCity.class));
        cards.add(new SetCardInfo("Shadows' Lair", 108, Rarity.UNCOMMON, mage.cards.s.ShadowsLair.class));
        cards.add(new SetCardInfo("Shipwreck Sentry", 75, Rarity.COMMON, mage.cards.s.ShipwreckSentry.class));
        cards.add(new SetCardInfo("Sinuous Benthisaur", 76, Rarity.UNCOMMON, mage.cards.s.SinuousBenthisaur.class));
        cards.add(new SetCardInfo("Skullcap Snail", 119, Rarity.COMMON, mage.cards.s.SkullcapSnail.class));
        cards.add(new SetCardInfo("Soaring Sandwing", 35, Rarity.COMMON, mage.cards.s.SoaringSandwing.class));
        cards.add(new SetCardInfo("Song of Stupefaction", 77, Rarity.COMMON, mage.cards.s.SongOfStupefaction.class));
        cards.add(new SetCardInfo("Sorcerous Spyglass", 261, Rarity.UNCOMMON, mage.cards.s.SorcerousSpyglass.class));
        cards.add(new SetCardInfo("Soulcoil Viper", 120, Rarity.UNCOMMON, mage.cards.s.SoulcoilViper.class));
        cards.add(new SetCardInfo("Souls of the Lost", 121, Rarity.RARE, mage.cards.s.SoulsOfTheLost.class));
        cards.add(new SetCardInfo("Sovereign Okinec Ahau", 240, Rarity.MYTHIC, mage.cards.s.SovereignOkinecAhau.class));
        cards.add(new SetCardInfo("Sovereign's Macuahuitl", 155, Rarity.COMMON, mage.cards.s.SovereignsMacuahuitl.class));
        cards.add(new SetCardInfo("Spelunking", 213, Rarity.UNCOMMON, mage.cards.s.Spelunking.class));
        cards.add(new SetCardInfo("Spring-Loaded Sawblades", 36, Rarity.UNCOMMON, mage.cards.s.SpringLoadedSawblades.class));
        cards.add(new SetCardInfo("Spyglass Siren", 78, Rarity.UNCOMMON, mage.cards.s.SpyglassSiren.class));
        cards.add(new SetCardInfo("Squirming Emergence", 241, Rarity.RARE, mage.cards.s.SquirmingEmergence.class));
        cards.add(new SetCardInfo("Staggering Size", 214, Rarity.COMMON, mage.cards.s.StaggeringSize.class));
        cards.add(new SetCardInfo("Stalactite Stalker", 122, Rarity.RARE, mage.cards.s.StalactiteStalker.class));
        cards.add(new SetCardInfo("Starving Revenant", 123, Rarity.RARE, mage.cards.s.StarvingRevenant.class));
        cards.add(new SetCardInfo("Staunch Crewmate", 79, Rarity.UNCOMMON, mage.cards.s.StaunchCrewmate.class));
        cards.add(new SetCardInfo("Stinging Cave Crawler", 124, Rarity.UNCOMMON, mage.cards.s.StingingCaveCrawler.class));
        cards.add(new SetCardInfo("Subterranean Schooner", 80, Rarity.RARE, mage.cards.s.SubterraneanSchooner.class));
        cards.add(new SetCardInfo("Sunbird Effigy", 262, Rarity.UNCOMMON, mage.cards.s.SunbirdEffigy.class));
        cards.add(new SetCardInfo("Sunbird Standard", 262, Rarity.UNCOMMON, mage.cards.s.SunbirdStandard.class));
        cards.add(new SetCardInfo("Sunfire Torch", 167, Rarity.COMMON, mage.cards.s.SunfireTorch.class));
        cards.add(new SetCardInfo("Sunken Citadel", 285, Rarity.RARE, mage.cards.s.SunkenCitadel.class));
        cards.add(new SetCardInfo("Sunshot Militia", 168, Rarity.COMMON, mage.cards.s.SunshotMilitia.class));
        cards.add(new SetCardInfo("Swamp", 289, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_UST_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 397, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swashbuckler's Whip", 263, Rarity.UNCOMMON, mage.cards.s.SwashbucklersWhip.class));
        cards.add(new SetCardInfo("Synapse Necromage", 125, Rarity.UNCOMMON, mage.cards.s.SynapseNecromage.class));
        cards.add(new SetCardInfo("Tarrian's Soulcleaver", 264, Rarity.RARE, mage.cards.t.TarriansSoulcleaver.class));
        cards.add(new SetCardInfo("Tectonic Hazard", 169, Rarity.COMMON, mage.cards.t.TectonicHazard.class));
        cards.add(new SetCardInfo("Tecutlan, the Searing Rift", 135, Rarity.RARE, mage.cards.t.TecutlanTheSearingRift.class));
        cards.add(new SetCardInfo("Temple of Civilization", 26, Rarity.MYTHIC, mage.cards.t.TempleOfCivilization.class));
        cards.add(new SetCardInfo("Temple of Cultivation", 204, Rarity.MYTHIC, mage.cards.t.TempleOfCultivation.class));
        cards.add(new SetCardInfo("Temple of Cyclical Time", 67, Rarity.MYTHIC, mage.cards.t.TempleOfCyclicalTime.class));
        cards.add(new SetCardInfo("Temple of Power", 158, Rarity.MYTHIC, mage.cards.t.TempleOfPower.class));
        cards.add(new SetCardInfo("Temple of the Dead", 88, Rarity.MYTHIC, mage.cards.t.TempleOfTheDead.class));
        cards.add(new SetCardInfo("Tendril of the Mycotyrant", 215, Rarity.UNCOMMON, mage.cards.t.TendrilOfTheMycotyrant.class));
        cards.add(new SetCardInfo("Terror Tide", 127, Rarity.RARE, mage.cards.t.TerrorTide.class));
        cards.add(new SetCardInfo("The Ancient One", 222, Rarity.MYTHIC, mage.cards.t.TheAncientOne.class));
        cards.add(new SetCardInfo("The Belligerent", 225, Rarity.RARE, mage.cards.t.TheBelligerent.class));
        cards.add(new SetCardInfo("The Core", 256, Rarity.RARE, mage.cards.t.TheCore.class));
        cards.add(new SetCardInfo("The Enigma Jewel", 55, Rarity.MYTHIC, mage.cards.t.TheEnigmaJewel.class));
        cards.add(new SetCardInfo("The Grim Captain", 266, Rarity.RARE, mage.cards.t.TheGrimCaptain.class));
        cards.add(new SetCardInfo("The Millennium Calendar", 257, Rarity.MYTHIC, mage.cards.t.TheMillenniumCalendar.class));
        cards.add(new SetCardInfo("The Mycotyrant", 235, Rarity.MYTHIC, mage.cards.t.TheMycotyrant.class));
        cards.add(new SetCardInfo("The Skullspore Nexus", 212, Rarity.MYTHIC, mage.cards.t.TheSkullsporeNexus.class));
        cards.add(new SetCardInfo("Thousand Moons Crackshot", 37, Rarity.COMMON, mage.cards.t.ThousandMoonsCrackshot.class));
        cards.add(new SetCardInfo("Thousand Moons Infantry", 38, Rarity.COMMON, mage.cards.t.ThousandMoonsInfantry.class));
        cards.add(new SetCardInfo("Thousand Moons Smithy", 39, Rarity.RARE, mage.cards.t.ThousandMoonsSmithy.class));
        cards.add(new SetCardInfo("Thrashing Brontodon", 216, Rarity.UNCOMMON, mage.cards.t.ThrashingBrontodon.class));
        cards.add(new SetCardInfo("Threefold Thunderhulk", 265, Rarity.RARE, mage.cards.t.ThreefoldThunderhulk.class));
        cards.add(new SetCardInfo("Throne of the Grim Captain", 266, Rarity.RARE, mage.cards.t.ThroneOfTheGrimCaptain.class));
        cards.add(new SetCardInfo("Tinker's Tote", 40, Rarity.COMMON, mage.cards.t.TinkersTote.class));
        cards.add(new SetCardInfo("Tishana's Tidebinder", 81, Rarity.RARE, mage.cards.t.TishanasTidebinder.class));
        cards.add(new SetCardInfo("Tithing Blade", 128, Rarity.COMMON, mage.cards.t.TithingBlade.class));
        cards.add(new SetCardInfo("Treasure Cove", 267, Rarity.RARE, mage.cards.t.TreasureCove.class));
        cards.add(new SetCardInfo("Treasure Map", 267, Rarity.RARE, mage.cards.t.TreasureMap.class));
        cards.add(new SetCardInfo("Triumphant Chomp", 170, Rarity.UNCOMMON, mage.cards.t.TriumphantChomp.class));
        cards.add(new SetCardInfo("Trumpeting Carnosaur", 171, Rarity.RARE, mage.cards.t.TrumpetingCarnosaur.class));
        cards.add(new SetCardInfo("Twists and Turns", 217, Rarity.UNCOMMON, mage.cards.t.TwistsAndTurns.class));
        cards.add(new SetCardInfo("Uchbenbak, the Great Mistake", 242, Rarity.UNCOMMON, mage.cards.u.UchbenbakTheGreatMistake.class));
        cards.add(new SetCardInfo("Unlucky Drop", 82, Rarity.COMMON, mage.cards.u.UnluckyDrop.class));
        cards.add(new SetCardInfo("Vanguard of the Rose", 42, Rarity.UNCOMMON, mage.cards.v.VanguardOfTheRose.class));
        cards.add(new SetCardInfo("Visage of Dread", 129, Rarity.UNCOMMON, mage.cards.v.VisageOfDread.class));
        cards.add(new SetCardInfo("Vito's Inquisitor", 130, Rarity.COMMON, mage.cards.v.VitosInquisitor.class));
        cards.add(new SetCardInfo("Vito, Fanatic of Aclazotz", 243, Rarity.MYTHIC, mage.cards.v.VitoFanaticOfAclazotz.class));
        cards.add(new SetCardInfo("Volatile Fault", 286, Rarity.UNCOMMON, mage.cards.v.VolatileFault.class));
        cards.add(new SetCardInfo("Volatile Wanderglyph", 172, Rarity.COMMON, mage.cards.v.VolatileWanderglyph.class));
        cards.add(new SetCardInfo("Wail of the Forgotten", 244, Rarity.RARE, mage.cards.w.WailOfTheForgotten.class));
        cards.add(new SetCardInfo("Walk with the Ancestors", 218, Rarity.COMMON, mage.cards.w.WalkWithTheAncestors.class));
        cards.add(new SetCardInfo("Warden of the Inner Sky", 43, Rarity.RARE, mage.cards.w.WardenOfTheInnerSky.class));
        cards.add(new SetCardInfo("Waterlogged Hulk", 83, Rarity.UNCOMMON, mage.cards.w.WaterloggedHulk.class));
        cards.add(new SetCardInfo("Watertight Gondola", 83, Rarity.UNCOMMON, mage.cards.w.WatertightGondola.class));
        cards.add(new SetCardInfo("Waterwind Scout", 84, Rarity.COMMON, mage.cards.w.WaterwindScout.class));
        cards.add(new SetCardInfo("Waylaying Pirates", 85, Rarity.COMMON, mage.cards.w.WaylayingPirates.class));
        cards.add(new SetCardInfo("Zoetic Glyph", 86, Rarity.UNCOMMON, mage.cards.z.ZoeticGlyph.class));
        cards.add(new SetCardInfo("Zoyowa Lava-Tongue", 245, Rarity.UNCOMMON, mage.cards.z.ZoyowaLavaTongue.class));
        cards.add(new SetCardInfo("Zoyowa's Justice", 173, Rarity.UNCOMMON, mage.cards.z.ZoyowasJustice.class));
    }

    @Override
    protected List<CardInfo> findSpecialCardsByRarity(Rarity rarity) {
        if (rarity == Rarity.RARE || rarity == Rarity.MYTHIC) {
            return new ArrayList<>(); // Rare/Mythic DFCs are not special cards here
        } else {
            return super.findSpecialCardsByRarity(rarity);
            // this accounts for 7 caves in the land slot, as well as the common/uncommon DFCs
        }
    }

    @Override
    protected void addDoubleFace(List<Card> booster) {
        int rarityKey = RandomUtil.nextInt((5 * 3) + 12); // 5 C, 12 U - assume commons three times the frequency as uncommons
        Rarity rarity = (rarityKey > 12) ? Rarity.COMMON : Rarity.UNCOMMON;
        addToBooster(booster, getSpecialCardsByRarity(rarity));
    }

}
