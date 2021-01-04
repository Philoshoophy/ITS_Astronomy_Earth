/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class Main_View extends javax.swing.JFrame {

    public Main_View() {
        initComponents();
        attachment(WELCOME);
        TypeNameChecker();
//        attachment(TeachingStrat);
//        PostTest_Button.setVisible(false);
//        PostTest_Button.setEnabled(false);
    }

    int planet_indicator = 0;
    String planet = "EARTH";
    int planet_indicator_slider = 0;
    int xMouse;
    int yMouse;
    int score = 0;

    private static String fName = "";
    private static String lName = "";
    private static int age = 0;
    private static String gender = "";

    int pos = 0;
    private static int milliseconds = 0;
    static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;
    static boolean state = true;
    int reminder = 0;

    int earthScore = 0;
    int moonScore = 0;
    int sunScore = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WELCOME = new javax.swing.JFrame();
        LastName = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        Fname_On = new javax.swing.JLabel();
        Fname_Off = new javax.swing.JLabel();
        Lname_On = new javax.swing.JLabel();
        Lname_Off = new javax.swing.JLabel();
        Welcome_Close = new javax.swing.JButton();
        Welcome_Minus = new javax.swing.JButton();
        Welcome_Plus = new javax.swing.JButton();
        Student_Age = new javax.swing.JLabel();
        Age_Input = new javax.swing.JLabel();
        Welcome_Light = new javax.swing.JLabel();
        Welcome_Left = new javax.swing.JButton();
        Welcome_Right = new javax.swing.JButton();
        Welcome_Light_Gender = new javax.swing.JLabel();
        Gender_Var = new javax.swing.JLabel();
        WelcomeLayout = new javax.swing.JLabel();
        WELCOME_TWO = new javax.swing.JFrame();
        Take_Your_Quiz_Button = new javax.swing.JButton();
        Welcome_Close1 = new javax.swing.JButton();
        WelcomeLayout1 = new javax.swing.JLabel();
        TeachingStrat = new javax.swing.JFrame();
        TEXT_SIZE = new javax.swing.JLabel();
        TEXT_DFTE = new javax.swing.JLabel();
        TEXT_ROIA = new javax.swing.JLabel();
        TEXT_TEMP = new javax.swing.JLabel();
        BUTTON_SEE_PICTURE = new javax.swing.JButton();
        BUTTON_PLAY_VIDEO = new javax.swing.JButton();
        BUTTON_SIZE_ON = new javax.swing.JButton();
        BUTTON_SIZE_OFF = new javax.swing.JButton();
        BUTTON_DFTE_ON = new javax.swing.JButton();
        BUTTON_DFTE_OFF = new javax.swing.JButton();
        BUTTON_ROIA_ON = new javax.swing.JButton();
        BUTTON_ROIA_OFF = new javax.swing.JButton();
        ARROW_OK = new javax.swing.JButton();
        ARROW_LEFT = new javax.swing.JButton();
        ARROW_UP = new javax.swing.JButton();
        ARROW_RIGHT = new javax.swing.JButton();
        ARROW_DOWN = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        BUTTON_TEMP_ON = new javax.swing.JButton();
        BUTTON_TEMP_OFF = new javax.swing.JButton();
        GLOW_ORANGE = new javax.swing.JLabel();
        GLOW_GREEN = new javax.swing.JLabel();
        GLOW_WHITE = new javax.swing.JLabel();
        MAIN_PANEL_PLANET = new javax.swing.JLabel();
        TEXT_SURFACE = new javax.swing.JLabel();
        SpaceShipButton = new javax.swing.JButton();
        ConversationalLearning_Button = new javax.swing.JButton();
        PostTest_Button = new javax.swing.JButton();
        MAIN_LAYOUT = new javax.swing.JLabel();
        Gallery = new javax.swing.JFrame();
        Gallery_Right_Button = new javax.swing.JButton();
        Gallery_Close_Button = new javax.swing.JButton();
        Gallery_Left_Button = new javax.swing.JButton();
        Gallery_Picture = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        First_Quiz_Frame = new javax.swing.JFrame();
        FirstButton = new javax.swing.JButton();
        SecondButton = new javax.swing.JButton();
        ThirdButton = new javax.swing.JButton();
        FourthButton = new javax.swing.JButton();
        FirstQuizCloseButton = new javax.swing.JButton();
        FirstQuizButton_HINT = new javax.swing.JButton();
        QuestionLayout = new javax.swing.JLabel();
        Second_Quiz_Frame = new javax.swing.JFrame();
        Second_FirstButton = new javax.swing.JButton();
        Second_SecondButton = new javax.swing.JButton();
        Second_ThirdButton = new javax.swing.JButton();
        Second_FourthButton = new javax.swing.JButton();
        FirstQuizCloseButton1 = new javax.swing.JButton();
        SecondQuizButton_HINT = new javax.swing.JButton();
        QuestionLayout1 = new javax.swing.JLabel();
        Third_Quiz_Frame = new javax.swing.JFrame();
        Third_FirstButton = new javax.swing.JButton();
        Third_SecondButton = new javax.swing.JButton();
        Third_ThirdButton = new javax.swing.JButton();
        Third_FourthButton = new javax.swing.JButton();
        FirstQuizCloseButton2 = new javax.swing.JButton();
        ThirdQuizButton_HINT = new javax.swing.JButton();
        QuestionLayout2 = new javax.swing.JLabel();
        Fourth_Quiz_Frame = new javax.swing.JFrame();
        Fourth_FirstButton = new javax.swing.JButton();
        Fourth_SecondButton = new javax.swing.JButton();
        Fourth_ThirdButton = new javax.swing.JButton();
        Fourth_FourthButton = new javax.swing.JButton();
        FirstQuizCloseButton3 = new javax.swing.JButton();
        FourthQuizButton_HINT = new javax.swing.JButton();
        QuestionLayout3 = new javax.swing.JLabel();
        Fifth_Quiz_Frame = new javax.swing.JFrame();
        Fifth_FirstButton = new javax.swing.JButton();
        Fifth_SecondButton = new javax.swing.JButton();
        Fifth_ThirdButton = new javax.swing.JButton();
        Fifth_FourthButton = new javax.swing.JButton();
        FirstQuizCloseButton4 = new javax.swing.JButton();
        FifthQuizButton_HINT = new javax.swing.JButton();
        QuestionLayout4 = new javax.swing.JLabel();
        Sixth_Quiz_Frame = new javax.swing.JFrame();
        Sixth_FirstButton = new javax.swing.JButton();
        Sixth_SecondButton = new javax.swing.JButton();
        Sixth_ThirdButton = new javax.swing.JButton();
        Sixth_FourthButton = new javax.swing.JButton();
        FirstQuizCloseButton5 = new javax.swing.JButton();
        SixthQuizButton_HINT = new javax.swing.JButton();
        QuestionLayout5 = new javax.swing.JLabel();
        Seventh_Quiz_Frame = new javax.swing.JFrame();
        Seventh_FirstButton = new javax.swing.JButton();
        Seventh_SecondButton = new javax.swing.JButton();
        Seventh_ThirdButton = new javax.swing.JButton();
        Seventh_FourthButton = new javax.swing.JButton();
        FirstQuizCloseButton6 = new javax.swing.JButton();
        SeventhQuizButton_HINT = new javax.swing.JButton();
        QuestionLayout6 = new javax.swing.JLabel();
        Eigth_Quiz_Frame = new javax.swing.JFrame();
        Eigth_FirstButton = new javax.swing.JButton();
        Eigth_SecondButton = new javax.swing.JButton();
        Eigth_ThirdButton = new javax.swing.JButton();
        Eigth_FourthButton = new javax.swing.JButton();
        FirstQuizCloseButton7 = new javax.swing.JButton();
        EigthQuizButton_HINT = new javax.swing.JButton();
        QuestionLayout7 = new javax.swing.JLabel();
        Ninth_Quiz_Frame = new javax.swing.JFrame();
        Ninth_FirstButton = new javax.swing.JButton();
        Ninth_SecondButton = new javax.swing.JButton();
        Ninth_ThirdButton = new javax.swing.JButton();
        Ninth_FourthButton = new javax.swing.JButton();
        FirstQuizCloseButton8 = new javax.swing.JButton();
        NinthQuizButton_HINT = new javax.swing.JButton();
        QuestionLayout8 = new javax.swing.JLabel();
        Tenth_Quiz_Frame = new javax.swing.JFrame();
        Tenth_FirstButton = new javax.swing.JButton();
        Tenth_SecondButton = new javax.swing.JButton();
        Tenth_ThirdButton = new javax.swing.JButton();
        Tenth_FourthButton = new javax.swing.JButton();
        FirstQuizCloseButton9 = new javax.swing.JButton();
        TenthQuizButton_HINT = new javax.swing.JButton();
        QuestionLayout9 = new javax.swing.JLabel();
        Eleventh_Quiz_Frame = new javax.swing.JFrame();
        Eleventh_FirstButton = new javax.swing.JButton();
        Eleventh_SecondButton = new javax.swing.JButton();
        Eleventh_ThirdButton = new javax.swing.JButton();
        Eleventh_FourthButton = new javax.swing.JButton();
        FirstQuizCloseButton10 = new javax.swing.JButton();
        EleventhQuizButton_HINT = new javax.swing.JButton();
        QuestionLayout10 = new javax.swing.JLabel();
        Twelve_Quiz_Frame = new javax.swing.JFrame();
        Twelve_FirstButton = new javax.swing.JButton();
        Twelve_SecondButton = new javax.swing.JButton();
        Twelve_ThirdButton = new javax.swing.JButton();
        Twelve_FourthButton = new javax.swing.JButton();
        FirstQuizCloseButton11 = new javax.swing.JButton();
        TwelveQuizButton_HINT = new javax.swing.JButton();
        QuestionLayout11 = new javax.swing.JLabel();
        QUIZ_HINT = new javax.swing.JFrame();
        HINT_OKAY_BUTTON = new javax.swing.JButton();
        HINT_PANEL = new javax.swing.JLabel();
        hint_layout = new javax.swing.JLabel();
        EARTH_SIZE_INFORMATION = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        EARTH_DFTE_INFORMATION = new javax.swing.JFrame();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        EARTH_ROIA_INFORMATION = new javax.swing.JFrame();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        EARTH_TEMP_INFORMATION = new javax.swing.JFrame();
        jButton13 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        MOON_SIZE_INFORMATION = new javax.swing.JFrame();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        MOON_DFTE_INFORMATION = new javax.swing.JFrame();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        MOON_ROIA_INFORMATION = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        MOON_TEMP_INFORMATION = new javax.swing.JFrame();
        jButton14 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        SUN_SIZE_INFORMATION = new javax.swing.JFrame();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SUN_DFTE_INFORMATION = new javax.swing.JFrame();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        SUN_ROIA_INFORMATION = new javax.swing.JFrame();
        jButton10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        SUN_TEMP_INFORMATION = new javax.swing.JFrame();
        jButton15 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Screen_View_Earth = new javax.swing.JFrame();
        jButton2 = new javax.swing.JButton();
        FORESTS = new javax.swing.JLabel();
        LAKE = new javax.swing.JLabel();
        MOUNTAINS = new javax.swing.JLabel();
        PLAINS = new javax.swing.JLabel();
        ISLANDS = new javax.swing.JLabel();
        OCEAN = new javax.swing.JLabel();
        Main_Earth = new javax.swing.JLabel();
        Screen_View_Moon = new javax.swing.JFrame();
        jButton11 = new javax.swing.JButton();
        LUNARMARIA = new javax.swing.JLabel();
        CRATERS = new javax.swing.JLabel();
        Main_Moon = new javax.swing.JLabel();
        Screen_View_Sun = new javax.swing.JFrame();
        jButton12 = new javax.swing.JButton();
        CORONA = new javax.swing.JLabel();
        PROMINENCE = new javax.swing.JLabel();
        SPOTS = new javax.swing.JLabel();
        FLARE = new javax.swing.JLabel();
        Main_Sun = new javax.swing.JLabel();
        SpaceShip = new javax.swing.JFrame();
        SpaceShip_Close = new javax.swing.JButton();
        SpaceShip_Earth = new javax.swing.JButton();
        SpaceShip_Moon = new javax.swing.JButton();
        SpaceShip_Sun = new javax.swing.JButton();
        SpaceShipLayout = new javax.swing.JLabel();
        Reminder = new javax.swing.JFrame();
        First_Reminder_Button = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Before_Teaching_Strat = new javax.swing.JFrame();
        B4_proceed_button = new javax.swing.JButton();
        HintUsed_Variable_Display = new javax.swing.JLabel();
        Score_Variable_Display = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Conversational_Learning = new javax.swing.JFrame();
        ConButton_Back = new javax.swing.JButton();
        ConButton_Next = new javax.swing.JButton();
        con_button_sun = new javax.swing.JButton();
        con_button_earth = new javax.swing.JButton();
        con_button_moon = new javax.swing.JButton();
        Con_Layout_Panel = new javax.swing.JLabel();
        Conversational_Learning_Earth = new javax.swing.JFrame();
        ConButton_Back_Earth = new javax.swing.JButton();
        ConButton_Next_Earth = new javax.swing.JButton();
        CLE_Text = new javax.swing.JTextField();
        Conver_proceed_Button = new javax.swing.JButton();
        CLE_Back_To_Main_Button = new javax.swing.JButton();
        Con_Layout_Panel_Earth = new javax.swing.JLabel();
        Conversational_Learning_Moon = new javax.swing.JFrame();
        ConButton_Back_Moon = new javax.swing.JButton();
        ConButton_Next_Moon = new javax.swing.JButton();
        CLM_ComboBox = new javax.swing.JComboBox<>();
        CLM_Text = new javax.swing.JTextField();
        Conver_proceed_Button_Moon = new javax.swing.JButton();
        CLM_Back_To_Main_Button = new javax.swing.JButton();
        Con_Layout_Panel_Moon = new javax.swing.JLabel();
        Conversational_Learning_Sun = new javax.swing.JFrame();
        ConButton_Back_Sun = new javax.swing.JButton();
        ConButton_Next_Sun = new javax.swing.JButton();
        CLS_Text = new javax.swing.JTextField();
        Conver_proceed_Button_Sun = new javax.swing.JButton();
        CLS_Back_To_Main_Button = new javax.swing.JButton();
        Con_Layout_Panel_Sun = new javax.swing.JLabel();
        PostTest_Results = new javax.swing.JFrame();
        GenderVarDisplayer = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        Displayer_Pretest_Hint = new javax.swing.JLabel();
        Displayer_FName = new javax.swing.JLabel();
        Displayer_Age = new javax.swing.JLabel();
        Displayer_Pretest_Score = new javax.swing.JLabel();
        Displayer_Posttest_Score = new javax.swing.JLabel();
        Displayer_Posttest_Hint = new javax.swing.JLabel();
        PostTest_Result_Layout = new javax.swing.JLabel();

        WELCOME.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LastName.setBackground(new java.awt.Color(255, 255, 255));
        LastName.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 55)); // NOI18N
        LastName.setForeground(new java.awt.Color(0, 0, 0));
        LastName.setBorder(null);
        LastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LastNameKeyTyped(evt);
            }
        });
        WELCOME.getContentPane().add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 540, 80));

        FirstName.setBackground(new java.awt.Color(255, 255, 255));
        FirstName.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 55)); // NOI18N
        FirstName.setForeground(new java.awt.Color(0, 0, 0));
        FirstName.setBorder(null);
        FirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FirstNameKeyTyped(evt);
            }
        });
        WELCOME.getContentPane().add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 540, 80));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Proceed Button.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        WELCOME.getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 730, 510, 80));

        Fname_On.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Off.png"))); // NOI18N
        WELCOME.getContentPane().add(Fname_On, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 80, 110));

        Fname_Off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_On.png"))); // NOI18N
        WELCOME.getContentPane().add(Fname_Off, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 80, 110));

        Lname_On.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Off.png"))); // NOI18N
        WELCOME.getContentPane().add(Lname_On, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 80, 110));

        Lname_Off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_On.png"))); // NOI18N
        WELCOME.getContentPane().add(Lname_Off, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 80, 110));

        Welcome_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        Welcome_Close.setBorder(null);
        Welcome_Close.setContentAreaFilled(false);
        Welcome_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Welcome_Close.setFocusPainted(false);
        Welcome_Close.setFocusable(false);
        Welcome_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Welcome_CloseActionPerformed(evt);
            }
        });
        WELCOME.getContentPane().add(Welcome_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, -1));

        Welcome_Minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Minus.png"))); // NOI18N
        Welcome_Minus.setBorder(null);
        Welcome_Minus.setContentAreaFilled(false);
        Welcome_Minus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Welcome_Minus.setFocusPainted(false);
        Welcome_Minus.setFocusable(false);
        Welcome_Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Welcome_MinusActionPerformed(evt);
            }
        });
        WELCOME.getContentPane().add(Welcome_Minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 80, 80));

        Welcome_Plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Plus.png"))); // NOI18N
        Welcome_Plus.setBorder(null);
        Welcome_Plus.setContentAreaFilled(false);
        Welcome_Plus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Welcome_Plus.setFocusPainted(false);
        Welcome_Plus.setFocusable(false);
        Welcome_Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Welcome_PlusActionPerformed(evt);
            }
        });
        WELCOME.getContentPane().add(Welcome_Plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, 80, 80));

        Student_Age.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        Student_Age.setForeground(new java.awt.Color(111, 126, 159));
        Student_Age.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Student_Age.setText("0");
        WELCOME.getContentPane().add(Student_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 130, 70));

        Age_Input.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Age_Input.png"))); // NOI18N
        WELCOME.getContentPane().add(Age_Input, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 210, 90));

        Welcome_Light.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Light_Green.png"))); // NOI18N
        WELCOME.getContentPane().add(Welcome_Light, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 70, 70));

        Welcome_Left.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Arrow_Left.png"))); // NOI18N
        Welcome_Left.setBorder(null);
        Welcome_Left.setContentAreaFilled(false);
        Welcome_Left.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Welcome_Left.setFocusPainted(false);
        Welcome_Left.setFocusable(false);
        Welcome_Left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Welcome_LeftActionPerformed(evt);
            }
        });
        WELCOME.getContentPane().add(Welcome_Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, 80, 80));

        Welcome_Right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Arrow_Right.png"))); // NOI18N
        Welcome_Right.setBorder(null);
        Welcome_Right.setContentAreaFilled(false);
        Welcome_Right.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Welcome_Right.setFocusPainted(false);
        Welcome_Right.setFocusable(false);
        Welcome_Right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Welcome_RightActionPerformed(evt);
            }
        });
        WELCOME.getContentPane().add(Welcome_Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 600, 70, 80));

        Welcome_Light_Gender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Light_Green.png"))); // NOI18N
        WELCOME.getContentPane().add(Welcome_Light_Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 70, 70));

        Gender_Var.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gender_Var.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Boy.png"))); // NOI18N
        WELCOME.getContentPane().add(Gender_Var, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 190, 70));

        WelcomeLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/LayOutWelcom.png"))); // NOI18N
        WELCOME.getContentPane().add(WelcomeLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 860));

        WELCOME_TWO.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Take_Your_Quiz_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/TakeYourQuiz_Button.png"))); // NOI18N
        Take_Your_Quiz_Button.setBorder(null);
        Take_Your_Quiz_Button.setContentAreaFilled(false);
        Take_Your_Quiz_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Take_Your_Quiz_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Take_Your_Quiz_ButtonActionPerformed(evt);
            }
        });
        WELCOME_TWO.getContentPane().add(Take_Your_Quiz_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 730, 510, 80));

        Welcome_Close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        Welcome_Close1.setBorder(null);
        Welcome_Close1.setContentAreaFilled(false);
        Welcome_Close1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Welcome_Close1.setFocusPainted(false);
        Welcome_Close1.setFocusable(false);
        Welcome_Close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Welcome_Close1ActionPerformed(evt);
            }
        });
        WELCOME_TWO.getContentPane().add(Welcome_Close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, -1));

        WelcomeLayout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Two.png"))); // NOI18N
        WELCOME_TWO.getContentPane().add(WelcomeLayout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 860));

        TeachingStrat.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEXT_SIZE.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        TEXT_SIZE.setForeground(new java.awt.Color(8, 87, 91));
        TEXT_SIZE.setText("13,000 KM");
        TEXT_SIZE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TeachingStrat.getContentPane().add(TEXT_SIZE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 270, 80));

        TEXT_DFTE.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        TEXT_DFTE.setForeground(new java.awt.Color(8, 87, 91));
        TEXT_DFTE.setText("N/A");
        TEXT_DFTE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TeachingStrat.getContentPane().add(TEXT_DFTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 280, -1));

        TEXT_ROIA.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        TEXT_ROIA.setForeground(new java.awt.Color(8, 87, 91));
        TEXT_ROIA.setText("24 HOURS");
        TEXT_ROIA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TeachingStrat.getContentPane().add(TEXT_ROIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 850, 280, 80));

        TEXT_TEMP.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        TEXT_TEMP.setForeground(new java.awt.Color(8, 87, 91));
        TEXT_TEMP.setText("14°C");
        TEXT_TEMP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TeachingStrat.getContentPane().add(TEXT_TEMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, 280, 80));

        BUTTON_SEE_PICTURE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/See_Picture_Button.png"))); // NOI18N
        BUTTON_SEE_PICTURE.setBorder(null);
        BUTTON_SEE_PICTURE.setContentAreaFilled(false);
        BUTTON_SEE_PICTURE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUTTON_SEE_PICTURE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_SEE_PICTUREActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(BUTTON_SEE_PICTURE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 240, 60));

        BUTTON_PLAY_VIDEO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Play_Video_Button.png"))); // NOI18N
        BUTTON_PLAY_VIDEO.setBorder(null);
        BUTTON_PLAY_VIDEO.setContentAreaFilled(false);
        BUTTON_PLAY_VIDEO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUTTON_PLAY_VIDEO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_PLAY_VIDEOActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(BUTTON_PLAY_VIDEO, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 210, 60));

        BUTTON_SIZE_ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Size_Rotation_Axis.png"))); // NOI18N
        BUTTON_SIZE_ON.setText("jButton3");
        BUTTON_SIZE_ON.setBorder(null);
        BUTTON_SIZE_ON.setContentAreaFilled(false);
        BUTTON_SIZE_ON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUTTON_SIZE_ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_SIZE_ONActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(BUTTON_SIZE_ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 370, 110));

        BUTTON_SIZE_OFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Size_Rotation_Axis_OFF.png"))); // NOI18N
        BUTTON_SIZE_OFF.setText("jButton3");
        BUTTON_SIZE_OFF.setBorder(null);
        BUTTON_SIZE_OFF.setContentAreaFilled(false);
        BUTTON_SIZE_OFF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUTTON_SIZE_OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_SIZE_OFFActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(BUTTON_SIZE_OFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 370, 110));

        BUTTON_DFTE_ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Size_Rotation_Axis.png"))); // NOI18N
        BUTTON_DFTE_ON.setText("jButton3");
        BUTTON_DFTE_ON.setBorder(null);
        BUTTON_DFTE_ON.setContentAreaFilled(false);
        BUTTON_DFTE_ON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUTTON_DFTE_ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_DFTE_ONActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(BUTTON_DFTE_ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 370, 110));

        BUTTON_DFTE_OFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Size_Rotation_Axis_OFF.png"))); // NOI18N
        BUTTON_DFTE_OFF.setText("jButton3");
        BUTTON_DFTE_OFF.setBorder(null);
        BUTTON_DFTE_OFF.setContentAreaFilled(false);
        BUTTON_DFTE_OFF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUTTON_DFTE_OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_DFTE_OFFActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(BUTTON_DFTE_OFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 370, 110));

        BUTTON_ROIA_ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Size_Rotation_Axis.png"))); // NOI18N
        BUTTON_ROIA_ON.setText("jButton3");
        BUTTON_ROIA_ON.setBorder(null);
        BUTTON_ROIA_ON.setContentAreaFilled(false);
        BUTTON_ROIA_ON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUTTON_ROIA_ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_ROIA_ONActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(BUTTON_ROIA_ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 370, 110));

        BUTTON_ROIA_OFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Size_Rotation_Axis_OFF.png"))); // NOI18N
        BUTTON_ROIA_OFF.setText("jButton3");
        BUTTON_ROIA_OFF.setBorder(null);
        BUTTON_ROIA_OFF.setContentAreaFilled(false);
        BUTTON_ROIA_OFF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUTTON_ROIA_OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_ROIA_OFFActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(BUTTON_ROIA_OFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 370, 110));

        ARROW_OK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Center_OK.png"))); // NOI18N
        ARROW_OK.setBorder(null);
        ARROW_OK.setContentAreaFilled(false);
        ARROW_OK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ARROW_OK.setFocusPainted(false);
        ARROW_OK.setFocusable(false);
        ARROW_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARROW_OKActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(ARROW_OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 680, 160, 160));

        ARROW_LEFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Arrow_Left.png"))); // NOI18N
        ARROW_LEFT.setBorder(null);
        ARROW_LEFT.setContentAreaFilled(false);
        ARROW_LEFT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ARROW_LEFT.setFocusPainted(false);
        ARROW_LEFT.setFocusable(false);
        ARROW_LEFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARROW_LEFTActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(ARROW_LEFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 140, 260));

        ARROW_UP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Arrow_Up.png"))); // NOI18N
        ARROW_UP.setBorder(null);
        ARROW_UP.setContentAreaFilled(false);
        ARROW_UP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ARROW_UP.setFocusPainted(false);
        ARROW_UP.setFocusable(false);
        ARROW_UP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARROW_UPActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(ARROW_UP, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 260, 110));

        ARROW_RIGHT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Arrow_Right.png"))); // NOI18N
        ARROW_RIGHT.setBorder(null);
        ARROW_RIGHT.setContentAreaFilled(false);
        ARROW_RIGHT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ARROW_RIGHT.setFocusPainted(false);
        ARROW_RIGHT.setFocusable(false);
        ARROW_RIGHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARROW_RIGHTActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(ARROW_RIGHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 630, 120, 270));

        ARROW_DOWN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Arrow_Down.png"))); // NOI18N
        ARROW_DOWN.setBorder(null);
        ARROW_DOWN.setContentAreaFilled(false);
        ARROW_DOWN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ARROW_DOWN.setFocusPainted(false);
        ARROW_DOWN.setFocusable(false);
        ARROW_DOWN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARROW_DOWNActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(ARROW_DOWN, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 830, 300, 130));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/CloseButton.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setContentAreaFilled(false);
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.setFocusPainted(false);
        closeButton.setFocusable(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 10, -1, 40));

        minimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Minimize_Button.png"))); // NOI18N
        minimizeButton.setBorder(null);
        minimizeButton.setContentAreaFilled(false);
        minimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeButton.setFocusPainted(false);
        minimizeButton.setFocusable(false);
        minimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeButtonActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, -1, 40));

        BUTTON_TEMP_ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Size_Rotation_Axis.png"))); // NOI18N
        BUTTON_TEMP_ON.setText("jButton3");
        BUTTON_TEMP_ON.setBorder(null);
        BUTTON_TEMP_ON.setContentAreaFilled(false);
        BUTTON_TEMP_ON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUTTON_TEMP_ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_TEMP_ONActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(BUTTON_TEMP_ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 580, 370, 110));

        BUTTON_TEMP_OFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Size_Rotation_Axis_OFF.png"))); // NOI18N
        BUTTON_TEMP_OFF.setText("jButton3");
        BUTTON_TEMP_OFF.setBorder(null);
        BUTTON_TEMP_OFF.setContentAreaFilled(false);
        BUTTON_TEMP_OFF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUTTON_TEMP_OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_TEMP_OFFActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(BUTTON_TEMP_OFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 580, 370, 110));

        GLOW_ORANGE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Orange_Glow_2.png"))); // NOI18N
        TeachingStrat.getContentPane().add(GLOW_ORANGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 60, 50));

        GLOW_GREEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Green_Glow_4.png"))); // NOI18N
        TeachingStrat.getContentPane().add(GLOW_GREEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 42, 80, 40));

        GLOW_WHITE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/White_Glow.png"))); // NOI18N
        TeachingStrat.getContentPane().add(GLOW_WHITE, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 70, 41));

        MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/EARTH.png"))); // NOI18N
        TeachingStrat.getContentPane().add(MAIN_PANEL_PLANET, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 380, 290));

        TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_EARTH.png"))); // NOI18N
        TeachingStrat.getContentPane().add(TEXT_SURFACE, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 540, 340));

        SpaceShipButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Button_ShapeShip.png"))); // NOI18N
        SpaceShipButton.setBorder(null);
        SpaceShipButton.setContentAreaFilled(false);
        SpaceShipButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SpaceShipButton.setFocusPainted(false);
        SpaceShipButton.setFocusable(false);
        SpaceShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpaceShipButtonActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(SpaceShipButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 710, 360, 90));

        ConversationalLearning_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Button_Travel_One.png"))); // NOI18N
        ConversationalLearning_Button.setBorder(null);
        ConversationalLearning_Button.setContentAreaFilled(false);
        ConversationalLearning_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConversationalLearning_Button.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ConversationalLearning_ButtonMouseMoved(evt);
            }
        });
        ConversationalLearning_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConversationalLearning_ButtonActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(ConversationalLearning_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 810, 170, 150));

        PostTest_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Button_Quiz_One.png"))); // NOI18N
        PostTest_Button.setBorder(null);
        PostTest_Button.setContentAreaFilled(false);
        PostTest_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PostTest_Button.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PostTest_ButtonMouseMoved(evt);
            }
        });
        PostTest_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostTest_ButtonActionPerformed(evt);
            }
        });
        TeachingStrat.getContentPane().add(PostTest_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 810, 170, 150));

        MAIN_LAYOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/BaseLayout_2.png"))); // NOI18N
        MAIN_LAYOUT.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                MAIN_LAYOUTAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        MAIN_LAYOUT.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MAIN_LAYOUTMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MAIN_LAYOUTMouseMoved(evt);
            }
        });
        MAIN_LAYOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MAIN_LAYOUTMousePressed(evt);
            }
        });
        TeachingStrat.getContentPane().add(MAIN_LAYOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 980));

        Gallery.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Gallery_Right_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Gallery_Right.png"))); // NOI18N
        Gallery_Right_Button.setBorder(null);
        Gallery_Right_Button.setContentAreaFilled(false);
        Gallery_Right_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Gallery_Right_Button.setFocusPainted(false);
        Gallery_Right_Button.setFocusable(false);
        Gallery_Right_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gallery_Right_ButtonActionPerformed(evt);
            }
        });
        Gallery.getContentPane().add(Gallery_Right_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 300, 110, 470));

        Gallery_Close_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Gallery_Close.png"))); // NOI18N
        Gallery_Close_Button.setBorder(null);
        Gallery_Close_Button.setContentAreaFilled(false);
        Gallery_Close_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Gallery_Close_Button.setFocusPainted(false);
        Gallery_Close_Button.setFocusable(false);
        Gallery_Close_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gallery_Close_ButtonActionPerformed(evt);
            }
        });
        Gallery.getContentPane().add(Gallery_Close_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 180, 110, 110));

        Gallery_Left_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Gallery_Left.png"))); // NOI18N
        Gallery_Left_Button.setBorder(null);
        Gallery_Left_Button.setContentAreaFilled(false);
        Gallery_Left_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Gallery_Left_Button.setFocusPainted(false);
        Gallery_Left_Button.setFocusable(false);
        Gallery_Left_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gallery_Left_ButtonActionPerformed(evt);
            }
        });
        Gallery.getContentPane().add(Gallery_Left_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 470));
        Gallery.getContentPane().add(Gallery_Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 870, 470));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Picture_Gallery.png"))); // NOI18N
        Gallery.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 930));

        First_Quiz_Frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FirstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Earth.png"))); // NOI18N
        FirstButton.setBorder(null);
        FirstButton.setContentAreaFilled(false);
        FirstButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstButton.setFocusPainted(false);
        FirstButton.setFocusable(false);
        FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstButtonActionPerformed(evt);
            }
        });
        First_Quiz_Frame.getContentPane().add(FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 490, 170));

        SecondButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Moon.png"))); // NOI18N
        SecondButton.setBorder(null);
        SecondButton.setContentAreaFilled(false);
        SecondButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SecondButton.setFocusPainted(false);
        SecondButton.setFocusable(false);
        SecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondButtonActionPerformed(evt);
            }
        });
        First_Quiz_Frame.getContentPane().add(SecondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 500, 170));

        ThirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Mercury.png"))); // NOI18N
        ThirdButton.setBorder(null);
        ThirdButton.setContentAreaFilled(false);
        ThirdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ThirdButton.setFocusPainted(false);
        ThirdButton.setFocusable(false);
        ThirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdButtonActionPerformed(evt);
            }
        });
        First_Quiz_Frame.getContentPane().add(ThirdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 490, 170));

        FourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Sun.png"))); // NOI18N
        FourthButton.setBorder(null);
        FourthButton.setContentAreaFilled(false);
        FourthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FourthButton.setFocusPainted(false);
        FourthButton.setFocusable(false);
        FourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourthButtonActionPerformed(evt);
            }
        });
        First_Quiz_Frame.getContentPane().add(FourthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 500, 170));

        FirstQuizCloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        FirstQuizCloseButton.setBorder(null);
        FirstQuizCloseButton.setContentAreaFilled(false);
        FirstQuizCloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizCloseButton.setFocusPainted(false);
        FirstQuizCloseButton.setFocusable(false);
        FirstQuizCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizCloseButtonActionPerformed(evt);
            }
        });
        First_Quiz_Frame.getContentPane().add(FirstQuizCloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 70, 80));

        FirstQuizButton_HINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Hint_Button.png"))); // NOI18N
        FirstQuizButton_HINT.setBorder(null);
        FirstQuizButton_HINT.setContentAreaFilled(false);
        FirstQuizButton_HINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizButton_HINT.setFocusPainted(false);
        FirstQuizButton_HINT.setFocusable(false);
        FirstQuizButton_HINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizButton_HINTActionPerformed(evt);
            }
        });
        First_Quiz_Frame.getContentPane().add(FirstQuizButton_HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 390, 120));

        QuestionLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/First_Quiz_Blue.png"))); // NOI18N
        First_Quiz_Frame.getContentPane().add(QuestionLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 950));

        Second_Quiz_Frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Second_FirstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Jupiter.png"))); // NOI18N
        Second_FirstButton.setBorder(null);
        Second_FirstButton.setContentAreaFilled(false);
        Second_FirstButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Second_FirstButton.setFocusPainted(false);
        Second_FirstButton.setFocusable(false);
        Second_FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Second_FirstButtonActionPerformed(evt);
            }
        });
        Second_Quiz_Frame.getContentPane().add(Second_FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 490, 170));

        Second_SecondButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Mercury.png"))); // NOI18N
        Second_SecondButton.setBorder(null);
        Second_SecondButton.setContentAreaFilled(false);
        Second_SecondButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Second_SecondButton.setFocusPainted(false);
        Second_SecondButton.setFocusable(false);
        Second_SecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Second_SecondButtonActionPerformed(evt);
            }
        });
        Second_Quiz_Frame.getContentPane().add(Second_SecondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 500, 170));

        Second_ThirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Sun.png"))); // NOI18N
        Second_ThirdButton.setBorder(null);
        Second_ThirdButton.setContentAreaFilled(false);
        Second_ThirdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Second_ThirdButton.setFocusPainted(false);
        Second_ThirdButton.setFocusable(false);
        Second_ThirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Second_ThirdButtonActionPerformed(evt);
            }
        });
        Second_Quiz_Frame.getContentPane().add(Second_ThirdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 490, 170));

        Second_FourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Earth.png"))); // NOI18N
        Second_FourthButton.setBorder(null);
        Second_FourthButton.setContentAreaFilled(false);
        Second_FourthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Second_FourthButton.setFocusPainted(false);
        Second_FourthButton.setFocusable(false);
        Second_FourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Second_FourthButtonActionPerformed(evt);
            }
        });
        Second_Quiz_Frame.getContentPane().add(Second_FourthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 500, 170));

        FirstQuizCloseButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        FirstQuizCloseButton1.setBorder(null);
        FirstQuizCloseButton1.setContentAreaFilled(false);
        FirstQuizCloseButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizCloseButton1.setFocusPainted(false);
        FirstQuizCloseButton1.setFocusable(false);
        FirstQuizCloseButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizCloseButton1ActionPerformed(evt);
            }
        });
        Second_Quiz_Frame.getContentPane().add(FirstQuizCloseButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 70, 80));

        SecondQuizButton_HINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Hint_Button.png"))); // NOI18N
        SecondQuizButton_HINT.setBorder(null);
        SecondQuizButton_HINT.setContentAreaFilled(false);
        SecondQuizButton_HINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SecondQuizButton_HINT.setFocusPainted(false);
        SecondQuizButton_HINT.setFocusable(false);
        SecondQuizButton_HINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondQuizButton_HINTActionPerformed(evt);
            }
        });
        Second_Quiz_Frame.getContentPane().add(SecondQuizButton_HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 390, 120));

        QuestionLayout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Second_Quiz_Blue.png"))); // NOI18N
        Second_Quiz_Frame.getContentPane().add(QuestionLayout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 950));

        Third_Quiz_Frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Third_FirstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Moon.png"))); // NOI18N
        Third_FirstButton.setBorder(null);
        Third_FirstButton.setContentAreaFilled(false);
        Third_FirstButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Third_FirstButton.setFocusPainted(false);
        Third_FirstButton.setFocusable(false);
        Third_FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Third_FirstButtonActionPerformed(evt);
            }
        });
        Third_Quiz_Frame.getContentPane().add(Third_FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 490, 170));

        Third_SecondButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Saturn.png"))); // NOI18N
        Third_SecondButton.setBorder(null);
        Third_SecondButton.setContentAreaFilled(false);
        Third_SecondButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Third_SecondButton.setFocusPainted(false);
        Third_SecondButton.setFocusable(false);
        Third_SecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Third_SecondButtonActionPerformed(evt);
            }
        });
        Third_Quiz_Frame.getContentPane().add(Third_SecondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 500, 170));

        Third_ThirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Venus.png"))); // NOI18N
        Third_ThirdButton.setBorder(null);
        Third_ThirdButton.setContentAreaFilled(false);
        Third_ThirdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Third_ThirdButton.setFocusPainted(false);
        Third_ThirdButton.setFocusable(false);
        Third_ThirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Third_ThirdButtonActionPerformed(evt);
            }
        });
        Third_Quiz_Frame.getContentPane().add(Third_ThirdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 490, 170));

        Third_FourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Earth.png"))); // NOI18N
        Third_FourthButton.setBorder(null);
        Third_FourthButton.setContentAreaFilled(false);
        Third_FourthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Third_FourthButton.setFocusPainted(false);
        Third_FourthButton.setFocusable(false);
        Third_FourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Third_FourthButtonActionPerformed(evt);
            }
        });
        Third_Quiz_Frame.getContentPane().add(Third_FourthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 500, 170));

        FirstQuizCloseButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        FirstQuizCloseButton2.setBorder(null);
        FirstQuizCloseButton2.setContentAreaFilled(false);
        FirstQuizCloseButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizCloseButton2.setFocusPainted(false);
        FirstQuizCloseButton2.setFocusable(false);
        FirstQuizCloseButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizCloseButton2ActionPerformed(evt);
            }
        });
        Third_Quiz_Frame.getContentPane().add(FirstQuizCloseButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 70, 80));

        ThirdQuizButton_HINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Hint_Button.png"))); // NOI18N
        ThirdQuizButton_HINT.setBorder(null);
        ThirdQuizButton_HINT.setContentAreaFilled(false);
        ThirdQuizButton_HINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ThirdQuizButton_HINT.setFocusPainted(false);
        ThirdQuizButton_HINT.setFocusable(false);
        ThirdQuizButton_HINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdQuizButton_HINTActionPerformed(evt);
            }
        });
        Third_Quiz_Frame.getContentPane().add(ThirdQuizButton_HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 390, 120));

        QuestionLayout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Third_Quiz_Blue.png"))); // NOI18N
        Third_Quiz_Frame.getContentPane().add(QuestionLayout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 950));

        Fourth_Quiz_Frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fourth_FirstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Moon.png"))); // NOI18N
        Fourth_FirstButton.setBorder(null);
        Fourth_FirstButton.setContentAreaFilled(false);
        Fourth_FirstButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fourth_FirstButton.setFocusPainted(false);
        Fourth_FirstButton.setFocusable(false);
        Fourth_FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fourth_FirstButtonActionPerformed(evt);
            }
        });
        Fourth_Quiz_Frame.getContentPane().add(Fourth_FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 490, 170));

        Fourth_SecondButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Sun.png"))); // NOI18N
        Fourth_SecondButton.setBorder(null);
        Fourth_SecondButton.setContentAreaFilled(false);
        Fourth_SecondButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fourth_SecondButton.setFocusPainted(false);
        Fourth_SecondButton.setFocusable(false);
        Fourth_SecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fourth_SecondButtonActionPerformed(evt);
            }
        });
        Fourth_Quiz_Frame.getContentPane().add(Fourth_SecondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 500, 170));

        Fourth_ThirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_MW.png"))); // NOI18N
        Fourth_ThirdButton.setBorder(null);
        Fourth_ThirdButton.setContentAreaFilled(false);
        Fourth_ThirdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fourth_ThirdButton.setFocusPainted(false);
        Fourth_ThirdButton.setFocusable(false);
        Fourth_ThirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fourth_ThirdButtonActionPerformed(evt);
            }
        });
        Fourth_Quiz_Frame.getContentPane().add(Fourth_ThirdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 490, 170));

        Fourth_FourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Star.png"))); // NOI18N
        Fourth_FourthButton.setBorder(null);
        Fourth_FourthButton.setContentAreaFilled(false);
        Fourth_FourthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fourth_FourthButton.setFocusPainted(false);
        Fourth_FourthButton.setFocusable(false);
        Fourth_FourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fourth_FourthButtonActionPerformed(evt);
            }
        });
        Fourth_Quiz_Frame.getContentPane().add(Fourth_FourthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 500, 170));

        FirstQuizCloseButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        FirstQuizCloseButton3.setBorder(null);
        FirstQuizCloseButton3.setContentAreaFilled(false);
        FirstQuizCloseButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizCloseButton3.setFocusPainted(false);
        FirstQuizCloseButton3.setFocusable(false);
        FirstQuizCloseButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizCloseButton3ActionPerformed(evt);
            }
        });
        Fourth_Quiz_Frame.getContentPane().add(FirstQuizCloseButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 70, 80));

        FourthQuizButton_HINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Hint_Button.png"))); // NOI18N
        FourthQuizButton_HINT.setBorder(null);
        FourthQuizButton_HINT.setContentAreaFilled(false);
        FourthQuizButton_HINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FourthQuizButton_HINT.setFocusPainted(false);
        FourthQuizButton_HINT.setFocusable(false);
        FourthQuizButton_HINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourthQuizButton_HINTActionPerformed(evt);
            }
        });
        Fourth_Quiz_Frame.getContentPane().add(FourthQuizButton_HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 390, 120));

        QuestionLayout3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fourth_Quiz_Blue.png"))); // NOI18N
        Fourth_Quiz_Frame.getContentPane().add(QuestionLayout3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 950));

        Fifth_Quiz_Frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fifth_FirstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Uranus.png"))); // NOI18N
        Fifth_FirstButton.setBorder(null);
        Fifth_FirstButton.setContentAreaFilled(false);
        Fifth_FirstButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fifth_FirstButton.setFocusPainted(false);
        Fifth_FirstButton.setFocusable(false);
        Fifth_FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fifth_FirstButtonActionPerformed(evt);
            }
        });
        Fifth_Quiz_Frame.getContentPane().add(Fifth_FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 490, 170));

        Fifth_SecondButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Saturn.png"))); // NOI18N
        Fifth_SecondButton.setBorder(null);
        Fifth_SecondButton.setContentAreaFilled(false);
        Fifth_SecondButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fifth_SecondButton.setFocusPainted(false);
        Fifth_SecondButton.setFocusable(false);
        Fifth_SecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fifth_SecondButtonActionPerformed(evt);
            }
        });
        Fifth_Quiz_Frame.getContentPane().add(Fifth_SecondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 500, 170));

        Fifth_ThirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Neptune.png"))); // NOI18N
        Fifth_ThirdButton.setBorder(null);
        Fifth_ThirdButton.setContentAreaFilled(false);
        Fifth_ThirdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fifth_ThirdButton.setFocusPainted(false);
        Fifth_ThirdButton.setFocusable(false);
        Fifth_ThirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fifth_ThirdButtonActionPerformed(evt);
            }
        });
        Fifth_Quiz_Frame.getContentPane().add(Fifth_ThirdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 490, 170));

        Fifth_FourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Moon.png"))); // NOI18N
        Fifth_FourthButton.setBorder(null);
        Fifth_FourthButton.setContentAreaFilled(false);
        Fifth_FourthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fifth_FourthButton.setFocusPainted(false);
        Fifth_FourthButton.setFocusable(false);
        Fifth_FourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fifth_FourthButtonActionPerformed(evt);
            }
        });
        Fifth_Quiz_Frame.getContentPane().add(Fifth_FourthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 500, 170));

        FirstQuizCloseButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        FirstQuizCloseButton4.setBorder(null);
        FirstQuizCloseButton4.setContentAreaFilled(false);
        FirstQuizCloseButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizCloseButton4.setFocusPainted(false);
        FirstQuizCloseButton4.setFocusable(false);
        FirstQuizCloseButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizCloseButton4ActionPerformed(evt);
            }
        });
        Fifth_Quiz_Frame.getContentPane().add(FirstQuizCloseButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 70, 80));

        FifthQuizButton_HINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Hint_Button.png"))); // NOI18N
        FifthQuizButton_HINT.setBorder(null);
        FifthQuizButton_HINT.setContentAreaFilled(false);
        FifthQuizButton_HINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FifthQuizButton_HINT.setFocusPainted(false);
        FifthQuizButton_HINT.setFocusable(false);
        FifthQuizButton_HINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FifthQuizButton_HINTActionPerformed(evt);
            }
        });
        Fifth_Quiz_Frame.getContentPane().add(FifthQuizButton_HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 390, 120));

        QuestionLayout4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fifth_Quiz_Blue.png"))); // NOI18N
        Fifth_Quiz_Frame.getContentPane().add(QuestionLayout4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 950));

        Sixth_Quiz_Frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sixth_FirstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Moon.png"))); // NOI18N
        Sixth_FirstButton.setBorder(null);
        Sixth_FirstButton.setContentAreaFilled(false);
        Sixth_FirstButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sixth_FirstButton.setFocusPainted(false);
        Sixth_FirstButton.setFocusable(false);
        Sixth_FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sixth_FirstButtonActionPerformed(evt);
            }
        });
        Sixth_Quiz_Frame.getContentPane().add(Sixth_FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 490, 170));

        Sixth_SecondButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_MW.png"))); // NOI18N
        Sixth_SecondButton.setBorder(null);
        Sixth_SecondButton.setContentAreaFilled(false);
        Sixth_SecondButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sixth_SecondButton.setFocusPainted(false);
        Sixth_SecondButton.setFocusable(false);
        Sixth_SecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sixth_SecondButtonActionPerformed(evt);
            }
        });
        Sixth_Quiz_Frame.getContentPane().add(Sixth_SecondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 500, 170));

        Sixth_ThirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Star.png"))); // NOI18N
        Sixth_ThirdButton.setBorder(null);
        Sixth_ThirdButton.setContentAreaFilled(false);
        Sixth_ThirdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sixth_ThirdButton.setFocusPainted(false);
        Sixth_ThirdButton.setFocusable(false);
        Sixth_ThirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sixth_ThirdButtonActionPerformed(evt);
            }
        });
        Sixth_Quiz_Frame.getContentPane().add(Sixth_ThirdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 490, 170));

        Sixth_FourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Sun.png"))); // NOI18N
        Sixth_FourthButton.setBorder(null);
        Sixth_FourthButton.setContentAreaFilled(false);
        Sixth_FourthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sixth_FourthButton.setFocusPainted(false);
        Sixth_FourthButton.setFocusable(false);
        Sixth_FourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sixth_FourthButtonActionPerformed(evt);
            }
        });
        Sixth_Quiz_Frame.getContentPane().add(Sixth_FourthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 500, 170));

        FirstQuizCloseButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        FirstQuizCloseButton5.setBorder(null);
        FirstQuizCloseButton5.setContentAreaFilled(false);
        FirstQuizCloseButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizCloseButton5.setFocusPainted(false);
        FirstQuizCloseButton5.setFocusable(false);
        FirstQuizCloseButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizCloseButton5ActionPerformed(evt);
            }
        });
        Sixth_Quiz_Frame.getContentPane().add(FirstQuizCloseButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 70, 80));

        SixthQuizButton_HINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Hint_Button.png"))); // NOI18N
        SixthQuizButton_HINT.setBorder(null);
        SixthQuizButton_HINT.setContentAreaFilled(false);
        SixthQuizButton_HINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SixthQuizButton_HINT.setFocusPainted(false);
        SixthQuizButton_HINT.setFocusable(false);
        SixthQuizButton_HINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixthQuizButton_HINTActionPerformed(evt);
            }
        });
        Sixth_Quiz_Frame.getContentPane().add(SixthQuizButton_HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 390, 120));

        QuestionLayout5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sixth_Quiz_Blue.png"))); // NOI18N
        Sixth_Quiz_Frame.getContentPane().add(QuestionLayout5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 950));

        Seventh_Quiz_Frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Seventh_FirstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Mercury.png"))); // NOI18N
        Seventh_FirstButton.setBorder(null);
        Seventh_FirstButton.setContentAreaFilled(false);
        Seventh_FirstButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Seventh_FirstButton.setFocusPainted(false);
        Seventh_FirstButton.setFocusable(false);
        Seventh_FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seventh_FirstButtonActionPerformed(evt);
            }
        });
        Seventh_Quiz_Frame.getContentPane().add(Seventh_FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 490, 170));

        Seventh_SecondButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Jupiter.png"))); // NOI18N
        Seventh_SecondButton.setBorder(null);
        Seventh_SecondButton.setContentAreaFilled(false);
        Seventh_SecondButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Seventh_SecondButton.setFocusPainted(false);
        Seventh_SecondButton.setFocusable(false);
        Seventh_SecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seventh_SecondButtonActionPerformed(evt);
            }
        });
        Seventh_Quiz_Frame.getContentPane().add(Seventh_SecondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 500, 170));

        Seventh_ThirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Venus.png"))); // NOI18N
        Seventh_ThirdButton.setBorder(null);
        Seventh_ThirdButton.setContentAreaFilled(false);
        Seventh_ThirdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Seventh_ThirdButton.setFocusPainted(false);
        Seventh_ThirdButton.setFocusable(false);
        Seventh_ThirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seventh_ThirdButtonActionPerformed(evt);
            }
        });
        Seventh_Quiz_Frame.getContentPane().add(Seventh_ThirdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 490, 170));

        Seventh_FourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Sun.png"))); // NOI18N
        Seventh_FourthButton.setBorder(null);
        Seventh_FourthButton.setContentAreaFilled(false);
        Seventh_FourthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Seventh_FourthButton.setFocusPainted(false);
        Seventh_FourthButton.setFocusable(false);
        Seventh_FourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seventh_FourthButtonActionPerformed(evt);
            }
        });
        Seventh_Quiz_Frame.getContentPane().add(Seventh_FourthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 500, 170));

        FirstQuizCloseButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        FirstQuizCloseButton6.setBorder(null);
        FirstQuizCloseButton6.setContentAreaFilled(false);
        FirstQuizCloseButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizCloseButton6.setFocusPainted(false);
        FirstQuizCloseButton6.setFocusable(false);
        FirstQuizCloseButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizCloseButton6ActionPerformed(evt);
            }
        });
        Seventh_Quiz_Frame.getContentPane().add(FirstQuizCloseButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 70, 80));

        SeventhQuizButton_HINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Hint_Button.png"))); // NOI18N
        SeventhQuizButton_HINT.setBorder(null);
        SeventhQuizButton_HINT.setContentAreaFilled(false);
        SeventhQuizButton_HINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeventhQuizButton_HINT.setFocusPainted(false);
        SeventhQuizButton_HINT.setFocusable(false);
        SeventhQuizButton_HINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeventhQuizButton_HINTActionPerformed(evt);
            }
        });
        Seventh_Quiz_Frame.getContentPane().add(SeventhQuizButton_HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 390, 120));

        QuestionLayout6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Seventh_Quiz_Blue.png"))); // NOI18N
        Seventh_Quiz_Frame.getContentPane().add(QuestionLayout6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 950));

        Eigth_Quiz_Frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eigth_FirstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Sun.png"))); // NOI18N
        Eigth_FirstButton.setBorder(null);
        Eigth_FirstButton.setContentAreaFilled(false);
        Eigth_FirstButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eigth_FirstButton.setFocusPainted(false);
        Eigth_FirstButton.setFocusable(false);
        Eigth_FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eigth_FirstButtonActionPerformed(evt);
            }
        });
        Eigth_Quiz_Frame.getContentPane().add(Eigth_FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 490, 170));

        Eigth_SecondButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Earth.png"))); // NOI18N
        Eigth_SecondButton.setBorder(null);
        Eigth_SecondButton.setContentAreaFilled(false);
        Eigth_SecondButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eigth_SecondButton.setFocusPainted(false);
        Eigth_SecondButton.setFocusable(false);
        Eigth_SecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eigth_SecondButtonActionPerformed(evt);
            }
        });
        Eigth_Quiz_Frame.getContentPane().add(Eigth_SecondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 500, 170));

        Eigth_ThirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Moon.png"))); // NOI18N
        Eigth_ThirdButton.setBorder(null);
        Eigth_ThirdButton.setContentAreaFilled(false);
        Eigth_ThirdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eigth_ThirdButton.setFocusPainted(false);
        Eigth_ThirdButton.setFocusable(false);
        Eigth_ThirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eigth_ThirdButtonActionPerformed(evt);
            }
        });
        Eigth_Quiz_Frame.getContentPane().add(Eigth_ThirdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 490, 170));

        Eigth_FourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Star.png"))); // NOI18N
        Eigth_FourthButton.setBorder(null);
        Eigth_FourthButton.setContentAreaFilled(false);
        Eigth_FourthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eigth_FourthButton.setFocusPainted(false);
        Eigth_FourthButton.setFocusable(false);
        Eigth_FourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eigth_FourthButtonActionPerformed(evt);
            }
        });
        Eigth_Quiz_Frame.getContentPane().add(Eigth_FourthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 500, 170));

        FirstQuizCloseButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        FirstQuizCloseButton7.setBorder(null);
        FirstQuizCloseButton7.setContentAreaFilled(false);
        FirstQuizCloseButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizCloseButton7.setFocusPainted(false);
        FirstQuizCloseButton7.setFocusable(false);
        FirstQuizCloseButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizCloseButton7ActionPerformed(evt);
            }
        });
        Eigth_Quiz_Frame.getContentPane().add(FirstQuizCloseButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 70, 80));

        EigthQuizButton_HINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Hint_Button.png"))); // NOI18N
        EigthQuizButton_HINT.setBorder(null);
        EigthQuizButton_HINT.setContentAreaFilled(false);
        EigthQuizButton_HINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EigthQuizButton_HINT.setFocusPainted(false);
        EigthQuizButton_HINT.setFocusable(false);
        EigthQuizButton_HINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EigthQuizButton_HINTActionPerformed(evt);
            }
        });
        Eigth_Quiz_Frame.getContentPane().add(EigthQuizButton_HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 390, 120));

        QuestionLayout7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Eight_Quiz_Blue.png"))); // NOI18N
        Eigth_Quiz_Frame.getContentPane().add(QuestionLayout7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 950));

        Ninth_Quiz_Frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ninth_FirstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Sun.png"))); // NOI18N
        Ninth_FirstButton.setBorder(null);
        Ninth_FirstButton.setContentAreaFilled(false);
        Ninth_FirstButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ninth_FirstButton.setFocusPainted(false);
        Ninth_FirstButton.setFocusable(false);
        Ninth_FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ninth_FirstButtonActionPerformed(evt);
            }
        });
        Ninth_Quiz_Frame.getContentPane().add(Ninth_FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 490, 170));

        Ninth_SecondButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Earth.png"))); // NOI18N
        Ninth_SecondButton.setBorder(null);
        Ninth_SecondButton.setContentAreaFilled(false);
        Ninth_SecondButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ninth_SecondButton.setFocusPainted(false);
        Ninth_SecondButton.setFocusable(false);
        Ninth_SecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ninth_SecondButtonActionPerformed(evt);
            }
        });
        Ninth_Quiz_Frame.getContentPane().add(Ninth_SecondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 500, 170));

        Ninth_ThirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Saturn.png"))); // NOI18N
        Ninth_ThirdButton.setBorder(null);
        Ninth_ThirdButton.setContentAreaFilled(false);
        Ninth_ThirdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ninth_ThirdButton.setFocusPainted(false);
        Ninth_ThirdButton.setFocusable(false);
        Ninth_ThirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ninth_ThirdButtonActionPerformed(evt);
            }
        });
        Ninth_Quiz_Frame.getContentPane().add(Ninth_ThirdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 490, 170));

        Ninth_FourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Star.png"))); // NOI18N
        Ninth_FourthButton.setBorder(null);
        Ninth_FourthButton.setContentAreaFilled(false);
        Ninth_FourthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ninth_FourthButton.setFocusPainted(false);
        Ninth_FourthButton.setFocusable(false);
        Ninth_FourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ninth_FourthButtonActionPerformed(evt);
            }
        });
        Ninth_Quiz_Frame.getContentPane().add(Ninth_FourthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 500, 170));

        FirstQuizCloseButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        FirstQuizCloseButton8.setBorder(null);
        FirstQuizCloseButton8.setContentAreaFilled(false);
        FirstQuizCloseButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizCloseButton8.setFocusPainted(false);
        FirstQuizCloseButton8.setFocusable(false);
        FirstQuizCloseButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizCloseButton8ActionPerformed(evt);
            }
        });
        Ninth_Quiz_Frame.getContentPane().add(FirstQuizCloseButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 70, 80));

        NinthQuizButton_HINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Hint_Button.png"))); // NOI18N
        NinthQuizButton_HINT.setBorder(null);
        NinthQuizButton_HINT.setContentAreaFilled(false);
        NinthQuizButton_HINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NinthQuizButton_HINT.setFocusPainted(false);
        NinthQuizButton_HINT.setFocusable(false);
        NinthQuizButton_HINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NinthQuizButton_HINTActionPerformed(evt);
            }
        });
        Ninth_Quiz_Frame.getContentPane().add(NinthQuizButton_HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 390, 120));

        QuestionLayout8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Ninth_Quiz_Blue.png"))); // NOI18N
        Ninth_Quiz_Frame.getContentPane().add(QuestionLayout8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 950));

        Tenth_Quiz_Frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tenth_FirstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Venus.png"))); // NOI18N
        Tenth_FirstButton.setBorder(null);
        Tenth_FirstButton.setContentAreaFilled(false);
        Tenth_FirstButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tenth_FirstButton.setFocusPainted(false);
        Tenth_FirstButton.setFocusable(false);
        Tenth_FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tenth_FirstButtonActionPerformed(evt);
            }
        });
        Tenth_Quiz_Frame.getContentPane().add(Tenth_FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 490, 170));

        Tenth_SecondButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Earth.png"))); // NOI18N
        Tenth_SecondButton.setBorder(null);
        Tenth_SecondButton.setContentAreaFilled(false);
        Tenth_SecondButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tenth_SecondButton.setFocusPainted(false);
        Tenth_SecondButton.setFocusable(false);
        Tenth_SecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tenth_SecondButtonActionPerformed(evt);
            }
        });
        Tenth_Quiz_Frame.getContentPane().add(Tenth_SecondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 500, 170));

        Tenth_ThirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Neptune.png"))); // NOI18N
        Tenth_ThirdButton.setBorder(null);
        Tenth_ThirdButton.setContentAreaFilled(false);
        Tenth_ThirdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tenth_ThirdButton.setFocusPainted(false);
        Tenth_ThirdButton.setFocusable(false);
        Tenth_ThirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tenth_ThirdButtonActionPerformed(evt);
            }
        });
        Tenth_Quiz_Frame.getContentPane().add(Tenth_ThirdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 490, 170));

        Tenth_FourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Mercury.png"))); // NOI18N
        Tenth_FourthButton.setBorder(null);
        Tenth_FourthButton.setContentAreaFilled(false);
        Tenth_FourthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tenth_FourthButton.setFocusPainted(false);
        Tenth_FourthButton.setFocusable(false);
        Tenth_FourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tenth_FourthButtonActionPerformed(evt);
            }
        });
        Tenth_Quiz_Frame.getContentPane().add(Tenth_FourthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 500, 170));

        FirstQuizCloseButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        FirstQuizCloseButton9.setBorder(null);
        FirstQuizCloseButton9.setContentAreaFilled(false);
        FirstQuizCloseButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizCloseButton9.setFocusPainted(false);
        FirstQuizCloseButton9.setFocusable(false);
        FirstQuizCloseButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizCloseButton9ActionPerformed(evt);
            }
        });
        Tenth_Quiz_Frame.getContentPane().add(FirstQuizCloseButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 70, 80));

        TenthQuizButton_HINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Hint_Button.png"))); // NOI18N
        TenthQuizButton_HINT.setBorder(null);
        TenthQuizButton_HINT.setContentAreaFilled(false);
        TenthQuizButton_HINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TenthQuizButton_HINT.setFocusPainted(false);
        TenthQuizButton_HINT.setFocusable(false);
        TenthQuizButton_HINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenthQuizButton_HINTActionPerformed(evt);
            }
        });
        Tenth_Quiz_Frame.getContentPane().add(TenthQuizButton_HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 390, 120));

        QuestionLayout9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Tenth_Quiz_Blue.png"))); // NOI18N
        Tenth_Quiz_Frame.getContentPane().add(QuestionLayout9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 950));

        Eleventh_Quiz_Frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eleventh_FirstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Star.png"))); // NOI18N
        Eleventh_FirstButton.setBorder(null);
        Eleventh_FirstButton.setContentAreaFilled(false);
        Eleventh_FirstButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eleventh_FirstButton.setFocusPainted(false);
        Eleventh_FirstButton.setFocusable(false);
        Eleventh_FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eleventh_FirstButtonActionPerformed(evt);
            }
        });
        Eleventh_Quiz_Frame.getContentPane().add(Eleventh_FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 490, 170));

        Eleventh_SecondButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_MW.png"))); // NOI18N
        Eleventh_SecondButton.setBorder(null);
        Eleventh_SecondButton.setContentAreaFilled(false);
        Eleventh_SecondButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eleventh_SecondButton.setFocusPainted(false);
        Eleventh_SecondButton.setFocusable(false);
        Eleventh_SecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eleventh_SecondButtonActionPerformed(evt);
            }
        });
        Eleventh_Quiz_Frame.getContentPane().add(Eleventh_SecondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 500, 170));

        Eleventh_ThirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Moon.png"))); // NOI18N
        Eleventh_ThirdButton.setBorder(null);
        Eleventh_ThirdButton.setContentAreaFilled(false);
        Eleventh_ThirdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eleventh_ThirdButton.setFocusPainted(false);
        Eleventh_ThirdButton.setFocusable(false);
        Eleventh_ThirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eleventh_ThirdButtonActionPerformed(evt);
            }
        });
        Eleventh_Quiz_Frame.getContentPane().add(Eleventh_ThirdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 490, 170));

        Eleventh_FourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Sun.png"))); // NOI18N
        Eleventh_FourthButton.setBorder(null);
        Eleventh_FourthButton.setContentAreaFilled(false);
        Eleventh_FourthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eleventh_FourthButton.setFocusPainted(false);
        Eleventh_FourthButton.setFocusable(false);
        Eleventh_FourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eleventh_FourthButtonActionPerformed(evt);
            }
        });
        Eleventh_Quiz_Frame.getContentPane().add(Eleventh_FourthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 500, 170));

        FirstQuizCloseButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        FirstQuizCloseButton10.setBorder(null);
        FirstQuizCloseButton10.setContentAreaFilled(false);
        FirstQuizCloseButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizCloseButton10.setFocusPainted(false);
        FirstQuizCloseButton10.setFocusable(false);
        FirstQuizCloseButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizCloseButton10ActionPerformed(evt);
            }
        });
        Eleventh_Quiz_Frame.getContentPane().add(FirstQuizCloseButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 70, 80));

        EleventhQuizButton_HINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Hint_Button.png"))); // NOI18N
        EleventhQuizButton_HINT.setBorder(null);
        EleventhQuizButton_HINT.setContentAreaFilled(false);
        EleventhQuizButton_HINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EleventhQuizButton_HINT.setFocusPainted(false);
        EleventhQuizButton_HINT.setFocusable(false);
        EleventhQuizButton_HINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleventhQuizButton_HINTActionPerformed(evt);
            }
        });
        Eleventh_Quiz_Frame.getContentPane().add(EleventhQuizButton_HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 390, 120));

        QuestionLayout10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Eleventh_Quiz_Blue.png"))); // NOI18N
        Eleventh_Quiz_Frame.getContentPane().add(QuestionLayout10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 950));

        Twelve_Quiz_Frame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Twelve_FirstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Moon.png"))); // NOI18N
        Twelve_FirstButton.setBorder(null);
        Twelve_FirstButton.setContentAreaFilled(false);
        Twelve_FirstButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Twelve_FirstButton.setFocusPainted(false);
        Twelve_FirstButton.setFocusable(false);
        Twelve_FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Twelve_FirstButtonActionPerformed(evt);
            }
        });
        Twelve_Quiz_Frame.getContentPane().add(Twelve_FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 490, 170));

        Twelve_SecondButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Sun.png"))); // NOI18N
        Twelve_SecondButton.setBorder(null);
        Twelve_SecondButton.setContentAreaFilled(false);
        Twelve_SecondButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Twelve_SecondButton.setFocusPainted(false);
        Twelve_SecondButton.setFocusable(false);
        Twelve_SecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Twelve_SecondButtonActionPerformed(evt);
            }
        });
        Twelve_Quiz_Frame.getContentPane().add(Twelve_SecondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 500, 170));

        Twelve_ThirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_MW.png"))); // NOI18N
        Twelve_ThirdButton.setBorder(null);
        Twelve_ThirdButton.setContentAreaFilled(false);
        Twelve_ThirdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Twelve_ThirdButton.setFocusPainted(false);
        Twelve_ThirdButton.setFocusable(false);
        Twelve_ThirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Twelve_ThirdButtonActionPerformed(evt);
            }
        });
        Twelve_Quiz_Frame.getContentPane().add(Twelve_ThirdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 490, 170));

        Twelve_FourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Button_Earth.png"))); // NOI18N
        Twelve_FourthButton.setBorder(null);
        Twelve_FourthButton.setContentAreaFilled(false);
        Twelve_FourthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Twelve_FourthButton.setFocusPainted(false);
        Twelve_FourthButton.setFocusable(false);
        Twelve_FourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Twelve_FourthButtonActionPerformed(evt);
            }
        });
        Twelve_Quiz_Frame.getContentPane().add(Twelve_FourthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 500, 170));

        FirstQuizCloseButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Close.png"))); // NOI18N
        FirstQuizCloseButton11.setBorder(null);
        FirstQuizCloseButton11.setContentAreaFilled(false);
        FirstQuizCloseButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstQuizCloseButton11.setFocusPainted(false);
        FirstQuizCloseButton11.setFocusable(false);
        FirstQuizCloseButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstQuizCloseButton11ActionPerformed(evt);
            }
        });
        Twelve_Quiz_Frame.getContentPane().add(FirstQuizCloseButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 70, 80));

        TwelveQuizButton_HINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/New_Hint_Button.png"))); // NOI18N
        TwelveQuizButton_HINT.setBorder(null);
        TwelveQuizButton_HINT.setContentAreaFilled(false);
        TwelveQuizButton_HINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TwelveQuizButton_HINT.setFocusPainted(false);
        TwelveQuizButton_HINT.setFocusable(false);
        TwelveQuizButton_HINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwelveQuizButton_HINTActionPerformed(evt);
            }
        });
        Twelve_Quiz_Frame.getContentPane().add(TwelveQuizButton_HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 390, 120));

        QuestionLayout11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Twelve_Quiz_Blue.png"))); // NOI18N
        Twelve_Quiz_Frame.getContentPane().add(QuestionLayout11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 950));

        QUIZ_HINT.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HINT_OKAY_BUTTON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Hint_OK.png"))); // NOI18N
        HINT_OKAY_BUTTON.setBorder(null);
        HINT_OKAY_BUTTON.setContentAreaFilled(false);
        HINT_OKAY_BUTTON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HINT_OKAY_BUTTON.setFocusPainted(false);
        HINT_OKAY_BUTTON.setFocusable(false);
        HINT_OKAY_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HINT_OKAY_BUTTONActionPerformed(evt);
            }
        });
        QUIZ_HINT.getContentPane().add(HINT_OKAY_BUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 230, 200));

        HINT_PANEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QUIZ_HINT.getContentPane().add(HINT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1060, 380));

        hint_layout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/HINT_TEMPLATE.png"))); // NOI18N
        hint_layout.setText("jLabel14");
        QUIZ_HINT.getContentPane().add(hint_layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 660));

        EARTH_SIZE_INFORMATION.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Done_Button.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        EARTH_SIZE_INFORMATION.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 460, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Size.png"))); // NOI18N
        EARTH_SIZE_INFORMATION.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 520));

        EARTH_DFTE_INFORMATION.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Done_Button1.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        EARTH_DFTE_INFORMATION.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 445, 220, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_DFTE_1.png"))); // NOI18N
        EARTH_DFTE_INFORMATION.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 520));

        EARTH_ROIA_INFORMATION.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Done_Button1.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        EARTH_ROIA_INFORMATION.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 445, 220, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_ROIA.png"))); // NOI18N
        EARTH_ROIA_INFORMATION.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 520));

        EARTH_TEMP_INFORMATION.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Done_Button1.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setFocusPainted(false);
        jButton13.setFocusable(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        EARTH_TEMP_INFORMATION.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 220, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/DISPLAY_TEMP_EARTH.png"))); // NOI18N
        EARTH_TEMP_INFORMATION.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        MOON_SIZE_INFORMATION.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Done_Button1.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        MOON_SIZE_INFORMATION.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 445, 220, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Moon_Sizze.png"))); // NOI18N
        MOON_SIZE_INFORMATION.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 520));

        MOON_DFTE_INFORMATION.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Done_Button1.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        MOON_DFTE_INFORMATION.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 445, 220, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Moon_DFTE.png"))); // NOI18N
        MOON_DFTE_INFORMATION.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 520));

        MOON_ROIA_INFORMATION.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Done_Button1.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        MOON_ROIA_INFORMATION.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 445, 220, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Moon_ROIA.png"))); // NOI18N
        MOON_ROIA_INFORMATION.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 520));

        MOON_TEMP_INFORMATION.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Done_Button1.png"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setFocusPainted(false);
        jButton14.setFocusable(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        MOON_TEMP_INFORMATION.getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 220, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/DISPLAY_TEMP_MOON.png"))); // NOI18N
        MOON_TEMP_INFORMATION.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 520));

        SUN_SIZE_INFORMATION.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Done_Button1.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusPainted(false);
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        SUN_SIZE_INFORMATION.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 445, 220, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Sun_Size.png"))); // NOI18N
        SUN_SIZE_INFORMATION.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 520));

        SUN_DFTE_INFORMATION.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Done_Button1.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        SUN_DFTE_INFORMATION.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 445, 220, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_SUN_DFTE.png"))); // NOI18N
        SUN_DFTE_INFORMATION.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 520));

        SUN_ROIA_INFORMATION.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Done_Button1.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setFocusPainted(false);
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        SUN_ROIA_INFORMATION.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 445, 220, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_SUN_ROIA.png"))); // NOI18N
        SUN_ROIA_INFORMATION.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 520));

        SUN_TEMP_INFORMATION.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Display_Done_Button1.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setContentAreaFilled(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.setFocusPainted(false);
        jButton15.setFocusable(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        SUN_TEMP_INFORMATION.getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 435, 220, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/DISPLAY_TEMP_SUN.png"))); // NOI18N
        SUN_TEMP_INFORMATION.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        Screen_View_Earth.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/closebutton_brown.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Screen_View_Earth.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 180, 130));

        FORESTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clicker.png"))); // NOI18N
        FORESTS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FORESTS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FORESTSMouseMoved(evt);
            }
        });
        Screen_View_Earth.getContentPane().add(FORESTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, 40, 40));

        LAKE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clicker.png"))); // NOI18N
        LAKE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LAKE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LAKEMouseMoved(evt);
            }
        });
        Screen_View_Earth.getContentPane().add(LAKE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 195, 120, 40));

        MOUNTAINS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clicker.png"))); // NOI18N
        MOUNTAINS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MOUNTAINS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MOUNTAINSMouseMoved(evt);
            }
        });
        Screen_View_Earth.getContentPane().add(MOUNTAINS, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 385, 120, 40));

        PLAINS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clicker.png"))); // NOI18N
        PLAINS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PLAINS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PLAINSMouseMoved(evt);
            }
        });
        Screen_View_Earth.getContentPane().add(PLAINS, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 595, 90, 40));

        ISLANDS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clicker.png"))); // NOI18N
        ISLANDS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ISLANDS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ISLANDSMouseMoved(evt);
            }
        });
        Screen_View_Earth.getContentPane().add(ISLANDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, 30, 40));

        OCEAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clicker.png"))); // NOI18N
        OCEAN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OCEAN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                OCEANMouseMoved(evt);
            }
        });
        Screen_View_Earth.getContentPane().add(OCEAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 420, 40, 40));

        Main_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_View_Main_1.png"))); // NOI18N
        Main_Earth.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Main_EarthMouseMoved(evt);
            }
        });
        Screen_View_Earth.getContentPane().add(Main_Earth, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 760));

        Screen_View_Moon.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/blueButton.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setFocusPainted(false);
        jButton11.setFocusable(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        Screen_View_Moon.getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 180, 130));

        LUNARMARIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clicker.png"))); // NOI18N
        LUNARMARIA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LUNARMARIA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LUNARMARIAMouseMoved(evt);
            }
        });
        Screen_View_Moon.getContentPane().add(LUNARMARIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 160, 40));

        CRATERS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clicker.png"))); // NOI18N
        CRATERS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CRATERS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CRATERSMouseMoved(evt);
            }
        });
        Screen_View_Moon.getContentPane().add(CRATERS, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 235, -1, 30));

        Main_Moon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Moon_View_Main.png"))); // NOI18N
        Main_Moon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Main_MoonMouseMoved(evt);
            }
        });
        Screen_View_Moon.getContentPane().add(Main_Moon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 760));

        Screen_View_Sun.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/violetButton.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setFocusPainted(false);
        jButton12.setFocusable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        Screen_View_Sun.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 180, 130));

        CORONA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clicker.png"))); // NOI18N
        CORONA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CORONA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CORONAMouseMoved(evt);
            }
        });
        Screen_View_Sun.getContentPane().add(CORONA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 160, 40));

        PROMINENCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clicker.png"))); // NOI18N
        PROMINENCE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PROMINENCE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PROMINENCEMouseMoved(evt);
            }
        });
        Screen_View_Sun.getContentPane().add(PROMINENCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 205, 30, 70));

        SPOTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clicker.png"))); // NOI18N
        SPOTS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SPOTS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SPOTSMouseMoved(evt);
            }
        });
        Screen_View_Sun.getContentPane().add(SPOTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 525, 40, 40));

        FLARE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/clicker.png"))); // NOI18N
        FLARE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FLARE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FLAREMouseMoved(evt);
            }
        });
        Screen_View_Sun.getContentPane().add(FLARE, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 475, 160, 40));

        Main_Sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_View_Main.png"))); // NOI18N
        Main_Sun.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Main_SunMouseMoved(evt);
            }
        });
        Screen_View_Sun.getContentPane().add(Main_Sun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 760));

        SpaceShip.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SpaceShip_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Button_ShapeShip_Close.png"))); // NOI18N
        SpaceShip_Close.setBorder(null);
        SpaceShip_Close.setContentAreaFilled(false);
        SpaceShip_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SpaceShip_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpaceShip_CloseActionPerformed(evt);
            }
        });
        SpaceShip.getContentPane().add(SpaceShip_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 640, 150, 80));

        SpaceShip_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Spaceship_Button.png"))); // NOI18N
        SpaceShip_Earth.setBorder(null);
        SpaceShip_Earth.setContentAreaFilled(false);
        SpaceShip_Earth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SpaceShip_Earth.setFocusPainted(false);
        SpaceShip_Earth.setFocusable(false);
        SpaceShip_Earth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpaceShip_EarthActionPerformed(evt);
            }
        });
        SpaceShip.getContentPane().add(SpaceShip_Earth, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 170, 50));

        SpaceShip_Moon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Spaceship_Button_Moon.png"))); // NOI18N
        SpaceShip_Moon.setBorder(null);
        SpaceShip_Moon.setContentAreaFilled(false);
        SpaceShip_Moon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SpaceShip_Moon.setFocusPainted(false);
        SpaceShip_Moon.setFocusable(false);
        SpaceShip_Moon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpaceShip_MoonActionPerformed(evt);
            }
        });
        SpaceShip.getContentPane().add(SpaceShip_Moon, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 170, 50));

        SpaceShip_Sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Spaceship_Button_Sun.png"))); // NOI18N
        SpaceShip_Sun.setBorder(null);
        SpaceShip_Sun.setContentAreaFilled(false);
        SpaceShip_Sun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SpaceShip_Sun.setFocusPainted(false);
        SpaceShip_Sun.setFocusable(false);
        SpaceShip_Sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpaceShip_SunActionPerformed(evt);
            }
        });
        SpaceShip.getContentPane().add(SpaceShip_Sun, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 170, 50));

        SpaceShipLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SpaceShip Adventure_Sun.png"))); // NOI18N
        SpaceShipLayout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SpaceShipLayoutMouseMoved(evt);
            }
        });
        SpaceShip.getContentPane().add(SpaceShipLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 770));

        Reminder.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        First_Reminder_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Rem_Button2.png"))); // NOI18N
        First_Reminder_Button.setBorder(null);
        First_Reminder_Button.setContentAreaFilled(false);
        First_Reminder_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        First_Reminder_Button.setFocusPainted(false);
        First_Reminder_Button.setFocusable(false);
        First_Reminder_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                First_Reminder_ButtonActionPerformed(evt);
            }
        });
        Reminder.getContentPane().add(First_Reminder_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1050, 250));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Rem_Panel.png"))); // NOI18N
        Reminder.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 270));

        Before_Teaching_Strat.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B4_proceed_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/B4_Button_One.png"))); // NOI18N
        B4_proceed_button.setBorder(null);
        B4_proceed_button.setContentAreaFilled(false);
        B4_proceed_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B4_proceed_button.setFocusPainted(false);
        B4_proceed_button.setFocusable(false);
        B4_proceed_button.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                B4_proceed_buttonMouseMoved(evt);
            }
        });
        B4_proceed_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4_proceed_buttonActionPerformed(evt);
            }
        });
        Before_Teaching_Strat.getContentPane().add(B4_proceed_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, 840, 210));

        HintUsed_Variable_Display.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        HintUsed_Variable_Display.setForeground(new java.awt.Color(75, 91, 123));
        HintUsed_Variable_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HintUsed_Variable_Display.setText("0");
        Before_Teaching_Strat.getContentPane().add(HintUsed_Variable_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 340, 100));

        Score_Variable_Display.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        Score_Variable_Display.setForeground(new java.awt.Color(75, 91, 123));
        Score_Variable_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Score_Variable_Display.setText("0 / 9");
        Before_Teaching_Strat.getContentPane().add(Score_Variable_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 340, 100));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Before_Strat_1.png"))); // NOI18N
        jLabel15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel15MouseMoved(evt);
            }
        });
        Before_Teaching_Strat.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 980));

        Conversational_Learning.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ConButton_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Back_Button_Conver.png"))); // NOI18N
        ConButton_Back.setBorder(null);
        ConButton_Back.setContentAreaFilled(false);
        ConButton_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConButton_Back.setFocusPainted(false);
        ConButton_Back.setFocusable(false);
        ConButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConButton_BackActionPerformed(evt);
            }
        });
        Conversational_Learning.getContentPane().add(ConButton_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 240, 100));

        ConButton_Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Next_Button_Conver.png"))); // NOI18N
        ConButton_Next.setBorder(null);
        ConButton_Next.setContentAreaFilled(false);
        ConButton_Next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConButton_Next.setFocusPainted(false);
        ConButton_Next.setFocusable(false);
        ConButton_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConButton_NextActionPerformed(evt);
            }
        });
        Conversational_Learning.getContentPane().add(ConButton_Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, 240, 100));

        con_button_sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun_Button.png"))); // NOI18N
        con_button_sun.setBorder(null);
        con_button_sun.setContentAreaFilled(false);
        con_button_sun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        con_button_sun.setFocusPainted(false);
        con_button_sun.setFocusable(false);
        con_button_sun.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                con_button_sunMouseMoved(evt);
            }
        });
        con_button_sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_button_sunActionPerformed(evt);
            }
        });
        Conversational_Learning.getContentPane().add(con_button_sun, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 410, 200));

        con_button_earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth_Button.png"))); // NOI18N
        con_button_earth.setBorder(null);
        con_button_earth.setContentAreaFilled(false);
        con_button_earth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        con_button_earth.setFocusPainted(false);
        con_button_earth.setFocusable(false);
        con_button_earth.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                con_button_earthMouseMoved(evt);
            }
        });
        con_button_earth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_button_earthActionPerformed(evt);
            }
        });
        Conversational_Learning.getContentPane().add(con_button_earth, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 420, 200));

        con_button_moon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon_Button.png"))); // NOI18N
        con_button_moon.setBorder(null);
        con_button_moon.setContentAreaFilled(false);
        con_button_moon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        con_button_moon.setFocusPainted(false);
        con_button_moon.setFocusable(false);
        con_button_moon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                con_button_moonMouseMoved(evt);
            }
        });
        con_button_moon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_button_moonActionPerformed(evt);
            }
        });
        Conversational_Learning.getContentPane().add(con_button_moon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 120, 430, 200));

        Con_Layout_Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/First_Frame.png"))); // NOI18N
        Con_Layout_Panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Con_Layout_PanelMouseMoved(evt);
            }
        });
        Conversational_Learning.getContentPane().add(Con_Layout_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, -1));

        Conversational_Learning_Earth.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ConButton_Back_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Back_Button_Conver.png"))); // NOI18N
        ConButton_Back_Earth.setBorder(null);
        ConButton_Back_Earth.setContentAreaFilled(false);
        ConButton_Back_Earth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConButton_Back_Earth.setFocusPainted(false);
        ConButton_Back_Earth.setFocusable(false);
        ConButton_Back_Earth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConButton_Back_EarthActionPerformed(evt);
            }
        });
        Conversational_Learning_Earth.getContentPane().add(ConButton_Back_Earth, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 240, 100));

        ConButton_Next_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Next_Button_Conver.png"))); // NOI18N
        ConButton_Next_Earth.setBorder(null);
        ConButton_Next_Earth.setContentAreaFilled(false);
        ConButton_Next_Earth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConButton_Next_Earth.setFocusPainted(false);
        ConButton_Next_Earth.setFocusable(false);
        ConButton_Next_Earth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConButton_Next_EarthActionPerformed(evt);
            }
        });
        Conversational_Learning_Earth.getContentPane().add(ConButton_Next_Earth, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, 240, 100));

        CLE_Text.setBackground(new java.awt.Color(255, 255, 255));
        CLE_Text.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        CLE_Text.setForeground(new java.awt.Color(0, 0, 0));
        CLE_Text.setBorder(null);
        Conversational_Learning_Earth.getContentPane().add(CLE_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 710, 110));

        Conver_proceed_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Proceed_Conver.png"))); // NOI18N
        Conver_proceed_Button.setText("jButton17");
        Conver_proceed_Button.setBorder(null);
        Conver_proceed_Button.setContentAreaFilled(false);
        Conver_proceed_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Conver_proceed_Button.setFocusPainted(false);
        Conver_proceed_Button.setFocusable(false);
        Conver_proceed_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Conver_proceed_ButtonActionPerformed(evt);
            }
        });
        Conversational_Learning_Earth.getContentPane().add(Conver_proceed_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, 410, 150));

        CLE_Back_To_Main_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Back_TOMAINPAGE.png"))); // NOI18N
        CLE_Back_To_Main_Button.setBorder(null);
        CLE_Back_To_Main_Button.setContentAreaFilled(false);
        CLE_Back_To_Main_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CLE_Back_To_Main_Button.setFocusPainted(false);
        CLE_Back_To_Main_Button.setFocusable(false);
        CLE_Back_To_Main_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLE_Back_To_Main_ButtonActionPerformed(evt);
            }
        });
        Conversational_Learning_Earth.getContentPane().add(CLE_Back_To_Main_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 760, 330));

        Con_Layout_Panel_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Conver_Layout_Earth_FirstFrame.png"))); // NOI18N
        Con_Layout_Panel_Earth.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Con_Layout_Panel_EarthMouseMoved(evt);
            }
        });
        Conversational_Learning_Earth.getContentPane().add(Con_Layout_Panel_Earth, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, -1));

        Conversational_Learning_Moon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Conversational_Learning_Moon.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ConButton_Back_Moon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Back_Button_Conver.png"))); // NOI18N
        ConButton_Back_Moon.setBorder(null);
        ConButton_Back_Moon.setContentAreaFilled(false);
        ConButton_Back_Moon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConButton_Back_Moon.setFocusPainted(false);
        ConButton_Back_Moon.setFocusable(false);
        ConButton_Back_Moon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConButton_Back_MoonActionPerformed(evt);
            }
        });
        Conversational_Learning_Moon.getContentPane().add(ConButton_Back_Moon, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 240, 100));

        ConButton_Next_Moon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Next_Button_Conver.png"))); // NOI18N
        ConButton_Next_Moon.setBorder(null);
        ConButton_Next_Moon.setContentAreaFilled(false);
        ConButton_Next_Moon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConButton_Next_Moon.setFocusPainted(false);
        ConButton_Next_Moon.setFocusable(false);
        ConButton_Next_Moon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConButton_Next_MoonActionPerformed(evt);
            }
        });
        Conversational_Learning_Moon.getContentPane().add(ConButton_Next_Moon, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, 240, 100));

        CLM_ComboBox.setBackground(new java.awt.Color(255, 255, 255));
        CLM_ComboBox.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        CLM_ComboBox.setForeground(new java.awt.Color(0, 0, 0));
        CLM_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25.3 Days", "27.3 Days", "28.3 Days", "30.3 Days" }));
        CLM_ComboBox.setBorder(null);
        Conversational_Learning_Moon.getContentPane().add(CLM_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 710, 110));

        CLM_Text.setBackground(new java.awt.Color(255, 255, 255));
        CLM_Text.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        CLM_Text.setForeground(new java.awt.Color(0, 0, 0));
        CLM_Text.setBorder(null);
        Conversational_Learning_Moon.getContentPane().add(CLM_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 710, 110));

        Conver_proceed_Button_Moon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Proceed_Conver.png"))); // NOI18N
        Conver_proceed_Button_Moon.setText("jButton17");
        Conver_proceed_Button_Moon.setBorder(null);
        Conver_proceed_Button_Moon.setContentAreaFilled(false);
        Conver_proceed_Button_Moon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Conver_proceed_Button_Moon.setFocusPainted(false);
        Conver_proceed_Button_Moon.setFocusable(false);
        Conver_proceed_Button_Moon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Conver_proceed_Button_MoonActionPerformed(evt);
            }
        });
        Conversational_Learning_Moon.getContentPane().add(Conver_proceed_Button_Moon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, 410, 150));

        CLM_Back_To_Main_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Back_TOMAINPAGE.png"))); // NOI18N
        CLM_Back_To_Main_Button.setBorder(null);
        CLM_Back_To_Main_Button.setContentAreaFilled(false);
        CLM_Back_To_Main_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CLM_Back_To_Main_Button.setFocusPainted(false);
        CLM_Back_To_Main_Button.setFocusable(false);
        CLM_Back_To_Main_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLM_Back_To_Main_ButtonActionPerformed(evt);
            }
        });
        Conversational_Learning_Moon.getContentPane().add(CLM_Back_To_Main_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 760, 330));

        Con_Layout_Panel_Moon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Conver_Layout_Moon_1Frame.png"))); // NOI18N
        Con_Layout_Panel_Moon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Con_Layout_Panel_MoonMouseMoved(evt);
            }
        });
        Conversational_Learning_Moon.getContentPane().add(Con_Layout_Panel_Moon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, -1));

        Conversational_Learning_Sun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Conversational_Learning_Sun.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ConButton_Back_Sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Back_Button_Conver.png"))); // NOI18N
        ConButton_Back_Sun.setBorder(null);
        ConButton_Back_Sun.setContentAreaFilled(false);
        ConButton_Back_Sun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConButton_Back_Sun.setFocusPainted(false);
        ConButton_Back_Sun.setFocusable(false);
        ConButton_Back_Sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConButton_Back_SunActionPerformed(evt);
            }
        });
        Conversational_Learning_Sun.getContentPane().add(ConButton_Back_Sun, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 240, 100));

        ConButton_Next_Sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Next_Button_Conver.png"))); // NOI18N
        ConButton_Next_Sun.setBorder(null);
        ConButton_Next_Sun.setContentAreaFilled(false);
        ConButton_Next_Sun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConButton_Next_Sun.setFocusPainted(false);
        ConButton_Next_Sun.setFocusable(false);
        ConButton_Next_Sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConButton_Next_SunActionPerformed(evt);
            }
        });
        Conversational_Learning_Sun.getContentPane().add(ConButton_Next_Sun, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, 240, 100));

        CLS_Text.setBackground(new java.awt.Color(255, 255, 255));
        CLS_Text.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        CLS_Text.setForeground(new java.awt.Color(0, 0, 0));
        CLS_Text.setBorder(null);
        Conversational_Learning_Sun.getContentPane().add(CLS_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 710, 110));

        Conver_proceed_Button_Sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Proceed_Conver.png"))); // NOI18N
        Conver_proceed_Button_Sun.setText("jButton17");
        Conver_proceed_Button_Sun.setBorder(null);
        Conver_proceed_Button_Sun.setContentAreaFilled(false);
        Conver_proceed_Button_Sun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Conver_proceed_Button_Sun.setFocusPainted(false);
        Conver_proceed_Button_Sun.setFocusable(false);
        Conver_proceed_Button_Sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Conver_proceed_Button_SunActionPerformed(evt);
            }
        });
        Conversational_Learning_Sun.getContentPane().add(Conver_proceed_Button_Sun, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, 410, 150));

        CLS_Back_To_Main_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Back_TOMAINPAGE.png"))); // NOI18N
        CLS_Back_To_Main_Button.setBorder(null);
        CLS_Back_To_Main_Button.setContentAreaFilled(false);
        CLS_Back_To_Main_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CLS_Back_To_Main_Button.setFocusPainted(false);
        CLS_Back_To_Main_Button.setFocusable(false);
        CLS_Back_To_Main_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLS_Back_To_Main_ButtonActionPerformed(evt);
            }
        });
        Conversational_Learning_Sun.getContentPane().add(CLS_Back_To_Main_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 760, 330));

        Con_Layout_Panel_Sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Conver_Layout_Sun_1Frame.png"))); // NOI18N
        Con_Layout_Panel_Sun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Con_Layout_Panel_Sun.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Con_Layout_Panel_SunMouseMoved(evt);
            }
        });
        Conversational_Learning_Sun.getContentPane().add(Con_Layout_Panel_Sun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, -1));

        PostTest_Results.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GenderVarDisplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Girl_Picture.png"))); // NOI18N
        PostTest_Results.getContentPane().add(GenderVarDisplayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 343, 310, 280));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Finish_Button.png"))); // NOI18N
        jButton17.setBorder(null);
        jButton17.setContentAreaFilled(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setFocusPainted(false);
        jButton17.setFocusable(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        PostTest_Results.getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 750, 580, 210));

        Displayer_Pretest_Hint.setFont(new java.awt.Font("Lithos Pro Regular", 1, 80)); // NOI18N
        Displayer_Pretest_Hint.setForeground(new java.awt.Color(123, 211, 247));
        Displayer_Pretest_Hint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Displayer_Pretest_Hint.setText("20");
        PostTest_Results.getContentPane().add(Displayer_Pretest_Hint, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 330, 80));

        Displayer_FName.setFont(new java.awt.Font("Lithos Pro Regular", 1, 48)); // NOI18N
        Displayer_FName.setForeground(new java.awt.Color(123, 211, 247));
        Displayer_FName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Displayer_FName.setText("Rafael");
        PostTest_Results.getContentPane().add(Displayer_FName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 350, 80));

        Displayer_Age.setFont(new java.awt.Font("Lithos Pro Regular", 1, 48)); // NOI18N
        Displayer_Age.setForeground(new java.awt.Color(123, 211, 247));
        Displayer_Age.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Displayer_Age.setText("000");
        PostTest_Results.getContentPane().add(Displayer_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 330, 80));

        Displayer_Pretest_Score.setFont(new java.awt.Font("Lithos Pro Regular", 1, 80)); // NOI18N
        Displayer_Pretest_Score.setForeground(new java.awt.Color(123, 211, 247));
        Displayer_Pretest_Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Displayer_Pretest_Score.setText("9 / 9");
        PostTest_Results.getContentPane().add(Displayer_Pretest_Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 330, 80));

        Displayer_Posttest_Score.setFont(new java.awt.Font("Lithos Pro Regular", 1, 80)); // NOI18N
        Displayer_Posttest_Score.setForeground(new java.awt.Color(123, 211, 247));
        Displayer_Posttest_Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Displayer_Posttest_Score.setText("9 / 9");
        PostTest_Results.getContentPane().add(Displayer_Posttest_Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, 330, 80));

        Displayer_Posttest_Hint.setFont(new java.awt.Font("Lithos Pro Regular", 1, 80)); // NOI18N
        Displayer_Posttest_Hint.setForeground(new java.awt.Color(123, 211, 247));
        Displayer_Posttest_Hint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Displayer_Posttest_Hint.setText("20");
        PostTest_Results.getContentPane().add(Displayer_Posttest_Hint, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, 330, 80));

        PostTest_Result_Layout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Postest_display_UI.png"))); // NOI18N
        PostTest_Results.getContentPane().add(PostTest_Result_Layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 980));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MAIN_LAYOUTMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAIN_LAYOUTMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        TeachingStrat.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MAIN_LAYOUTMouseDragged

    private void MAIN_LAYOUTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAIN_LAYOUTMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MAIN_LAYOUTMousePressed

    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        // TODO add your handling code here:
        TeachingStrat.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void BUTTON_SIZE_ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_SIZE_ONActionPerformed
        if (null != planet) // TODO add your handling code here:
        {
            switch (planet) {
                case "EARTH":
                    //EARTH_SIZE_INFORMATION.setUndecorated(true);
                    // EARTH_SIZE_INFORMATION.setBackground(new Color(0, 0, 0, 0));
                    EARTH_SIZE_INFORMATION.setVisible(true);
                    EARTH_SIZE_INFORMATION.pack();
                    EARTH_SIZE_INFORMATION.setLocationRelativeTo(null);
                    BUTTON_SIZE_ON.setVisible(false);
                    BUTTON_SIZE_ON.setEnabled(false);
                    BUTTON_SIZE_OFF.setVisible(true);
                    BUTTON_SIZE_OFF.setEnabled(true);
                    TEXT_SIZE.setForeground(new Color(144, 39, 30));
                    break;
                case "MOON":
                    //MOON_SIZE_INFORMATION.setUndecorated(true);
                    //MOON_SIZE_INFORMATION.setBackground(new Color(0, 0, 0, 0));
                    MOON_SIZE_INFORMATION.setVisible(true);
                    MOON_SIZE_INFORMATION.pack();
                    MOON_SIZE_INFORMATION.setLocationRelativeTo(null);
                    BUTTON_SIZE_ON.setVisible(false);
                    BUTTON_SIZE_ON.setEnabled(false);
                    BUTTON_SIZE_OFF.setVisible(true);
                    BUTTON_SIZE_OFF.setEnabled(true);
                    TEXT_SIZE.setForeground(new Color(144, 39, 30));
                    break;
                case "SUN":
                    //SUN_SIZE_INFORMATION.setUndecorated(true);
                    //SUN_SIZE_INFORMATION.setBackground(new Color(0, 0, 0, 0));
                    SUN_SIZE_INFORMATION.setVisible(true);
                    SUN_SIZE_INFORMATION.pack();
                    SUN_SIZE_INFORMATION.setLocationRelativeTo(null);
                    BUTTON_SIZE_ON.setVisible(false);
                    BUTTON_SIZE_ON.setEnabled(false);
                    BUTTON_SIZE_OFF.setVisible(true);
                    BUTTON_SIZE_OFF.setEnabled(true);
                    TEXT_SIZE.setForeground(new Color(144, 39, 30));
                    break;
                default:
                    break;
            }
        }
        posttest_clicks += 1;
        postTest_Quiz_Displayer();

    }//GEN-LAST:event_BUTTON_SIZE_ONActionPerformed

    private void BUTTON_SIZE_OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_SIZE_OFFActionPerformed
        if (null != planet) // TODO add your handling code here:
        {
            switch (planet) {
                case "EARTH":
                    BUTTON_SIZE_ON.setVisible(true);
                    BUTTON_SIZE_ON.setEnabled(true);
                    BUTTON_SIZE_OFF.setVisible(false);
                    BUTTON_SIZE_OFF.setEnabled(false);
                    TEXT_SIZE.setForeground(new Color(8, 87, 91));
                    EARTH_SIZE_INFORMATION.dispose();
                    EARTH_SIZE_INFORMATION.setVisible(false);

                    break;
                case "MOON":
                    BUTTON_SIZE_ON.setVisible(true);
                    BUTTON_SIZE_ON.setEnabled(true);
                    BUTTON_SIZE_OFF.setVisible(false);
                    BUTTON_SIZE_OFF.setEnabled(false);
                    TEXT_SIZE.setForeground(new Color(8, 87, 91));
                    MOON_SIZE_INFORMATION.dispose();
                    MOON_SIZE_INFORMATION.setVisible(false);

                    break;
                case "SUN":
                    BUTTON_SIZE_ON.setVisible(true);
                    BUTTON_SIZE_ON.setEnabled(true);
                    BUTTON_SIZE_OFF.setVisible(false);
                    BUTTON_SIZE_OFF.setEnabled(false);
                    TEXT_SIZE.setForeground(new Color(8, 87, 91));
                    SUN_SIZE_INFORMATION.dispose();
                    SUN_SIZE_INFORMATION.setVisible(false);

                    break;
                default:
                    break;
            }
        }
        posttest_clicks += 1;
        postTest_Quiz_Displayer();

    }//GEN-LAST:event_BUTTON_SIZE_OFFActionPerformed

    private void BUTTON_DFTE_ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_DFTE_ONActionPerformed
        if (null != planet) // TODO add your handling code here:
        {

            switch (planet) {
                case "EARTH":
                    // EARTH_DFTE_INFORMATION.setUndecorated(true);
                    // EARTH_DFTE_INFORMATION.setBackground(new Color(0, 0, 0, 0));
                    EARTH_DFTE_INFORMATION.setVisible(true);
                    EARTH_DFTE_INFORMATION.pack();
                    EARTH_DFTE_INFORMATION.setLocationRelativeTo(null);
                    BUTTON_DFTE_ON.setVisible(false);
                    BUTTON_DFTE_ON.setEnabled(false);
                    BUTTON_DFTE_OFF.setVisible(true);
                    BUTTON_DFTE_OFF.setEnabled(true);
                    TEXT_DFTE.setForeground(new Color(144, 39, 30));
                    break;
                case "MOON":
                    // MOON_DFTE_INFORMATION.setUndecorated(true);
                    // MOON_DFTE_INFORMATION.setBackground(new Color(0, 0, 0, 0));
                    MOON_DFTE_INFORMATION.setVisible(true);
                    MOON_DFTE_INFORMATION.pack();
                    MOON_DFTE_INFORMATION.setLocationRelativeTo(null);
                    BUTTON_DFTE_ON.setVisible(false);
                    BUTTON_DFTE_ON.setEnabled(false);
                    BUTTON_DFTE_OFF.setVisible(true);
                    BUTTON_DFTE_OFF.setEnabled(true);
                    TEXT_DFTE.setForeground(new Color(144, 39, 30));
                    break;
                case "SUN":
                    // SUN_DFTE_INFORMATION.setUndecorated(true);
                    // SUN_DFTE_INFORMATION.setBackground(new Color(0, 0, 0, 0));
                    SUN_DFTE_INFORMATION.setVisible(true);
                    SUN_DFTE_INFORMATION.pack();
                    SUN_DFTE_INFORMATION.setLocationRelativeTo(null);
                    BUTTON_DFTE_ON.setVisible(false);
                    BUTTON_DFTE_ON.setEnabled(false);
                    BUTTON_DFTE_OFF.setVisible(true);
                    BUTTON_DFTE_OFF.setEnabled(true);
                    TEXT_DFTE.setForeground(new Color(144, 39, 30));
                    break;
                default:
                    break;
            }
        }

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_BUTTON_DFTE_ONActionPerformed

    private void BUTTON_DFTE_OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_DFTE_OFFActionPerformed

        if (null != planet) // TODO add your handling code here:
        {
            switch (planet) {
                case "EARTH":
                    EARTH_DFTE_INFORMATION.dispose();
                    EARTH_DFTE_INFORMATION.setVisible(false);
                    BUTTON_DFTE_ON.setVisible(true);
                    BUTTON_DFTE_ON.setEnabled(true);
                    BUTTON_DFTE_OFF.setVisible(false);
                    BUTTON_DFTE_OFF.setEnabled(false);
                    TEXT_DFTE.setForeground(new Color(8, 87, 91));
                    break;
                case "MOON":
                    MOON_DFTE_INFORMATION.dispose();
                    MOON_DFTE_INFORMATION.setVisible(false);
                    BUTTON_DFTE_ON.setVisible(true);
                    BUTTON_DFTE_ON.setEnabled(true);
                    BUTTON_DFTE_OFF.setVisible(false);
                    BUTTON_DFTE_OFF.setEnabled(false);
                    TEXT_DFTE.setForeground(new Color(8, 87, 91));
                    break;
                case "SUN":
                    SUN_DFTE_INFORMATION.dispose();
                    SUN_DFTE_INFORMATION.setVisible(false);
                    BUTTON_DFTE_ON.setVisible(true);
                    BUTTON_DFTE_ON.setEnabled(true);
                    BUTTON_DFTE_OFF.setVisible(false);
                    BUTTON_DFTE_OFF.setEnabled(false);
                    TEXT_DFTE.setForeground(new Color(8, 87, 91));
                    break;
                default:
                    break;
            }
        }

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_BUTTON_DFTE_OFFActionPerformed

    private void BUTTON_ROIA_ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_ROIA_ONActionPerformed
        if (null != planet) // TODO add your handling code here:
        {
            switch (planet) {
                case "EARTH":
                    // EARTH_ROIA_INFORMATION.setUndecorated(true);
                    // EARTH_ROIA_INFORMATION.setBackground(new Color(0, 0, 0, 0));
                    EARTH_ROIA_INFORMATION.setVisible(true);
                    EARTH_ROIA_INFORMATION.pack();
                    EARTH_ROIA_INFORMATION.setLocationRelativeTo(null);
                    BUTTON_ROIA_ON.setVisible(false);
                    BUTTON_ROIA_ON.setEnabled(false);
                    BUTTON_ROIA_OFF.setVisible(true);
                    BUTTON_ROIA_OFF.setEnabled(true);
                    TEXT_ROIA.setForeground(new Color(144, 39, 30));
                    break;
                case "MOON":
                    // MOON_ROIA_INFORMATION.setUndecorated(true);
                    // MOON_ROIA_INFORMATION.setBackground(new Color(0, 0, 0, 0));
                    MOON_ROIA_INFORMATION.setVisible(true);
                    MOON_ROIA_INFORMATION.pack();
                    MOON_ROIA_INFORMATION.setLocationRelativeTo(null);
                    BUTTON_ROIA_ON.setVisible(false);
                    BUTTON_ROIA_ON.setEnabled(false);
                    BUTTON_ROIA_OFF.setVisible(true);
                    BUTTON_ROIA_OFF.setEnabled(true);
                    TEXT_ROIA.setForeground(new Color(144, 39, 30));
                    break;
                case "SUN":
                    // SUN_ROIA_INFORMATION.setUndecorated(true);
                    // SUN_ROIA_INFORMATION.setBackground(new Color(0, 0, 0, 0));
                    SUN_ROIA_INFORMATION.setVisible(true);
                    SUN_ROIA_INFORMATION.pack();
                    SUN_ROIA_INFORMATION.setLocationRelativeTo(null);
                    BUTTON_ROIA_ON.setVisible(false);
                    BUTTON_ROIA_ON.setEnabled(false);
                    BUTTON_ROIA_OFF.setVisible(true);
                    BUTTON_ROIA_OFF.setEnabled(true);
                    TEXT_ROIA.setForeground(new Color(144, 39, 30));
                    break;
                default:
                    break;
            }
        }
        posttest_clicks += 1;
        postTest_Quiz_Displayer();

    }//GEN-LAST:event_BUTTON_ROIA_ONActionPerformed

    private void BUTTON_ROIA_OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_ROIA_OFFActionPerformed
        if (null != planet) // TODO add your handling code here:
        {
            switch (planet) {
                case "EARTH":
                    EARTH_ROIA_INFORMATION.dispose();
                    EARTH_ROIA_INFORMATION.setVisible(false);

                    BUTTON_ROIA_ON.setVisible(true);
                    BUTTON_ROIA_ON.setEnabled(true);
                    BUTTON_ROIA_OFF.setVisible(false);
                    BUTTON_ROIA_OFF.setEnabled(false);
                    TEXT_ROIA.setForeground(new Color(8, 87, 91));
                    break;
                case "MOON":
                    MOON_ROIA_INFORMATION.dispose();
                    MOON_ROIA_INFORMATION.setVisible(false);

                    BUTTON_ROIA_ON.setVisible(true);
                    BUTTON_ROIA_ON.setEnabled(true);
                    BUTTON_ROIA_OFF.setVisible(false);
                    BUTTON_ROIA_OFF.setEnabled(false);
                    TEXT_ROIA.setForeground(new Color(8, 87, 91));
                    break;
                case "SUN":
                    SUN_ROIA_INFORMATION.dispose();
                    SUN_ROIA_INFORMATION.setVisible(false);

                    BUTTON_ROIA_ON.setVisible(true);
                    BUTTON_ROIA_ON.setEnabled(true);
                    BUTTON_ROIA_OFF.setVisible(false);
                    BUTTON_ROIA_OFF.setEnabled(false);
                    TEXT_ROIA.setForeground(new Color(8, 87, 91));
                    break;
                default:
                    break;
            }
        }
        posttest_clicks += 1;
        postTest_Quiz_Displayer();

    }//GEN-LAST:event_BUTTON_ROIA_OFFActionPerformed

    public void Text_Changer(String str) {
        if (null != str) {
            switch (str) {
                case "EARTH":
                    TEXT_SIZE.setText("13,000 KM");
                    TEXT_DFTE.setText("N/A");
                    TEXT_ROIA.setText("24 HOURS");
                    break;
                case "MOON":
                    TEXT_SIZE.setText("3,474.2 KM");
                    TEXT_DFTE.setText("384,400 KM");
                    TEXT_ROIA.setText("27 DAYS");
                    break;
                case "SUN":
                    TEXT_SIZE.setText("1.3927M KM");
                    TEXT_DFTE.setText("147.2M KM");
                    TEXT_ROIA.setText("27 DAYS");
                    break;
                default:
                    break;
            }
        }
    }
    private void ARROW_RIGHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARROW_RIGHTActionPerformed
        // TODO add your handling code here:
        planet_indicator += 1;
        if (planet_indicator > -1) {
            int planetChecker = planet_indicator % 3;
            switch (planetChecker) {
                case 1:
                    planet = "MOON";
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON.png")));
                    GLOW_ORANGE.setVisible(false);
                    GLOW_GREEN.setVisible(true);
                    GLOW_WHITE.setVisible(false);
                    TEXT_TEMP.setText("127 °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_MOON.png")));
                    break;
                case 2:
                    planet = "SUN";
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SUN.png")));
                    GLOW_ORANGE.setVisible(false);
                    GLOW_GREEN.setVisible(false);
                    GLOW_WHITE.setVisible(true);
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_SUN.png")));
                    TEXT_TEMP.setText("15M °C");
                    break;
                case 0:
                    planet = "EARTH";
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/EARTH.png")));
                    GLOW_ORANGE.setVisible(true);
                    GLOW_GREEN.setVisible(false);
                    GLOW_WHITE.setVisible(false);
                    TEXT_TEMP.setText("14 °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_EARTH.png")));
                    break;
                default:
                    break;
            }
        } else if (planet_indicator < 0) {
            int planetChecker = planet_indicator % 3;
            switch (planetChecker) {
                case -2:
                    planet = "MOON";
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON.png")));
                    GLOW_ORANGE.setVisible(false);
                    GLOW_GREEN.setVisible(true);
                    GLOW_WHITE.setVisible(false);
                    TEXT_TEMP.setText("127 °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_MOON.png")));
                    break;
                case -1:
                    planet = "SUN";
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SUN.png")));
                    GLOW_ORANGE.setVisible(false);
                    GLOW_GREEN.setVisible(false);
                    GLOW_WHITE.setVisible(true);
                    TEXT_TEMP.setText("15M °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_SUN.png")));
                    break;
                case 0:
                    planet = "EARTH";
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/EARTH.png")));
                    GLOW_ORANGE.setVisible(true);
                    GLOW_GREEN.setVisible(false);
                    GLOW_WHITE.setVisible(false);
                    TEXT_TEMP.setText("14 °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_EARTH.png")));
                    break;
                default:
                    break;
            }
        }
        Text_Changer(planet);
        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_ARROW_RIGHTActionPerformed

    private void ARROW_LEFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARROW_LEFTActionPerformed
        // TODO add your handling code here:
        planet_indicator -= 1;
        if (planet_indicator > -1) {
            int planetChecker = planet_indicator % 3;
            switch (planetChecker) {
                case 1:
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON.png")));
                    GLOW_ORANGE.setVisible(false);
                    GLOW_GREEN.setVisible(true);
                    GLOW_WHITE.setVisible(false);
                    planet = "MOON";
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_MOON.png")));
                    TEXT_TEMP.setText("127 °C");
                    break;
                case 2:
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SUN.png")));
                    GLOW_ORANGE.setVisible(false);
                    GLOW_GREEN.setVisible(false);
                    GLOW_WHITE.setVisible(true);
                    planet = "SUN";
                    TEXT_TEMP.setText("15M °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_SUN.png")));
                    break;
                case 0:
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/EARTH.png")));
                    GLOW_ORANGE.setVisible(true);
                    GLOW_GREEN.setVisible(false);
                    GLOW_WHITE.setVisible(false);
                    planet = "EARTH";
                    TEXT_TEMP.setText("14 °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_EARTH.png")));
                    break;
                default:
                    break;
            }
        } else if (planet_indicator < 0) {
            int planetChecker = planet_indicator % 3;
            switch (planetChecker) {
                case -2:
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON.png")));
                    GLOW_ORANGE.setVisible(false);
                    GLOW_GREEN.setVisible(true);
                    GLOW_WHITE.setVisible(false);
                    planet = "MOON";
                    TEXT_TEMP.setText("127 °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_MOON.png")));
                    break;
                case -1:
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SUN.png")));
                    GLOW_ORANGE.setVisible(false);
                    GLOW_GREEN.setVisible(false);
                    GLOW_WHITE.setVisible(true);
                    planet = "SUN";
                    TEXT_TEMP.setText("15M °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_SUN.png")));
                    break;
                case 0:
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/EARTH.png")));
                    GLOW_ORANGE.setVisible(true);
                    GLOW_GREEN.setVisible(false);
                    GLOW_WHITE.setVisible(false);
                    planet = "EARTH";
                    TEXT_TEMP.setText("14 °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_EARTH.png")));
                    break;
                default:
                    break;
            }
        }
        Text_Changer(planet);
        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_ARROW_LEFTActionPerformed

    private void ARROW_UPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARROW_UPActionPerformed
        // TODO add your handling code here:
        planet_indicator_slider = planet_indicator_slider + 1;
        int pl = planet_indicator_slider % 3;
        if (null != planet) {
            switch (planet) {
                case "MOON":
                    if (pl > -1) {
                        switch (pl) {
                            case 0:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON.png")));
                                break;
                            case 1:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON_1.png")));
                                break;
                            case 2:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Moon_3.png")));
                                break;
                            default:
                                break;
                        }
                    } else if (pl < 0) {
                        switch (pl) {
                            case 0:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON.png")));
                                break;
                            case -2:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON_1.png")));
                                break;
                            case -1:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Moon_3.png")));
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case "SUN":
                    if (pl > -1) {
                        switch (pl) {
                            case 0:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SUN.png")));
                                break;
                            case 1:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_1.png")));
                                break;
                            case 2:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_2.png")));
                                break;
                            default:
                                break;
                        }
                    } else if (pl < 0) {
                        switch (pl) {
                            case 0:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SUN.png")));
                                break;
                            case -2:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_1.png")));
                                break;
                            case -1:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_2.png")));
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case "EARTH":
                    if (pl > -1) {
                        switch (pl) {
                            case 0:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/EARTH.png")));
                                break;
                            case 1:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_3.png")));
                                break;
                            case 2:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_4.png")));
                                break;
                            default:
                                break;
                        }
                    } else if (pl < 0) {
                        switch (pl) {
                            case 0:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/EARTH.png")));
                                break;
                            case -2:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_3.png")));
                                break;
                            case -1:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_4.png")));
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_ARROW_UPActionPerformed

    private void ARROW_DOWNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARROW_DOWNActionPerformed
        // TODO add your handling code here:
        planet_indicator_slider = planet_indicator_slider - 1;
        int pl = planet_indicator_slider % 3;
        if (null != planet) {
            switch (planet) {
                case "MOON":
                    if (pl > -1) {
                        switch (pl) {
                            case 0:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON.png")));
                                break;
                            case 1:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON_1.png")));
                                break;
                            case 2:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Moon_3.png")));
                                break;
                            default:
                                break;
                        }
                    } else if (pl < 0) {
                        switch (pl) {
                            case 0:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON.png")));
                                break;
                            case -2:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON_1.png")));
                                break;
                            case -1:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Moon_3.png")));
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case "SUN":
                    if (pl > -1) {
                        switch (pl) {
                            case 0:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SUN.png")));
                                break;
                            case 1:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_1.png")));
                                break;
                            case 2:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_2.png")));
                                break;
                            default:
                                break;
                        }
                    } else if (pl < 0) {
                        switch (pl) {
                            case 0:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SUN.png")));
                                break;
                            case -2:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_1.png")));
                                break;
                            case -1:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_2.png")));
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case "EARTH":
                    if (pl > -1) {
                        switch (pl) {
                            case 0:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/EARTH.png")));
                                break;
                            case 1:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_3.png")));
                                break;
                            case 2:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_4.png")));
                                break;
                            default:
                                break;
                        }
                    } else if (pl < 0) {
                        switch (pl) {
                            case 0:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/EARTH.png")));
                                break;
                            case -2:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_3.png")));
                                break;
                            case -1:
                                MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_4.png")));
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_ARROW_DOWNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EARTH_SIZE_INFORMATION.dispose();
        EARTH_SIZE_INFORMATION.setVisible(false);

        BUTTON_SIZE_ON.setVisible(true);
        BUTTON_SIZE_ON.setEnabled(true);
        BUTTON_SIZE_OFF.setVisible(false);
        BUTTON_SIZE_OFF.setEnabled(false);
        TEXT_SIZE.setForeground(new Color(8, 87, 91));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        EARTH_DFTE_INFORMATION.dispose();
        EARTH_DFTE_INFORMATION.setVisible(false);

        BUTTON_DFTE_ON.setVisible(true);
        BUTTON_DFTE_ON.setEnabled(true);
        BUTTON_DFTE_OFF.setVisible(false);
        BUTTON_DFTE_OFF.setEnabled(false);
        TEXT_DFTE.setForeground(new Color(8, 87, 91));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void MAIN_LAYOUTAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MAIN_LAYOUTAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_MAIN_LAYOUTAncestorAdded

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        EARTH_ROIA_INFORMATION.dispose();
        EARTH_ROIA_INFORMATION.setVisible(false);

        BUTTON_ROIA_ON.setVisible(true);
        BUTTON_ROIA_ON.setEnabled(true);
        BUTTON_ROIA_OFF.setVisible(false);
        BUTTON_ROIA_OFF.setEnabled(false);
        TEXT_ROIA.setForeground(new Color(8, 87, 91));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        MOON_SIZE_INFORMATION.dispose();
        MOON_SIZE_INFORMATION.setVisible(false);

        BUTTON_SIZE_ON.setVisible(true);
        BUTTON_SIZE_ON.setEnabled(true);
        BUTTON_SIZE_OFF.setVisible(false);
        BUTTON_SIZE_OFF.setEnabled(false);
        TEXT_SIZE.setForeground(new Color(8, 87, 91));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        MOON_DFTE_INFORMATION.dispose();
        MOON_DFTE_INFORMATION.setVisible(false);

        BUTTON_DFTE_ON.setVisible(true);
        BUTTON_DFTE_ON.setEnabled(true);
        BUTTON_DFTE_OFF.setVisible(false);
        BUTTON_DFTE_OFF.setEnabled(false);
        TEXT_DFTE.setForeground(new Color(8, 87, 91));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        MOON_ROIA_INFORMATION.dispose();
        MOON_ROIA_INFORMATION.setVisible(false);

        BUTTON_ROIA_ON.setVisible(true);
        BUTTON_ROIA_ON.setEnabled(true);
        BUTTON_ROIA_OFF.setVisible(false);
        BUTTON_ROIA_OFF.setEnabled(false);
        TEXT_ROIA.setForeground(new Color(8, 87, 91));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        SUN_SIZE_INFORMATION.dispose();
        SUN_SIZE_INFORMATION.setVisible(false);

        BUTTON_SIZE_ON.setVisible(true);
        BUTTON_SIZE_ON.setEnabled(true);
        BUTTON_SIZE_OFF.setVisible(false);
        BUTTON_SIZE_OFF.setEnabled(false);
        TEXT_SIZE.setForeground(new Color(8, 87, 91));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        SUN_DFTE_INFORMATION.dispose();
        SUN_DFTE_INFORMATION.setVisible(false);

        BUTTON_DFTE_ON.setVisible(true);
        BUTTON_DFTE_ON.setEnabled(true);
        BUTTON_DFTE_OFF.setVisible(false);
        BUTTON_DFTE_OFF.setEnabled(false);
        TEXT_DFTE.setForeground(new Color(8, 87, 91));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        SUN_ROIA_INFORMATION.dispose();
        SUN_ROIA_INFORMATION.setVisible(false);

        BUTTON_ROIA_ON.setVisible(true);
        BUTTON_ROIA_ON.setEnabled(true);
        BUTTON_ROIA_OFF.setVisible(false);
        BUTTON_ROIA_OFF.setEnabled(false);
        TEXT_ROIA.setForeground(new Color(8, 87, 91));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void ARROW_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARROW_OKActionPerformed

        if (null != planet) // TODO add your handling code here:
        {
            switch (planet) {
                case "EARTH":
                    attachment(Screen_View_Earth);
                    break;
                case "MOON":
                    attachment(Screen_View_Moon);
                    break;
                case "SUN":
                    attachment(Screen_View_Sun);
                    break;
                default:
                    break;
            }
        }
        posttest_clicks += 1;
        postTest_Quiz_Displayer();

    }//GEN-LAST:event_ARROW_OKActionPerformed

    private void LAKEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LAKEMouseMoved
        // TODO add your handling code here:\
        Main_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_View_Main_Lake.png")));
    }//GEN-LAST:event_LAKEMouseMoved

    private void Main_EarthMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_EarthMouseMoved
        // TODO add your handling code here:
        Main_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_View_Main_1.png")));
    }//GEN-LAST:event_Main_EarthMouseMoved

    private void MOUNTAINSMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MOUNTAINSMouseMoved
        // TODO add your handling code here:
        Main_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_View_Main_Mountain.png")));
    }//GEN-LAST:event_MOUNTAINSMouseMoved

    private void PLAINSMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PLAINSMouseMoved
        // TODO add your handling code here:
        Main_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_View_Main_Plain.png")));
    }//GEN-LAST:event_PLAINSMouseMoved

    private void ISLANDSMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ISLANDSMouseMoved
        // TODO add your handling code here:
        Main_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_View_Main_Islands.png")));
    }//GEN-LAST:event_ISLANDSMouseMoved

    private void OCEANMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCEANMouseMoved
        // TODO add your handling code here:
        Main_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_View_Main_Plain_Ocean.png")));
    }//GEN-LAST:event_OCEANMouseMoved

    private void FORESTSMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FORESTSMouseMoved
        // TODO add your handling code here:
        Main_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Earth_View_Main_Plain_Forest.png")));
    }//GEN-LAST:event_FORESTSMouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Screen_View_Earth.setVisible(false);
        Screen_View_Earth.dispose();
        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Screen_View_Moon.setVisible(false);
        Screen_View_Moon.dispose();
        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void Main_MoonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_MoonMouseMoved
        // TODO add your handling code here:
        Main_Moon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Moon_View_Main.png")));
    }//GEN-LAST:event_Main_MoonMouseMoved

    private void LUNARMARIAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LUNARMARIAMouseMoved
        // TODO add your handling code here:
        Main_Moon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Moon_View_Luna.png")));
    }//GEN-LAST:event_LUNARMARIAMouseMoved

    private void CRATERSMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRATERSMouseMoved
        // TODO add your handling code here:

        Main_Moon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Moon_View_Crater.png")));
    }//GEN-LAST:event_CRATERSMouseMoved

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        Screen_View_Sun.setVisible(false);
        Screen_View_Sun.dispose();
        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void CORONAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CORONAMouseMoved
        // TODO add your handling code here:

        Main_Sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_View_Corona.png")));
    }//GEN-LAST:event_CORONAMouseMoved

    private void PROMINENCEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROMINENCEMouseMoved
        // TODO add your handling code here:

        Main_Sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_View_Prom.png")));
    }//GEN-LAST:event_PROMINENCEMouseMoved

    private void Main_SunMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_SunMouseMoved
        // TODO add your handling code here:
        Main_Sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_View_Main.png")));
    }//GEN-LAST:event_Main_SunMouseMoved

    private void FLAREMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FLAREMouseMoved
        // TODO add your handling code here:
        Main_Sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_View_Flare.png")));

    }//GEN-LAST:event_FLAREMouseMoved

    private void SPOTSMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SPOTSMouseMoved
        // TODO add your handling code here:
        Main_Sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sun_View_Spot.png")));


    }//GEN-LAST:event_SPOTSMouseMoved

    private void BUTTON_TEMP_ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_TEMP_ONActionPerformed
        // TODO add your handling code here:
        BUTTON_TEMP_ON.setVisible(false);
        BUTTON_TEMP_ON.setEnabled(false);
        BUTTON_TEMP_OFF.setVisible(true);
        BUTTON_TEMP_OFF.setEnabled(true);

        if (null != planet) {
            switch (planet) {
                case "EARTH":
                    TEXT_TEMP.setForeground(new Color(144, 39, 30));
                    // EARTH_TEMP_INFORMATION.setUndecorated(true);
                    // EARTH_TEMP_INFORMATION.setBackground(new Color(0, 0, 0, 0));
                    EARTH_TEMP_INFORMATION.setVisible(true);
                    EARTH_TEMP_INFORMATION.pack();
                    EARTH_TEMP_INFORMATION.setLocationRelativeTo(null);
                    break;
                case "MOON":
                    TEXT_TEMP.setForeground(new Color(144, 39, 30));
                    // MOON_TEMP_INFORMATION.setUndecorated(true);
                    // MOON_TEMP_INFORMATION.setBackground(new Color(0, 0, 0, 0));
                    MOON_TEMP_INFORMATION.setVisible(true);
                    MOON_TEMP_INFORMATION.pack();
                    MOON_TEMP_INFORMATION.setLocationRelativeTo(null);
                    break;
                case "SUN":
                    TEXT_TEMP.setForeground(new Color(144, 39, 30));
                    //     SUN_TEMP_INFORMATION.setUndecorated(true);
                    //SUN_TEMP_INFORMATION.setBackground(new Color(0, 0, 0, 0));
                    SUN_TEMP_INFORMATION.setVisible(true);
                    SUN_TEMP_INFORMATION.pack();
                    SUN_TEMP_INFORMATION.setLocationRelativeTo(null);
                    break;
                default:
                    break;
            }
        }
        posttest_clicks += 1;
        postTest_Quiz_Displayer();

    }//GEN-LAST:event_BUTTON_TEMP_ONActionPerformed

    private void BUTTON_TEMP_OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_TEMP_OFFActionPerformed
        // TODO add your handling code here:
        BUTTON_TEMP_ON.setVisible(true);
        BUTTON_TEMP_ON.setEnabled(true);
        BUTTON_TEMP_OFF.setVisible(false);
        BUTTON_TEMP_OFF.setEnabled(false);
        if (null != planet) {
            switch (planet) {
                case "EARTH":
                    EARTH_TEMP_INFORMATION.dispose();
                    EARTH_TEMP_INFORMATION.setVisible(false);

                    TEXT_TEMP.setForeground(new Color(8, 87, 91));
                    break;
                case "MOON":
                    MOON_TEMP_INFORMATION.dispose();
                    MOON_TEMP_INFORMATION.setVisible(false);

                    TEXT_TEMP.setForeground(new Color(8, 87, 91));
                    break;
                case "SUN":
                    SUN_TEMP_INFORMATION.dispose();
                    SUN_TEMP_INFORMATION.setVisible(false);

                    TEXT_TEMP.setForeground(new Color(8, 87, 91));
                    break;
                default:
                    break;
            }
        }
        posttest_clicks += 1;
        postTest_Quiz_Displayer();

    }//GEN-LAST:event_BUTTON_TEMP_OFFActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        EARTH_TEMP_INFORMATION.setVisible(false);
        EARTH_TEMP_INFORMATION.dispose();
        BUTTON_TEMP_ON.setVisible(true);
        BUTTON_TEMP_ON.setEnabled(true);
        BUTTON_TEMP_OFF.setVisible(false);
        BUTTON_TEMP_OFF.setEnabled(false);
        TEXT_TEMP.setForeground(new Color(8, 87, 91));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        MOON_TEMP_INFORMATION.setVisible(false);
        MOON_TEMP_INFORMATION.dispose();
        BUTTON_TEMP_ON.setVisible(true);
        BUTTON_TEMP_ON.setEnabled(true);
        BUTTON_TEMP_OFF.setVisible(false);
        BUTTON_TEMP_OFF.setEnabled(false);
        TEXT_TEMP.setForeground(new Color(8, 87, 91));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        SUN_TEMP_INFORMATION.setVisible(false);
        SUN_TEMP_INFORMATION.dispose();
        BUTTON_TEMP_ON.setVisible(true);
        BUTTON_TEMP_ON.setEnabled(true);
        BUTTON_TEMP_OFF.setVisible(false);
        BUTTON_TEMP_OFF.setEnabled(false);
        TEXT_TEMP.setForeground(new Color(8, 87, 91));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_jButton15ActionPerformed


    private void BUTTON_PLAY_VIDEOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_PLAY_VIDEOActionPerformed

        try {
            File file = new File(getClass().getResource("/View/Earth.mp4").getFile());
            if (null != planet) {
                switch (planet) {
                    case "EARTH":
                        file = new File(getClass().getResource("/View/Earth.mp4").getFile());
                        break;
                    case "MOON":
                        file = new File(getClass().getResource("/View/Moon.mp4").getFile());
                        break;
                    case "SUN":
                        file = new File(getClass().getResource("/View/Sun.mp4").getFile());
                        break;
                    default:
                        break;
                }
            }
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(Main_View.class.getName()).log(Level.SEVERE, null, ex);
        }
        posttest_clicks += 1;
        postTest_Quiz_Displayer();

    }//GEN-LAST:event_BUTTON_PLAY_VIDEOActionPerformed

    private void BUTTON_SEE_PICTUREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_SEE_PICTUREActionPerformed
        // TODO add your handling code here:
        //Gallery.setUndecorated(true);
        //Gallery.setBackground(new Color(0, 0, 0, 0));
        attachment(Gallery);
        showImage(pos);
        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_BUTTON_SEE_PICTUREActionPerformed

    private void Gallery_Close_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gallery_Close_ButtonActionPerformed
        // TODO add your handling code here:
        Gallery.setVisible(false);
        Gallery.dispose();
        pos = 0;
    }//GEN-LAST:event_Gallery_Close_ButtonActionPerformed

    public String[] getImages(String planet) {

        if (null != planet) {
            switch (planet) {
                case "EARTH": {
                    File file = new File(getClass().getResource("/View/GalleryEarth/").getFile());
                    String[] imagelist = file.list();
                    return imagelist;
                }
                case "SUN": {
                    File file = new File(getClass().getResource("/View/GallerySun/").getFile());
                    String[] imagelist = file.list();
                    return imagelist;
                }
                case "MOON": {
                    File file = new File(getClass().getResource("/View/GalleryMoon/").getFile());
                    String[] imagelist = file.list();
                    return imagelist;
                }
                default:
                    break;
            }
        }
        return null;

    }

    public void showImage(int index) {

        try {
            if (null != planet) {
                switch (planet) {
                    case "EARTH": {
                        String[] imageList = getImages(planet);
                        String imageName = imageList[index];
                        ImageIcon icon = new ImageIcon(getClass().getResource("/View/GalleryEarth/" + imageName));
                        Image image = icon.getImage().getScaledInstance(Gallery_Picture.getWidth(), Gallery_Picture.getHeight(), Image.SCALE_SMOOTH);
                        Gallery_Picture.setIcon(new ImageIcon(image));
                        break;
                    }
                    case "SUN": {
                        String[] imageList = getImages(planet);
                        String imageName = imageList[index];
                        ImageIcon icon = new ImageIcon(getClass().getResource("/View/GallerySun/" + imageName));
                        Image image = icon.getImage().getScaledInstance(Gallery_Picture.getWidth(), Gallery_Picture.getHeight(), Image.SCALE_SMOOTH);
                        Gallery_Picture.setIcon(new ImageIcon(image));
                        break;
                    }
                    case "MOON": {
                        String[] imageList = getImages(planet);
                        String imageName = imageList[index];
                        ImageIcon icon = new ImageIcon(getClass().getResource("/View/GalleryMoon/" + imageName));
                        Image image = icon.getImage().getScaledInstance(Gallery_Picture.getWidth(), Gallery_Picture.getHeight(), Image.SCALE_SMOOTH);
                        Gallery_Picture.setIcon(new ImageIcon(image));
                        break;
                    }
                    default:
                        break;
                }
            }
        } catch (Exception e) {

        }

    }


    private void Gallery_Right_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gallery_Right_ButtonActionPerformed
        // TODO add your handling code here:

        pos = pos + 1;
        if (pos >= getImages(planet).length) {
            pos = getImages(planet).length - 1;
        }
        showImage(pos);
        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_Gallery_Right_ButtonActionPerformed

    private void Gallery_Left_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gallery_Left_ButtonActionPerformed
        // TODO add your handling code here:
        pos = pos - 1;
        if (pos >= getImages(planet).length) {
            pos = getImages(planet).length + 1;
        }
        showImage(pos);
        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_Gallery_Left_ButtonActionPerformed

    private void SpaceShipLayoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpaceShipLayoutMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_SpaceShipLayoutMouseMoved

    private void SpaceShip_SunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpaceShip_SunActionPerformed
        // TODO add your handling code here:
        SpaceShipLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Spaceship Adventure_Sun.png")));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_SpaceShip_SunActionPerformed

    private void SpaceShip_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpaceShip_CloseActionPerformed
        // TODO add your handling code here:
        SpaceShip.setVisible(false);
        SpaceShip.dispose();

    }//GEN-LAST:event_SpaceShip_CloseActionPerformed

    private void SpaceShip_EarthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpaceShip_EarthActionPerformed
        // TODO add your handling code here:
        SpaceShipLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Spaceship Adventure_Earth.png")));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_SpaceShip_EarthActionPerformed

    private void SpaceShip_MoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpaceShip_MoonActionPerformed
        // TODO add your handling code here:
        SpaceShipLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Spaceship Adventure_Moon.png")));

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_SpaceShip_MoonActionPerformed

    private void SpaceShipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpaceShipButtonActionPerformed
        // TODO add your handling code here:
        // SpaceShip.setUndecorated(true);
        //SpaceShip.setBackground(new Color(0, 0, 0, 0));
        SpaceShip.setVisible(true);
        SpaceShip.pack();
        SpaceShip.setLocationRelativeTo(null);
        if (null != planet) {
            switch (planet) {
                case "EARTH":
                    SpaceShipLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Spaceship Adventure_Earth.png")));
                    break;
                case "SUN":
                    SpaceShipLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Spaceship Adventure_Sun.png")));
                    break;
                case "MOON":
                    SpaceShipLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Spaceship Adventure_Moon.png")));
                    break;
                default:
                    break;
            }
        }
        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_SpaceShipButtonActionPerformed

    private void FirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstNameKeyTyped
        // TODO add your handling code here:
        if (FirstName.getText().isEmpty()) {
            Lname_Off.setVisible(false);
            Lname_On.setVisible(true);
        } else {
            Lname_Off.setVisible(true);
            Lname_On.setVisible(false);
        }


    }//GEN-LAST:event_FirstNameKeyTyped
    public void TypeNameChecker() {
        Lname_Off.setVisible(false);
        Lname_On.setVisible(true);
        Fname_Off.setVisible(false);
        Fname_On.setVisible(true);
    }
    private void LastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNameKeyTyped
        // TODO add your handling code here:
        if (LastName.getText().isEmpty()) {
            Fname_Off.setVisible(false);
            Fname_On.setVisible(true);
        } else {
            Fname_Off.setVisible(true);
            Fname_On.setVisible(false);
        }
    }//GEN-LAST:event_LastNameKeyTyped

    private void Welcome_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Welcome_CloseActionPerformed
        // TODO add your handling code here:
//        WELCOME.setVisible(false);
//        WELCOME.dispose();
        System.exit(0);
    }//GEN-LAST:event_Welcome_CloseActionPerformed

    private void Welcome_PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Welcome_PlusActionPerformed
        // TODO add your handling code here:
        int age = Integer.parseInt(Student_Age.getText());
        age++;
        Student_Age.setText(age + "");

        if (age % 2 == 0) {
            Welcome_Light.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Light_Green.png")));
        } else {
            Welcome_Light.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Light_Orange.png")));
        }

    }//GEN-LAST:event_Welcome_PlusActionPerformed

    private void Welcome_MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Welcome_MinusActionPerformed
        // TODO add your handling code here:
        int age = Integer.parseInt(Student_Age.getText());
        if (age > 0) {
            age--;
            Student_Age.setText(age + "");
        }
        if (age % 2 == 0) {
            Welcome_Light.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Light_Green.png")));
        } else {
            Welcome_Light.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Light_Orange.png")));
        }

    }//GEN-LAST:event_Welcome_MinusActionPerformed
    String GenderVariable = "BOY";
    private void Welcome_LeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Welcome_LeftActionPerformed
        // TODO add your handling code here:

        if ("GIRL".equals(GenderVariable)) {
            GenderVariable = "BOY";
            Gender_Var.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Boy.png")));
            Welcome_Light_Gender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Light_Green.png")));

        } else if ("BOY".equals(GenderVariable)) {
            GenderVariable = "GIRL";
            Gender_Var.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Girl.png")));
            Welcome_Light_Gender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Light_Orange.png")));
        }


    }//GEN-LAST:event_Welcome_LeftActionPerformed

    private void Welcome_RightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Welcome_RightActionPerformed
        // TODO add your handling code here:
        if ("GIRL".equals(GenderVariable)) {
            GenderVariable = "BOY";
            Gender_Var.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Boy.png")));
            Welcome_Light_Gender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Light_Green.png")));

        } else if ("BOY".equals(GenderVariable)) {
            GenderVariable = "GIRL";
            Gender_Var.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Girl.png")));
            Welcome_Light_Gender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Welcome_Light_Orange.png")));
        }
    }//GEN-LAST:event_Welcome_RightActionPerformed

    private void Welcome_Close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Welcome_Close1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Welcome_Close1ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        boolean ageFlag = Integer.parseInt(Student_Age.getText()) > 0;
        if (!(FirstName.getText().isEmpty() && LastName.getText().isEmpty()) && ageFlag == true) {
            WELCOME.setVisible(false);
            WELCOME.dispose();
            attachment(WELCOME_TWO);
            Main_View.fName = FirstName.getText();
            Main_View.lName = LastName.getText();
            Main_View.age = Integer.parseInt(Student_Age.getText());
            Main_View.gender = GenderVariable;
        } else {
            JOptionPane.showMessageDialog(null, "Dont Leave Last Name Blank* \nDont Leave First Name Blank* \nAge Greater Than 0");
        }
        //System.out.println(GenderVariable);

    }//GEN-LAST:event_jButton16ActionPerformed
    int hint_click_counter = 0;
    private void HINT_OKAY_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HINT_OKAY_BUTTONActionPerformed
        // TODO add your handling code here:
        FirstQuizButton_HINT.setEnabled(true);
        SecondQuizButton_HINT.setEnabled(true);
        ThirdQuizButton_HINT.setEnabled(true);
        FourthQuizButton_HINT.setEnabled(true);
        FifthQuizButton_HINT.setEnabled(true);
        SixthQuizButton_HINT.setEnabled(true);
        SeventhQuizButton_HINT.setEnabled(true);
        EigthQuizButton_HINT.setEnabled(true);
        NinthQuizButton_HINT.setEnabled(true);
        TenthQuizButton_HINT.setEnabled(true);
        EleventhQuizButton_HINT.setEnabled(true);
        TwelveQuizButton_HINT.setEnabled(true);

        QUIZ_HINT.dispose();
        QUIZ_HINT.setVisible(false);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_HINT_OKAY_BUTTONActionPerformed
    int earth_HINT_CLICKCOUNTER = 0;
    int moon_HINT_CLICKCOUNTER = 0;
    int sun_HINT_CLICKCOUNTER = 0;
    int first_CC = 0;
    private void FirstQuizButton_HINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizButton_HINTActionPerformed
        // TODO add your handling code here:
        earth_HINT_CLICKCOUNTER += 1;
        hint_click_counter++;
        first_CC += 1;
        state = false;
        minutes = 0;
        seconds = 0;
        attachment(QUIZ_HINT);
        FirstQuizButton_HINT.setEnabled(false);
        switch (hint_click_counter % 3) {
            case 1:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/First_Quiz_HINT_FIRST.png")));
                break;
            case 2:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/First_Quiz_HINT_Second.png")));
                break;
            case 0:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/First_Quiz_HINT_Third.png")));
                break;
            default:
                break;
        }


    }//GEN-LAST:event_FirstQuizButton_HINTActionPerformed

    private void FirstQuizCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizCloseButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FirstQuizCloseButtonActionPerformed

    private void First_Reminder_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_First_Reminder_ButtonActionPerformed
        // TODO add your handling code here:
        seconds += 1;
        threadChecker();
        stopwatch();
        Reminder.dispose();
        Reminder.setVisible(false);
    }//GEN-LAST:event_First_Reminder_ButtonActionPerformed

    private void FirstQuizCloseButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizCloseButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FirstQuizCloseButton1ActionPerformed
    int second_CC = 0;
    private void SecondQuizButton_HINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondQuizButton_HINTActionPerformed
        if (postTesState >= 1) {
            PostTest_Hint += 1;
            hint_click_counter++;
            state = false;
            minutes = 0;
            seconds = 0;
            attachment(QUIZ_HINT);
            SecondQuizButton_HINT.setEnabled(false);
            switch (hint_click_counter % 3) {
                case 1:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Second_Quiz_HINT_FIRST.png")));
                    break;
                case 2:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Second_Quiz_HINT_Second.png")));
                    break;
                case 0:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Second_Quiz_HINT_Third.png")));
                    break;
                default:
                    break;
            }
        } else {
            earth_HINT_CLICKCOUNTER += 1;
            second_CC += 1;
            hint_click_counter++;
            state = false;
            minutes = 0;
            seconds = 0;
            attachment(QUIZ_HINT);
            SecondQuizButton_HINT.setEnabled(false);
            switch (hint_click_counter % 3) {
                case 1:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Second_Quiz_HINT_FIRST.png")));
                    break;
                case 2:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Second_Quiz_HINT_Second.png")));
                    break;
                case 0:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Second_Quiz_HINT_Third.png")));
                    break;
                default:
                    break;
            }
        }


    }//GEN-LAST:event_SecondQuizButton_HINTActionPerformed

    private void FirstQuizCloseButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizCloseButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FirstQuizCloseButton2ActionPerformed
    int third_CC = 0;
    private void ThirdQuizButton_HINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdQuizButton_HINTActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Hint += 1;
            hint_click_counter++;
            state = false;
            minutes = 0;
            seconds = 0;
            attachment(QUIZ_HINT);
            ThirdQuizButton_HINT.setEnabled(false);
            switch (hint_click_counter % 3) {
                case 1:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Third_Quiz_HINT_FIRST.png")));
                    break;
                case 2:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Third_Quiz_HINT_Second.png")));
                    break;
                case 0:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Third_Quiz_HINT_Third.png")));
                    break;
                default:
                    break;
            }
        } else {
            earth_HINT_CLICKCOUNTER += 1;
            hint_click_counter++;
            third_CC += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            attachment(QUIZ_HINT);
            ThirdQuizButton_HINT.setEnabled(false);
            switch (hint_click_counter % 3) {
                case 1:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Third_Quiz_HINT_FIRST.png")));
                    break;
                case 2:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Third_Quiz_HINT_Second.png")));
                    break;
                case 0:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Third_Quiz_HINT_Third.png")));
                    break;
                default:
                    break;
            }
        }


    }//GEN-LAST:event_ThirdQuizButton_HINTActionPerformed

    private void FirstQuizCloseButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizCloseButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FirstQuizCloseButton3ActionPerformed
    int fourth_CC = 0;
    private void FourthQuizButton_HINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourthQuizButton_HINTActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Hint += 1;
            hint_click_counter++;
            state = false;
            minutes = 0;
            seconds = 0;
            attachment(QUIZ_HINT);
            FourthQuizButton_HINT.setEnabled(false);
            switch (hint_click_counter % 3) {
                case 1:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fourth_Quiz_HINT_FIRST.png")));
                    break;
                case 2:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fourth_Quiz_HINT_Second.png")));
                    break;
                case 0:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fourth_Quiz_HINT_Third.png")));
                    break;
                default:
                    break;
            }
        } else {
            moon_HINT_CLICKCOUNTER += 1;
            fourth_CC += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter++;
            attachment(QUIZ_HINT);
            FourthQuizButton_HINT.setEnabled(false);
            switch (hint_click_counter % 3) {
                case 1:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fourth_Quiz_HINT_FIRST.png")));
                    break;
                case 2:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fourth_Quiz_HINT_Second.png")));
                    break;
                case 0:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fourth_Quiz_HINT_Third.png")));
                    break;
                default:
                    break;
            }
        }

    }//GEN-LAST:event_FourthQuizButton_HINTActionPerformed

    private void FirstQuizCloseButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizCloseButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FirstQuizCloseButton4ActionPerformed
    int fifth_CC = 0;
    private void FifthQuizButton_HINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FifthQuizButton_HINTActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Hint += 1;
            hint_click_counter++;
            state = false;
            minutes = 0;
            seconds = 0;
            attachment(QUIZ_HINT);
            FifthQuizButton_HINT.setEnabled(false);
            switch (hint_click_counter % 3) {
                case 1:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fifth_Quiz_HINT_FIRST.png")));
                    break;
                case 2:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fifth_Quiz_HINT_Second.png")));
                    break;
                case 0:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fifth_Quiz_HINT_Third.png")));
                    break;
                default:
                    break;
            }
        } else {
            moon_HINT_CLICKCOUNTER += 1;
            fifth_CC += 1;
            hint_click_counter++;
            state = false;
            minutes = 0;
            seconds = 0;
            attachment(QUIZ_HINT);
            FifthQuizButton_HINT.setEnabled(false);
            switch (hint_click_counter % 3) {
                case 1:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fifth_Quiz_HINT_FIRST.png")));
                    break;
                case 2:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fifth_Quiz_HINT_Second.png")));
                    break;
                case 0:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fifth_Quiz_HINT_Third.png")));
                    break;
                default:
                    break;
            }
        }


    }//GEN-LAST:event_FifthQuizButton_HINTActionPerformed

    private void FirstQuizCloseButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizCloseButton5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FirstQuizCloseButton5ActionPerformed
    int sixth_CC = 0;
    private void SixthQuizButton_HINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixthQuizButton_HINTActionPerformed
        // TODO add your handling code here:
        moon_HINT_CLICKCOUNTER += 1;
        sixth_CC += 1;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter++;
        attachment(QUIZ_HINT);
        SixthQuizButton_HINT.setEnabled(false);
        switch (hint_click_counter % 3) {
            case 1:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sixth_Quiz_HINT_FIRST.png")));
                break;
            case 2:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sixth_Quiz_HINT_Second.png")));
                break;
            case 0:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Sixth_Quiz_HINT_Third.png")));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_SixthQuizButton_HINTActionPerformed

    private void FirstQuizCloseButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizCloseButton6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FirstQuizCloseButton6ActionPerformed
    int seventh_CC = 0;
    private void SeventhQuizButton_HINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeventhQuizButton_HINTActionPerformed
        if (postTesState >= 1) {
            PostTest_Hint += 1;
            hint_click_counter++;
            state = false;
            minutes = 0;
            seconds = 0;
            attachment(QUIZ_HINT);
            SeventhQuizButton_HINT.setEnabled(false);
            switch (hint_click_counter % 3) {
                case 1:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Seventh_Quiz_HINT_FIRST.png")));
                    break;
                case 2:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Seventh_Quiz_HINT_Second.png")));
                    break;
                case 0:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Seventh_Quiz_HINT_Third.png")));
                    break;
                default:
                    break;
            }
        } else {
            sun_HINT_CLICKCOUNTER += 1;
            seventh_CC += 1;
            hint_click_counter++;
            state = false;
            minutes = 0;
            seconds = 0;
            attachment(QUIZ_HINT);
            SeventhQuizButton_HINT.setEnabled(false);
            switch (hint_click_counter % 3) {
                case 1:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Seventh_Quiz_HINT_FIRST.png")));
                    break;
                case 2:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Seventh_Quiz_HINT_Second.png")));
                    break;
                case 0:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Seventh_Quiz_HINT_Third.png")));
                    break;
                default:
                    break;
            }
        }

    }//GEN-LAST:event_SeventhQuizButton_HINTActionPerformed

    private void Fifth_FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fifth_FirstButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fifth_Quiz_Frame.dispose();
            Fifth_Quiz_Frame.setVisible(false);

            attachment(Ninth_Quiz_Frame);
            stopwatch();
            threadChecker();

        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fifth_Quiz_Frame.dispose();
            Fifth_Quiz_Frame.setVisible(false);

            attachment(Ninth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }

    }//GEN-LAST:event_Fifth_FirstButtonActionPerformed

    private void FirstQuizCloseButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizCloseButton7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FirstQuizCloseButton7ActionPerformed
    int Eight_CC = 0;
    private void EigthQuizButton_HINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EigthQuizButton_HINTActionPerformed
        // TODO add your handling code here:
        sun_HINT_CLICKCOUNTER += 1;
        state = false;
        minutes = 0;
        seconds = 0;
        Eight_CC += 1;
        hint_click_counter++;
        attachment(QUIZ_HINT);
        EigthQuizButton_HINT.setEnabled(false);
        switch (hint_click_counter % 3) {
            case 1:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Eight_Quiz_HINT_FIRST.png")));
                break;
            case 2:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Eight_Quiz_HINT_Second.png")));
                break;
            case 0:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Eight_Quiz_HINT_Third.png")));
                break;
            default:
                break;
        }

    }//GEN-LAST:event_EigthQuizButton_HINTActionPerformed

    private void FirstQuizCloseButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizCloseButton8ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FirstQuizCloseButton8ActionPerformed
    int ninth_CC = 0;
    private void NinthQuizButton_HINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NinthQuizButton_HINTActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Hint += 1;
            hint_click_counter++;
            state = false;
            minutes = 0;
            seconds = 0;
            attachment(QUIZ_HINT);
            NinthQuizButton_HINT.setEnabled(false);
            switch (hint_click_counter % 3) {
                case 1:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Ninth_Quiz_HINT_FIRST.png")));
                    break;
                case 2:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Ninth_Quiz_HINT_Second.png")));
                    break;
                case 0:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Ninth_Quiz_HINT_Third.png")));
                    break;
                default:
                    break;
            }
        } else {
            sun_HINT_CLICKCOUNTER += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            ninth_CC += 1;
            hint_click_counter++;
            attachment(QUIZ_HINT);
            NinthQuizButton_HINT.setEnabled(false);
            switch (hint_click_counter % 3) {
                case 1:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Ninth_Quiz_HINT_FIRST.png")));
                    break;
                case 2:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Ninth_Quiz_HINT_Second.png")));
                    break;
                case 0:
                    HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Ninth_Quiz_HINT_Third.png")));
                    break;
                default:
                    break;
            }
        }

    }//GEN-LAST:event_NinthQuizButton_HINTActionPerformed

    private void Take_Your_Quiz_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Take_Your_Quiz_ButtonActionPerformed
        // TODO add your handling code here:
        WELCOME_TWO.dispose();
        WELCOME_TWO.setVisible(false);

        attachment(Third_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Take_Your_Quiz_ButtonActionPerformed

    private void Third_FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Third_FirstButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Third_Quiz_Frame.dispose();
            Third_Quiz_Frame.setVisible(false);

            attachment(Seventh_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Third_Quiz_Frame.dispose();
            Third_Quiz_Frame.setVisible(false);

            attachment(Fifth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }

    }//GEN-LAST:event_Third_FirstButtonActionPerformed

    private void Third_ThirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Third_ThirdButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Third_Quiz_Frame.dispose();
            Third_Quiz_Frame.setVisible(false);

            attachment(Seventh_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Third_Quiz_Frame.dispose();
            Third_Quiz_Frame.setVisible(false);

            attachment(Fifth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Third_ThirdButtonActionPerformed

    private void Third_SecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Third_SecondButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Third_Quiz_Frame.dispose();
            Third_Quiz_Frame.setVisible(false);

            attachment(Seventh_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Third_Quiz_Frame.dispose();
            Third_Quiz_Frame.setVisible(false);

            attachment(Fifth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Third_SecondButtonActionPerformed

    private void Third_FourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Third_FourthButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Third_Quiz_Frame.dispose();
            Third_Quiz_Frame.setVisible(false);

            attachment(Seventh_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            earthScore += 1;
            score += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Third_Quiz_Frame.dispose();
            Third_Quiz_Frame.setVisible(false);

            attachment(Fifth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Third_FourthButtonActionPerformed

    private void Fifth_FourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fifth_FourthButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fifth_Quiz_Frame.dispose();
            Fifth_Quiz_Frame.setVisible(false);

            attachment(Ninth_Quiz_Frame);
            stopwatch();
            threadChecker();

        } else {
            moonScore += 1;
            score += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fifth_Quiz_Frame.dispose();
            Fifth_Quiz_Frame.setVisible(false);

            attachment(First_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Fifth_FourthButtonActionPerformed

    private void Fifth_SecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fifth_SecondButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fifth_Quiz_Frame.dispose();
            Fifth_Quiz_Frame.setVisible(false);

            attachment(Ninth_Quiz_Frame);
            stopwatch();
            threadChecker();

        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fifth_Quiz_Frame.dispose();
            Fifth_Quiz_Frame.setVisible(false);

            attachment(First_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Fifth_SecondButtonActionPerformed

    private void Fifth_ThirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fifth_ThirdButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fifth_Quiz_Frame.dispose();
            Fifth_Quiz_Frame.setVisible(false);

            attachment(Ninth_Quiz_Frame);
            stopwatch();
            threadChecker();

        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fifth_Quiz_Frame.dispose();
            Fifth_Quiz_Frame.setVisible(false);

            attachment(First_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Fifth_ThirdButtonActionPerformed

    private void FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstButtonActionPerformed
        // TODO add your handling code here:
        earthScore += 1;
        score += 1;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        First_Quiz_Frame.dispose();
        First_Quiz_Frame.setVisible(false);

        attachment(Seventh_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_FirstButtonActionPerformed

    private void ThirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdButtonActionPerformed
        // TODO add your handling code here:
        score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        First_Quiz_Frame.dispose();
        First_Quiz_Frame.setVisible(false);

        attachment(Seventh_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_ThirdButtonActionPerformed

    private void SecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondButtonActionPerformed
        // TODO add your handling code here:
        score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        First_Quiz_Frame.dispose();
        First_Quiz_Frame.setVisible(false);

        attachment(Seventh_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_SecondButtonActionPerformed

    private void FourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourthButtonActionPerformed
        // TODO add your handling code here:
        score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        First_Quiz_Frame.dispose();
        First_Quiz_Frame.setVisible(false);

        attachment(Seventh_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_FourthButtonActionPerformed

    private void Seventh_FourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seventh_FourthButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Seventh_Quiz_Frame.dispose();
            Seventh_Quiz_Frame.setVisible(false);

            attachment(Tenth_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            sunScore += 1;
            score += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Seventh_Quiz_Frame.dispose();
            Seventh_Quiz_Frame.setVisible(false);

            attachment(Second_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Seventh_FourthButtonActionPerformed

    private void Seventh_SecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seventh_SecondButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Seventh_Quiz_Frame.dispose();
            Seventh_Quiz_Frame.setVisible(false);

            attachment(Tenth_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Seventh_Quiz_Frame.dispose();
            Seventh_Quiz_Frame.setVisible(false);

            attachment(Second_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Seventh_SecondButtonActionPerformed

    private void Seventh_FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seventh_FirstButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Seventh_Quiz_Frame.dispose();
            Seventh_Quiz_Frame.setVisible(false);

            attachment(Tenth_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Seventh_Quiz_Frame.dispose();
            Seventh_Quiz_Frame.setVisible(false);

            attachment(Second_Quiz_Frame);
            stopwatch();
            threadChecker();
        }

    }//GEN-LAST:event_Seventh_FirstButtonActionPerformed

    private void Seventh_ThirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seventh_ThirdButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Seventh_Quiz_Frame.dispose();
            Seventh_Quiz_Frame.setVisible(false);

            attachment(Tenth_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Seventh_Quiz_Frame.dispose();
            Seventh_Quiz_Frame.setVisible(false);

            attachment(Second_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Seventh_ThirdButtonActionPerformed

    private void Second_FourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Second_FourthButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Second_Quiz_Frame.dispose();
            Second_Quiz_Frame.setVisible(false);

            attachment(Fifth_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            earthScore += 1;
            score += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Second_Quiz_Frame.dispose();
            Second_Quiz_Frame.setVisible(false);

            attachment(Ninth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Second_FourthButtonActionPerformed

    private void Second_SecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Second_SecondButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Second_Quiz_Frame.dispose();
            Second_Quiz_Frame.setVisible(false);

            attachment(Fifth_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Second_Quiz_Frame.dispose();
            Second_Quiz_Frame.setVisible(false);

            attachment(Ninth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Second_SecondButtonActionPerformed

    private void Second_FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Second_FirstButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Second_Quiz_Frame.dispose();
            Second_Quiz_Frame.setVisible(false);

            attachment(Fifth_Quiz_Frame);
            stopwatch();
            threadChecker();

        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Second_Quiz_Frame.dispose();
            Second_Quiz_Frame.setVisible(false);

            attachment(Ninth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }

    }//GEN-LAST:event_Second_FirstButtonActionPerformed

    private void Second_ThirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Second_ThirdButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Second_Quiz_Frame.dispose();
            Second_Quiz_Frame.setVisible(false);

            attachment(Fifth_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Second_Quiz_Frame.dispose();
            Second_Quiz_Frame.setVisible(false);

            attachment(Ninth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Second_ThirdButtonActionPerformed

    private void Ninth_FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ninth_FirstButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Ninth_Quiz_Frame.dispose();
            Ninth_Quiz_Frame.setVisible(false);

            attachment(Fourth_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            sunScore += 1;
            score += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Ninth_Quiz_Frame.dispose();
            Ninth_Quiz_Frame.setVisible(false);

            attachment(Eigth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }

    }//GEN-LAST:event_Ninth_FirstButtonActionPerformed

    private void Ninth_ThirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ninth_ThirdButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Ninth_Quiz_Frame.dispose();
            Ninth_Quiz_Frame.setVisible(false);

            attachment(Fourth_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Ninth_Quiz_Frame.dispose();
            Ninth_Quiz_Frame.setVisible(false);

            attachment(Eigth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Ninth_ThirdButtonActionPerformed

    private void Ninth_SecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ninth_SecondButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Ninth_Quiz_Frame.dispose();
            Ninth_Quiz_Frame.setVisible(false);

            attachment(Fourth_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Ninth_Quiz_Frame.dispose();
            Ninth_Quiz_Frame.setVisible(false);

            attachment(Eigth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Ninth_SecondButtonActionPerformed

    private void Ninth_FourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ninth_FourthButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Ninth_Quiz_Frame.dispose();
            Ninth_Quiz_Frame.setVisible(false);

            attachment(Fourth_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Ninth_Quiz_Frame.dispose();
            Ninth_Quiz_Frame.setVisible(false);

            attachment(Eigth_Quiz_Frame);
            stopwatch();
            threadChecker();
        }
    }//GEN-LAST:event_Ninth_FourthButtonActionPerformed

    private void Eigth_FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eigth_FirstButtonActionPerformed
        // TODO add your handling code here:
        sunScore += 1;
        score += 1;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Eigth_Quiz_Frame.dispose();
        Eigth_Quiz_Frame.setVisible(false);

        attachment(Sixth_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Eigth_FirstButtonActionPerformed

    private void Eigth_FourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eigth_FourthButtonActionPerformed
        // TODO add your handling code here:
        score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Eigth_Quiz_Frame.dispose();
        Eigth_Quiz_Frame.setVisible(false);

        attachment(Sixth_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Eigth_FourthButtonActionPerformed

    private void Eigth_ThirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eigth_ThirdButtonActionPerformed
        // TODO add your handling code here:
        score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Eigth_Quiz_Frame.dispose();
        Eigth_Quiz_Frame.setVisible(false);

        attachment(Sixth_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Eigth_ThirdButtonActionPerformed

    private void Eigth_SecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eigth_SecondButtonActionPerformed
        // TODO add your handling code here:
        score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Eigth_Quiz_Frame.dispose();
        Eigth_Quiz_Frame.setVisible(false);

        attachment(Sixth_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Eigth_SecondButtonActionPerformed

    private void Sixth_FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sixth_FirstButtonActionPerformed
        // TODO add your handling code here:
        moonScore += 1;
        score += 1;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Sixth_Quiz_Frame.dispose();
        Sixth_Quiz_Frame.setVisible(false);

        attachment(Fourth_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Sixth_FirstButtonActionPerformed

    private void Sixth_ThirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sixth_ThirdButtonActionPerformed
        // TODO add your handling code here:
        score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Sixth_Quiz_Frame.dispose();
        Sixth_Quiz_Frame.setVisible(false);

        attachment(Fourth_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Sixth_ThirdButtonActionPerformed

    private void Sixth_SecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sixth_SecondButtonActionPerformed
        // TODO add your handling code here:
        score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Sixth_Quiz_Frame.dispose();
        Sixth_Quiz_Frame.setVisible(false);

        attachment(Fourth_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Sixth_SecondButtonActionPerformed

    private void Sixth_FourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sixth_FourthButtonActionPerformed
        // TODO add your handling code here:
        score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Sixth_Quiz_Frame.dispose();
        Sixth_Quiz_Frame.setVisible(false);

        attachment(Fourth_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Sixth_FourthButtonActionPerformed

    private class PLANET {

        private final String planet;
        private int planetindicator;

        public String getPlanet() {
            return planet;
        }

        public int getPI() {
            return planetindicator;
        }

        public PLANET(String planet, int planetindicator) {
            super();
            this.planet = planet;
            this.planetindicator = planetindicator;
        }
    }

    public String Sorting() {
        PLANET[] pl = {new PLANET("EARTH", earthScore),
            new PLANET("MOON", moonScore),
            new PLANET("SUN", sunScore)};

        Arrays.sort(pl, (PLANET o1, PLANET o2) -> o2.getPI() - o1.getPI());
        return (pl[pl.length - 1].getPlanet());
    }

    public String Sorting_HINT() {
        PLANET[] pl = {new PLANET("EARTH", earth_HINT_CLICKCOUNTER),
            new PLANET("MOON", moon_HINT_CLICKCOUNTER),
            new PLANET("SUN", sun_HINT_CLICKCOUNTER)};

        Arrays.sort(pl, (PLANET o1, PLANET o2) -> o1.getPI() - o2.getPI());
        return (pl[pl.length - 1].getPlanet());
    }


    private void B4_proceed_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4_proceed_buttonActionPerformed
        // TODO add your handling code here:
        PostTest_Button.setVisible(false);
        PostTest_Button.setEnabled(false);
        boolean earthScoreCheck = earthScore == 3;
        boolean moonScoreCheck = moonScore == 3;
        boolean sunScoreCheck = sunScore == 3;

        if (earthScoreCheck && moonScoreCheck && sunScoreCheck) {
            System.out.println("HINT" + Sorting_HINT());
            switch (Sorting_HINT()) {
                case "EARTH":
                    planet = "EARTH";
                    planet_indicator = 0;
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/EARTH.png")));
                    GLOW_ORANGE.setVisible(true);
                    GLOW_GREEN.setVisible(false);
                    GLOW_WHITE.setVisible(false);
                    TEXT_TEMP.setText("14 °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_EARTH.png")));
                    break;
                case "MOON":
                    planet = "MOON";
                    planet_indicator = 1;
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON.png")));
                    GLOW_ORANGE.setVisible(false);
                    GLOW_GREEN.setVisible(true);
                    GLOW_WHITE.setVisible(false);
                    TEXT_TEMP.setText("127 °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_MOON.png")));
                    break;
                case "SUN":
                    planet = "SUN";
                    planet_indicator = 2;
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SUN.png")));
                    GLOW_ORANGE.setVisible(false);
                    GLOW_GREEN.setVisible(false);
                    GLOW_WHITE.setVisible(true);
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_SUN.png")));
                    TEXT_TEMP.setText("15M °C");
                    break;

            }

            Text_Changer(Sorting_HINT());
        } else {
            System.out.println("SCORE" + Sorting());
            switch (Sorting()) {
                case "EARTH":
                    planet = "EARTH";
                    planet_indicator = 0;
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/EARTH.png")));
                    GLOW_ORANGE.setVisible(true);
                    GLOW_GREEN.setVisible(false);
                    GLOW_WHITE.setVisible(false);
                    TEXT_TEMP.setText("14 °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_EARTH.png")));
                    break;
                case "MOON":
                    planet = "MOON";
                    planet_indicator = 1;
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MOON.png")));
                    GLOW_ORANGE.setVisible(false);
                    GLOW_GREEN.setVisible(true);
                    GLOW_WHITE.setVisible(false);
                    TEXT_TEMP.setText("127 °C");
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_MOON.png")));
                    break;
                case "SUN":
                    planet = "SUN";
                    planet_indicator = 2;
                    MAIN_PANEL_PLANET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SUN.png")));
                    GLOW_ORANGE.setVisible(false);
                    GLOW_GREEN.setVisible(false);
                    GLOW_WHITE.setVisible(true);
                    TEXT_SURFACE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SURFACE_SUN.png")));
                    TEXT_TEMP.setText("15M °C");
                    break;

            }

            Text_Changer(Sorting());
        }

        Before_Teaching_Strat.dispose();
        Before_Teaching_Strat.setVisible(false);
        attachment(TeachingStrat);
        PostTest_Button.setVisible(false);
        PostTest_Button.setEnabled(false);
    }//GEN-LAST:event_B4_proceed_buttonActionPerformed


    private void B4_proceed_buttonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4_proceed_buttonMouseMoved
        // TODO add your handling code here:
        B4_proceed_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/B4_Button_Two.png")));
    }//GEN-LAST:event_B4_proceed_buttonMouseMoved

    private void jLabel15MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseMoved
        // TODO add your handling code here:
        B4_proceed_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/B4_Button_One.png")));
    }//GEN-LAST:event_jLabel15MouseMoved

    private void Fourth_FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fourth_FirstButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fourth_Quiz_Frame.dispose();
            Fourth_Quiz_Frame.setVisible(false);

            attachment(Third_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            moonScore += 1;
            score += 1;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fourth_Quiz_Frame.dispose();
            Fourth_Quiz_Frame.setVisible(false);

            attachment(Before_Teaching_Strat);
            Score_Variable_Display.setText(score + " / 9");
            int total = first_CC + second_CC + third_CC + fourth_CC + fifth_CC + sixth_CC + seventh_CC + Eight_CC + ninth_CC;
            HintUsed_Variable_Display.setText(total + "");
        }


    }//GEN-LAST:event_Fourth_FirstButtonActionPerformed

    private void Fourth_SecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fourth_SecondButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fourth_Quiz_Frame.dispose();
            Fourth_Quiz_Frame.setVisible(false);

            attachment(Third_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fourth_Quiz_Frame.dispose();
            Fourth_Quiz_Frame.setVisible(false);

            attachment(Before_Teaching_Strat);
            Score_Variable_Display.setText(score + " / 9");
            int total = first_CC + second_CC + third_CC + fourth_CC + fifth_CC + sixth_CC + seventh_CC + Eight_CC + ninth_CC;
            HintUsed_Variable_Display.setText(total + "");
        }
    }//GEN-LAST:event_Fourth_SecondButtonActionPerformed

    private void Fourth_FourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fourth_FourthButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fourth_Quiz_Frame.dispose();
            Fourth_Quiz_Frame.setVisible(false);

            attachment(Third_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fourth_Quiz_Frame.dispose();
            Fourth_Quiz_Frame.setVisible(false);

            attachment(Before_Teaching_Strat);
            Score_Variable_Display.setText(score + " / 9");
            int total = first_CC + second_CC + third_CC + fourth_CC + fifth_CC + sixth_CC + seventh_CC + Eight_CC + ninth_CC;
            HintUsed_Variable_Display.setText(total + "");
        }
    }//GEN-LAST:event_Fourth_FourthButtonActionPerformed

    private void Fourth_ThirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fourth_ThirdButtonActionPerformed
        // TODO add your handling code here:
        if (postTesState >= 1) {
            PostTest_Score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fourth_Quiz_Frame.dispose();
            Fourth_Quiz_Frame.setVisible(false);

            attachment(Third_Quiz_Frame);
            stopwatch();
            threadChecker();
        } else {
            score += 0;
            state = false;
            minutes = 0;
            seconds = 0;
            hint_click_counter = 0;
            Fourth_Quiz_Frame.dispose();
            Fourth_Quiz_Frame.setVisible(false);

            attachment(Before_Teaching_Strat);
            Score_Variable_Display.setText(score + " / 9");
            int total = first_CC + second_CC + third_CC + fourth_CC + fifth_CC + sixth_CC + seventh_CC + Eight_CC + ninth_CC;
            HintUsed_Variable_Display.setText(total + "");
        }
    }//GEN-LAST:event_Fourth_ThirdButtonActionPerformed
    int conFrames = 1;

    public void converFrameBackDisplayer() {
        ConButton_Next.setVisible(true);
        ConButton_Next.setEnabled(true);
        if (conFrames > 1) {
            ConButton_Back.setVisible(true);
            ConButton_Back.setEnabled(true);
        } else {
            ConButton_Back.setVisible(false);
            ConButton_Back.setEnabled(false);
        }
        if (conFrames == 4) {
            con_button_earth.setVisible(true);
            con_button_earth.setEnabled(true);
            con_button_sun.setVisible(true);
            con_button_sun.setEnabled(true);
            con_button_moon.setVisible(true);
            con_button_moon.setEnabled(true);
            ConButton_Next.setVisible(false);
            ConButton_Next.setEnabled(false);
        } else {
            con_button_earth.setVisible(false);
            con_button_earth.setEnabled(false);
            con_button_sun.setVisible(false);
            con_button_sun.setEnabled(false);
            con_button_moon.setVisible(false);
            con_button_moon.setEnabled(false);
        }
    }
    private void ConButton_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConButton_NextActionPerformed
        // TODO add your handling code here:
        if (conFrames >= 4) {
            conFrames = 4;
        } else {
            conFrames = conFrames + 1;
        }
        ConCheck();
        Con_Layout_Panel.setIcon(conFrameDisplayer(conFrames));
        converFrameBackDisplayer();

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_ConButton_NextActionPerformed

    public void ConCheck() {
        if (conFrames == 4) {
            if (conEarthButton == false) {
                conHideButton(con_button_earth);
            } else if (conMoonButton == false) {
                conHideButton(con_button_moon);
            } else if (conSunButton == false) {
                conHideButton(con_button_sun);
            }

        }
    }


    private void ConButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConButton_BackActionPerformed
        // TODO add your handling code here:
        if (conFrames == 1) {
            conFrames = 1;
        } else {
            conFrames = conFrames - 1;
        }
        Con_Layout_Panel.setIcon(conFrameDisplayer(conFrames));
        converFrameBackDisplayer();

        posttest_clicks += 1;
        postTest_Quiz_Displayer();

    }//GEN-LAST:event_ConButton_BackActionPerformed

    private void Con_Layout_PanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Con_Layout_PanelMouseMoved
        // TODO add your handling code here:
        if (conFrames >= 4) {
            Con_Layout_Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Conv_FourthFrame.png")));
        }
    }//GEN-LAST:event_Con_Layout_PanelMouseMoved

    private void con_button_earthMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_con_button_earthMouseMoved
        // TODO add your handling code here:
        if (conFrames >= 4) {
            Con_Layout_Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Conv_FourthFrame_Earth.png")));
        }
    }//GEN-LAST:event_con_button_earthMouseMoved

    private void con_button_moonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_con_button_moonMouseMoved
        // TODO add your handling code here:
        if (conFrames >= 4) {
            Con_Layout_Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Conv_FourthFrame_Moon.png")));
        }
    }//GEN-LAST:event_con_button_moonMouseMoved

    private void con_button_sunMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_con_button_sunMouseMoved
        // TODO add your handling code here:
        if (conFrames >= 4) {
            Con_Layout_Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Conv_FourthFrame_Sun.png")));
        }
    }//GEN-LAST:event_con_button_sunMouseMoved

    boolean conEarthButton = true;
    boolean conSunButton = true;
    boolean conMoonButton = true;
    int conFrames_Earth = 1;
    int conFrames_Moon = 1;
    int conFrames_Sun = 1;

    private void con_button_earthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_button_earthActionPerformed
        // TODO add your handling code here:
        conEarthButton = false;
        conHideButton(con_button_earth);
        attachment(Conversational_Learning_Earth);
        converFrameBackDisplayer_Earth();
        Conversational_Learning.setVisible(false);

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_con_button_earthActionPerformed

    private void con_button_sunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_button_sunActionPerformed
        // TODO add your handling code here:
        conSunButton = false;
        conHideButton(con_button_sun);
        attachment(Conversational_Learning_Sun);
        converFrameBackDisplayer_Sun();
        Conversational_Learning.setVisible(false);

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_con_button_sunActionPerformed

    private void con_button_moonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_button_moonActionPerformed
        // TODO add your handling code here:
        conMoonButton = false;
        conHideButton(con_button_moon);
        attachment(Conversational_Learning_Moon);
        converFrameBackDisplayer_Moon();
        Conversational_Learning.setVisible(false);

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_con_button_moonActionPerformed

    public void converFrameBackDisplayer_Earth() {
        CLE_Text.setVisible(false);
        CLE_Text.setEditable(false);
        Conver_proceed_Button.setVisible(false);
        Conver_proceed_Button.setEnabled(false);
        CLE_Back_To_Main_Button.setVisible(false);
        CLE_Back_To_Main_Button.setEnabled(false);
        if (conFrames_Earth == 9) {
            CLE_Text.setVisible(true);
            CLE_Text.setEditable(true);
            ConButton_Back_Earth.setVisible(false);
            ConButton_Back_Earth.setEnabled(false);
            ConButton_Next_Earth.setVisible(false);
            ConButton_Next_Earth.setEnabled(false);
            Conver_proceed_Button.setVisible(true);
            Conver_proceed_Button.setEnabled(true);
        }
        if (conFrames_Earth == 10) {
            CLE_Text.setVisible(true);
            CLE_Text.setEditable(true);
            ConButton_Back_Earth.setVisible(false);
            ConButton_Back_Earth.setEnabled(false);
            ConButton_Next_Earth.setVisible(false);
            ConButton_Next_Earth.setEnabled(false);
            Conver_proceed_Button.setVisible(true);
            Conver_proceed_Button.setEnabled(true);
        }
        if (conFrames_Earth == 11) {
            CLE_Text.setVisible(true);
            CLE_Text.setEditable(true);
            ConButton_Back_Earth.setVisible(false);
            ConButton_Back_Earth.setEnabled(false);
            ConButton_Next_Earth.setVisible(false);
            ConButton_Next_Earth.setEnabled(false);
            Conver_proceed_Button.setVisible(true);
            Conver_proceed_Button.setEnabled(true);
        }
        if (conFrames_Earth == 12) {
            CLE_Back_To_Main_Button.setVisible(true);
            CLE_Back_To_Main_Button.setEnabled(true);
        }
    }

    private void ConButton_Back_EarthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConButton_Back_EarthActionPerformed
        // TODO add your handling code here:
        if (conFrames_Earth == 1) {
            conFrames_Earth = 1;
        } else {
            conFrames_Earth = conFrames_Earth - 1;
        }
        Con_Layout_Panel_Earth.setIcon(conFrameDisplayer_EARTH(conFrames_Earth));
        converFrameBackDisplayer_Earth();

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
//        System.out.println(conFrames_Earth);
    }//GEN-LAST:event_ConButton_Back_EarthActionPerformed

    private void ConButton_Next_EarthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConButton_Next_EarthActionPerformed
        // TODO add your handling code here:
        if (conFrames_Earth >= 12) {
            conFrames_Earth = 12;
        } else {
            conFrames_Earth = conFrames_Earth + 1;
        }

        Con_Layout_Panel_Earth.setIcon(conFrameDisplayer_EARTH(conFrames_Earth));
        converFrameBackDisplayer_Earth();

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
//        System.out.println(conFrames_Earth);
    }//GEN-LAST:event_ConButton_Next_EarthActionPerformed

    private void Con_Layout_Panel_EarthMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Con_Layout_Panel_EarthMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Con_Layout_Panel_EarthMouseMoved

    private void Conver_proceed_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Conver_proceed_ButtonActionPerformed
        // TODO add your handling code here:
        String answer = CLE_Text.getText().toUpperCase().trim();

        if (conFrames_Earth == 9) {
            if (answer.equals("EARTH")) {
                Icon icon = new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_9YesFrame.png"));
                Con_Layout_Panel_Earth.setIcon(icon);
                ConButton_Back_Earth.setVisible(true);
                ConButton_Back_Earth.setEnabled(true);
                ConButton_Next_Earth.setVisible(true);
                ConButton_Next_Earth.setEnabled(true);
                Conver_proceed_Button.setVisible(false);
                Conver_proceed_Button.setEnabled(false);
                CLE_Text.setVisible(false);
                CLE_Text.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "YOUR ANSWER IS WRONG!");
                CLE_Text.setText("");
            }
        } else if (conFrames_Earth == 10) {
            if (answer.equals("FALSE")) {
                Icon icon = new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_10YesFrame.png"));
                Con_Layout_Panel_Earth.setIcon(icon);
                ConButton_Back_Earth.setVisible(true);
                ConButton_Back_Earth.setEnabled(true);
                ConButton_Next_Earth.setVisible(true);
                ConButton_Next_Earth.setEnabled(true);
                Conver_proceed_Button.setVisible(false);
                Conver_proceed_Button.setEnabled(false);
                CLE_Text.setVisible(false);
                CLE_Text.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "YOUR ANSWER IS WRONG!");
                CLE_Text.setText("");
            }
        } else if (conFrames_Earth == 11) {
            if (answer.equals("ROTATES") || answer.equals("ROTATE") || answer.equals("ROTATIONS") || answer.equals("ROTATION")) {
                Icon icon = new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_11YesFrame.png"));
                Con_Layout_Panel_Earth.setIcon(icon);
                ConButton_Back_Earth.setVisible(true);
                ConButton_Back_Earth.setEnabled(true);
                ConButton_Next_Earth.setVisible(true);
                ConButton_Next_Earth.setEnabled(true);
                Conver_proceed_Button.setVisible(false);
                Conver_proceed_Button.setEnabled(false);
                CLE_Text.setVisible(false);
                CLE_Text.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "YOUR ANSWER IS WRONG!");
                CLE_Text.setText("");
            }
        }


    }//GEN-LAST:event_Conver_proceed_ButtonActionPerformed

    private void CLE_Back_To_Main_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLE_Back_To_Main_ButtonActionPerformed
        // TODO add your handling code here:
        Conversational_Learning_Earth.setVisible(false);
        Conversational_Learning_Earth.dispose();
        attachment(Conversational_Learning);

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_CLE_Back_To_Main_ButtonActionPerformed

    public void converFrameBackDisplayer_Moon() {
        CLM_Text.setVisible(false);
        CLM_Text.setEditable(false);
        CLM_ComboBox.setVisible(false);
        CLM_ComboBox.setEnabled(false);
        Conver_proceed_Button_Moon.setVisible(false);
        Conver_proceed_Button_Moon.setEnabled(false);
        CLM_Back_To_Main_Button.setVisible(false);
        CLM_Back_To_Main_Button.setEnabled(false);
        if (conFrames_Moon > 1) {
            ConButton_Back_Moon.setVisible(true);
            ConButton_Back_Moon.setEnabled(true);
        } else {
            ConButton_Back_Moon.setVisible(false);
            ConButton_Back_Moon.setEnabled(false);
        }

        if (conFrames_Moon == 7) {
            CLM_Text.setVisible(true);
            CLM_Text.setEditable(true);
            Conver_proceed_Button_Moon.setVisible(true);
            Conver_proceed_Button_Moon.setEnabled(true);
            ConButton_Back_Moon.setVisible(false);
            ConButton_Back_Moon.setEnabled(false);
            ConButton_Next_Moon.setVisible(false);
            ConButton_Next_Moon.setEnabled(false);

        }

        if (conFrames_Moon == 8) {
            CLM_ComboBox.setVisible(true);
            CLM_ComboBox.setEnabled(true);
            Conver_proceed_Button_Moon.setVisible(true);
            Conver_proceed_Button_Moon.setEnabled(true);
            ConButton_Back_Moon.setVisible(false);
            ConButton_Back_Moon.setEnabled(false);
            ConButton_Next_Moon.setVisible(false);
            ConButton_Next_Moon.setEnabled(false);

        }

        if (conFrames_Moon == 9) {
            CLM_Text.setVisible(true);
            CLM_Text.setEditable(true);
            Conver_proceed_Button_Moon.setVisible(true);
            Conver_proceed_Button_Moon.setEnabled(true);
            ConButton_Back_Moon.setVisible(false);
            ConButton_Back_Moon.setEnabled(false);
            ConButton_Next_Moon.setVisible(false);
            ConButton_Next_Moon.setEnabled(false);

        }
        if (conFrames_Moon == 10) {
            CLM_Back_To_Main_Button.setVisible(true);
            CLM_Back_To_Main_Button.setEnabled(true);
        }

    }


    private void ConButton_Back_MoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConButton_Back_MoonActionPerformed
        // TODO add your handling code here:
        if (conFrames_Moon == 1) {
            conFrames_Moon = 1;
        } else {
            conFrames_Moon = conFrames_Moon - 1;
        }
        Con_Layout_Panel_Moon.setIcon(conFrameDisplayer_Moon(conFrames_Moon));
        converFrameBackDisplayer_Moon();

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
//        System.out.println(conFrames_Moon);
    }//GEN-LAST:event_ConButton_Back_MoonActionPerformed

    private void ConButton_Next_MoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConButton_Next_MoonActionPerformed
        // TODO add your handling code here:
        if (conFrames_Moon >= 10) {
            conFrames_Moon = 10;
        } else {
            conFrames_Moon = conFrames_Moon + 1;
        }

        Con_Layout_Panel_Moon.setIcon(conFrameDisplayer_Moon(conFrames_Moon));
        converFrameBackDisplayer_Moon();

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
//        System.out.println(conFrames_Moon);
    }//GEN-LAST:event_ConButton_Next_MoonActionPerformed

    private void Conver_proceed_Button_MoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Conver_proceed_Button_MoonActionPerformed
        // TODO add your handling code here:
        String answer = CLM_Text.getText().toUpperCase().trim();

        if (conFrames_Moon == 7) {
            if (answer.equals("MOON")) {
                Icon icon = new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_7Frame_Yes.png"));
                Con_Layout_Panel_Moon.setIcon(icon);
                ConButton_Back_Moon.setVisible(true);
                ConButton_Back_Moon.setEnabled(true);
                ConButton_Next_Moon.setVisible(true);
                ConButton_Next_Moon.setEnabled(true);
                Conver_proceed_Button_Moon.setVisible(false);
                Conver_proceed_Button_Moon.setEnabled(false);
                CLM_Text.setVisible(false);
                CLM_Text.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "YOUR ANSWER IS WRONG!");
                CLM_Text.setText("");
            }
        }

        if (conFrames_Moon == 8) {
            String comchoose = CLM_ComboBox.getSelectedItem().toString().toUpperCase().trim();
            //System.out.println(comchoose);
            if (comchoose.equals("27.3 DAYS")) {
                Icon icon = new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_8Frame_Yes.png"));
                Con_Layout_Panel_Moon.setIcon(icon);
                ConButton_Back_Moon.setVisible(true);
                ConButton_Back_Moon.setEnabled(true);
                ConButton_Next_Moon.setVisible(true);
                ConButton_Next_Moon.setEnabled(true);
                Conver_proceed_Button_Moon.setVisible(false);
                Conver_proceed_Button_Moon.setEnabled(false);
                CLM_ComboBox.setVisible(false);
                CLM_ComboBox.setSelectedIndex(0);

            } else {
                JOptionPane.showMessageDialog(null, "YOUR ANSWER IS WRONG!");
                CLM_ComboBox.setSelectedIndex(0);
//            }
            }

        }

        if (conFrames_Moon == 9) {
            if (answer.equals("1") || answer.equals("ONE")) {
                Icon icon = new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_9Frame_Yes.png"));
                Con_Layout_Panel_Moon.setIcon(icon);
                ConButton_Back_Moon.setVisible(true);
                ConButton_Back_Moon.setEnabled(true);
                ConButton_Next_Moon.setVisible(true);
                ConButton_Next_Moon.setEnabled(true);
                Conver_proceed_Button_Moon.setVisible(false);
                Conver_proceed_Button_Moon.setEnabled(false);
                CLM_Text.setVisible(false);
                CLM_Text.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "YOUR ANSWER IS WRONG!");
                CLM_Text.setText("");
            }
        }
    }//GEN-LAST:event_Conver_proceed_Button_MoonActionPerformed

    private void CLM_Back_To_Main_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLM_Back_To_Main_ButtonActionPerformed
        // TODO add your handling code here:
        Conversational_Learning_Moon.setVisible(false);
        Conversational_Learning_Moon.dispose();
        attachment(Conversational_Learning);

    }//GEN-LAST:event_CLM_Back_To_Main_ButtonActionPerformed

    public void converFrameBackDisplayer_Sun() {
        CLS_Text.setVisible(false);
        CLS_Text.setEditable(false);
        Conver_proceed_Button_Sun.setVisible(false);
        Conver_proceed_Button_Sun.setEnabled(false);
        CLS_Back_To_Main_Button.setVisible(false);
        CLS_Back_To_Main_Button.setEnabled(false);
        if (conFrames_Sun > 1) {
            ConButton_Back_Sun.setVisible(true);
            ConButton_Back_Sun.setEnabled(true);
        } else {
            ConButton_Back_Sun.setVisible(false);
            ConButton_Back_Sun.setEnabled(false);
        }

        if (conFrames_Sun >= 6) {
            CLS_Text.setVisible(true);
            CLS_Text.setEditable(true);
            Conver_proceed_Button_Sun.setVisible(true);
            Conver_proceed_Button_Sun.setEnabled(true);
            ConButton_Back_Sun.setVisible(false);
            ConButton_Back_Sun.setEnabled(false);
            ConButton_Next_Sun.setVisible(false);
            ConButton_Next_Sun.setEnabled(false);

        }

        if (conFrames_Sun == 7) {
            CLS_Text.setVisible(true);
            CLS_Text.setEditable(true);
            Conver_proceed_Button_Sun.setVisible(true);
            Conver_proceed_Button_Sun.setEnabled(true);
            ConButton_Back_Sun.setVisible(false);
            ConButton_Back_Sun.setEnabled(false);
            ConButton_Next_Sun.setVisible(false);
            ConButton_Next_Sun.setEnabled(false);

        }

        if (conFrames_Sun == 8) {
            CLS_Text.setVisible(true);
            CLS_Text.setEditable(true);
            Conver_proceed_Button_Sun.setVisible(true);
            Conver_proceed_Button_Sun.setEnabled(true);
            ConButton_Back_Sun.setVisible(false);
            ConButton_Back_Sun.setEnabled(false);
            ConButton_Next_Sun.setVisible(false);
            ConButton_Next_Sun.setEnabled(false);

        }

        if (conFrames_Sun == 9) {
            ConButton_Back_Sun.setVisible(true);
            ConButton_Back_Sun.setEnabled(true);
            CLS_Text.setVisible(false);
            CLS_Text.setEditable(false);
            Conver_proceed_Button_Sun.setVisible(false);
            Conver_proceed_Button_Sun.setEnabled(false);
            CLS_Back_To_Main_Button.setVisible(true);
            CLS_Back_To_Main_Button.setEnabled(true);
        }

    }


    private void Con_Layout_Panel_MoonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Con_Layout_Panel_MoonMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Con_Layout_Panel_MoonMouseMoved

    private void ConButton_Back_SunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConButton_Back_SunActionPerformed
        // TODO add your handling code here:
        if (conFrames_Sun == 1) {
            conFrames_Sun = 1;
        } else {
            conFrames_Sun = conFrames_Sun - 1;
        }
        Con_Layout_Panel_Sun.setIcon(conFrameDisplayer_Sun(conFrames_Sun));
        converFrameBackDisplayer_Sun();

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
        //System.out.println(conFrames_Sun);
    }//GEN-LAST:event_ConButton_Back_SunActionPerformed

    private void ConButton_Next_SunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConButton_Next_SunActionPerformed
        // TODO add your handling code here:
        if (conFrames_Sun >= 9) {
            conFrames_Sun = 9;
        } else {
            conFrames_Sun = conFrames_Sun + 1;
        }

        Con_Layout_Panel_Sun.setIcon(conFrameDisplayer_Sun(conFrames_Sun));
        converFrameBackDisplayer_Sun();

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
        //System.out.println(conFrames_Sun);
    }//GEN-LAST:event_ConButton_Next_SunActionPerformed

    private void Conver_proceed_Button_SunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Conver_proceed_Button_SunActionPerformed
        // TODO add your handling code here:
        String answer = CLS_Text.getText().toUpperCase().trim();

        if (conFrames_Sun == 6) {
            if (answer.equals("SUN")) {
                Icon icon = new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun/Conver_Layout_Sun_6Frame_Yes.png"));
                Con_Layout_Panel_Sun.setIcon(icon);
                ConButton_Back_Sun.setVisible(true);
                ConButton_Back_Sun.setEnabled(true);
                ConButton_Next_Sun.setVisible(true);
                ConButton_Next_Sun.setEnabled(true);
                Conver_proceed_Button_Sun.setVisible(false);
                Conver_proceed_Button_Sun.setEnabled(false);
                CLS_Text.setVisible(false);
                CLS_Text.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "YOUR ANSWER IS WRONG!");
                CLS_Text.setText("");
            }
        }

        if (conFrames_Sun == 7) {
            if (answer.equals("CENTER")) {
                Icon icon = new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun/Conver_Layout_Sun_7Frame_Yes.png"));
                Con_Layout_Panel_Sun.setIcon(icon);
                ConButton_Back_Sun.setVisible(true);
                ConButton_Back_Sun.setEnabled(true);
                ConButton_Next_Sun.setVisible(true);
                ConButton_Next_Sun.setEnabled(true);
                Conver_proceed_Button_Sun.setVisible(false);
                Conver_proceed_Button_Sun.setEnabled(false);
                CLS_Text.setVisible(false);
                CLS_Text.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "YOUR ANSWER IS WRONG!");
                CLS_Text.setText("");
            }

        }

        if (conFrames_Sun == 8) {
            if (answer.equals("SUN")) {
                Icon icon = new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun/Conver_Layout_Sun_8Frame_Yes.png"));
                Con_Layout_Panel_Sun.setIcon(icon);
                ConButton_Back_Sun.setVisible(true);
                ConButton_Back_Sun.setEnabled(true);
                ConButton_Next_Sun.setVisible(true);
                ConButton_Next_Sun.setEnabled(true);
                Conver_proceed_Button_Sun.setVisible(false);
                Conver_proceed_Button_Sun.setEnabled(false);
                CLS_Text.setVisible(false);
                CLS_Text.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "YOUR ANSWER IS WRONG!");
                CLS_Text.setText("");
            }
        }
    }//GEN-LAST:event_Conver_proceed_Button_SunActionPerformed

    private void CLS_Back_To_Main_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLS_Back_To_Main_ButtonActionPerformed
        // TODO add your handling code here:
        Conversational_Learning_Sun.setVisible(false);
        Conversational_Learning_Sun.dispose();
        attachment(Conversational_Learning);

        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_CLS_Back_To_Main_ButtonActionPerformed

    private void Con_Layout_Panel_SunMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Con_Layout_Panel_SunMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Con_Layout_Panel_SunMouseMoved

    private void ConversationalLearning_ButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConversationalLearning_ButtonMouseMoved
        // TODO add your handling code here:
        ConversationalLearning_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Button_Travel_Two.png")));
    }//GEN-LAST:event_ConversationalLearning_ButtonMouseMoved

    private void MAIN_LAYOUTMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAIN_LAYOUTMouseMoved
        // TODO add your handling code here:
        ConversationalLearning_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Button_Travel_One.png")));
        PostTest_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Button_Quiz_One.png")));
    }//GEN-LAST:event_MAIN_LAYOUTMouseMoved

    private void ConversationalLearning_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConversationalLearning_ButtonActionPerformed
        // TODO add your handling code here:
        attachment(Conversational_Learning);
        converFrameBackDisplayer();
        posttest_clicks += 1;
        postTest_Quiz_Displayer();
    }//GEN-LAST:event_ConversationalLearning_ButtonActionPerformed

    private void PostTest_ButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PostTest_ButtonMouseMoved
        // TODO add your handling code here:
        PostTest_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Button_Quiz_Two.png")));
    }//GEN-LAST:event_PostTest_ButtonMouseMoved
    int postTesState = 0;
    int PostTest_Score = 0;
    int PostTest_Hint = 0;
    private void PostTest_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostTest_ButtonActionPerformed
        // TODO add your handling code here:
        postTesState += 1;

        TeachingStrat.dispose();
        TeachingStrat.setVisible(false);
        Conversational_Learning.dispose();
        TeachingStrat.setVisible(false);

        attachment(Second_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_PostTest_ButtonActionPerformed

    private void Tenth_FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tenth_FirstButtonActionPerformed
        // TODO add your handling code here:
        PostTest_Score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Tenth_Quiz_Frame.dispose();
        Tenth_Quiz_Frame.setVisible(false);

        attachment(Eleventh_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Tenth_FirstButtonActionPerformed

    private void Tenth_SecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tenth_SecondButtonActionPerformed
        // TODO add your handling code here:+
        PostTest_Score += 1;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Tenth_Quiz_Frame.dispose();
        Tenth_Quiz_Frame.setVisible(false);

        attachment(Eleventh_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Tenth_SecondButtonActionPerformed

    private void Tenth_ThirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tenth_ThirdButtonActionPerformed
        // TODO add your handling code here:
        PostTest_Score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Tenth_Quiz_Frame.dispose();
        Tenth_Quiz_Frame.setVisible(false);

        attachment(Eleventh_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Tenth_ThirdButtonActionPerformed

    private void Tenth_FourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tenth_FourthButtonActionPerformed
        // TODO add your handling code here:
        PostTest_Score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Tenth_Quiz_Frame.dispose();
        Tenth_Quiz_Frame.setVisible(false);

        attachment(Eleventh_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Tenth_FourthButtonActionPerformed

    private void FirstQuizCloseButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizCloseButton9ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FirstQuizCloseButton9ActionPerformed

    private void TenthQuizButton_HINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenthQuizButton_HINTActionPerformed
        // TODO add your handling code here:
        hint_click_counter += 1;
        state = false;
        minutes = 0;
        seconds = 0;
        attachment(QUIZ_HINT);
        TenthQuizButton_HINT.setEnabled(false);
        switch (hint_click_counter % 3) {
            case 1:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/First_Quiz_HINT_Third.png")));
                break;
            case 2:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Second_Quiz_HINT_Second.png")));
                break;
            case 0:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Third_Quiz_HINT_Third.png")));
                break;
            default:
                break;
        }


    }//GEN-LAST:event_TenthQuizButton_HINTActionPerformed

    private void Eleventh_FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eleventh_FirstButtonActionPerformed
        // TODO add your handling code here:
        PostTest_Score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Eleventh_Quiz_Frame.dispose();
        Eleventh_Quiz_Frame.setVisible(false);

        attachment(Twelve_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Eleventh_FirstButtonActionPerformed

    private void Eleventh_SecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eleventh_SecondButtonActionPerformed
        // TODO add your handling code here:
        PostTest_Score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Eleventh_Quiz_Frame.dispose();
        Eleventh_Quiz_Frame.setVisible(false);

        attachment(Twelve_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Eleventh_SecondButtonActionPerformed

    private void Eleventh_ThirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eleventh_ThirdButtonActionPerformed
        // TODO add your handling code here:
        PostTest_Score += 1;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Eleventh_Quiz_Frame.dispose();
        Eleventh_Quiz_Frame.setVisible(false);

        attachment(Twelve_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Eleventh_ThirdButtonActionPerformed

    private void Eleventh_FourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eleventh_FourthButtonActionPerformed
        // TODO add your handling code here:
        PostTest_Score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Eleventh_Quiz_Frame.dispose();
        Eleventh_Quiz_Frame.setVisible(false);

        attachment(Twelve_Quiz_Frame);
        stopwatch();
        threadChecker();
    }//GEN-LAST:event_Eleventh_FourthButtonActionPerformed

    private void FirstQuizCloseButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizCloseButton10ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FirstQuizCloseButton10ActionPerformed

    private void EleventhQuizButton_HINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleventhQuizButton_HINTActionPerformed
        // TODO add your handling code here:
        hint_click_counter += 1;
        state = false;
        minutes = 0;
        seconds = 0;
        attachment(QUIZ_HINT);
        EleventhQuizButton_HINT.setEnabled(false);
        switch (hint_click_counter % 3) {
            case 1:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fourth_Quiz_HINT_Third.png")));
                break;
            case 2:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fifth_Quiz_HINT_Third.png")));
                break;
            case 0:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fifth_Quiz_HINT_Second.png")));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_EleventhQuizButton_HINTActionPerformed

    private void Twelve_FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Twelve_FirstButtonActionPerformed
        // TODO add your handling code here:
        PostTest_Score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Twelve_Quiz_Frame.dispose();
        Twelve_Quiz_Frame.setVisible(false);

        attachment(PostTest_Results);

        Displayer_FName.setText(fName);
        Displayer_Age.setText(age + "");
        int total = first_CC + second_CC + third_CC + fourth_CC + fifth_CC + sixth_CC + seventh_CC + Eight_CC + ninth_CC;
        Displayer_Pretest_Score.setText(score + " / 9");
        Displayer_Pretest_Hint.setText(total + "");
        Displayer_Posttest_Score.setText(PostTest_Score + " / 9");
        Displayer_Posttest_Hint.setText(PostTest_Hint + "");
        if (GenderVariable.equals("BOY")) {
            GenderVarDisplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Boy_Picture.png")));
        } else if (GenderVariable.equals("GIRL")) {
            GenderVarDisplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Girl_Picture.png")));
        }

    }//GEN-LAST:event_Twelve_FirstButtonActionPerformed

    private void Twelve_SecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Twelve_SecondButtonActionPerformed
        // TODO add your handling code here:
        PostTest_Score += 1;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Twelve_Quiz_Frame.dispose();
        Twelve_Quiz_Frame.setVisible(false);

        attachment(PostTest_Results);

        Displayer_FName.setText(fName);
        Displayer_Age.setText(age + "");
        int total = first_CC + second_CC + third_CC + fourth_CC + fifth_CC + sixth_CC + seventh_CC + Eight_CC + ninth_CC;
        Displayer_Pretest_Score.setText(score + " / 9");
        Displayer_Pretest_Hint.setText(total + "");
        Displayer_Posttest_Score.setText(PostTest_Score + " / 9");
        Displayer_Posttest_Hint.setText(PostTest_Hint + "");
        if (GenderVariable.equals("BOY")) {
            GenderVarDisplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Boy_Picture.png")));
        } else if (GenderVariable.equals("GIRL")) {
            GenderVarDisplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Girl_Picture.png")));
        }
    }//GEN-LAST:event_Twelve_SecondButtonActionPerformed

    private void Twelve_ThirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Twelve_ThirdButtonActionPerformed
        // TODO add your handling code here:
        PostTest_Score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Twelve_Quiz_Frame.dispose();
        Twelve_Quiz_Frame.setVisible(false);

        attachment(PostTest_Results);

        Displayer_FName.setText(fName);
        Displayer_Age.setText(age + "");
        int total = first_CC + second_CC + third_CC + fourth_CC + fifth_CC + sixth_CC + seventh_CC + Eight_CC + ninth_CC;
        Displayer_Pretest_Score.setText(score + " / 9");
        Displayer_Pretest_Hint.setText(total + "");
        Displayer_Posttest_Score.setText(PostTest_Score + " / 9");
        Displayer_Posttest_Hint.setText(PostTest_Hint + "");
        if (GenderVariable.equals("BOY")) {
            GenderVarDisplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Boy_Picture.png")));
        } else if (GenderVariable.equals("GIRL")) {
            GenderVarDisplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Girl_Picture.png")));
        }
    }//GEN-LAST:event_Twelve_ThirdButtonActionPerformed

    private void Twelve_FourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Twelve_FourthButtonActionPerformed
        // TODO add your handling code here:
        PostTest_Score += 0;
        state = false;
        minutes = 0;
        seconds = 0;
        hint_click_counter = 0;
        Twelve_Quiz_Frame.dispose();
        Twelve_Quiz_Frame.setVisible(false);

        attachment(PostTest_Results);

        Displayer_FName.setText(fName);
        Displayer_Age.setText(age + "");
        int total = first_CC + second_CC + third_CC + fourth_CC + fifth_CC + sixth_CC + seventh_CC + Eight_CC + ninth_CC;
        Displayer_Pretest_Score.setText(score + " / 9");
        Displayer_Pretest_Hint.setText(total + "");
        Displayer_Posttest_Score.setText(PostTest_Score + " / 9");
        Displayer_Posttest_Hint.setText(PostTest_Hint + "");
        if (GenderVariable.equals("BOY")) {
            GenderVarDisplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Boy_Picture.png")));
        } else if (GenderVariable.equals("GIRL")) {
            GenderVarDisplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Girl_Picture.png")));
        }
    }//GEN-LAST:event_Twelve_FourthButtonActionPerformed

    private void FirstQuizCloseButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstQuizCloseButton11ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FirstQuizCloseButton11ActionPerformed

    private void TwelveQuizButton_HINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwelveQuizButton_HINTActionPerformed
        // TODO add your handling code here:
        hint_click_counter += 1;
        state = false;
        minutes = 0;
        seconds = 0;
        attachment(QUIZ_HINT);
        TwelveQuizButton_HINT.setEnabled(false);
        switch (hint_click_counter % 3) {
            case 1:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Eight_Quiz_HINT_FIRST.png")));
                break;
            case 2:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Seventh_Quiz_HINT_Third.png")));
                break;
            case 0:
                HINT_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Seventh_Quiz_HINT_Second.png")));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_TwelveQuizButton_HINTActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton17ActionPerformed

    public void conHideButton(JButton button) {
        button.setVisible(false);
        button.setEnabled(false);
    }

    public Icon conFrameDisplayer(int num) {
        if (num == 1) {
            return new javax.swing.ImageIcon(getClass().getResource("/View/First_Frame.png"));
        } else if (num == 2) {
            return new javax.swing.ImageIcon(getClass().getResource("/View/Second_Frame.png"));
        } else if (num == 3) {
            return new javax.swing.ImageIcon(getClass().getResource("/View/Third_Frame.png"));
        } else if (num == 4) {
            return new javax.swing.ImageIcon(getClass().getResource("/View/Conv_FourthFrame.png"));
        }

        return null;
    }

    public Icon conFrameDisplayer_EARTH(int num) {
        switch (num) {
            case 1:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_FirstFrame.png"));
            case 2:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_SecondFrame.png"));
            case 3:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_ThirdFrame.png"));
            case 4:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_FourthFrame.png"));
            case 5:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_FifthFrame.png"));
            case 6:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_SixthFrame.png"));
            case 7:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_SeventhFrame.png"));
            case 8:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_EigthFrame.png"));
            case 9:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_9Frame.png"));
            case 10:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_10Frame.png"));
            case 11:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_11Frame.png"));
            case 12:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Earth/Conver_Layout_Earth_12Frame.png"));
            default:
                break;
        }

        return null;
    }

    public Icon conFrameDisplayer_Moon(int num) {
        switch (num) {
            case 1:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_1Frame.png"));
            case 2:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_2Frame.png"));
            case 3:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_3Frame.png"));
            case 4:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_4Frame.png"));
            case 5:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_5Frame.png"));
            case 6:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_6Frame.png"));
            case 7:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_7Frame.png"));
            case 8:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_8Frame.png"));
            case 9:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_9Frame.png"));
            case 10:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Moon/Conver_Layout_Moon_10Frame.png"));

            default:
                break;
        }

        return null;
    }

    public Icon conFrameDisplayer_Sun(int num) {
        switch (num) {
            case 1:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun/Conver_Layout_Sun_1Frame.png"));
            case 2:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun/Conver_Layout_Sun_2Frame.png"));
            case 3:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun/Conver_Layout_Sun_3Frame.png"));
            case 4:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun/Conver_Layout_Sun_4Frame.png"));
            case 5:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun/Conver_Layout_Sun_5Frame.png"));
            case 6:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun/Conver_Layout_Sun_6Frame.png"));
            case 7:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun/Conver_Layout_Sun_7Frame.png"));
            case 8:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun/Conver_Layout_Sun_8Frame.png"));
            case 9:
                return new javax.swing.ImageIcon(getClass().getResource("/View/Conversational_Sun/Conver_Layout_Sun_9Frame.png"));
            default:
                break;
        }

        return null;
    }

    public static void attachment(JFrame frame) {
        //frame.setUndecorated(true);
//        frame.setBackground(new Color(0, 0, 0, 0));
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void threadChecker() {
        state = true;
        Thread t = new Thread() {
            @Override
            public void run() {

                while (state == true) {
                    try {
                        Thread.sleep(1);
                        milliseconds++;
                        if (milliseconds == 1000) {
                            seconds++;
                            milliseconds = 0;
                        }
                        if (seconds == 60) {
                            minutes++;
                            seconds = 0;
                        }

                        if (minutes == 60) {
                            hours++;
                            minutes = 0;
                        }
                        if (seconds == 30) {
                            reminder = reminder + 1;
                            state = false;
                            switch (reminder) {
                                case 1:
                                    attachment(Reminder);
                                    First_Reminder_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Rem_Button.png")));
                                    break;
                                case 2:
                                    attachment(Reminder);
                                    First_Reminder_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Rem_Button2.png")));
                                    break;
                                case 3:
                                    attachment(Reminder);
                                    First_Reminder_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Rem_Button3.png")));
                                    break;
                                default:
                                    break;
                            }

                        }

                    } catch (Exception e) {

                    }

                }

            }

        };
        t.start();
    }

    public void stopwatch() {
        state = true;

        Thread t = new Thread() {
            public void run() {
                while (state == true) {
                    try {
                        Thread.sleep(1);
                        milliseconds++;
                        if (milliseconds == 1000) {
                            seconds++;
                            milliseconds = 0;
                        }
                        if (seconds == 60) {
                            minutes++;
                            seconds = 0;
                        }
                        if (minutes == 60) {
                            hours++;
                            minutes = 0;
                        }
                    } catch (Exception e) {

                    }

                }

            }

        };
        t.start();
    }

    int posttest_clicks = 0;

    public void postTest_Quiz_Displayer() {
        if (posttest_clicks >= 20) {
            PostTest_Button.setVisible(true);
            PostTest_Button.setEnabled(true);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_View().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ARROW_DOWN;
    private javax.swing.JButton ARROW_LEFT;
    private javax.swing.JButton ARROW_OK;
    private javax.swing.JButton ARROW_RIGHT;
    private javax.swing.JButton ARROW_UP;
    private javax.swing.JLabel Age_Input;
    private javax.swing.JButton B4_proceed_button;
    private javax.swing.JButton BUTTON_DFTE_OFF;
    private javax.swing.JButton BUTTON_DFTE_ON;
    private javax.swing.JButton BUTTON_PLAY_VIDEO;
    private javax.swing.JButton BUTTON_ROIA_OFF;
    private javax.swing.JButton BUTTON_ROIA_ON;
    private javax.swing.JButton BUTTON_SEE_PICTURE;
    private javax.swing.JButton BUTTON_SIZE_OFF;
    private javax.swing.JButton BUTTON_SIZE_ON;
    private javax.swing.JButton BUTTON_TEMP_OFF;
    private javax.swing.JButton BUTTON_TEMP_ON;
    private javax.swing.JFrame Before_Teaching_Strat;
    private javax.swing.JButton CLE_Back_To_Main_Button;
    private javax.swing.JTextField CLE_Text;
    private javax.swing.JButton CLM_Back_To_Main_Button;
    private javax.swing.JComboBox<String> CLM_ComboBox;
    private javax.swing.JTextField CLM_Text;
    private javax.swing.JButton CLS_Back_To_Main_Button;
    private javax.swing.JTextField CLS_Text;
    private javax.swing.JLabel CORONA;
    private javax.swing.JLabel CRATERS;
    private javax.swing.JButton ConButton_Back;
    private javax.swing.JButton ConButton_Back_Earth;
    private javax.swing.JButton ConButton_Back_Moon;
    private javax.swing.JButton ConButton_Back_Sun;
    private javax.swing.JButton ConButton_Next;
    private javax.swing.JButton ConButton_Next_Earth;
    private javax.swing.JButton ConButton_Next_Moon;
    private javax.swing.JButton ConButton_Next_Sun;
    private javax.swing.JLabel Con_Layout_Panel;
    private javax.swing.JLabel Con_Layout_Panel_Earth;
    private javax.swing.JLabel Con_Layout_Panel_Moon;
    private javax.swing.JLabel Con_Layout_Panel_Sun;
    private javax.swing.JButton Conver_proceed_Button;
    private javax.swing.JButton Conver_proceed_Button_Moon;
    private javax.swing.JButton Conver_proceed_Button_Sun;
    private javax.swing.JButton ConversationalLearning_Button;
    private javax.swing.JFrame Conversational_Learning;
    private javax.swing.JFrame Conversational_Learning_Earth;
    private javax.swing.JFrame Conversational_Learning_Moon;
    private javax.swing.JFrame Conversational_Learning_Sun;
    private javax.swing.JLabel Displayer_Age;
    private javax.swing.JLabel Displayer_FName;
    private javax.swing.JLabel Displayer_Posttest_Hint;
    private javax.swing.JLabel Displayer_Posttest_Score;
    private javax.swing.JLabel Displayer_Pretest_Hint;
    private javax.swing.JLabel Displayer_Pretest_Score;
    private javax.swing.JFrame EARTH_DFTE_INFORMATION;
    private javax.swing.JFrame EARTH_ROIA_INFORMATION;
    private javax.swing.JFrame EARTH_SIZE_INFORMATION;
    private javax.swing.JFrame EARTH_TEMP_INFORMATION;
    private javax.swing.JButton EigthQuizButton_HINT;
    private javax.swing.JButton Eigth_FirstButton;
    private javax.swing.JButton Eigth_FourthButton;
    private javax.swing.JFrame Eigth_Quiz_Frame;
    private javax.swing.JButton Eigth_SecondButton;
    private javax.swing.JButton Eigth_ThirdButton;
    private javax.swing.JButton EleventhQuizButton_HINT;
    private javax.swing.JButton Eleventh_FirstButton;
    private javax.swing.JButton Eleventh_FourthButton;
    private javax.swing.JFrame Eleventh_Quiz_Frame;
    private javax.swing.JButton Eleventh_SecondButton;
    private javax.swing.JButton Eleventh_ThirdButton;
    private javax.swing.JLabel FLARE;
    private javax.swing.JLabel FORESTS;
    private javax.swing.JButton FifthQuizButton_HINT;
    private javax.swing.JButton Fifth_FirstButton;
    private javax.swing.JButton Fifth_FourthButton;
    private javax.swing.JFrame Fifth_Quiz_Frame;
    private javax.swing.JButton Fifth_SecondButton;
    private javax.swing.JButton Fifth_ThirdButton;
    private javax.swing.JButton FirstButton;
    private javax.swing.JTextField FirstName;
    private javax.swing.JButton FirstQuizButton_HINT;
    private javax.swing.JButton FirstQuizCloseButton;
    private javax.swing.JButton FirstQuizCloseButton1;
    private javax.swing.JButton FirstQuizCloseButton10;
    private javax.swing.JButton FirstQuizCloseButton11;
    private javax.swing.JButton FirstQuizCloseButton2;
    private javax.swing.JButton FirstQuizCloseButton3;
    private javax.swing.JButton FirstQuizCloseButton4;
    private javax.swing.JButton FirstQuizCloseButton5;
    private javax.swing.JButton FirstQuizCloseButton6;
    private javax.swing.JButton FirstQuizCloseButton7;
    private javax.swing.JButton FirstQuizCloseButton8;
    private javax.swing.JButton FirstQuizCloseButton9;
    private javax.swing.JFrame First_Quiz_Frame;
    private javax.swing.JButton First_Reminder_Button;
    private javax.swing.JLabel Fname_Off;
    private javax.swing.JLabel Fname_On;
    private javax.swing.JButton FourthButton;
    private javax.swing.JButton FourthQuizButton_HINT;
    private javax.swing.JButton Fourth_FirstButton;
    private javax.swing.JButton Fourth_FourthButton;
    private javax.swing.JFrame Fourth_Quiz_Frame;
    private javax.swing.JButton Fourth_SecondButton;
    private javax.swing.JButton Fourth_ThirdButton;
    private javax.swing.JLabel GLOW_GREEN;
    private javax.swing.JLabel GLOW_ORANGE;
    private javax.swing.JLabel GLOW_WHITE;
    private javax.swing.JFrame Gallery;
    private javax.swing.JButton Gallery_Close_Button;
    private javax.swing.JButton Gallery_Left_Button;
    private javax.swing.JLabel Gallery_Picture;
    private javax.swing.JButton Gallery_Right_Button;
    private javax.swing.JLabel GenderVarDisplayer;
    private javax.swing.JLabel Gender_Var;
    private javax.swing.JButton HINT_OKAY_BUTTON;
    private javax.swing.JLabel HINT_PANEL;
    private javax.swing.JLabel HintUsed_Variable_Display;
    private javax.swing.JLabel ISLANDS;
    private javax.swing.JLabel LAKE;
    private javax.swing.JLabel LUNARMARIA;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel Lname_Off;
    private javax.swing.JLabel Lname_On;
    private javax.swing.JLabel MAIN_LAYOUT;
    private javax.swing.JLabel MAIN_PANEL_PLANET;
    private javax.swing.JFrame MOON_DFTE_INFORMATION;
    private javax.swing.JFrame MOON_ROIA_INFORMATION;
    private javax.swing.JFrame MOON_SIZE_INFORMATION;
    private javax.swing.JFrame MOON_TEMP_INFORMATION;
    private javax.swing.JLabel MOUNTAINS;
    private javax.swing.JLabel Main_Earth;
    private javax.swing.JLabel Main_Moon;
    private javax.swing.JLabel Main_Sun;
    private javax.swing.JButton NinthQuizButton_HINT;
    private javax.swing.JButton Ninth_FirstButton;
    private javax.swing.JButton Ninth_FourthButton;
    private javax.swing.JFrame Ninth_Quiz_Frame;
    private javax.swing.JButton Ninth_SecondButton;
    private javax.swing.JButton Ninth_ThirdButton;
    private javax.swing.JLabel OCEAN;
    private javax.swing.JLabel PLAINS;
    private javax.swing.JLabel PROMINENCE;
    private javax.swing.JButton PostTest_Button;
    private javax.swing.JLabel PostTest_Result_Layout;
    private javax.swing.JFrame PostTest_Results;
    private javax.swing.JFrame QUIZ_HINT;
    private javax.swing.JLabel QuestionLayout;
    private javax.swing.JLabel QuestionLayout1;
    private javax.swing.JLabel QuestionLayout10;
    private javax.swing.JLabel QuestionLayout11;
    private javax.swing.JLabel QuestionLayout2;
    private javax.swing.JLabel QuestionLayout3;
    private javax.swing.JLabel QuestionLayout4;
    private javax.swing.JLabel QuestionLayout5;
    private javax.swing.JLabel QuestionLayout6;
    private javax.swing.JLabel QuestionLayout7;
    private javax.swing.JLabel QuestionLayout8;
    private javax.swing.JLabel QuestionLayout9;
    private javax.swing.JFrame Reminder;
    private javax.swing.JLabel SPOTS;
    private javax.swing.JFrame SUN_DFTE_INFORMATION;
    private javax.swing.JFrame SUN_ROIA_INFORMATION;
    private javax.swing.JFrame SUN_SIZE_INFORMATION;
    private javax.swing.JFrame SUN_TEMP_INFORMATION;
    private javax.swing.JLabel Score_Variable_Display;
    private javax.swing.JFrame Screen_View_Earth;
    private javax.swing.JFrame Screen_View_Moon;
    private javax.swing.JFrame Screen_View_Sun;
    private javax.swing.JButton SecondButton;
    private javax.swing.JButton SecondQuizButton_HINT;
    private javax.swing.JButton Second_FirstButton;
    private javax.swing.JButton Second_FourthButton;
    private javax.swing.JFrame Second_Quiz_Frame;
    private javax.swing.JButton Second_SecondButton;
    private javax.swing.JButton Second_ThirdButton;
    private javax.swing.JButton SeventhQuizButton_HINT;
    private javax.swing.JButton Seventh_FirstButton;
    private javax.swing.JButton Seventh_FourthButton;
    private javax.swing.JFrame Seventh_Quiz_Frame;
    private javax.swing.JButton Seventh_SecondButton;
    private javax.swing.JButton Seventh_ThirdButton;
    private javax.swing.JButton SixthQuizButton_HINT;
    private javax.swing.JButton Sixth_FirstButton;
    private javax.swing.JButton Sixth_FourthButton;
    private javax.swing.JFrame Sixth_Quiz_Frame;
    private javax.swing.JButton Sixth_SecondButton;
    private javax.swing.JButton Sixth_ThirdButton;
    private javax.swing.JFrame SpaceShip;
    private javax.swing.JButton SpaceShipButton;
    private javax.swing.JLabel SpaceShipLayout;
    private javax.swing.JButton SpaceShip_Close;
    private javax.swing.JButton SpaceShip_Earth;
    private javax.swing.JButton SpaceShip_Moon;
    private javax.swing.JButton SpaceShip_Sun;
    private javax.swing.JLabel Student_Age;
    private javax.swing.JLabel TEXT_DFTE;
    private javax.swing.JLabel TEXT_ROIA;
    private javax.swing.JLabel TEXT_SIZE;
    private javax.swing.JLabel TEXT_SURFACE;
    private javax.swing.JLabel TEXT_TEMP;
    private javax.swing.JButton Take_Your_Quiz_Button;
    private javax.swing.JFrame TeachingStrat;
    private javax.swing.JButton TenthQuizButton_HINT;
    private javax.swing.JButton Tenth_FirstButton;
    private javax.swing.JButton Tenth_FourthButton;
    private javax.swing.JFrame Tenth_Quiz_Frame;
    private javax.swing.JButton Tenth_SecondButton;
    private javax.swing.JButton Tenth_ThirdButton;
    private javax.swing.JButton ThirdButton;
    private javax.swing.JButton ThirdQuizButton_HINT;
    private javax.swing.JButton Third_FirstButton;
    private javax.swing.JButton Third_FourthButton;
    private javax.swing.JFrame Third_Quiz_Frame;
    private javax.swing.JButton Third_SecondButton;
    private javax.swing.JButton Third_ThirdButton;
    private javax.swing.JButton TwelveQuizButton_HINT;
    private javax.swing.JButton Twelve_FirstButton;
    private javax.swing.JButton Twelve_FourthButton;
    private javax.swing.JFrame Twelve_Quiz_Frame;
    private javax.swing.JButton Twelve_SecondButton;
    private javax.swing.JButton Twelve_ThirdButton;
    private javax.swing.JFrame WELCOME;
    private javax.swing.JFrame WELCOME_TWO;
    private javax.swing.JLabel WelcomeLayout;
    private javax.swing.JLabel WelcomeLayout1;
    private javax.swing.JButton Welcome_Close;
    private javax.swing.JButton Welcome_Close1;
    private javax.swing.JButton Welcome_Left;
    private javax.swing.JLabel Welcome_Light;
    private javax.swing.JLabel Welcome_Light_Gender;
    private javax.swing.JButton Welcome_Minus;
    private javax.swing.JButton Welcome_Plus;
    private javax.swing.JButton Welcome_Right;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton con_button_earth;
    private javax.swing.JButton con_button_moon;
    private javax.swing.JButton con_button_sun;
    private javax.swing.JLabel hint_layout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton minimizeButton;
    // End of variables declaration//GEN-END:variables
}
