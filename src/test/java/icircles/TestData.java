package icircles;

import icircles.decomposition.DecompositionType;
import icircles.recomposition.RecompositionType;

public class TestData {

    // possible actions
    public static final int RUN_ALL_TESTS = 0;
    public static final int RUN_TEST_LIST = 1;
    public static final int VIEW_TEST_LIST = 2;
    public static final int VIEW_ALL_TESTS = 3;

    public static boolean GENERATE_ALL_TEST_DATA = false;
    public static boolean TEST_BEST_STRATEGIES = true;
    public static boolean TEST_EULER_THREE = false;
    
    public static boolean DO_VIEW_FAILURES = false;
    public static int TEST_DEBUG_LEVEL = 3;
    // settings for view-list or view-all
    //public static final int VIEW_PANEL_SIZE = 280; // test checksum size
    public static final int VIEW_PANEL_SIZE = 160; // small panel, good for viewing multiple
    //public static final int VIEW_PANEL_SIZE = 480; // large panel, good for single, complex diagrams
    public static final int FAIL_VIEW_PANEL_SIZE = 180;
    public static final int GRID_WIDTH = 7;
    public static int[] test_list = {
        263//,224
    };  // a set of tests of particular interest
    //public static int TASK = RUN_TEST_LIST;
    //public static int TASK = VIEW_TEST_LIST;
    public static int TASK = RUN_ALL_TESTS;
    //public static int TASK = VIEW_ALL_TESTS;
    
    public static TestDatum[] test_data = {
    	/*0*/new TestDatum( "a", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 79888.31660062482),
    	/*1*/new TestDatum( "a", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 79888.31660062482),
    	/*2*/new TestDatum( "a", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 79888.31660062482),
    	/*3*/new TestDatum( "a b", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 737504.5585076772),
    	/*4*/new TestDatum( "a b", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 737504.5585076772),
    	/*5*/new TestDatum( "a b", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 737504.5585076772),
    	/*6*/new TestDatum( "a b c", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 2716326.316596987),
    	/*7*/new TestDatum( "a b c", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 2716326.316596987),
    	/*8*/new TestDatum( "a b c", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 2716326.316596987),
    	/*9*/new TestDatum( "ab", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1216893.6462764367),
    	/*10*/new TestDatum( "ab", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1216893.6462764367),
    	/*11*/new TestDatum( "ab", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1216893.6462764367),
    	/*12*/new TestDatum( "a ab", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 854318.1119576368),
    	/*13*/new TestDatum( "a ab", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 854318.1119576368),
    	/*14*/new TestDatum( "a ab", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 854318.1119576368),
    	/*15*/new TestDatum( "a b ab", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1699249.6986082606),
    	/*16*/new TestDatum( "a b ab", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1433990.0486694109),
    	/*17*/new TestDatum( "a b ab", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1433990.0486694109),
    	/*18*/new TestDatum( "a b ac", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 3243619.9769056533),
    	/*19*/new TestDatum( "a b ac", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 3243619.9769056533),
    	/*20*/new TestDatum( "a b ac", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 3243619.9769056533),
    	/*21*/new TestDatum( "a b c ab", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 5821646.284596458),
    	/*22*/new TestDatum( "a b c ab", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 4817702.278757704),
    	/*23*/new TestDatum( "a b c ab", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 4817702.278757704),
    	/*24*/new TestDatum( "ab ac", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 3770058.9527985347),
    	/*25*/new TestDatum( "ab ac", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 3770058.9527985347),
    	/*26*/new TestDatum( "ab ac", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 3770058.9527985347),
    	/*27*/new TestDatum( "a ab ac", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 3771540.736737995),
    	/*28*/new TestDatum( "a ab ac", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 3771540.736737995),
    	/*29*/new TestDatum( "a ab ac", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 3771540.736737995),
    	/*30*/new TestDatum( "a b ab ac", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 6899346.276996872),
    	/*31*/new TestDatum( "a b ab ac", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 5807823.536540072),
    	/*32*/new TestDatum( "a b ab ac", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 5807823.536540072),
    	/*33*/new TestDatum( "a b c ab ac", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 6597213.78631978),
    	/*34*/new TestDatum( "a b c ab ac", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 5104369.567900396),
    	/*35*/new TestDatum( "a b c ab ac", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 5104369.567900396),
    	/*36*/new TestDatum( "a bc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 4847432.501001963),
    	/*37*/new TestDatum( "a bc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 4847432.501001963),
    	/*38*/new TestDatum( "a bc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 4847432.501001963),
    	/*39*/new TestDatum( "a ab bc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 6678982.995940352),
    	/*40*/new TestDatum( "a ab bc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 5556229.695569007),
    	/*41*/new TestDatum( "a ab bc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 5556229.695569007),
    	/*42*/new TestDatum( "a b ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 8669340.264564458),
    	/*43*/new TestDatum( "a b ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 7015888.818883275),
    	/*44*/new TestDatum( "a b ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 7015888.818883275),
    	/*45*/new TestDatum( "ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 9772538.375567237),
    	/*46*/new TestDatum( "ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 8439765.590834696),
    	/*47*/new TestDatum( "ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 8439765.590834696),
    	/*48*/new TestDatum( "a ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 7845025.089379846),
    	/*49*/new TestDatum( "a ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 6620497.030309036),
    	/*50*/new TestDatum( "a ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 6620497.030309036),
    	/*51*/new TestDatum( "a b ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 8761514.377097148),
    	/*52*/new TestDatum( "a b ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 7394637.885494188),
    	/*53*/new TestDatum( "a b ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 7394637.885494188),
    	/*54*/new TestDatum( "a b c ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.1040227976411488E7),
    	/*55*/new TestDatum( "a b c ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 8909631.84331466),
    	/*56*/new TestDatum( "a b c ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 8909631.84331466),
    	/*57*/new TestDatum( "abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 7193846.2179843085),
    	/*58*/new TestDatum( "abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 7193846.2179843085),
    	/*59*/new TestDatum( "abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 7193846.2179843085),
    	/*60*/new TestDatum( "a abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 5220377.767054839),
    	/*61*/new TestDatum( "a abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 5220377.767054839),
    	/*62*/new TestDatum( "a abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 5220377.767054839),
    	/*63*/new TestDatum( "a b abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 8568384.924078587),
    	/*64*/new TestDatum( "a b abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 7055227.917646345),
    	/*65*/new TestDatum( "a b abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 7055227.917646345),
    	/*66*/new TestDatum( "a b c abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.0826317778115656E7),
    	/*67*/new TestDatum( "a b c abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 9186228.02677497),
    	/*68*/new TestDatum( "a b c abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 9186228.02677497),
    	/*69*/new TestDatum( "ab abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 6125462.153832399),
    	/*70*/new TestDatum( "ab abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 6125462.153832399),
    	/*71*/new TestDatum( "ab abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 6125462.153832399),
    	/*72*/new TestDatum( "a ab abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 5214753.5182211185),
    	/*73*/new TestDatum( "a ab abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 5214753.5182211185),
    	/*74*/new TestDatum( "a ab abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 5214753.5182211185),
    	/*75*/new TestDatum( "a b ab abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 8575932.861878628),
    	/*76*/new TestDatum( "a b ab abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 7062775.855446384),
    	/*77*/new TestDatum( "a b ab abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 7062775.855446384),
    	/*78*/new TestDatum( "a b ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 6141972.454146504),
    	/*79*/new TestDatum( "a b ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 6141972.454146504),
    	/*80*/new TestDatum( "a b ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 6141972.454146504),
    	/*81*/new TestDatum( "a b c ab abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 9651960.455853026),
    	/*82*/new TestDatum( "a b c ab abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 7975276.47109968),
    	/*83*/new TestDatum( "a b c ab abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 7975276.47109968),
    	/*84*/new TestDatum( "ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 6762262.994607151),
    	/*85*/new TestDatum( "ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 6272721.064655634),
    	/*86*/new TestDatum( "ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 6272721.064655634),
    	/*87*/new TestDatum( "a ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 6764433.825110311),
    	/*88*/new TestDatum( "a ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 6274891.895158794),
    	/*89*/new TestDatum( "a ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 6274891.895158794),
    	/*90*/new TestDatum( "a b ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.0865990915712351E7),
    	/*91*/new TestDatum( "a b ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 8614756.521462768),
    	/*92*/new TestDatum( "a b ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 8614756.521462768),
    	/*93*/new TestDatum( "a b c ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.074627545616693E7),
    	/*94*/new TestDatum( "a b c ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 8235598.788947298),
    	/*95*/new TestDatum( "a b c ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 8235598.788947298),
    	/*96*/new TestDatum( "a bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 8196286.430352533),
    	/*97*/new TestDatum( "a bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 8196286.430352533),
    	/*98*/new TestDatum( "a bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 8196286.430352533),
    	/*99*/new TestDatum( "a ab bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.061958589597289E7),
    	/*100*/new TestDatum( "a ab bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 8342389.987324107),
    	/*101*/new TestDatum( "a ab bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 8342389.987324107),
    	/*102*/new TestDatum( "a b ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.3419439787728168E7),
    	/*103*/new TestDatum( "a b ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.0661899077020718E7),
    	/*104*/new TestDatum( "a b ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.0661899077020718E7),
    	/*105*/new TestDatum( "ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.4663202166265197E7),
    	/*106*/new TestDatum( "ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.165268867070619E7),
    	/*107*/new TestDatum( "ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.165268867070619E7),
    	/*108*/new TestDatum( "a ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.2134602643304592E7),
    	/*109*/new TestDatum( "a ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 9370273.526204333),
    	/*110*/new TestDatum( "a ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 9370273.526204333),
    	/*111*/new TestDatum( "a b ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.3301042368681977E7),
    	/*112*/new TestDatum( "a b ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.035725090381974E7),
    	/*113*/new TestDatum( "a b ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.035725090381974E7),
    	/*114*/new TestDatum( "a b c ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.6554335212169942E7),
    	/*115*/new TestDatum( "a b c ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.2516795892409358E7),
    	/*116*/new TestDatum( "a b c ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.1682659351894083E7),
    	/*117*/new TestDatum( "ab b", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1218988.6171484967),
    	/*118*/new TestDatum( "ab b", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1218988.6171484967),
    	/*119*/new TestDatum( "ab b", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1218988.6171484967),
    	/*120*/new TestDatum( "a ab b", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1699249.6986082606),
    	/*121*/new TestDatum( "a ab b", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1433990.0486694109),
    	/*122*/new TestDatum( "a ab b", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1433990.0486694109),
    	/*123*/new TestDatum( "bc a b ", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 3223778.1015239735),
    	/*124*/new TestDatum( "bc a b ", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 3223778.1015239735),
    	/*125*/new TestDatum( "bc a b ", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 3223778.1015239735),
    	/*126*/new TestDatum( "a ab c", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 2459607.2678991407),
    	/*127*/new TestDatum( "a ab c", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 2459607.2678991407),
    	/*128*/new TestDatum( "a ab c", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 2459607.2678991407),
    	/*129*/new TestDatum( "a abc abcd", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 2.1339501939880174E7),
    	/*130*/new TestDatum( "a abc abcd", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 2.1339501939880174E7),
    	/*131*/new TestDatum( "a abc abcd", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 2.1339501939880174E7),
    	/*132*/new TestDatum( "abc b c ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.4670855703556707E7),
    	/*133*/new TestDatum( "abc b c ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.16603422079977E7),
    	/*134*/new TestDatum( "abc b c ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.16603422079977E7),
    	/*135*/new TestDatum( "a b c ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.1040227976411488E7),
    	/*136*/new TestDatum( "a b c ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 8909631.84331466),
    	/*137*/new TestDatum( "a b c ab ac bc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 8909631.84331466),
    	/*138*/new TestDatum( "a b c ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.074627545616693E7),
    	/*139*/new TestDatum( "a b c ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 8235598.788947298),
    	/*140*/new TestDatum( "a b c ab ac abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 8235598.788947298),
    	/*141*/new TestDatum( "a b ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.3301042368681977E7),
    	/*142*/new TestDatum( "a b ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.035725090381974E7),
    	/*143*/new TestDatum( "a b ab ac bc abc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.035725090381974E7),
    	/*144*/new TestDatum( "a b ab c ac bc abc d ad bd abd cd acd bcd abcd", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.3336270845462497E8),
    	/*145*/new TestDatum( "a b ab c ac bc abc d ad bd abd cd acd bcd abcd", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 9.01466224955217E7),
    	/*146*/new TestDatum( "a b ab c ac bc abc d ad bd abd cd acd bcd abcd", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 7.74175661292661E7),
    	/*147*/new TestDatum( "a b ab c ac bc abc cd acd bcd abcd cde acde bcde abcde", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 3.45273487398656E8),
    	/*148*/new TestDatum( "a b ab c ac bc abc cd acd bcd abcd cde acde bcde abcde", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 2.3820841083351758E8),
    	/*149*/new TestDatum( "a b ab c ac bc abc cd acd bcd abcd cde acde bcde abcde", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 2.045223870766254E8),
    	/*150*/new TestDatum( "a b ab c ac bc abc d ad bd abd cd acd bcd abcd cde acde bcde abcde", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 5.310565008322925E8),
    	/*151*/new TestDatum( "a b ab c ac bc abc d ad bd abd cd acd bcd abcd cde acde bcde abcde", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 3.471449381722256E8),
    	/*152*/new TestDatum( "a b ab c ac bc abc d ad bd abd cd acd bcd abcd cde acde bcde abcde", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 2.877634336655891E8),
    	/*153*/new TestDatum( "abcd abce", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 6.712754178265849E7),
    	/*154*/new TestDatum( "abcd abce", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 6.712754178265849E7),
    	/*155*/new TestDatum( "abcd abce", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 6.712754178265849E7),
    	/*156*/new TestDatum( "a ab c cd", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.0416805099451702E7),
    	/*157*/new TestDatum( "a ab c cd", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.0416805099451702E7),
    	/*158*/new TestDatum( "a ab c cd", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.0416805099451702E7),
    	/*159*/new TestDatum( "a c ab bc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 7786516.041252902),
    	/*160*/new TestDatum( "a c ab bc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 6215397.209206813),
    	/*161*/new TestDatum( "a c ab bc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 6215397.209206813),
    	/*162*/new TestDatum( "a b ac bc bcd d", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 3.1784558757338937E7),
    	/*163*/new TestDatum( "a b ac bc bcd d", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 2.6421373934392862E7),
    	/*164*/new TestDatum( "a b ac bc bcd d", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 2.6421373934392862E7),
    	/*165*/new TestDatum( "abcd abce de", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.2775953345472418E8),
    	/*166*/new TestDatum( "abcd abce de", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.1604703043322521E8),
    	/*167*/new TestDatum( "abcd abce de", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.1604703043322521E8),
    	/*168*/new TestDatum( "a b ab c ac bc abc df adf bdf abdf cd acd bcd abcd cde acde bcde abcde", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.1829162325865223E9),
    	/*169*/new TestDatum( "a b ab c ac bc abc df adf bdf abdf cd acd bcd abcd cde acde bcde abcde", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 7.70943412595342E8),
    	/*170*/new TestDatum( "a b ab c ac bc abc df adf bdf abdf cd acd bcd abcd cde acde bcde abcde", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 6.311036132352159E8),
    	/*171*/new TestDatum( "abd abc dc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 3.648094815530618E7),
    	/*172*/new TestDatum( "abd abc dc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 3.2271086235896707E7),
    	/*173*/new TestDatum( "abd abc dc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 3.2271086235896707E7),
    	/*174*/new TestDatum( "a b ab c ac bc abc p q pq r pr qr pqr x bx px", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 4.10170985641211E8),
    	/*175*/new TestDatum( "a b ab c ac bc abc p q pq r pr qr pqr x bx px", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 2.9408551868298614E8),
    	/*176*/new TestDatum( "a b ab c ac bc abc p q pq r pr qr pqr x bx px", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 2.801562123529685E8),
    	/*177*/new TestDatum( "a b ab c ac d ad e ae f af", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 8.68349751388919E7),
    	/*178*/new TestDatum( "a b ab c ac d ad e ae f af", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 6.323426197582513E7),
    	/*179*/new TestDatum( "a b ab c ac d ad e ae f af", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 6.323426197582513E7),
    	/*180*/new TestDatum( "a b c d cd ae be e ce de cde", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.2427225452141175E8),
    	/*181*/new TestDatum( "a b c d cd ae be e ce de cde", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 9.266710340308318E7),
    	/*182*/new TestDatum( "a b c d cd ae be e ce de cde", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 8.594534385699356E7),
    	/*183*/new TestDatum( "a b c d cd ae be e ce de cde ef", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 2.1512103911998644E8),
    	/*184*/new TestDatum( "a b c d cd ae be e ce de cde ef", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.5907492196056086E8),
    	/*185*/new TestDatum( "a b c d cd ae be e ce de cde ef", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.477198419065136E8),
    	/*186*/new TestDatum( "a b c ab ac bc abc ad", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 5.043271024240187E7),
    	/*187*/new TestDatum( "a b c ab ac bc abc ad", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 3.7830884289998375E7),
    	/*188*/new TestDatum( "a b c ab ac bc abc ad", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 3.486031682232209E7),
    	/*189*/new TestDatum( "a b c ab ac bc abc abd", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 5.434254074511287E7),
    	/*190*/new TestDatum( "a b c ab ac bc abc abd", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 4.0750237311447255E7),
    	/*191*/new TestDatum( "a b c ab ac bc abc abd", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 3.762136341636858E7),
    	/*192*/new TestDatum( "a b c ab ac bc abc abcd", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 6.051737407892114E7),
    	/*193*/new TestDatum( "a b c ab ac bc abc abcd", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 4.4802797141966484E7),
    	/*194*/new TestDatum( "a b c ab ac bc abc abcd", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 4.09394261214547E7),
    	/*195*/new TestDatum( "ad bd cd abd acd bcd abcd d", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 4.817479851380087E7),
    	/*196*/new TestDatum( "ad bd cd abd acd bcd abcd d", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 4.055860890842431E7),
    	/*197*/new TestDatum( "ad bd cd abd acd bcd abcd d", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 3.8905434006696895E7),
    	/*198*/new TestDatum( "a b c ab ac bc abc ad bd cd", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 6.0028207738253325E7),
    	/*199*/new TestDatum( "a b c ab ac bc abc ad bd cd", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 4.503468428206088E7),
    	/*200*/new TestDatum( "a b c ab ac bc abc ad bd cd", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 4.131173789857594E7),
    	/*201*/new TestDatum( "a b c ab ac bc abc abd bcd acd", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 7.351978037436223E7),
    	/*202*/new TestDatum( "a b c ab ac bc abc abd bcd acd", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 5.505267383624485E7),
    	/*203*/new TestDatum( "a b c ab ac bc abc abd bcd acd", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 5.039774908910654E7),
    	/*204*/new TestDatum( "a b c ab ac bc abc ad d", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 5.256568558450084E7),
    	/*205*/new TestDatum( "a b c ab ac bc abc ad d", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 3.8762197167341724E7),
    	/*206*/new TestDatum( "a b c ab ac bc abc ad d", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 3.565378740610455E7),
    	/*207*/new TestDatum( "a b c ab ac bc abc ad abd", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 5.939675243143979E7),
    	/*208*/new TestDatum( "a b c ab ac bc abc ad abd", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 4.384294116284333E7),
    	/*209*/new TestDatum( "a b c ab ac bc abc ad abd", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 4.045948250847632E7),
    	/*210*/new TestDatum( "a b c ab ac bc abc abd abcd", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 7.024676546446215E7),
    	/*211*/new TestDatum( "a b c ab ac bc abc abd abcd", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 5.213574237917462E7),
    	/*212*/new TestDatum( "a b c ab ac bc abc abd abcd", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 4.692074726408342E7),
    	/*213*/new TestDatum( "a b c ab ac bc abc ad d be e cf f", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.9921495297600916E8),
    	/*214*/new TestDatum( "a b c ab ac bc abc ad d be e cf f", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.4339342360760194E8),
    	/*215*/new TestDatum( "a b c ab ac bc abc ad d be e cf f", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.3138792400837941E8),
    	/*216*/new TestDatum( "a b c ab ac bc abc ad bd abd d", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 6.1755960688412525E7),
    	/*217*/new TestDatum( "a b c ab ac bc abc ad bd abd d", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 4.4436534624882385E7),
    	/*218*/new TestDatum( "a b c ab ac bc abc ad bd abd d", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 4.02331698661041E7),
    	/*219*/new TestDatum( "a b c ab ac bc abc acd bcd abcd cd", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 8.738882198203754E7),
    	/*220*/new TestDatum( "a b c ab ac bc abc acd bcd abcd cd", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 6.211984562916808E7),
    	/*221*/new TestDatum( "a b c ab ac bc abc acd bcd abcd cd", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 5.50850427658096E7),
    	/*222*/new TestDatum( "a ab b ac c ad d be e cf f dg g", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.7540423395282975E8),
    	/*223*/new TestDatum( "a ab b ac c ad d be e cf f dg g", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.2591862119908917E8),
    	/*224*/new TestDatum( "a ab b ac c ad d be e cf f dg g", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.2591862119908917E8),
    	/*225*/new TestDatum( "a ab b ac c ad d be e cf f dg g eh h fi i gj j ak k kl l lm m", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.9857216238792362E9),
    	/*226*/new TestDatum( "a ab b ac c ad d be e cf f dg g eh h fi i gj j ak k kl l lm m", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.3475325242422373E9),
    	/*227*/new TestDatum( "a ab b ac c ad d be e cf f dg g eh h fi i gj j ak k kl l lm m", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.3475325242422373E9),
    	/*228*/new TestDatum( "ab ac abc ad ae ade", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 5.292084195500767E7),
    	/*229*/new TestDatum( "ab ac abc ad ae ade", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 4.7555901092560105E7),
    	/*230*/new TestDatum( "ab ac abc ad ae ade", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 4.7555901092560105E7),
    	/*231*/new TestDatum( "a b ab c ac abd ace", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 5.132414594307317E7),
    	/*232*/new TestDatum( "a b ab c ac abd ace", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 4.025406705650046E7),
    	/*233*/new TestDatum( "a b ab c ac abd ace", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 4.025406705650046E7),
    	/*234*/new TestDatum( "a b ab c ac d ad be ce de", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 6.810940063035224E7),
    	/*235*/new TestDatum( "a b ab c ac d ad be ce de", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 5.680147511242039E7),
    	/*236*/new TestDatum( "a b ab c ac d ad be ce de", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 5.680147511242039E7),
    	/*237*/new TestDatum( "a b ab c ac d ad ae be ce de", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.0086998114323667E8),
    	/*238*/new TestDatum( "a b ab c ac d ad ae be ce de", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 7.877849486542825E7),
    	/*239*/new TestDatum( "a b ab c ac d ad ae be ce de", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 7.877849486542825E7),
    	/*240*/new TestDatum( "a b ab c ac abd ace acef acefg", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 2.9850646070229834E8),
    	/*241*/new TestDatum( "a b ab c ac abd ace acef acefg", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 2.4280043884137377E8),
    	/*242*/new TestDatum( "a b ab c ac abd ace acef acefg", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 2.4280043884137377E8),
    	/*243*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.2026580979086614E9),
    	/*244*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.003378592675317E9),
    	/*245*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.003378592675317E9),
    	/*246*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.8235443444131958E9),
    	/*247*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.4078070648934042E9),
    	/*248*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.4078070648934042E9),
    	/*249*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 2.392993065028067E9),
    	/*250*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.8563541107154212E9),
    	/*251*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.8563541107154212E9),
    	/*252*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj l", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 3.022462930319212E9),
    	/*253*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj l", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 2.3554471115623384E9),
    	/*254*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj l", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 2.3554471115623384E9),
    	/*255*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj l lc", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 3.1401984909616756E9),
    	/*256*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj l lc", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 2.409440494246113E9),
    	/*257*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj l lc", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 2.409440494246113E9),
    	/*258*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj l lc al", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 3.436699715229096E9),
    	/*259*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj l lc al", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 2.646696938439686E9),
    	/*260*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj l lc al", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 2.646696938439686E9),
    	/*261*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj l lc al m mn nc bc bco bo boj bp bop cq cqb rs ra s", DecompositionType.PIERCED_FIRST, RecompositionType.NESTED, 1.6129723602755812E10),
    	/*262*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj l lc al m mn nc bc bco bo boj bp bop cq cqb rs ra s", DecompositionType.PIERCED_FIRST, RecompositionType.SINGLY_PIERCED, 1.2205803926586895E10),
    	/*263*/new TestDatum( "qh h fh ih ik kh b ab ac de bd  abc bfg fc bj l lc al m mn nc bc bco bo boj bp bop cq cqb rs ra s", DecompositionType.PIERCED_FIRST, RecompositionType.DOUBLY_PIERCED, 1.1633111010059067E10),

    };
}
