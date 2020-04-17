package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import model.Board;

import java.util.ArrayList;

public class Controller {

    public static Board board = new Board();
    public static ArrayList<Text> boxTexts;

    @FXML
    private Button b_clear;

    @FXML
    private Button b_solve;

    @FXML
    void onClearClick(ActionEvent event) {
        board = new Board();
        boxTexts = new ArrayList<Text>();
        boxTexts.add(txt_0);
        boxTexts.add(txt_1);
        boxTexts.add(txt_2);
        boxTexts.add(txt_3);
        boxTexts.add(txt_4);
        boxTexts.add(txt_5);
        boxTexts.add(txt_6);
        boxTexts.add(txt_7);
        boxTexts.add(txt_8);
        boxTexts.add(txt_9);
        boxTexts.add(txt_10);
        boxTexts.add(txt_11);
        boxTexts.add(txt_12);
        boxTexts.add(txt_13);
        boxTexts.add(txt_14);
        boxTexts.add(txt_15);
        boxTexts.add(txt_16);
        boxTexts.add(txt_17);
        boxTexts.add(txt_18);
        boxTexts.add(txt_19);
        boxTexts.add(txt_20);
        boxTexts.add(txt_21);
        boxTexts.add(txt_22);
        boxTexts.add(txt_23);
        boxTexts.add(txt_24);
        boxTexts.add(txt_25);
        boxTexts.add(txt_26);
        boxTexts.add(txt_27);
        boxTexts.add(txt_28);
        boxTexts.add(txt_29);
        boxTexts.add(txt_30);
        boxTexts.add(txt_31);
        boxTexts.add(txt_32);
        boxTexts.add(txt_33);
        boxTexts.add(txt_34);
        boxTexts.add(txt_35);
        boxTexts.add(txt_36);
        boxTexts.add(txt_37);
        boxTexts.add(txt_38);
        boxTexts.add(txt_39);
        boxTexts.add(txt_40);
        boxTexts.add(txt_41);
        boxTexts.add(txt_42);
        boxTexts.add(txt_43);
        boxTexts.add(txt_44);
        boxTexts.add(txt_45);
        boxTexts.add(txt_46);
        boxTexts.add(txt_47);
        boxTexts.add(txt_48);
        boxTexts.add(txt_49);
        boxTexts.add(txt_50);
        boxTexts.add(txt_51);
        boxTexts.add(txt_52);
        boxTexts.add(txt_53);
        boxTexts.add(txt_54);
        boxTexts.add(txt_55);
        boxTexts.add(txt_56);
        boxTexts.add(txt_57);
        boxTexts.add(txt_58);
        boxTexts.add(txt_59);
        boxTexts.add(txt_60);
        boxTexts.add(txt_61);
        boxTexts.add(txt_62);
        boxTexts.add(txt_63);
        boxTexts.add(txt_64);
        boxTexts.add(txt_65);
        boxTexts.add(txt_66);
        boxTexts.add(txt_67);
        boxTexts.add(txt_68);
        boxTexts.add(txt_69);
        boxTexts.add(txt_70);
        boxTexts.add(txt_71);
        boxTexts.add(txt_72);
        boxTexts.add(txt_73);
        boxTexts.add(txt_74);
        boxTexts.add(txt_75);
        boxTexts.add(txt_76);
        boxTexts.add(txt_77);
        boxTexts.add(txt_78);
        boxTexts.add(txt_79);
        boxTexts.add(txt_80);
        for (Text t : boxTexts) {
            t.setText("");
        }
    }

    @FXML
    void onSolveClick(ActionEvent event) {
        board = board.solveOneBoard();
        updateBoard();

    }
    
    private void updateBoard() {
        boxTexts = new ArrayList<Text>();
        boxTexts.add(txt_0);
        boxTexts.add(txt_1);
        boxTexts.add(txt_2);
        boxTexts.add(txt_3);
        boxTexts.add(txt_4);
        boxTexts.add(txt_5);
        boxTexts.add(txt_6);
        boxTexts.add(txt_7);
        boxTexts.add(txt_8);
        boxTexts.add(txt_9);
        boxTexts.add(txt_10);
        boxTexts.add(txt_11);
        boxTexts.add(txt_12);
        boxTexts.add(txt_13);
        boxTexts.add(txt_14);
        boxTexts.add(txt_15);
        boxTexts.add(txt_16);
        boxTexts.add(txt_17);
        boxTexts.add(txt_18);
        boxTexts.add(txt_19);
        boxTexts.add(txt_20);
        boxTexts.add(txt_21);
        boxTexts.add(txt_22);
        boxTexts.add(txt_23);
        boxTexts.add(txt_24);
        boxTexts.add(txt_25);
        boxTexts.add(txt_26);
        boxTexts.add(txt_27);
        boxTexts.add(txt_28);
        boxTexts.add(txt_29);
        boxTexts.add(txt_30);
        boxTexts.add(txt_31);
        boxTexts.add(txt_32);
        boxTexts.add(txt_33);
        boxTexts.add(txt_34);
        boxTexts.add(txt_35);
        boxTexts.add(txt_36);
        boxTexts.add(txt_37);
        boxTexts.add(txt_38);
        boxTexts.add(txt_39);
        boxTexts.add(txt_40);
        boxTexts.add(txt_41);
        boxTexts.add(txt_42);
        boxTexts.add(txt_43);
        boxTexts.add(txt_44);
        boxTexts.add(txt_45);
        boxTexts.add(txt_46);
        boxTexts.add(txt_47);
        boxTexts.add(txt_48);
        boxTexts.add(txt_49);
        boxTexts.add(txt_50);
        boxTexts.add(txt_51);
        boxTexts.add(txt_52);
        boxTexts.add(txt_53);
        boxTexts.add(txt_54);
        boxTexts.add(txt_55);
        boxTexts.add(txt_56);
        boxTexts.add(txt_57);
        boxTexts.add(txt_58);
        boxTexts.add(txt_59);
        boxTexts.add(txt_60);
        boxTexts.add(txt_61);
        boxTexts.add(txt_62);
        boxTexts.add(txt_63);
        boxTexts.add(txt_64);
        boxTexts.add(txt_65);
        boxTexts.add(txt_66);
        boxTexts.add(txt_67);
        boxTexts.add(txt_68);
        boxTexts.add(txt_69);
        boxTexts.add(txt_70);
        boxTexts.add(txt_71);
        boxTexts.add(txt_72);
        boxTexts.add(txt_73);
        boxTexts.add(txt_74);
        boxTexts.add(txt_75);
        boxTexts.add(txt_76);
        boxTexts.add(txt_77);
        boxTexts.add(txt_78);
        boxTexts.add(txt_79);
        boxTexts.add(txt_80);
        int x = 0;
        for (Text t: boxTexts) {
            t.setText(board.getValOnBoard(x) + "");
            x++;
        }
    }

    void onKeyPressed(KeyEvent keyEvent, Text text, int pos) {
        String input = keyEvent.getCode().toString();
        switch (input) {
            case "DIGIT1":
                text.setText("1");
                board.setBoard(pos, 1);
                break;
            case "DIGIT2":
                text.setText("2");
                board.setBoard(pos, 2);
                break;
            case "DIGIT3":
                text.setText("3");
                board.setBoard(pos, 3);
                break;
            case "DIGIT4":
                text.setText("4");
                board.setBoard(pos, 4);
                break;
            case "DIGIT5":
                text.setText("5");
                board.setBoard(pos, 5);
                break;
            case "DIGIT6":
                text.setText("6");
                board.setBoard(pos, 6);
                break;
            case "DIGIT7":
                text.setText("7");
                board.setBoard(pos, 7);
                break;
            case "DIGIT8":
                text.setText("8");
                board.setBoard(pos, 8);
                break;
            case "DIGIT9":
                text.setText("9");
                board.setBoard(pos, 9);
                break;
            case "BACK_SPACE":
                text.setText("");
                board.setBoard(pos, null);

        }
    }

    @FXML
    private Rectangle b_0;
    @FXML
    private Text txt_0;

    @FXML
    void onBox0Entered(MouseEvent mouseEvent) {
        b_0.setStroke(Paint.valueOf("Green"));
        b_0.setStrokeWidth(3);
        b_0.requestFocus();
    }

    @FXML
    void onBox0Exited(MouseEvent mouseEvent) {
        b_0.setStroke(Paint.valueOf("Black"));
        b_0.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox0KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_0, 0);
    }




    @FXML
    private Rectangle b_1;
    @FXML
    private Text txt_1;

    @FXML
    void onBox1Entered(MouseEvent mouseEvent) {
        b_1.setStroke(Paint.valueOf("Green"));
        b_1.setStrokeWidth(3);
        b_1.requestFocus();
    }

    @FXML
    void onBox1Exited(MouseEvent mouseEvent) {
        b_1.setStroke(Paint.valueOf("Black"));
        b_1.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox1Pressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_1, 1);
    }




    @FXML
    private Rectangle b_2;
    @FXML
    private Text txt_2;

    @FXML
    void onBox2Entered(MouseEvent mouseEvent) {
        b_2.setStroke(Paint.valueOf("Green"));
        b_2.setStrokeWidth(3);
        b_2.requestFocus();
    }

    @FXML
    void onBox2Exited(MouseEvent mouseEvent) {
        b_2.setStroke(Paint.valueOf("Black"));
        b_2.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox2KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_2, 2);
    }


    @FXML
    private Rectangle b_3;
    @FXML
    private Text txt_3;

    @FXML
    void onBox3Entered(MouseEvent mouseEvent) {
        b_3.setStroke(Paint.valueOf("Green"));
        b_3.setStrokeWidth(3);
        b_3.requestFocus();
    }

    @FXML
    void onBox3Exited(MouseEvent mouseEvent) {
        b_3.setStroke(Paint.valueOf("Black"));
        b_3.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox3KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_3, 3);
    }



    @FXML
    private Rectangle b_4;
    @FXML
    private Text txt_4;

    @FXML
    void onBox4Entered(MouseEvent mouseEvent) {
        b_4.setStroke(Paint.valueOf("Green"));
        b_4.setStrokeWidth(3);
        b_4.requestFocus();
    }

    @FXML
    void onBox4Exited(MouseEvent mouseEvent) {
        b_4.setStroke(Paint.valueOf("Black"));
        b_4.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox4KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_4, 4);
    }



    @FXML
    private Rectangle b_5;
    @FXML
    private Text txt_5;

    @FXML
    void onBox5Entered(MouseEvent mouseEvent) {
        b_5.setStroke(Paint.valueOf("Green"));
        b_5.setStrokeWidth(3);
        b_5.requestFocus();
    }

    @FXML
    void onBox5Exited(MouseEvent mouseEvent) {
        b_5.setStroke(Paint.valueOf("Black"));
        b_5.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox5KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_5, 5);
    }



    @FXML
    private Rectangle b_6;
    @FXML
    private Text txt_6;

    @FXML
    void onBox6Entered(MouseEvent mouseEvent) {
        b_6.setStroke(Paint.valueOf("Green"));
        b_6.setStrokeWidth(3);
        b_6.requestFocus();
    }

    @FXML
    void onBox6Exited(MouseEvent mouseEvent) {
        b_6.setStroke(Paint.valueOf("Black"));
        b_6.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox6KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_6, 6);
    }


    @FXML
    private Rectangle b_7;
    @FXML
    private Text txt_7;

    @FXML
    void onBox7Entered(MouseEvent mouseEvent) {
        b_7.setStroke(Paint.valueOf("Green"));
        b_7.setStrokeWidth(3);
        b_7.requestFocus();
    }

    @FXML
    void onBox7Exited(MouseEvent mouseEvent) {
        b_7.setStroke(Paint.valueOf("Black"));
        b_7.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox7KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_7, 7);
    }



    @FXML
    private Rectangle b_8;
    @FXML
    private Text txt_8;

    @FXML
    void onBox8Entered(MouseEvent mouseEvent) {
        b_8.setStroke(Paint.valueOf("Green"));
        b_8.setStrokeWidth(3);
        b_8.requestFocus();
    }

    @FXML
    void onBox8Exited(MouseEvent mouseEvent) {
        b_8.setStroke(Paint.valueOf("Black"));
        b_8.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox8KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_8, 8);
    }



    @FXML
    private Rectangle b_9;
    @FXML
    private Text txt_9;

    @FXML
    void onBox9Entered(MouseEvent mouseEvent) {
        b_9.setStroke(Paint.valueOf("Green"));
        b_9.setStrokeWidth(3);
        b_9.requestFocus();
    }

    @FXML
    void onBox9Exited(MouseEvent mouseEvent) {
        b_9.setStroke(Paint.valueOf("Black"));
        b_9.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox9KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_9, 9);
    }



    @FXML
    private Rectangle b_10;
    @FXML
    private Text txt_10;

    @FXML
    void onBox10Entered(MouseEvent mouseEvent) {
        b_10.setStroke(Paint.valueOf("Green"));
        b_10.setStrokeWidth(3);
        b_10.requestFocus();
    }

    @FXML
    void onBox10Exited(MouseEvent mouseEvent) {
        b_10.setStroke(Paint.valueOf("Black"));
        b_10.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox10KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_10, 10);
    }



    @FXML
    private Rectangle b_11;
    @FXML
    private Text txt_11;

    @FXML
    void onBox11Entered(MouseEvent mouseEvent) {
        b_11.setStroke(Paint.valueOf("Green"));
        b_11.setStrokeWidth(3);
        b_11.requestFocus();
    }

    @FXML
    void onBox11Exited(MouseEvent mouseEvent) {
        b_11.setStroke(Paint.valueOf("Black"));
        b_11.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox11KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_11, 11);
    }



    @FXML
    private Rectangle b_12;
    @FXML
    private Text txt_12;

    @FXML
    void onBox12Entered(MouseEvent mouseEvent) {
        b_12.setStroke(Paint.valueOf("Green"));
        b_12.setStrokeWidth(3);
        b_12.requestFocus();
    }

    @FXML
    void onBox12Exited(MouseEvent mouseEvent) {
        b_12.setStroke(Paint.valueOf("Black"));
        b_12.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox12KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_12, 12);
    }


    @FXML
    private Rectangle b_13;
    @FXML
    private Text txt_13;

    @FXML
    void onBox13Entered(MouseEvent mouseEvent) {
        b_13.setStroke(Paint.valueOf("Green"));
        b_13.setStrokeWidth(3);
        b_13.requestFocus();
    }

    @FXML
    void onBox13Exited(MouseEvent mouseEvent) {
        b_13.setStroke(Paint.valueOf("Black"));
        b_13.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox13KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_13, 13);
    }



    @FXML
    private Rectangle b_14;
    @FXML
    private Text txt_14;

    @FXML
    void onBox14Entered(MouseEvent mouseEvent) {
        b_14.setStroke(Paint.valueOf("Green"));
        b_14.setStrokeWidth(3);
        b_14.requestFocus();
    }

    @FXML
    void onBox14Exited(MouseEvent mouseEvent) {
        b_14.setStroke(Paint.valueOf("Black"));
        b_14.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox14KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_14, 14);
    }


    @FXML
    private Rectangle b_15;
    @FXML
    private Text txt_15;

    @FXML
    void onBox15Entered(MouseEvent mouseEvent) {
        b_15.setStroke(Paint.valueOf("Green"));
        b_15.setStrokeWidth(3);
        b_15.requestFocus();
    }

    @FXML
    void onBox15Exited(MouseEvent mouseEvent) {
        b_15.setStroke(Paint.valueOf("Black"));
        b_15.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox15KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_15, 15);
    }


    @FXML
    private Rectangle b_16;
    @FXML
    private Text txt_16;

    @FXML
    void onBox16Entered(MouseEvent mouseEvent) {
        b_16.setStroke(Paint.valueOf("Green"));
        b_16.setStrokeWidth(3);
        b_16.requestFocus();
    }

    @FXML
    void onBox16Exited(MouseEvent mouseEvent) {
        b_16.setStroke(Paint.valueOf("Black"));
        b_16.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox16KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_16, 16);
    }

    @FXML
    private Rectangle b_17;
    @FXML
    private Text txt_17;

    @FXML
    void onBox17Entered(MouseEvent mouseEvent) {
        b_17.setStroke(Paint.valueOf("Green"));
        b_17.setStrokeWidth(3);
        b_17.requestFocus();
    }

    @FXML
    void onBox17Exited(MouseEvent mouseEvent) {
        b_17.setStroke(Paint.valueOf("Black"));
        b_17.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox17KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_17, 17);
    }



    @FXML
    private Rectangle b_18;
    @FXML
    private Text txt_18;

    @FXML
    void onBox18Entered(MouseEvent mouseEvent) {
        b_18.setStroke(Paint.valueOf("Green"));
        b_18.setStrokeWidth(3);
        b_18.requestFocus();
    }

    @FXML
    void onBox18Exited(MouseEvent mouseEvent) {
        b_18.setStroke(Paint.valueOf("Black"));
        b_18.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox18KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_18, 18);
    }



    @FXML
    private Rectangle b_19;
    @FXML
    private Text txt_19;

    @FXML
    void onBox19Entered(MouseEvent mouseEvent) {
        b_19.setStroke(Paint.valueOf("Green"));
        b_19.setStrokeWidth(3);
        b_19.requestFocus();
    }

    @FXML
    void onBox19Exited(MouseEvent mouseEvent) {
        b_19.setStroke(Paint.valueOf("Black"));
        b_19.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox19KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_19, 19);
    }


    @FXML
    private Rectangle b_20;
    @FXML
    private Text txt_20;

    @FXML
    void onBox20Entered(MouseEvent mouseEvent) {
        b_20.setStroke(Paint.valueOf("Green"));
        b_20.setStrokeWidth(3);
        b_20.requestFocus();
    }

    @FXML
    void onBox20Exited(MouseEvent mouseEvent) {
        b_20.setStroke(Paint.valueOf("Black"));
        b_20.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox20KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_20, 20);
    }


    @FXML
    private Rectangle b_21;
    @FXML
    private Text txt_21;

    @FXML
    void onBox21Entered(MouseEvent mouseEvent) {
        b_21.setStroke(Paint.valueOf("Green"));
        b_21.setStrokeWidth(3);
        b_21.requestFocus();
    }

    @FXML
    void onBox21Exited(MouseEvent mouseEvent) {
        b_21.setStroke(Paint.valueOf("Black"));
        b_21.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox21KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_21, 21);
    }


    @FXML
    private Rectangle b_22;
    @FXML
    private Text txt_22;

    @FXML
    void onBox22Entered(MouseEvent mouseEvent) {
        b_22.setStroke(Paint.valueOf("Green"));
        b_22.setStrokeWidth(3);
        b_22.requestFocus();
    }

    @FXML
    void onBox22Exited(MouseEvent mouseEvent) {
        b_22.setStroke(Paint.valueOf("Black"));
        b_22.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox22KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_22, 22);
    }

    @FXML
    private Rectangle b_23;
    @FXML
    private Text txt_23;

    @FXML
    void onBox23Entered(MouseEvent mouseEvent) {
        b_23.setStroke(Paint.valueOf("Green"));
        b_23.setStrokeWidth(3);
        b_23.requestFocus();
    }

    @FXML
    void onBox23Exited(MouseEvent mouseEvent) {
        b_23.setStroke(Paint.valueOf("Black"));
        b_23.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox23KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_23, 23);
    }



    @FXML
    private Rectangle b_24;
    @FXML
    private Text txt_24;

    @FXML
    void onBox24Entered(MouseEvent mouseEvent) {
        b_24.setStroke(Paint.valueOf("Green"));
        b_24.setStrokeWidth(3);
        b_24.requestFocus();
    }

    @FXML
    void onBox24Exited(MouseEvent mouseEvent) {
        b_24.setStroke(Paint.valueOf("Black"));
        b_24.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox24KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_24, 24);
    }



    @FXML
    private Rectangle b_25;
    @FXML
    private Text txt_25;

    @FXML
    void onBox25Entered(MouseEvent mouseEvent) {
        b_25.setStroke(Paint.valueOf("Green"));
        b_25.setStrokeWidth(3);
        b_25.requestFocus();
    }

    @FXML
    void onBox25Exited(MouseEvent mouseEvent) {
        b_25.setStroke(Paint.valueOf("Black"));
        b_25.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox25KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_25, 25);
    }



    @FXML
    private Rectangle b_26;
    @FXML
    private Text txt_26;

    @FXML
    void onBox26Entered(MouseEvent mouseEvent) {
        b_26.setStroke(Paint.valueOf("Green"));
        b_26.setStrokeWidth(3);
        b_26.requestFocus();
    }

    @FXML
    void onBox26Exited(MouseEvent mouseEvent) {
        b_26.setStroke(Paint.valueOf("Black"));
        b_26.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox26KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_26, 26);
    }




    @FXML
    private Rectangle b_27;
    @FXML
    private Text txt_27;

    @FXML
    void onBox27Entered(MouseEvent mouseEvent) {
        b_27.setStroke(Paint.valueOf("Green"));
        b_27.setStrokeWidth(3);
        b_27.requestFocus();
    }

    @FXML
    void onBox27Exited(MouseEvent mouseEvent) {
        b_27.setStroke(Paint.valueOf("Black"));
        b_27.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox27KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_27, 27);
    }



    @FXML
    private Rectangle b_28;
    @FXML
    private Text txt_28;

    @FXML
    void onBox28Entered(MouseEvent mouseEvent) {
        b_28.setStroke(Paint.valueOf("Green"));
        b_28.setStrokeWidth(3);
        b_28.requestFocus();
    }

    @FXML
    void onBox28Exited(MouseEvent mouseEvent) {
        b_28.setStroke(Paint.valueOf("Black"));
        b_28.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox28KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_28, 28);
    }



    @FXML
    private Rectangle b_29;
    @FXML
    private Text txt_29;

    @FXML
    void onBox29Entered(MouseEvent mouseEvent) {
        b_29.setStroke(Paint.valueOf("Green"));
        b_29.setStrokeWidth(3);
        b_29.requestFocus();
    }

    @FXML
    void onBox29Exited(MouseEvent mouseEvent) {
        b_29.setStroke(Paint.valueOf("Black"));
        b_29.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox29KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_29, 29);
    }


    @FXML
    private Rectangle b_30;
    @FXML
    private Text txt_30;

    @FXML
    void onBox30Entered(MouseEvent mouseEvent) {
        b_30.setStroke(Paint.valueOf("Green"));
        b_30.setStrokeWidth(3);
        b_30.requestFocus();
    }

    @FXML
    void onBox30Exited(MouseEvent mouseEvent) {
        b_30.setStroke(Paint.valueOf("Black"));
        b_30.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox30KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_30, 30);
    }


    @FXML
    private Rectangle b_31;
    @FXML
    private Text txt_31;

    @FXML
    void onBox31Entered(MouseEvent mouseEvent) {
        b_31.setStroke(Paint.valueOf("Green"));
        b_31.setStrokeWidth(3);
        b_31.requestFocus();
    }

    @FXML
    void onBox31Exited(MouseEvent mouseEvent) {
        b_31.setStroke(Paint.valueOf("Black"));
        b_31.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox31KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_31, 31);
    }

    @FXML
    private Rectangle b_32;
    @FXML
    private Text txt_32;

    @FXML
    void onBox32Entered(MouseEvent mouseEvent) {
        b_32.setStroke(Paint.valueOf("Green"));
        b_32.setStrokeWidth(3);
        b_32.requestFocus();
    }

    @FXML
    void onBox32Exited(MouseEvent mouseEvent) {
        b_32.setStroke(Paint.valueOf("Black"));
        b_32.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox32KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_32, 32);
    }


    @FXML
    private Rectangle b_33;
    @FXML
    private Text txt_33;

    @FXML
    void onBox33Entered(MouseEvent mouseEvent) {
        b_33.setStroke(Paint.valueOf("Green"));
        b_33.setStrokeWidth(3);
        b_33.requestFocus();
    }

    @FXML
    void onBox33Exited(MouseEvent mouseEvent) {
        b_33.setStroke(Paint.valueOf("Black"));
        b_33.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox33KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_33, 33);
    }

    @FXML
    private Rectangle b_34;
    @FXML
    private Text txt_34;

    @FXML
    void onBox34Entered(MouseEvent mouseEvent) {
        b_34.setStroke(Paint.valueOf("Green"));
        b_34.setStrokeWidth(3);
        b_34.requestFocus();
    }

    @FXML
    void onBox34Exited(MouseEvent mouseEvent) {
        b_34.setStroke(Paint.valueOf("Black"));
        b_34.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox34KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_34, 34);
    }

    @FXML
    private Rectangle b_35;
    @FXML
    private Text txt_35;

    @FXML
    void onBox35Entered(MouseEvent mouseEvent) {
        b_35.setStroke(Paint.valueOf("Green"));
        b_35.setStrokeWidth(3);
        b_35.requestFocus();
    }

    @FXML
    void onBox35Exited(MouseEvent mouseEvent) {
        b_35.setStroke(Paint.valueOf("Black"));
        b_35.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox35KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_35, 35);
    }


    @FXML
    private Rectangle b_36;
    @FXML
    private Text txt_36;

    @FXML
    void onBox36Entered(MouseEvent mouseEvent) {
        b_36.setStroke(Paint.valueOf("Green"));
        b_36.setStrokeWidth(3);
        b_36.requestFocus();
    }

    @FXML
    void onBox36Exited(MouseEvent mouseEvent) {
        b_36.setStroke(Paint.valueOf("Black"));
        b_36.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox36KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_36, 36);
    }


    @FXML
    private Rectangle b_37;
    @FXML
    private Text txt_37;

    @FXML
    void onBox37Entered(MouseEvent mouseEvent) {
        b_37.setStroke(Paint.valueOf("Green"));
        b_37.setStrokeWidth(3);
        b_37.requestFocus();
    }

    @FXML
    void onBox37Exited(MouseEvent mouseEvent) {
        b_37.setStroke(Paint.valueOf("Black"));
        b_37.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox37KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_37, 37);
    }


    @FXML
    private Rectangle b_38;
    @FXML
    private Text txt_38;

    @FXML
    void onBox38Entered(MouseEvent mouseEvent) {
        b_38.setStroke(Paint.valueOf("Green"));
        b_38.setStrokeWidth(3);
        b_38.requestFocus();
    }

    @FXML
    void onBox38Exited(MouseEvent mouseEvent) {
        b_38.setStroke(Paint.valueOf("Black"));
        b_38.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox38KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_38, 38);
    }


    @FXML
    private Rectangle b_39;
    @FXML
    private Text txt_39;

    @FXML
    void onBox39Entered(MouseEvent mouseEvent) {
        b_39.setStroke(Paint.valueOf("Green"));
        b_39.setStrokeWidth(3);
        b_39.requestFocus();
    }

    @FXML
    void onBox39Exited(MouseEvent mouseEvent) {
        b_39.setStroke(Paint.valueOf("Black"));
        b_39.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox39KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_39, 39);
    }


    @FXML
    private Rectangle b_40;
    @FXML
    private Text txt_40;

    @FXML
    void onBox40Entered(MouseEvent mouseEvent) {
        b_40.setStroke(Paint.valueOf("Green"));
        b_40.setStrokeWidth(3);
        b_40.requestFocus();
    }

    @FXML
    void onBox40Exited(MouseEvent mouseEvent) {
        b_40.setStroke(Paint.valueOf("Black"));
        b_40.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox40KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_40, 40);
    }


    @FXML
    private Rectangle b_41;
    @FXML
    private Text txt_41;

    @FXML
    void onBox41Entered(MouseEvent mouseEvent) {
        b_41.setStroke(Paint.valueOf("Green"));
        b_41.setStrokeWidth(3);
        b_41.requestFocus();
    }

    @FXML
    void onBox41Exited(MouseEvent mouseEvent) {
        b_41.setStroke(Paint.valueOf("Black"));
        b_41.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox41KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_41, 41);
    }

    @FXML
    private Rectangle b_42;
    @FXML
    private Text txt_42;

    @FXML
    void onBox42Entered(MouseEvent mouseEvent) {
        b_42.setStroke(Paint.valueOf("Green"));
        b_42.setStrokeWidth(3);
        b_42.requestFocus();
    }

    @FXML
    void onBox42Exited(MouseEvent mouseEvent) {
        b_42.setStroke(Paint.valueOf("Black"));
        b_42.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox42KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_42, 42);
    }


    @FXML
    private Rectangle b_43;
    @FXML
    private Text txt_43;

    @FXML
    void onBox43Entered(MouseEvent mouseEvent) {
        b_43.setStroke(Paint.valueOf("Green"));
        b_43.setStrokeWidth(3);
        b_43.requestFocus();
    }

    @FXML
    void onBox43Exited(MouseEvent mouseEvent) {
        b_43.setStroke(Paint.valueOf("Black"));
        b_43.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox43KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_43, 43);
    }


    @FXML
    private Rectangle b_44;
    @FXML
    private Text txt_44;

    @FXML
    void onBox44Entered(MouseEvent mouseEvent) {
        b_44.setStroke(Paint.valueOf("Green"));
        b_44.setStrokeWidth(3);
        b_44.requestFocus();
    }

    @FXML
    void onBox44Exited(MouseEvent mouseEvent) {
        b_44.setStroke(Paint.valueOf("Black"));
        b_44.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox44KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_44, 44);
    }


    @FXML
    private Rectangle b_45;
    @FXML
    private Text txt_45;

    @FXML
    void onBox45Entered(MouseEvent mouseEvent) {
        b_45.setStroke(Paint.valueOf("Green"));
        b_45.setStrokeWidth(3);
        b_45.requestFocus();
    }

    @FXML
    void onBox45Exited(MouseEvent mouseEvent) {
        b_45.setStroke(Paint.valueOf("Black"));
        b_45.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox45KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_45, 45);
    }


    @FXML
    private Rectangle b_46;
    @FXML
    private Text txt_46;

    @FXML
    void onBox46Entered(MouseEvent mouseEvent) {
        b_46.setStroke(Paint.valueOf("Green"));
        b_46.setStrokeWidth(3);
        b_46.requestFocus();
    }

    @FXML
    void onBox46Exited(MouseEvent mouseEvent) {
        b_46.setStroke(Paint.valueOf("Black"));
        b_46.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox46KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_46, 46);
    }


    @FXML
    private Rectangle b_47;
    @FXML
    private Text txt_47;

    @FXML
    void onBox47Entered(MouseEvent mouseEvent) {
        b_47.setStroke(Paint.valueOf("Green"));
        b_47.setStrokeWidth(3);
        b_47.requestFocus();
    }

    @FXML
    void onBox47Exited(MouseEvent mouseEvent) {
        b_47.setStroke(Paint.valueOf("Black"));
        b_47.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox47KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_47, 47);
    }



    @FXML
    private Rectangle b_48;
    @FXML
    private Text txt_48;

    @FXML
    void onBox48Entered(MouseEvent mouseEvent) {
        b_48.setStroke(Paint.valueOf("Green"));
        b_48.setStrokeWidth(3);
        b_48.requestFocus();
    }

    @FXML
    void onBox48Exited(MouseEvent mouseEvent) {
        b_48.setStroke(Paint.valueOf("Black"));
        b_48.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox48KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_48, 48);
    }



    @FXML
    private Rectangle b_49;
    @FXML
    private Text txt_49;

    @FXML
    void onBox49Entered(MouseEvent mouseEvent) {
        b_49.setStroke(Paint.valueOf("Green"));
        b_49.setStrokeWidth(3);
        b_49.requestFocus();
    }

    @FXML
    void onBox49Exited(MouseEvent mouseEvent) {
        b_49.setStroke(Paint.valueOf("Black"));
        b_49.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox49KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_49, 49);
    }



    @FXML
    private Rectangle b_50;
    @FXML
    private Text txt_50;

    @FXML
    void onBox50Entered(MouseEvent mouseEvent) {
        b_50.setStroke(Paint.valueOf("Green"));
        b_50.setStrokeWidth(3);
        b_50.requestFocus();
    }

    @FXML
    void onBox50Exited(MouseEvent mouseEvent) {
        b_50.setStroke(Paint.valueOf("Black"));
        b_50.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox50KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_50, 50);
    }


    @FXML
    private Rectangle b_51;
    @FXML
    private Text txt_51;

    @FXML
    void onBox51Entered(MouseEvent mouseEvent) {
        b_51.setStroke(Paint.valueOf("Green"));
        b_51.setStrokeWidth(3);
        b_51.requestFocus();
    }

    @FXML
    void onBox51Exited(MouseEvent mouseEvent) {
        b_51.setStroke(Paint.valueOf("Black"));
        b_51.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox51KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_51, 51);
    }



    @FXML
    private Rectangle b_52;
    @FXML
    private Text txt_52;

    @FXML
    void onBox52Entered(MouseEvent mouseEvent) {
        b_52.setStroke(Paint.valueOf("Green"));
        b_52.setStrokeWidth(3);
        b_52.requestFocus();
    }

    @FXML
    void onBox52Exited(MouseEvent mouseEvent) {
        b_52.setStroke(Paint.valueOf("Black"));
        b_52.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox52KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_52, 52);
    }


    @FXML
    private Rectangle b_53;
    @FXML
    private Text txt_53;

    @FXML
    void onBox53Entered(MouseEvent mouseEvent) {
        b_53.setStroke(Paint.valueOf("Green"));
        b_53.setStrokeWidth(3);
        b_53.requestFocus();
    }

    @FXML
    void onBox53Exited(MouseEvent mouseEvent) {
        b_53.setStroke(Paint.valueOf("Black"));
        b_53.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox53KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_53, 53);
    }


    @FXML
    private Rectangle b_54;
    @FXML
    private Text txt_54;

    @FXML
    void onBox54Entered(MouseEvent mouseEvent) {
        b_54.setStroke(Paint.valueOf("Green"));
        b_54.setStrokeWidth(3);
        b_54.requestFocus();
    }

    @FXML
    void onBox54Exited(MouseEvent mouseEvent) {
        b_54.setStroke(Paint.valueOf("Black"));
        b_54.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox54KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_54, 54);
    }


    @FXML
    private Rectangle b_55;
    @FXML
    private Text txt_55;

    @FXML
    void onBox55Entered(MouseEvent mouseEvent) {
        b_55.setStroke(Paint.valueOf("Green"));
        b_55.setStrokeWidth(3);
        b_55.requestFocus();
    }

    @FXML
    void onBox55Exited(MouseEvent mouseEvent) {
        b_55.setStroke(Paint.valueOf("Black"));
        b_55.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox55KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_55, 55);
    }


    @FXML
    private Rectangle b_56;
    @FXML
    private Text txt_56;

    @FXML
    void onBox56Entered(MouseEvent mouseEvent) {
        b_56.setStroke(Paint.valueOf("Green"));
        b_56.setStrokeWidth(3);
        b_56.requestFocus();
    }

    @FXML
    void onBox56Exited(MouseEvent mouseEvent) {
        b_56.setStroke(Paint.valueOf("Black"));
        b_56.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox56KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_56, 56);
    }


    @FXML
    private Rectangle b_57;
    @FXML
    private Text txt_57;

    @FXML
    void onBox57Entered(MouseEvent mouseEvent) {
        b_57.setStroke(Paint.valueOf("Green"));
        b_57.setStrokeWidth(3);
        b_57.requestFocus();
    }

    @FXML
    void onBox57Exited(MouseEvent mouseEvent) {
        b_57.setStroke(Paint.valueOf("Black"));
        b_57.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox57KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_57, 57);
    }


    @FXML
    private Rectangle b_58;
    @FXML
    private Text txt_58;

    @FXML
    void onBox58Entered(MouseEvent mouseEvent) {
        b_58.setStroke(Paint.valueOf("Green"));
        b_58.setStrokeWidth(3);
        b_58.requestFocus();
    }

    @FXML
    void onBox58Exited(MouseEvent mouseEvent) {
        b_58.setStroke(Paint.valueOf("Black"));
        b_58.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox58KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_58, 58);
    }


    @FXML
    private Rectangle b_59;
    @FXML
    private Text txt_59;

    @FXML
    void onBox59Entered(MouseEvent mouseEvent) {
        b_59.setStroke(Paint.valueOf("Green"));
        b_59.setStrokeWidth(3);
        b_59.requestFocus();
    }

    @FXML
    void onBox59Exited(MouseEvent mouseEvent) {
        b_59.setStroke(Paint.valueOf("Black"));
        b_59.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox59KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_59, 59);
    }


    @FXML
    private Rectangle b_60;
    @FXML
    private Text txt_60;

    @FXML
    void onBox60Entered(MouseEvent mouseEvent) {
        b_60.setStroke(Paint.valueOf("Green"));
        b_60.setStrokeWidth(3);
        b_60.requestFocus();
    }

    @FXML
    void onBox60Exited(MouseEvent mouseEvent) {
        b_60.setStroke(Paint.valueOf("Black"));
        b_60.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox60KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_60, 60);
    }



    @FXML
    private Rectangle b_61;
    @FXML
    private Text txt_61;

    @FXML
    void onBox61Entered(MouseEvent mouseEvent) {
        b_61.setStroke(Paint.valueOf("Green"));
        b_61.setStrokeWidth(3);
        b_61.requestFocus();
    }

    @FXML
    void onBox61Exited(MouseEvent mouseEvent) {
        b_61.setStroke(Paint.valueOf("Black"));
        b_61.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox61KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_61, 61);
    }



    @FXML
    private Rectangle b_62;
    @FXML
    private Text txt_62;

    @FXML
    void onBox62Entered(MouseEvent mouseEvent) {
        b_62.setStroke(Paint.valueOf("Green"));
        b_62.setStrokeWidth(3);
        b_62.requestFocus();
    }

    @FXML
    void onBox62Exited(MouseEvent mouseEvent) {
        b_62.setStroke(Paint.valueOf("Black"));
        b_62.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox62KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_62, 62);
    }



    @FXML
    private Rectangle b_63;
    @FXML
    private Text txt_63;

    @FXML
    void onBox63Entered(MouseEvent mouseEvent) {
        b_63.setStroke(Paint.valueOf("Green"));
        b_63.setStrokeWidth(3);
        b_63.requestFocus();
    }

    @FXML
    void onBox63Exited(MouseEvent mouseEvent) {
        b_63.setStroke(Paint.valueOf("Black"));
        b_63.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox63KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_63, 63);
    }



    @FXML
    private Rectangle b_64;
    @FXML
    private Text txt_64;

    @FXML
    void onBox64Entered(MouseEvent mouseEvent) {
        b_64.setStroke(Paint.valueOf("Green"));
        b_64.setStrokeWidth(3);
        b_64.requestFocus();
    }

    @FXML
    void onBox64Exited(MouseEvent mouseEvent) {
        b_64.setStroke(Paint.valueOf("Black"));
        b_64.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox64KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_64, 64);
    }




    @FXML
    private Rectangle b_65;
    @FXML
    private Text txt_65;

    @FXML
    void onBox65Entered(MouseEvent mouseEvent) {
        b_65.setStroke(Paint.valueOf("Green"));
        b_65.setStrokeWidth(3);
        b_65.requestFocus();
    }

    @FXML
    void onBox65Exited(MouseEvent mouseEvent) {
        b_65.setStroke(Paint.valueOf("Black"));
        b_65.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox65KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_65, 65);
    }



    @FXML
    private Rectangle b_66;
    @FXML
    private Text txt_66;

    @FXML
    void onBox66Entered(MouseEvent mouseEvent) {
        b_66.setStroke(Paint.valueOf("Green"));
        b_66.setStrokeWidth(3);
        b_66.requestFocus();
    }

    @FXML
    void onBox66Exited(MouseEvent mouseEvent) {
        b_66.setStroke(Paint.valueOf("Black"));
        b_66.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox66KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_66, 66);
    }


    @FXML
    private Rectangle b_67;
    @FXML
    private Text txt_67;

    @FXML
    void onBox67Entered(MouseEvent mouseEvent) {
        b_67.setStroke(Paint.valueOf("Green"));
        b_67.setStrokeWidth(3);
        b_67.requestFocus();
    }

    @FXML
    void onBox67Exited(MouseEvent mouseEvent) {
        b_67.setStroke(Paint.valueOf("Black"));
        b_67.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox67KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_67, 67);
    }



    @FXML
    private Rectangle b_68;
    @FXML
    private Text txt_68;

    @FXML
    void onBox68Entered(MouseEvent mouseEvent) {
        b_68.setStroke(Paint.valueOf("Green"));
        b_68.setStrokeWidth(3);
        b_68.requestFocus();
    }

    @FXML
    void onBox68Exited(MouseEvent mouseEvent) {
        b_68.setStroke(Paint.valueOf("Black"));
        b_68.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox68KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_68, 68);
    }


    @FXML
    private Rectangle b_69;
    @FXML
    private Text txt_69;

    @FXML
    void onBox69Entered(MouseEvent mouseEvent) {
        b_69.setStroke(Paint.valueOf("Green"));
        b_69.setStrokeWidth(3);
        b_69.requestFocus();
    }

    @FXML
    void onBox69Exited(MouseEvent mouseEvent) {
        b_69.setStroke(Paint.valueOf("Black"));
        b_69.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox69KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_69, 69);
    }



    @FXML
    private Rectangle b_70;
    @FXML
    private Text txt_70;

    @FXML
    void onBox70Entered(MouseEvent mouseEvent) {
        b_70.setStroke(Paint.valueOf("Green"));
        b_70.setStrokeWidth(3);
        b_70.requestFocus();
    }

    @FXML
    void onBox70Exited(MouseEvent mouseEvent) {
        b_70.setStroke(Paint.valueOf("Black"));
        b_70.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox70KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_70, 70);
    }



    @FXML
    private Rectangle b_71;
    @FXML
    private Text txt_71;

    @FXML
    void onBox71Entered(MouseEvent mouseEvent) {
        b_71.setStroke(Paint.valueOf("Green"));
        b_71.setStrokeWidth(3);
        b_71.requestFocus();
    }

    @FXML
    void onBox71Exited(MouseEvent mouseEvent) {
        b_71.setStroke(Paint.valueOf("Black"));
        b_71.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox71KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_71, 71);
    }


    @FXML
    private Rectangle b_72;
    @FXML
    private Text txt_72;

    @FXML
    void onBox72Entered(MouseEvent mouseEvent) {
        b_72.setStroke(Paint.valueOf("Green"));
        b_72.setStrokeWidth(3);
        b_72.requestFocus();
    }

    @FXML
    void onBox72Exited(MouseEvent mouseEvent) {
        b_72.setStroke(Paint.valueOf("Black"));
        b_72.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox72KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_72, 72);
    }



    @FXML
    private Rectangle b_73;
    @FXML
    private Text txt_73;

    @FXML
    void onBox73Entered(MouseEvent mouseEvent) {
        b_73.setStroke(Paint.valueOf("Green"));
        b_73.setStrokeWidth(3);
        b_73.requestFocus();
    }

    @FXML
    void onBox73Exited(MouseEvent mouseEvent) {
        b_73.setStroke(Paint.valueOf("Black"));
        b_73.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox73KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_73, 73);
    }



    @FXML
    private Rectangle b_74;
    @FXML
    private Text txt_74;

    @FXML
    void onBox74Entered(MouseEvent mouseEvent) {
        b_74.setStroke(Paint.valueOf("Green"));
        b_74.setStrokeWidth(3);
        b_74.requestFocus();
    }

    @FXML
    void onBox74Exited(MouseEvent mouseEvent) {
        b_74.setStroke(Paint.valueOf("Black"));
        b_74.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox74KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_74, 74);
    }



    @FXML
    private Rectangle b_75;
    @FXML
    private Text txt_75;

    @FXML
    void onBox75Entered(MouseEvent mouseEvent) {
        b_75.setStroke(Paint.valueOf("Green"));
        b_75.setStrokeWidth(3);
        b_75.requestFocus();
    }

    @FXML
    void onBox75Exited(MouseEvent mouseEvent) {
        b_75.setStroke(Paint.valueOf("Black"));
        b_75.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox75KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_75, 75);
    }



    @FXML
    private Rectangle b_76;
    @FXML
    private Text txt_76;

    @FXML
    void onBox76Entered(MouseEvent mouseEvent) {
        b_76.setStroke(Paint.valueOf("Green"));
        b_76.setStrokeWidth(3);
        b_76.requestFocus();
    }

    @FXML
    void onBox76Exited(MouseEvent mouseEvent) {
        b_76.setStroke(Paint.valueOf("Black"));
        b_76.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox76KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_76, 76);
    }



    @FXML
    private Rectangle b_77;
    @FXML
    private Text txt_77;

    @FXML
    void onBox77Entered(MouseEvent mouseEvent) {
        b_77.setStroke(Paint.valueOf("Green"));
        b_77.setStrokeWidth(3);
        b_77.requestFocus();
    }

    @FXML
    void onBox77Exited(MouseEvent mouseEvent) {
        b_77.setStroke(Paint.valueOf("Black"));
        b_77.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox77KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_77, 77);
    }



    @FXML
    private Rectangle b_78;
    @FXML
    private Text txt_78;

    @FXML
    void onBox78Entered(MouseEvent mouseEvent) {
        b_78.setStroke(Paint.valueOf("Green"));
        b_78.setStrokeWidth(3);
        b_78.requestFocus();
    }

    @FXML
    void onBox78Exited(MouseEvent mouseEvent) {
        b_78.setStroke(Paint.valueOf("Black"));
        b_78.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox78KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_78, 78);
    }



    @FXML
    private Rectangle b_79;
    @FXML
    private Text txt_79;

    @FXML
    void onBox79Entered(MouseEvent mouseEvent) {
        b_79.setStroke(Paint.valueOf("Green"));
        b_79.setStrokeWidth(3);
        b_79.requestFocus();
    }

    @FXML
    void onBox79Exited(MouseEvent mouseEvent) {
        b_79.setStroke(Paint.valueOf("Black"));
        b_79.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox79KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_79, 79);
    }



    @FXML
    private Rectangle b_80;
    @FXML
    private Text txt_80;

    @FXML
    void onBox80Entered(MouseEvent mouseEvent) {
        b_80.setStroke(Paint.valueOf("Green"));
        b_80.setStrokeWidth(3);
        b_80.requestFocus();
    }

    @FXML
    void onBox80Exited(MouseEvent mouseEvent) {
        b_80.setStroke(Paint.valueOf("Black"));
        b_80.setStrokeWidth(1);
        b_solve.requestFocus();
    }

    @FXML
    void onBox80KeyPressed(KeyEvent keyEvent) {
        onKeyPressed(keyEvent, txt_80, 80);
    }

}
