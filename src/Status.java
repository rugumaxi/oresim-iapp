import com.nttdocomo.ui.Dialog;



/**
 * �X�e�[�^�X�N���X
 *
 * @author fox
 */
public class Status {

	public static boolean reversingFlag = false;

    public static final String ST_STAB = "STAB";
    public static final String ST_HACK = "HACK";
    public static final String ST_INT = "INT";
    public static final String ST_DEF = "DEF";
    public static final String ST_MR = "MR";
    public static final String ST_DEX = "DEX";
    public static final String ST_AGI = "AGI";
    public static final String ST_HP = "HP";
    public static final String ST_MP = "MP";
    public static final String ST_SP = "SP";
    public static final String ST_WEIGHT = "WEIGHT";

    public static final String[] STATUS_NAME = {
        ST_STAB, ST_HACK, ST_INT, ST_DEF, ST_MR, ST_DEX, ST_AGI,
        ST_HP, ST_MP, ST_SP, ST_WEIGHT
    };

    /** Xien ���� */
    public static final String[] XIEN_NAME = {
            "������ MR/INT", "�Ή��n INT/DEX", "�X���n INT/MR", "�����n DEX/INT", "��n�n DEF/INT", "�d���n INT/MR",
            "�����@ MR/INT", "�����@ INT/MR", "���ʌn DEX/AGI", "���n STAB/DEX", "���n HACK/DEF", "���n STAB/HACK",
            "�ڌn HACK/DEX", "�Ō��n DEF/HACK" , "�����n STAB/DEX", "�ω��n INT/MR", "���o�n INT/DEX",
            "���p�n INT/DEX", "���p�n INT/DEX", "���p�n INT/DEX",
            "�����n SATB/DEX","���@�n INT/DEX","�⏕�n INT/MR",
            "�C�T�n /","�C�U�n /","�C�V�n /",
            "�A�T�n /","�A�U�n /","�A�V�n /"
    };

    public static final char ACT_LVUP = 'L';
    public static final char ACT_BONUS = 'B';
    public static final char ACT_STAB = 'S';
    public static final char ACT_HACK = 'H';
    public static final char ACT_INT = 'I';
    public static final char ACT_DEF = 'F';
    public static final char ACT_MR = 'M';
    public static final char ACT_DEX = 'X';
    public static final char ACT_AGI = 'A';
    public static final char ACT_NONE = 'n';
    public static final char ACT_FIRE = 'f';
    public static final char ACT_ICE = 'i';
    public static final char ACT_WIND = 'd';
    public static final char ACT_EARTH = 'e';
    public static final char ACT_LIGHTNING = 'l';
    public static final char ACT_WHITE = 't';
    public static final char ACT_BLACK = 'b';
    public static final char ACT_COMMON = 'c';
    public static final char ACT_SWORD = 'o';
    public static final char ACT_KATANA = 'k';
    public static final char ACT_SPEAR = 'p';
    public static final char ACT_WHIP = 'h';
    public static final char ACT_SMASH = 'm';
    public static final char ACT_STLENGTH = 'g';
    public static final char ACT_ENCHANT = 'v';
    public static final char ACT_RELEASE = 'r';
    public static final char ACT_FIRE2 = 'a';
    public static final char ACT_ICE2 = 'j';
    public static final char ACT_LIGHTNING2 = 'q';
    public static final char ACT_LANZIEE_1 = 'w';
    public static final char ACT_LANZIEE_2 = 'x';
    public static final char ACT_LANZIEE_3 = 'y';
    public static final char ACT_ISSAC_1 = 'z';
    public static final char ACT_ISSAC_2 = 's';
    public static final char ACT_ISSAC_3 = 'u';
    public static final char ACT_ANAIS_1 = '{';
    public static final char ACT_ANAIS_2 = '|';
    public static final char ACT_ANAIS_3 = '}';
    public static final char ACT_STATUS = 'T';

    /** �ĐU�胍�O�p�R�[�h */
    public static final char[] ACTIONS = {
        ACT_LVUP, ACT_BONUS,
        ACT_STAB, ACT_HACK, ACT_INT, ACT_DEF, ACT_MR, ACT_DEX, ACT_AGI,
        ACT_NONE, ACT_FIRE, ACT_ICE, ACT_WIND, ACT_EARTH, ACT_LIGHTNING, ACT_WHITE,
        ACT_BLACK, ACT_COMMON, ACT_SWORD, ACT_KATANA, ACT_SPEAR, ACT_WHIP, ACT_SMASH,
        ACT_STLENGTH,ACT_ENCHANT,ACT_RELEASE,ACT_FIRE2,ACT_ICE2,ACT_LIGHTNING2,
        ACT_LANZIEE_1,ACT_LANZIEE_2,ACT_LANZIEE_3,
        ACT_ISSAC_1,ACT_ISSAC_2,ACT_ISSAC_3,
        ACT_ANAIS_1,ACT_ANAIS_2,ACT_ANAIS_3,
        ACT_STATUS
    };

    public static final char[] ACT_ALLOC_STATUS = new char[] {
    	ACT_STAB, ACT_HACK, ACT_INT, ACT_DEF, ACT_MR, ACT_DEX, ACT_AGI
    };

    public static final char[] ACT_CHANGE_XIEN = new char[]{
    	ACT_NONE, ACT_FIRE, ACT_ICE, ACT_WIND, ACT_EARTH, ACT_LIGHTNING, ACT_WHITE,
    	ACT_BLACK, ACT_COMMON, ACT_SWORD, ACT_KATANA, ACT_SPEAR, ACT_WHIP, ACT_SMASH,
    	ACT_STLENGTH,ACT_ENCHANT,ACT_RELEASE,ACT_FIRE2,ACT_ICE2,ACT_LIGHTNING2,
        ACT_LANZIEE_1,ACT_LANZIEE_2,ACT_LANZIEE_3,
        ACT_ISSAC_1,ACT_ISSAC_2,ACT_ISSAC_3,
        ACT_ANAIS_1,ACT_ANAIS_2,ACT_ANAIS_3
     };

    /**
     * �X�e�㏸�l
     *
     * STAB
     * HACK
     * INT
     * DEF
     * MR
     * DEX
     * AGI
     */
    public static final int[][] STATUS_UP = {
            /*             HP  MP  SP  WE  */
            /* STAB */   {  7,  1,  8,  4 },
            /* HACK */   { 15,  2,  4,  6 },
            /* INT  */   {  1,  6,  2,  1 },
            /* DEF  */   { 40,  0,  3,  8 },
            /* MR   */   {  2, 20,  6,  2 },
            /* DEX  */   {  5,  3, 30,  5 },
            /* AGI  */   {  8,  2, 10,  1 }
    };

    /**
     * Xien�{�[�i�X�i�K���㏸�j
     *
     * ������
     * �Ή��n
     * �X���n
     * �����n
     * ��n�n
     * �d���n
     * �����@
     * �����@
     * ���ʌn
     * ���n
     * ���n
     * ���n
     * �ڌn
     * �Ō��n
     * �����n
     * �ω��n
     * ���o�n
     * ���p�n
     * ���p�n
     * ���p�n
     * �����n
     * ���@�n
     * �⏕�n
     * �C�T�n
     * �C�U�n
     * �C�V�n
     * �A�T�n
     * �A�U�n
     * �A�V�n
     */
    private static final int[][] XIEN_UP_BONUS = {
            /*               S  H  I  DF M  DX A  */
            /* ������ */   { 0, 0, 0, 0, 1, 0, 0 },
            /* �Ή��n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* �X���n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* �����n */   { 0, 0, 0, 0, 0, 1, 0 },
            /* ��n�n */   { 0, 0, 0, 1, 0, 0, 0 },
            /* �d���n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* �����@ */   { 0, 0, 0, 0, 1, 0, 0 },
            /* �����@ */   { 0, 0, 1, 0, 0, 0, 0 },
            /* ���ʌn */   { 0, 0, 0, 0, 0, 1, 0 },
            /*  ���n  */   { 1, 0, 0, 0, 0, 0, 0 },
            /*  ���n  */   { 0, 1, 0, 0, 0, 0, 0 },
            /*  ���n  */   { 1, 0, 0, 0, 0, 0, 0 },
            /*  �ڌn  */   { 0, 1, 0, 0, 0, 0, 0 },
            /* �Ō��n */   { 0, 0, 0, 1, 0, 0, 0 },
            /* �����n */   { 1, 0, 0, 0, 0, 0, 0 },
            /* �ω��n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* ���o�n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* ���p�n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* ���p�n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* ���p�n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* �����n */   { 1, 0, 0, 0, 0, 0, 0 },
            /* ���@�n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* �⏕�n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* �C�T�n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* �C�U�n */   { 1, 0, 0, 0, 0, 0, 0 },
            /* �C�V�n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* �A�T�n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* �A�U�n */   { 1, 0, 0, 0, 0, 0, 0 },
            /* �A�V�n */   { 0, 0, 1, 0, 0, 0, 0 }
    };

    /**
     * Xien�{�[�i�X�i���m���ŏ㏸�j
     *
     * ������
     * �Ή��n
     * �X���n
     * �����n
     * ��n�n
     * �d���n
     * �����@
     * �����@
     * ���ʌn
     * ���n
     * ���n
     * ���n
     * �ڌn
     * �Ō��n
     * �����n
     * �ω��n
     * ���o�n
     * ���p�n
     * ���p�n
     * ���p�n
     * �����n
     * ���@�n
     * �⏕�n
     * �C�T�n
     * �C�U�n
     * �C�V�n
     * �A�T�n
     * �A�U�n
     * �A�V�n
     */
    private static final int[][] XIEN_RANDOM_UP_BONUS = {
            /*               S  H  I  DF M  DX A  */
            /* ������ */   { 0, 0, 1, 0, 0, 0, 0 },
            /* �Ή��n */   { 0, 0, 0, 0, 0, 1, 0 },
            /* �X���n */   { 0, 0, 0, 0, 1, 0, 0 },
            /* �����n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* ��n�n */   { 0, 0, 1, 0, 0, 0, 0 },
            /* �d���n */   { 0, 0, 0, 0, 1, 0, 0 },
            /* �����@ */   { 0, 0, 1, 0, 0, 0, 0 },
            /* �����@ */   { 0, 0, 0, 0, 1, 0, 0 },
            /* ���ʌn */   { 0, 0, 0, 0, 0, 0, 1 },
            /*  ���n  */   { 0, 0, 0, 0, 0, 1, 0 },
            /*  ���n  */   { 0, 0, 0, 1, 0, 0, 0 },
            /*  ���n  */   { 0, 1, 0, 0, 0, 0, 0 },
            /*  �ڌn  */   { 0, 0, 0, 0, 0, 1, 0 },
            /* �Ō��n */   { 0, 1, 0, 0, 0, 0, 0 },
            /* �����n */   { 0, 0, 0, 0, 0, 1, 0 },
            /* �ω��n */   { 0, 0, 0, 0, 1, 0, 0 },
            /* ���o�n */   { 0, 0, 0, 0, 0, 1, 0 },
            /* ���p�n */   { 0, 0, 0, 0, 0, 1, 0 },
            /* ���p�n */   { 0, 0, 0, 0, 0, 1, 0 },
            /* ���p�n */   { 0, 0, 0, 0, 0, 1, 0 },
            /* �����n */   { 0, 0, 0, 0, 0, 1, 0 },
            /* ���@�n */   { 0, 0, 0, 0, 0, 1, 0 },
            /* �⏕�n */   { 0, 0, 0, 0, 1, 0, 0 },
            /* �C�T�n */   { 0, 0, 0, 0, 1, 0, 0 },
            /* �C�U�n */   { 0, 0, 0, 0, 1, 0, 0 },
            /* �C�V�n */   { 0, 0, 0, 0, 1, 0, 0 },
            /* �A�T�n */   { 0, 0, 0, 0, 1, 0, 0 },
            /* �A�U�n */   { 0, 0, 0, 0, 1, 0, 0 },
            /* �A�V�n */   { 0, 0, 0, 0, 1, 0, 0 }
    };

    /**
     * Xien�X�e���Ϗ㏸�l
     *
     * ������
     * �Ή��n
     * �X���n
     * �����n
     * ��n�n
     * �d���n
     * �����@
     * �����@
     * ���ʌn
     * ���n
     * ���n
     * ���n
     * �ڌn
     * �Ō��n
     * �����n
     * �ω��n
     * ���o�n
     * ���p�n
     * ���p�n
     * ���p�n
     * �����n
     * ���@�n
     * �⏕�n
     * �C�T�n
     * �C�U�n
     * �C�V�n
     * �A�T�n
     * �A�U�n
     * �A�V�n
     */
    private static final int[][] XIEN_UP_STATUS = {
            /*               HP  MP  SP  WE  */
            /* ������ */   {  5,  5, 10,  4 },
            /* �Ή��n */   {  7,  6, 14,  4 },
            /* �X���n */   {  5,  7, 10,  4 },
            /* �����n */   {  9,  5, 12,  4 },
            /* ��n�n */   {  9,  4, 12,  4 },
            /* �d���n */   {  7,  5, 10,  4 },
            /* �����@ */   {  7,  5, 13,  4 },
            /* �����@ */   {  5,  7, 10,  4 },
            /* ���ʌn */   { 15,  2, 23, 10 },
            /* ���n�@ */   { 17,  1, 26, 12 },
            /* ���n�@ */   { 23,  3, 24, 16 },
            /* ���n�@ */   { 21,  2, 22, 15 },
            /* �ڌn�@ */   { 19,  2, 29, 14 },
            /* �Ō��n */   { 20,  2, 19, 16 },
            /* �����n */   { 17,  1, 26, 12 },
            /* �ω��n */   {  5,  7, 10,  4 },
            /* ���o�n */   {  7,  5, 13,  4 },
            /* ���p�n */   {  7,  6, 14,  4 },
            /* ���p�n */   {  5,  7, 10,  4 },
            /* ���p�n */   {  7,  5, 10,  4 },
            /* �����n */   { 17,  1, 26, 12 },
            /* ���@�n */   {  7,  6, 14,  4 },
            /* �⏕�n */   {  5,  4, 10,  2 },
            /* �C�T�n */   {  7,  6, 14,  4 },
            /* �C�U�n */   { 17,  1, 26, 12 },
            /* �C�V�n */   {  5,  4, 10,  2 },
            /* �A�T�n */   {  7,  6, 14,  4 },
            /* �A�U�n */   { 17,  1, 26, 12 },
            /* �A�V�n */   {  5,  4, 10,  2 }
    };

    /**
     * �ō����x��
     */
    public static final int MAX_LEVEL = 255;

    /**
     * �X�e�J���X�g�l
     */
    public static final int[] MAX_STATUS = {
            255, 255, 255, 255, 255, 255, 255, 15000, 3000, 9999, 9999
    };

    /**
     * ���x���ʃ{�[�i�X�X�e�[�^�X�|�C���g
     */
    public static int[] bonusStatusPoint = {
                /* 1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 */
    /*   1- 20 */  2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
    /*  21- 40 */  3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
    /*  41- 60 */  4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
    /*  61- 80 */  5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
    /*  81-100 */  6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,
    /* 101-120 */  6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,
    /* 121-140 */  6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
    /* 141-160 */  7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
    /* 161-180 */  7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8,
    /* 181-200 */  8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
    /* 201-220 */  8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
    /* 221-240 */  8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9,
    /* 241-255 */  9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9
    };

    /**
     * �L�����E�^���
     */
    public TWCharacters _character = null;

    /**
     * ���x��
     */
    private int level = 1;

    /**
     * �X�e���Ғl
     *
     * STAB
     * HACK
     * INT
     * DEF
     * MR
     * DEX
     * AGI
     * HP
     * MP
     * SP
     * WEIGHT
     */
    private int[] status = {
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
    };

    /**
     * POINT �X�e�l
     */
    private int statusPoint = 0;

    /**
     * �X�e�㏸�K�v�|�C���g�����l
     *
     * STAB
     * HACK
     * INT
     * DEF
     * MR
     * DEX
     * AGI
     */
    private int[] needPoints = {
           0, 0, 0, 0, 0, 0, 0
    };

    /**
     * Xien
     *
     * ������
     * �Ή��n
     * �X���n
     * �����n
     * ��n�n
     * �d���n
     * �����@
     * �����@
     * ���ʌn
     * ���n
     * ���n
     * ���n
     * �ڌn
     * �Ō��n
     * �����n
     * �ω��n
     * ���o�n
     * ���p�n
     * ���p�n
     * ���p�n
     * �����n
     * ���@�n
     * �⏕�n
     * �C�T�n
     * �C�U�n
     * �C�V�n
     * �A�T�n
     * �A�U�n
     * �A�V�n
     */
    private int[] xien = {
           0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
    };

    private int[] tmpXien = {
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
    };

    /**
     * �{�[�i�X�����m��
     */
    private int bonusExpected = 50;

    /**
     * �{�[�i�X�����݌v
     */
    private int totalBonusPoints = 0;

    /**
     * ���s�{�[�i�X������
     */
    private int bonusPoints = 0;

    /**
     *
     */
    private int totalLevelUp = 0;

    /**
     * �ĐU�胍�O�L�^�o�b�t�@
     */
    public StringBuffer allocationBuffer = new StringBuffer();

    /**
     * �߂鑀��p�o�b�t�@
     */
    private StringBuffer reverseBuffer = new StringBuffer();

    /** Xien �ύX�L�^�ۗ̕��p */
    private char tmpXienChangeBuffer = ACTIONS[9 + getXienIndex()];

    private StringBuffer tmpBonusChoiceBuffer = new StringBuffer("B50");

    private static Status tmpStm = null;


    /**
     * ���x���A�b�v����
     *
     * @return ���x���A�b�v�̐���
     */
    public boolean levelUp() {

        if ( level >= MAX_LEVEL) {
            // LV�J���X�g�̏ꍇ�ُ�I��
            return false;
        }

        if(tmpBonusChoiceBuffer.length() > 0 ) {
            for(int i = 0; i < tmpBonusChoiceBuffer.length(); i++) {
                log(tmpBonusChoiceBuffer.charAt(i));
            }
            tmpBonusChoiceBuffer.setLength(0);
        }
        if(tmpXienChangeBuffer != ' ') {
            log(tmpXienChangeBuffer);
            tmpXienChangeBuffer = ' ';
        }
        level++;
        log(ACT_LVUP);

        int currentXien = 0;
        for(int i = 0; i < xien.length; i++) {
            xien[i] = tmpXien[i];
            if ( xien[i] >= xien[currentXien] ) {
                currentXien = i;
            }
        }

        for( int i = 0; i < XIEN_UP_BONUS[currentXien].length; i++) {
            status[i] += XIEN_UP_BONUS[currentXien][i];
        }

        for( int i = 0; i < XIEN_UP_STATUS[currentXien].length ; i++ ) {

            status[i + XIEN_UP_BONUS[currentXien].length ] += XIEN_UP_STATUS[currentXien][i];
        }

        totalLevelUp++;
        if ((bonusPoints + 1) * 100 <= totalLevelUp * bonusExpected) {
            bonusPoints++;
            totalBonusPoints++;

            for( int i = 0; i < XIEN_RANDOM_UP_BONUS[currentXien].length; i++) {
                status[i] += XIEN_RANDOM_UP_BONUS[currentXien][i];
            }
        }

        for ( int i = 0; i < status.length; i++) {
            if ( status[i] > MAX_STATUS[i] ) {
                status[i] = MAX_STATUS[i];
            }
        }

        statusPoint += bonusStatusPoint[level - 1];

        return true;
    }

    /**
     * �X�e�l���グ��
     *
     * @param index ������X�e
     * @return �X�e�l�㏸�̐���
     */
    public boolean statusUp(int index) {
      int[] currentNeedPoints = getNeedPoints();

      if ( statusPoint < currentNeedPoints[index] || status[index] >= MAX_STATUS[index]) {
          // �X�e�[�^�X�|�C���g�s��
          return false;
      }

      statusPoint -= currentNeedPoints[index];
      log(ACT_ALLOC_STATUS[index]);

      status[index]++;
      for ( int i = 0; i < STATUS_UP[index].length; i ++) {
          status[i + XIEN_UP_BONUS[0].length] += STATUS_UP[index][i];

          if (status[i + XIEN_UP_BONUS[0].length] > MAX_STATUS[i + XIEN_UP_BONUS[0].length]) {
              status[i + XIEN_UP_BONUS[0].length] = MAX_STATUS[i + XIEN_UP_BONUS[0].length];
          }
      }

      return true;
    }

    /**
     * �X�e�l���X�e�[�^�X�|�C���g���オ��܂ŏグ��
     *
     * @param index ������X�e
     * @return �X�e�l�㏸�̐���
     */
    public boolean statusUpUntillChange(int index) {
        int originalValue = getNeedPoints()[index];

        if (originalValue < Status.MAX_STATUS[index]
                 && (level < Status.MAX_LEVEL || statusPoint >= getNeedPoints()[index])) {

            while(status[index] < Status.MAX_STATUS[index] && originalValue == getNeedPoints()[index]
                && (level < Status.MAX_LEVEL || statusPoint >= getNeedPoints()[index])) {

            	while(level < Status.MAX_LEVEL && statusPoint < getNeedPoints()[index] && levelUp()) {
            	}
            	if (originalValue == getNeedPoints()[index]) {
                  	statusUp(index);
            	}
            }

            return true;
        }
        return false;
    }

    /**
     * Xien �ύX
     *
     * @param xienIndex �ύX����Xien
     * @return Xien �ύX��Xien
     */
    public int changeXien(int xienIndex) {

        int currentXien = getXienIndex();
        for(int i = 0; i < tmpXien.length; i++) {
            tmpXien[i] = xien[i];
        }
        if ( currentXien == xienIndex) {
            tmpXienChangeBuffer = ACTIONS[9 + getXienIndex()];
            return currentXien;
        }

        reverseBuffer = new StringBuffer();
        int maxXien = xien[currentXien];
        if(xienIndex > currentXien) {

            if(_character.getMaxXienPoints(level)[xienIndex] >= maxXien) {
                tmpXien[xienIndex] = maxXien;

            } else {
                tmpXienChangeBuffer = ' ';
                return currentXien;
            }

        } else {
        	//System.out.println(_character.charIndex);

            if(_character.getMaxXienPoints(level)[xienIndex] > maxXien) {
                tmpXien[xienIndex] = maxXien + 1;

            } else {
                tmpXienChangeBuffer = ' ';
                return currentXien;
            }
        }

        tmpXienChangeBuffer = ACTIONS[9 + xienIndex];
        return xienIndex;
    }


    /**
     * �ĐU�胍�O���o��
     *
     * @param action ���s���e
     */
    public void log(char action) {
        if(action != ' ' ){
            allocationBuffer.append(action);
            reverseBuffer = new StringBuffer();
        }
    }

    /**
     * �\���p�ĐU�胍�O���擾
     *
     * @return �\���p���O
     */
     public String getLog() {

        if ( tmpStm == null) {
      	    tmpStm = new Status();
            tmpStm._character = _character;
        }

    	int index = 0;
        int startLv = 1;
        int currentLv = 1;

        StringBuffer log = new StringBuffer();
        log.append(allocationBuffer);
        StringBuffer logBuf = new StringBuffer("");
        StringBuffer lineLog = new StringBuffer("");
        StringBuffer statusLineLog = new StringBuffer("");
        String pattern = "";
        StringBuffer currentBuf = new StringBuffer();
        boolean bonusXienFlag = false;
        char currentAction = ' ';
        int lv = 0;

        tmpStm.init();
        int gokuburiStatus = -1;
        int gokuburiStart = 0;
        int gokuburiPastStatus = -1;

        while(index < log.length()) {

            while(index < log.length()
            		&& log.charAt(index) != ACT_LVUP ) {

                currentAction = log.charAt(index);

            	if (currentAction == ACT_BONUS) {
                    // BONUS �ύX
            		lineLog.append("Bonus        : ");

                	index++;
                	StringBuffer bonusBuf = new StringBuffer();
                    while(index < log.length()
                            && log.charAt(index) >= '0'
                            && log.charAt(index) <= '9') {

                    	lineLog.append((log.charAt(index) - '0'));
                    	bonusBuf.append((log.charAt(index) - '0'));
                        index++;
                    }
                    lineLog.append("%\n");

                    tmpStm.changeBonusExpected(Integer.parseInt(bonusBuf.toString()));
                    continue;

            	} else if (String.valueOf(ACT_CHANGE_XIEN).indexOf(currentAction) >= 0) {
                    // Xien �ύX
            		lineLog.append("Xien         : ");
            		lineLog.append(XIEN_NAME[String.valueOf(ACT_CHANGE_XIEN).indexOf(currentAction)]);
            		lineLog.append("\n");

            		tmpStm.changeXien(String.valueOf(ACT_CHANGE_XIEN).indexOf(currentAction));

            	} else if (String.valueOf(ACT_ALLOC_STATUS).indexOf(currentAction) >= 0) {
            		// �X�e�U��
        			int statusIndex = String.valueOf(ACT_ALLOC_STATUS).indexOf(currentAction);

        			if (index > 0 && String.valueOf(ACT_ALLOC_STATUS).indexOf(log.charAt(index - 1)) >= 0) {
        				tmpStm.statusUp(statusIndex);
                		currentBuf.append(currentAction);

        			} else {

        				while (index < log.length() && log.charAt(index) == currentAction) {

            				tmpStm.statusUp(statusIndex);
                    		currentBuf.append(currentAction);
            				index++;
            			}
            			if (index < log.length()
            			    && String.valueOf(ACT_ALLOC_STATUS).indexOf(log.charAt(index)) < 0
            			    && tmpStm.getStatusPoint() < tmpStm.getNeedPoints()[statusIndex]) {

                   		    gokuburiStatus = statusIndex;
            			}
            			index--;
        			}

            	} else if (currentAction == ACT_STATUS) {
            		statusLineLog.append("Status       : ");

            		StringBuffer statusBuf = new StringBuffer();
            		lv = 0;
            		index++;
                	while(index < log.length()
                            && log.charAt(index) >= '0'
                            && log.charAt(index) <= '9') {

                		statusBuf.append(log.charAt(index) - '0');
                        index++;
                	}
                	lv = Integer.parseInt(statusBuf.toString());
                	tmpStm.setLevel(lv);

                	//currentLv = lv;
                	startLv = currentLv;
                	statusLineLog.append(lv);
                	int statusBufIndex = 1;
                	while(index + 1 < log.length()
                            && log.charAt(index) == ',') {

                		statusLineLog.append(", ");
                        index++;
                        statusBuf.setLength(0);

                		while(index < log.length()
                                && log.charAt(index) >= '0'
                                && log.charAt(index) <= '9') {

                			 statusLineLog.append((log.charAt(index) - '0'));
                       		 statusBuf.append(log.charAt(index) - '0');
                             index++;
                        }
                		if (statusBufIndex < STATUS_NAME.length + 1) {
                    		tmpStm.setStatus(statusBufIndex - 1, Integer.parseInt(statusBuf.toString()));

                		} else if (statusBufIndex < STATUS_NAME.length + 2) {
                    		tmpStm.setStatusPoint(Integer.parseInt(statusBuf.toString()));

                		} else {
                    		tmpStm.setXien(statusBufIndex - 2 - STATUS_NAME.length, Integer.parseInt(statusBuf.toString()));
                		}
                    	statusBufIndex++;
                    }
                	statusLineLog.append("\n");
                	break;
            	}
            	index++;
            }


            if (gokuburiStatus < 0 && gokuburiPastStatus >= 0
                && tmpStm.getStatusPoint() < tmpStm.getNeedPoints()[gokuburiPastStatus]
                && log.length() > 1 && log.charAt(index -1) == ACT_LVUP) {

            	gokuburiStatus = gokuburiPastStatus;
            }
            if (gokuburiPastStatus == -1 && gokuburiStatus >= 0 && lineLog.length() > 0) {
            	gokuburiPastStatus = gokuburiStatus;
            }
            if (gokuburiStatus >= 0 && tmpStm.getStatusPoint() < tmpStm.getNeedPoints()[gokuburiStatus]) {

            	if (gokuburiStart == 0) {
            		gokuburiStart = currentLv;
            	}
            }
            if (gokuburiPastStatus != -1
            	&& ((gokuburiPastStatus != gokuburiStatus) || ((lineLog.length() > 0 || statusLineLog.length() > 0 ) && gokuburiStatus >= 0))) {

            	if ( startLv != gokuburiStart) {
                	logBuf.append(logLine(startLv, gokuburiStart - 1, pattern));
            	}

            	int endLv = currentLv - 1;
            	if (lineLog.length() > 0 && gokuburiStatus != -1 && gokuburiStatus == gokuburiPastStatus) {
                	endLv = currentLv;
            	}
            	logBuf.append("LV ");
                if(gokuburiStart < 100) {
                    logBuf.append(" ");
                }
                if(gokuburiStart < 10) {
                    logBuf.append(" ");
                }
                logBuf.append(gokuburiStart);

                if(gokuburiStart < endLv) {

                    logBuf.append(" - ");

                    if(endLv < 100) {
                        logBuf.append(" ");
                    }
                    if(endLv < 10) {
                        logBuf.append(" ");
                    }
                    logBuf.append(endLv);
                } else {
                    logBuf.append("      ");
                }
                logBuf.append(" : ");

                logBuf.append(STATUS_NAME[gokuburiPastStatus]);
                logBuf.append(" �ɐU�� ");
                logBuf.append(getTotalAlloc(gokuburiStart, endLv, ACT_ALLOC_STATUS[gokuburiPastStatus]));
                logBuf.append("up\n");

                startLv = endLv + 1;
                if (gokuburiStatus < 0 ) {
                    gokuburiStart = 0;

                } else {
                	gokuburiStart = startLv;
                }

            } else 	if (gokuburiStart != startLv && !bonusXienFlag
            		&& (currentBuf.length() != pattern.length() || !currentBuf.toString().equals(pattern))) {

            	if (gokuburiStart > 0 && gokuburiStart <= currentLv - 1) {
                	logBuf.append(logLine(startLv, gokuburiStart - 1, pattern));
                    startLv = gokuburiStart;

            	} else {
                	logBuf.append(logLine(startLv, currentLv - 1, pattern));
                    startLv = currentLv;
            	}

            }
            if ( lineLog.length() > 0 ) {

            	if (gokuburiStatus != -1 && gokuburiPastStatus != gokuburiStatus) {

            		int endLv = currentLv;

            		logBuf.append("LV ");
                    if(gokuburiStart < 100) {
                        logBuf.append(" ");
                    }
                    if(gokuburiStart < 10) {
                        logBuf.append(" ");
                    }
                    logBuf.append(gokuburiStart);

                    if(gokuburiStart < endLv) {

                        logBuf.append(" - ");

                        if(endLv < 100) {
                            logBuf.append(" ");
                        }
                        if(endLv < 10) {
                            logBuf.append(" ");
                        }
                        logBuf.append(endLv);
                    } else {
                        logBuf.append("      ");
                    }
                    logBuf.append(" : ");

                    logBuf.append(STATUS_NAME[gokuburiStatus]);
                    logBuf.append(" �ɐU�� ");
                    logBuf.append(getTotalAlloc(gokuburiStart, endLv, ACT_ALLOC_STATUS[gokuburiStatus]));
                    logBuf.append("up\n");


            	} else if (!logBuf.toString().endsWith("up\n") || gokuburiStart != currentLv + 1 || gokuburiPastStatus == -1) {
                	logBuf.append(logLine(startLv, currentLv, currentBuf.toString()));
            	}
            	gokuburiPastStatus = -1;
            	gokuburiStatus = -1;
            	gokuburiStart = 0;
        		logBuf.append(lineLog);

        		lineLog.setLength(0);
                startLv = currentLv + 1;
                currentBuf.setLength(0);
                bonusXienFlag = true;

            } else {
            	bonusXienFlag = false;
            }
        	gokuburiPastStatus = gokuburiStatus;
            if ( statusLineLog.length() > 0 ) {

            	if (gokuburiStatus != -1 ) {

            		int endLv = currentLv;

            		logBuf.append("LV ");
                    if(gokuburiStart < 100) {
                        logBuf.append(" ");
                    }
                    if(gokuburiStart < 10) {
                        logBuf.append(" ");
                    }
                    logBuf.append(gokuburiStart);

                    if(gokuburiStart < endLv) {

                        logBuf.append(" - ");

                        if(endLv < 100) {
                            logBuf.append(" ");
                        }
                        if(endLv < 10) {
                            logBuf.append(" ");
                        }
                        logBuf.append(endLv);
                    } else {
                        logBuf.append("      ");
                    }
                    logBuf.append(" : ");

                    logBuf.append(STATUS_NAME[gokuburiPastStatus]);
                    logBuf.append(" �ɐU�� ");
                    logBuf.append(getTotalAlloc(gokuburiStart, endLv, ACT_ALLOC_STATUS[gokuburiPastStatus]));
                    logBuf.append("up\n");


            	} else if (!logBuf.toString().endsWith("up\n") || gokuburiStart != currentLv + 1 || gokuburiPastStatus == -1) {
                	logBuf.append(logLine(startLv, currentLv, currentBuf.toString()));
            	}
            	gokuburiPastStatus = -1;
            	gokuburiStatus = -1;
                if (statusPoint > 0 ) {
                    gokuburiStart = 0;

                } else {
                	gokuburiStart = lv;
                }
            	logBuf.append(statusLineLog);
                pattern  = "";
            	lineLog.setLength(0);
            	bonusXienFlag = true;

            	startLv = lv;
            	currentLv = lv;
                currentBuf.setLength(0);
            	statusLineLog.setLength(0);

            } else {
                pattern = currentBuf.toString();
                gokuburiStatus = -1;

                tmpStm.levelUp();
                currentLv++;
              	currentBuf.setLength(0);

                index++;
            }
        }
        if (gokuburiStart > 0 && gokuburiPastStatus != -1) {

        	if ( startLv != gokuburiStart) {
            	logBuf.append(logLine(startLv, gokuburiStart - 1, pattern));
        	}

        	int endLv = currentLv - 1;
        	logBuf.append("LV ");
            if(gokuburiStart < 100) {
                logBuf.append(" ");
            }
            if(gokuburiStart < 10) {
                logBuf.append(" ");
            }
            logBuf.append(gokuburiStart);

            if(gokuburiStart < endLv) {

                logBuf.append(" - ");

                if(endLv < 100) {
                    logBuf.append(" ");
                }
                if(endLv < 10) {
                    logBuf.append(" ");
                }
                logBuf.append(endLv);
            } else {
                logBuf.append("      ");
            }
            logBuf.append(" : ");

            logBuf.append(STATUS_NAME[gokuburiPastStatus]);
            logBuf.append(" �ɐU�� ");
            logBuf.append(getTotalAlloc(gokuburiStart, endLv, ACT_ALLOC_STATUS[gokuburiPastStatus]));
            logBuf.append("up\n");

            gokuburiStart = 0;
            startLv = currentLv;

        } else if (pattern.length() == 0 && log.length() > 0 && (index - 1 < log.length()) && (log.charAt(index - 1) == ACT_LVUP)) {
            logBuf.append(logLine(startLv, currentLv, pattern));

        } else {
            logBuf.append(logLine(startLv, currentLv - 1, pattern));
        }
        if (pattern.length() > 0 && index - 1 < log.length() && log.charAt(index - 1) == ACT_LVUP) {
            logBuf.append(logLine(currentLv, currentLv, ""));
        }
        if (log.length() > 0 && log.charAt(log.length() - 1) != ACT_LVUP && currentAction != ACT_STATUS) {
        	currentLv--;
        }

        logBuf.append("\n");

        return logBuf.toString();
    }

    /**
     * �X�e�U��̃��O��s�o��
     *
     * @param startLv �J�nLV
     * @param endLv �I��LV
     * @param pattern �X�e�U��p�^�[��
     * @return �X�e�U��̃��O��s
     */
    private String logLine(int startLv, int endLv, String pattern) {

        StringBuffer logBuf = new StringBuffer();

        logBuf.append("LV ");
        if(startLv < 100) {
            logBuf.append(" ");
        }
        if(startLv < 10) {
            logBuf.append(" ");
        }
        logBuf.append(startLv);

        if(startLv < endLv) {

            logBuf.append(" - ");

            if(endLv < 100) {
                logBuf.append(" ");
            }
            if(endLv < 10) {
                logBuf.append(" ");
            }
            logBuf.append(endLv);
        } else {
            logBuf.append("      ");
        }
        logBuf.append(" :");

        int magnif = 1;
        for(int i = 0; i < pattern.length(); i++) {
        	if (i + 1 < pattern.length() && pattern.charAt(i) == pattern.charAt(i + 1)) {
        		magnif++;
        		continue;
        	}

        	int statusIndex = String.valueOf(ACT_ALLOC_STATUS).indexOf(pattern.charAt(i));
        	if (statusIndex >= 0) {
            	logBuf.append(" ");
            	logBuf.append(STATUS_NAME[statusIndex]);
        	}
            if(magnif > 1) {
            	logBuf.append(" * ");
            	logBuf.append(magnif);
            }
            magnif = 1;
            if(i + 1 < pattern.length()) {
                logBuf.append(",");
            }
        }
        logBuf.append("\n");

        return logBuf.toString();
    }

    public int getTotalAlloc(int startLv, int endLv, char statusChar) {

    	int index = 0;
    	for(int i = 1; i < startLv; i++) {
    		if(index < allocationBuffer.length() && allocationBuffer.toString().indexOf(String.valueOf(ACT_LVUP), index)  >= 0) {
    			index = allocationBuffer.toString().indexOf(String.valueOf(ACT_LVUP), index) + 1;
    		}
    	}
    	int alloc = 0;
    	while(index < allocationBuffer.length() && startLv <= endLv) {
    		if(allocationBuffer.charAt(index) == statusChar) {
    			alloc++;
    		}
    		if(allocationBuffer.charAt(index) == ACT_LVUP) {
    			startLv++;
    		}
    		index++;
    	}

    	return alloc;
    }

    public void playLog(String log) {

    	StringBuffer buf = new StringBuffer();

    	for(int i = 0; i < log.length(); i++) {

    		switch (log.charAt(i)) {
			case ACT_LVUP:
				levelUp();
				break;

			case ACT_STAB:
				statusUp(0);
				break;

			case ACT_HACK:
				statusUp(1);
				break;

			case ACT_INT:
				statusUp(2);
				break;

			case ACT_DEF:
				statusUp(3);
				break;

			case ACT_MR:
				statusUp(4);
				break;

			case ACT_DEX:
				statusUp(5);
				break;

			case ACT_AGI:
				statusUp(6);
				break;

			case ACT_NONE:
				changeXien(0);
				break;

			case ACT_FIRE:
				changeXien(1);
				break;

			case ACT_ICE:
				changeXien(2);
				break;

			case ACT_WIND:
				changeXien(3);
				break;

			case ACT_EARTH:
				changeXien(4);
				break;

			case ACT_LIGHTNING:
				changeXien(5);
				break;

			case ACT_WHITE:
				changeXien(6);
				break;

			case ACT_BLACK:
				changeXien(7);
				break;

			case ACT_COMMON:
				changeXien(8);
				break;

			case ACT_SWORD:
				changeXien(9);
				break;

			case ACT_KATANA:
				changeXien(10);
				break;

			case ACT_SPEAR:
				changeXien(11);
				break;

			case ACT_WHIP:
				changeXien(12);
				break;

			case ACT_SMASH:
				changeXien(13);
				break;

			case ACT_STLENGTH:
				changeXien(14);
				break;

			case ACT_ENCHANT:
				changeXien(15);
				break;

			case ACT_RELEASE:
				changeXien(16);
				break;

			case ACT_FIRE2:
				changeXien(17);
				break;

			case ACT_ICE2:
				changeXien(18);
				break;

			case ACT_LIGHTNING2:
				changeXien(19);
				break;

			case ACT_LANZIEE_1:
				changeXien(20);
				break;

			case ACT_LANZIEE_2:
				changeXien(21);
				break;

			case ACT_LANZIEE_3:
				changeXien(22);
				break;

			case ACT_ISSAC_1:
				changeXien(23);
				break;

			case ACT_ISSAC_2:
				changeXien(24);
				break;

			case ACT_ISSAC_3:
				changeXien(25);
				break;

			case ACT_ANAIS_1:
				changeXien(26);
				break;

			case ACT_ANAIS_2:
				changeXien(27);
				break;

			case ACT_ANAIS_3:
				changeXien(28);
				break;

			case ACT_BONUS:
				buf.setLength(0);
				i++;
				while (i < log.length() && log.charAt(i) >= '0' && log.charAt(i) <= '9') {
					buf.append(log.charAt(i) - '0');
					i++;
				}
				i--;
				try {
					changeBonusExpected(Integer.parseInt(buf.toString()));
				}catch (NumberFormatException nfe) {
				}
				break;

			case ACT_STATUS:
				buf.setLength(0);
				int index = 0;
				int[] values = new int[27];
				i++;
				try {
					while (i < log.length() && index < values.length
							&& ((log.charAt(i) >= '0' && log.charAt(i) <= '9') || log.charAt(i) == ',')) {

						if (log.charAt(i) == ',') {
							values[index] = Integer.parseInt(buf.toString());
							buf.setLength(0);
							i++;
							index++;
							continue;
						}

						buf.append(log.charAt(i) - '0');
						i++;
					}
				}catch (NumberFormatException nfe) {
				}
				changeStatus(values);
				logStatus(values);
				i--;
				break;

			default:
				break;
			}
    	}
    }

    /**
     * �߂�
     */
    public boolean reverse() {

        if(reversingFlag || allocationBuffer.length() < 5) {
            return reversingFlag;
        }
        reversingFlag = true;

        int lastIndex = allocationBuffer.length() - 1;
        reverseBuffer.insert(0, allocationBuffer.charAt(lastIndex));
        allocationBuffer
            = new StringBuffer(allocationBuffer.toString().substring(0, lastIndex));

        if(reverseBuffer.charAt(0) == ACT_LVUP) {
            lastIndex--;

            if(lastIndex >= 0
                && allocationBuffer.charAt(lastIndex) >= 'a') {

                reverseBuffer.insert(0, allocationBuffer.charAt(lastIndex));
                allocationBuffer
                     = new StringBuffer(allocationBuffer.toString().substring(0, lastIndex));

                lastIndex--;
            }
            StringBuffer bonusBuf = new StringBuffer();
            while (lastIndex >= 0
            		&& allocationBuffer.charAt(lastIndex) >= '0'
            	    && allocationBuffer.charAt(lastIndex) <= '9') {

            	bonusBuf.insert(0, allocationBuffer.charAt(lastIndex));
                allocationBuffer
                    = new StringBuffer(allocationBuffer.toString().substring(0, lastIndex));

                lastIndex--;
            }

            if(lastIndex >= 0 && allocationBuffer.charAt(lastIndex) == ACT_BONUS) {

                reverseBuffer.insert(0,bonusBuf);
                reverseBuffer.insert(0,ACT_BONUS);
                allocationBuffer
                    = new StringBuffer(allocationBuffer.toString().substring(0, lastIndex));
            } else {
            	allocationBuffer.append(bonusBuf);
            }
        }
        if (reverseBuffer.charAt(0) >= '0' && reverseBuffer.charAt(0) <= '9') {
        	lastIndex--;

        	while (reverseBuffer.charAt(0) != ACT_STATUS) {
                reverseBuffer.insert(0, allocationBuffer.charAt(lastIndex));
                allocationBuffer
                    = new StringBuffer(allocationBuffer.toString().substring(0, lastIndex));

                lastIndex--;
        	}
        }
        StringBuffer tmpBuf = reverseBuffer;
        String tmpLog = allocationBuffer.toString();
    	init();
        playLog(tmpLog);
        allocationBuffer = new StringBuffer(tmpLog);
        reverseBuffer = tmpBuf;

        reversingFlag = false;
        return reversingFlag;
    }

    /**
     * �i��
     */
    public void progress() {

        if(reverseBuffer.length() < 1) {
            return;
        }
        StringBuffer buf = new StringBuffer();
        if(reverseBuffer.length() > 0 && reverseBuffer.charAt(0) == ACT_STATUS) {

            buf.append(ACT_STATUS);
            reverseBuffer = new StringBuffer(reverseBuffer.toString().substring(1));

            while(reverseBuffer.length() > 0
                  && ((reverseBuffer.charAt(0) >= '0'
                  && reverseBuffer.charAt(0) <= '9') || reverseBuffer.charAt(0) == ',')) {


                buf.append(reverseBuffer.charAt(0));
                reverseBuffer = new StringBuffer(reverseBuffer.toString().substring(1));
            }

            StringBuffer tmpBuf = reverseBuffer;
            playLog(buf.toString());
            reverseBuffer = tmpBuf;
            return;
        }
        if(reverseBuffer.charAt(0) == ACT_BONUS) {

        	buf.append(ACT_BONUS);
            reverseBuffer = new StringBuffer(reverseBuffer.toString().substring(1));

            while(reverseBuffer.length() > 0
                  && reverseBuffer.charAt(0) >= '0'
                  && reverseBuffer.charAt(0) <= '9') {

                buf.append(reverseBuffer.charAt(0));
                reverseBuffer = new StringBuffer(reverseBuffer.toString().substring(1));
            }
        }
        if (reverseBuffer.charAt(0) >= 'a') {

            buf.append(reverseBuffer.charAt(0));
            reverseBuffer = new StringBuffer(reverseBuffer.toString().substring(1));
        }

        buf.append(reverseBuffer.charAt(0));
        reverseBuffer = new StringBuffer(reverseBuffer.toString().substring(1));

        StringBuffer tmpBuf = reverseBuffer;
        playLog(buf.toString());
        reverseBuffer = tmpBuf;
    }

    /**
     * �{�[�i�X�����m����ݒ�
     *
     * @param expected �{�[�i�X�����m��
     */
    public void changeBonusExpected(int expected) {

        reverseBuffer = new StringBuffer();

        if (expected != bonusExpected) {
            String bonus = String.valueOf(expected);
            tmpBonusChoiceBuffer = new StringBuffer();
            tmpBonusChoiceBuffer.append(ACT_BONUS);
            for(int i = 0; i < bonus.length(); i++) {
                tmpBonusChoiceBuffer.append(bonus.charAt(i));
            }
        }
        bonusExpected = expected;
        bonusPoints = (int)((level - 1) * expected / 100);
    }

    public String getBonusExpected() {
        return String.valueOf(bonusExpected) + "%";
    }

    public int getBonusExpectedIntValue() {
    	return bonusExpected;
    }

    /**
     * ���݂̃X�e�㏸�K�v�|�C���g���擾
     *
     * @return �X�e�㏸�K�v�|�C���g(�z��)
     */
    public int[] getNeedPoints() {
        int[] currentNeedPoints = new int[_character.getDefaultNeedPoints().length];

        for ( int i = 0; i < currentNeedPoints.length; i++) {
            currentNeedPoints[i] = _character.getDefaultNeedPoints()[i] + (int)((level + status[i] * 5) / 125);
        }

        return currentNeedPoints;
    }

    public void logStatus(int[] values) {

        if(tmpXienChangeBuffer != ' ' && level > 1) {
            tmpXienChangeBuffer = ' ';
        }
        if(tmpBonusChoiceBuffer.length() > 0 && level > 1) {
        	tmpBonusChoiceBuffer.setLength(0);
        }
    	log(ACT_STATUS);
    	for (int i = 0; i < values.length; i++) {
    		String digit = String.valueOf(values[i]);
    		for (int l = 0; l < digit.length(); l++) {
    			log(digit.charAt(l));
    		}
    		if (i + 1 < values.length) {
    			log(',');
    		}
    	}
    }

    public void changeStatus(int[] values) {
    	try {
    		level = values[0];

    		for (int i = 0; i < STATUS_NAME.length; i++) {
    			status[i] = values[i + 1];
    		}

    		statusPoint = values[1 + STATUS_NAME.length];

    		for (int i = 0; i < 7; i++) {
    			tmpXien[i] = values[i + 2 + STATUS_NAME.length];
    			xien[i] = values[i + 2 + STATUS_NAME.length];
    		}
    	} catch (ArrayIndexOutOfBoundsException aioobe) {
    	}
    }

    public int[] getStatus() {
        return status;
    }

    public void setStatus(int index, int value) {
    	if (value > MAX_STATUS[index]) {
    		value = MAX_STATUS[index];
    	}
    	if (value < 0){
    		value = 0;
    	}
    	status[index] = value;
    }

    public boolean isEnableStatusUp(int index) {

    	if ( statusPoint < getNeedPoints()[index] || status[index] >= MAX_STATUS[index]) {
            return false;
        }
        return true;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int value) {
    	if (value > MAX_LEVEL) {
    		value = MAX_LEVEL;
    	}
    	if (value < 1){
    		value = 1;
    	}
    	level = value;
    }

    public int getStatusPoint() {
        return statusPoint;
    }

    public void setStatusPoint(int value) {
    	if (value > 9999) {
    		value = 9999;
    	}

    	if (value < 0){
    		value = 0;
    	}
    	statusPoint = value;
    }

    public int getTotalBonusPoint() {
        return totalBonusPoints;
    }

    public int getTotalLevelUp() {
    	return totalLevelUp;
    }

    public int getXienIndex() {
        int currentXien = 0;
        for(int i = 1; i < xien.length; i++) {

            if ( xien[i] >= xien[currentXien] ) {
                currentXien = i;
            }
        }
        return currentXien;
    }

    public String getXienName() {
        return XIEN_NAME[getXienIndex()];
    }

    public int[] getXien() {
        return tmpXien;
    }

    public void setXien(int index, int value) {
    	if (value > 99) {
    		value = 99;
    	}
    	if (value < 0){
    		value = 0;
    	}
    	tmpXien[index] = value;
    	xien[index] = value;
    	tmpXienChangeBuffer = ACTIONS[9 + getXienIndex()];
    }

    public void init() {

        level = 1;

        for ( int i = 0; i < status.length; i++ ) {
            status[i] = _character.getDefaultStatus()[i];
        }
        statusPoint = 0;

        for(int i = 0; i < xien.length; i++) {
            xien[i] = _character.getDefaultXien()[i];
            tmpXien[i] = _character.getDefaultXien()[i];
        }

        for(int i = 0; i < needPoints.length; i++) {
            needPoints[i] = _character.getDefaultNeedPoints()[i];
        }

        bonusPoints = 0;
        totalBonusPoints = 0;
        totalLevelUp = 0;

        tmpXienChangeBuffer = ACTIONS[9 + getXienIndex()];

        tmpBonusChoiceBuffer = new StringBuffer();
        tmpBonusChoiceBuffer.append(ACT_BONUS);
        String bonus = String.valueOf((int)bonusExpected);
        for(int i = 0; i < bonus.length(); i++) {
            tmpBonusChoiceBuffer.append(bonus.charAt(i));
        }

        allocationBuffer = new StringBuffer();
        reverseBuffer = new StringBuffer();
    }
}