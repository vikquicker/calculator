package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import sample.elements.Buttons;
import sample.elements.InputField;

import java.io.InputStream;
import java.util.ArrayList;

public class Main extends Application {
    private StringBuilder inputStringBuilderX = new StringBuilder();
    private StringBuilder inputStringBuilderY = new StringBuilder();
    private InputField inputField = new InputField();
    private StackPane root = new StackPane();

    public StringBuilder getInputStringBuilderX() {
        return inputStringBuilderX;
    }

    public void setInputStringBuilderX(StringBuilder inputStringBuilderX) {
        this.inputStringBuilderX = inputStringBuilderX;
    }

    public StringBuilder getInputStringBuilderY() {
        return inputStringBuilderY;
    }

    public void setInputStringBuilderY(StringBuilder inputStringBuilderY) {
        this.inputStringBuilderY = inputStringBuilderY;
    }

    public InputField getInputField() {
        return inputField;
    }

    public void setInputField(StringBuilder stringBuilder) {
        this.inputField = inputField;
    }

    public void setInputField(InputField inputField) {
        this.inputField = inputField;
    }

    public StackPane getRoot() {
        return root;
    }

    public void setRoot(StackPane root) {
        this.root = root;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Buttons buttons = new Buttons();

        buttons.getOne().setMinSize(50, 50);
        buttons.getTwo().setMinSize(50, 50);
        buttons.getThree().setMinSize(50, 50);
        buttons.getFour().setMinSize(50, 50);
        buttons.getFive().setMinSize(50, 50);
        buttons.getSix().setMinSize(50, 50);
        buttons.getSeven().setMinSize(50, 50);
        buttons.getEight().setMinSize(50, 50);
        buttons.getNine().setMinSize(50, 50);
        buttons.getZero().setMinSize(105, 50);
        buttons.getDeleteElement().setMinSize(270, 50);
        buttons.getComma().setMinSize(50, 50);

        StackPane.setAlignment(buttons.getOne(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getTwo(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getThree(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getFour(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getFive(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getSix(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getSeven(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getEight(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getNine(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getZero(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getDeleteElement(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getComma(), Pos.TOP_LEFT);

        StackPane.setMargin(buttons.getOne(), new Insets(60, 0, 0, 5));
        StackPane.setMargin(buttons.getTwo(), new Insets(60, 0, 0, 60));
        StackPane.setMargin(buttons.getThree(), new Insets(60, 0, 0, 115));
        StackPane.setMargin(buttons.getFour(), new Insets(115, 0, 0, 5));
        StackPane.setMargin(buttons.getFive(), new Insets(115, 0, 0, 60));
        StackPane.setMargin(buttons.getSix(), new Insets(115, 0, 0, 115));
        StackPane.setMargin(buttons.getSeven(), new Insets(170, 0, 0, 5));
        StackPane.setMargin(buttons.getEight(), new Insets(170, 0, 0, 60));
        StackPane.setMargin(buttons.getNine(), new Insets(170, 0, 0, 115));
        StackPane.setMargin(buttons.getZero(), new Insets(225, 0, 0, 5));
        StackPane.setMargin(buttons.getDeleteElement(), new Insets(280, 0, 0, 5));
        StackPane.setMargin(buttons.getComma(), new Insets(225, 0, 0, 115));

        buttons.getPlus().setMinSize(50, 50);
        buttons.getMinus().setMinSize(50, 50);
        buttons.getMultiply().setMinSize(50, 50);
        buttons.getDivision().setMinSize(50, 50);
        buttons.getEquals().setMinSize(50, 215);

        StackPane.setAlignment(buttons.getPlus(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getMinus(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getMultiply(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getDivision(), Pos.TOP_LEFT);
        StackPane.setAlignment(buttons.getEquals(), Pos.TOP_LEFT);

        StackPane.setMargin(buttons.getPlus(), new Insets(60, 0, 0, 170));
        StackPane.setMargin(buttons.getMinus(), new Insets(115, 0, 0, 170));
        StackPane.setMargin(buttons.getMultiply(), new Insets(170, 0, 0, 170));
        StackPane.setMargin(buttons.getDivision(), new Insets(225, 0, 0, 170));
        StackPane.setMargin(buttons.getEquals(), new Insets(60, 0, 0, 225));


        inputField.getInputField().setMinSize(50, 50);
        StackPane.setAlignment(inputField.getInputField(), Pos.TOP_CENTER);
        StackPane.setMargin(inputField.getInputField(), new Insets(5, 5, 0, 5));

        buttons.getOne().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (inputStringBuilderX.length() < 30) {
                    inputStringBuilderX.append(1);
                    inputField.setInputField(String.valueOf(inputStringBuilderX));
                }
            }
        });

        buttons.getTwo().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (inputStringBuilderX.length() < 30) {
                    inputStringBuilderX.append(2);
                    inputField.setInputField(String.valueOf(inputStringBuilderX));
                }
            }
        });

        buttons.getThree().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (inputStringBuilderX.length() < 30) {
                    inputStringBuilderX.append(3);
                    inputField.setInputField(String.valueOf(inputStringBuilderX));
                }

            }
        });

        buttons.getFour().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (inputStringBuilderX.length() < 30) {
                    inputStringBuilderX.append(4);
                    inputField.setInputField(String.valueOf(inputStringBuilderX));
                }

            }
        });

        buttons.getFive().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (inputStringBuilderX.length() < 30) {
                    inputStringBuilderX.append(5);
                    inputField.setInputField(String.valueOf(inputStringBuilderX));
                }

            }
        });

        buttons.getSix().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (inputStringBuilderX.length() < 30) {
                    inputStringBuilderX.append(6);
                    inputField.setInputField(String.valueOf(inputStringBuilderX));
                }

            }
        });

        buttons.getSeven().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (inputStringBuilderX.length() < 30) {
                    inputStringBuilderX.append(7);
                    inputField.setInputField(String.valueOf(inputStringBuilderX));
                }

            }
        });

        buttons.getEight().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (inputStringBuilderX.length() < 30) {
                    inputStringBuilderX.append(8);
                    inputField.setInputField(String.valueOf(inputStringBuilderX));
                }

            }
        });

        buttons.getNine().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (inputStringBuilderX.length() < 30) {
                    inputStringBuilderX.append(9);
                    inputField.setInputField(String.valueOf(inputStringBuilderX));
                }

            }
        });

        buttons.getZero().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (inputStringBuilderX.length() == 0) {
                    inputStringBuilderX.append(0);
                    inputField.setInputField(String.valueOf(inputStringBuilderX));
                }
                if (!inputStringBuilderX.toString().contains("+") &
                        !inputStringBuilderX.toString().contains("-") &
                        !inputStringBuilderX.toString().contains("*") &
                        !inputStringBuilderX.toString().contains("/")) {

                    if (!inputStringBuilderX.toString().matches("[0]+")) {
                        if (inputStringBuilderX.length() < 30) {
                            inputStringBuilderX.append(0);
                            inputField.setInputField(String.valueOf(inputStringBuilderX));
                        }

                    }
                } else {
                    if (inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals("+") |
                            inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals("-") |
                            inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals("*") |
                            inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals("/")) {
                        if (inputStringBuilderX.length() < 30) {
                            inputStringBuilderX.append(0);
                            inputField.setInputField(String.valueOf(inputStringBuilderX));
                        }

                    } else if (!inputStringBuilderX.substring(inputStringBuilderX.length() - 2).equals("+0") &
                            !inputStringBuilderX.substring(inputStringBuilderX.length() - 2).equals("-0") &
                            !inputStringBuilderX.substring(inputStringBuilderX.length() - 2).equals("*0") &
                            !inputStringBuilderX.substring(inputStringBuilderX.length() - 2).equals("/0")) {
                        if (inputStringBuilderX.length() < 30) {
                            inputStringBuilderX.append(0);
                            inputField.setInputField(String.valueOf(inputStringBuilderX));
                        }

                    }
                }
            }
        });

        buttons.getEquals().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String firstPart = "";
                String secondPart = "";
                String operation = "";

                int intResult = 0;
                double doubleResult = 0.0;

                String stringResult = "";

                boolean flag1 = true;
                boolean flag2 = false;

                if (inputStringBuilderX.toString().equals("24021986")) {
                    inputField.setInputField("Создатель проги - Пожаров Витька!");
                }else {
                    ArrayList<String> arrayList = new ArrayList<>();
                    char[] massive = inputStringBuilderX.toString().toCharArray();

                    for (int i = 0; i < massive.length; i++) {
                        arrayList.add(String.valueOf(massive[i]));
                    }

                    for (int i = 0; i < inputStringBuilderX.length() - 1; i++) {
                        if (arrayList.get(i).equals("+") |
                                arrayList.get(i).equals("-") |
                                arrayList.get(i).equals("*") |
                                arrayList.get(i).equals("/")) {
                            flag1 = false;
                            flag2 = true;
                            operation = arrayList.get(i);
                        }
                        if (flag1) {
                            firstPart += arrayList.get(i);
                        }
                        if (flag2) {
                            secondPart += arrayList.get(i + 1);
                        }
                    }

                    if (operation.equals("+")) {
                        doubleResult = Double.parseDouble(firstPart) + Double.parseDouble(secondPart);
                    } else if (operation.equals("-")) {
                        doubleResult = Double.parseDouble(firstPart) - Double.parseDouble(secondPart);
                    } else if (operation.equals("*")) {
                        doubleResult = Double.parseDouble(firstPart) * Double.parseDouble(secondPart);
                    } else if (operation.equals("/")) {
                        doubleResult = Double.parseDouble(firstPart) / Double.parseDouble(secondPart);
                    }
                    stringResult = String.valueOf(doubleResult);

                    if (stringResult.substring(stringResult.length() - 2).equals(".0")) {
                        intResult = (int) doubleResult;

                        inputStringBuilderX.setLength(0);
                        inputStringBuilderX.append(intResult);
                        inputField.setInputField(String.valueOf(inputStringBuilderX));
                    } else {
                        inputStringBuilderX.setLength(0);
                        inputStringBuilderX.append(doubleResult);
                        inputField.setInputField(String.valueOf(inputStringBuilderX));
                    }

                }

            }
        });

        buttons.getComma().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int countComma = 0;
                int countPlus = 0;
                int countMinus = 0;
                int countMultiply = 0;
                int countDivision = 0;

                ArrayList<Character> arrayList = new ArrayList<>();
                char[] massive = inputStringBuilderX.toString().toCharArray();
                for (int i = 0; i < massive.length; i++) {
                    arrayList.add(massive[i]);
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).equals('.')) {
                        countComma++;
                    } else if (arrayList.get(i).equals('+')) {
                        countPlus++;
                    } else if (arrayList.get(i).equals('-')) {
                        countMinus++;
                    } else if (arrayList.get(i).equals('*')) {
                        countMultiply++;
                    } else if (arrayList.get(i).equals('/')) {
                        countDivision++;
                    }
                }
                if (!(inputStringBuilderX.length() == 0) &
                        !inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals(".") &
                        !(countComma > 0) & countPlus == 0 & countMinus == 0 & countMultiply == 0 & countDivision == 0) {
                    if (inputStringBuilderX.length() < 30) {
                        inputStringBuilderX.append(".");
                        inputField.setInputField(String.valueOf(inputStringBuilderX));
                    }

                } else if (!inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals(".") &
                        !inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals("+") &
                        !inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals("-") &
                        !inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals("*") &
                        !inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals("/") &
                        !(countComma > 1) & (countPlus == 1 | countMinus == 1 | countMultiply == 1 | countDivision == 1)
                ) {
                    if (inputStringBuilderX.length() < 30) {
                        inputStringBuilderX.append(".");
                        inputField.setInputField(String.valueOf(inputStringBuilderX));
                    }

                }

            }
        });

        buttons.getDeleteElement().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputStringBuilderX.deleteCharAt(inputStringBuilderX.length() - 1);
                inputField.setInputField(String.valueOf(inputStringBuilderX));
            }
        });


        buttons.getPlus().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!(inputStringBuilderX.length() == 0) &&
                        !inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals(".") &&
                        !inputStringBuilderX.toString().contains("+") &&
                        !inputStringBuilderX.toString().contains("-") &&
                        !inputStringBuilderX.toString().contains("*") &&
                        !inputStringBuilderX.toString().contains("/")) {
                    if (inputStringBuilderX.length() < 30) {
                        inputStringBuilderX.append("+");
                        inputField.setInputField(String.valueOf(inputStringBuilderX));
                    }

                }
            }
        });

        buttons.getMinus().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!(inputStringBuilderX.length() == 0) &&
                        !inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals(".") &&
                        !inputStringBuilderX.toString().contains("+") &&
                        !inputStringBuilderX.toString().contains("-") &&
                        !inputStringBuilderX.toString().contains("*") &&
                        !inputStringBuilderX.toString().contains("/")) {
                    if (inputStringBuilderX.length() < 30) {
                        inputStringBuilderX.append("-");
                        inputField.setInputField(String.valueOf(inputStringBuilderX));
                    }

                }
            }
        });

        buttons.getMultiply().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!(inputStringBuilderX.length() == 0) &&
                        !inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals(".") &&
                        !inputStringBuilderX.toString().contains("+") &&
                        !inputStringBuilderX.toString().contains("-") &&
                        !inputStringBuilderX.toString().contains("*") &&
                        !inputStringBuilderX.toString().contains("/")) {
                    if (inputStringBuilderX.length() < 30) {
                        inputStringBuilderX.append("*");
                        inputField.setInputField(String.valueOf(inputStringBuilderX));
                    }

                }
            }
        });

        buttons.getDivision().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!(inputStringBuilderX.length() == 0) &&
                        !inputStringBuilderX.substring(inputStringBuilderX.length() - 1).equals(".") &&
                        !inputStringBuilderX.toString().contains("+") &&
                        !inputStringBuilderX.toString().contains("-") &&
                        !inputStringBuilderX.toString().contains("*") &&
                        !inputStringBuilderX.toString().contains("/")) {
                    if (inputStringBuilderX.length() < 30) {
                        inputStringBuilderX.append("/");
                        inputField.setInputField(String.valueOf(inputStringBuilderX));
                    }

                }
            }
        });

        root = new StackPane(buttons.getOne(), buttons.getTwo(), buttons.getThree(),
                buttons.getFour(), buttons.getFive(), buttons.getSix(), buttons.getSeven(), buttons.getEight(),
                buttons.getNine(), buttons.getZero(), buttons.getPlus(), buttons.getMinus(), buttons.getMultiply(),
                buttons.getDivision(), buttons.getEquals(), buttons.getDeleteElement(), buttons.getComma(),
                inputField.getInputField());

        InputStream inputStreamIco = getClass().getResourceAsStream("ico.png");
        stage.getIcons().add(new Image(inputStreamIco));

        Scene scene = new Scene(root, 280, 335);
        stage.setScene(scene);

        stage.setTitle("Калькулятер");

        stage.show();
        stage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
