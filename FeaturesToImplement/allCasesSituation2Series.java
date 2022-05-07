
        TextField[] textFieldList = {batValueSit1Parallel, resistance1Sit1Parallel,resistance2Sit1Parallel, current1Sit1Parallel, current2Sit1Parallel};
        int nbEmpty = 0;
       //if no input
        for (TextField field:textFieldList){
           if (field.getText().isEmpty())
               nbEmpty++;
        }
       
        switch(nbEmpty){
            case 5:
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("All fields are empty");
                alert.showAndWait();
                break;
                
            case 4:
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("4 fields are empty");
                alert.showAndWait();
                break;
                
            case 3:
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setHeaderText("ERROR");
                alert.setContentText("3 fields are empty");
                alert.showAndWait();
                break;    
                
            case 2:     
                
                // if resistance 1 & current 1 empty -> throw alert and break
                if (resistance1Sit1Parallel.getText().isEmpty() && current1Sit1Parallel.getText().isEmpty()){
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setHeaderText("ERROR");
                    alert.setContentText("There are 2 unknowns for Resistor 1, please enter either missing value");
                    alert.showAndWait();
                    break;    
                }
                
                // if resistance 2 & current 2 empty -> throw alert and break
                if (resistance2Sit1Parallel.getText().isEmpty() && current2Sit1Parallel.getText().isEmpty()){
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setHeaderText("ERROR");
                    alert.setContentText("There are 2 unknowns for resistor 2, please enter either missing value");
                    alert.showAndWait();
                    break;    
                }    
                
                // if voltage & resistance 1 empty  
                // 1. calculate voltage from resistance 2 and current 2 (V = IR)
                // 2. calculate resistance 1 from voltage and current 1 (R = V/I)
                if (batValueSit1Parallel.getText().isEmpty() && resistance1Sit1Parallel.getText().isEmpty()){
                    batParallel1.setVoltage(res2Parallel1.getCurrent()*res2Parallel1.getResistance());
                    res1Parallel1.setVoltage(res2Parallel1.getCurrent()*res2Parallel1.getResistance());
                    res2Parallel1.setVoltage(res2Parallel1.getCurrent()*res2Parallel1.getResistance());
                    
                    res1Parallel1.setResistance(res1Parallel1.getVoltage()/res1Parallel1.getCurrent());
                    
                    labelBatSit1Parallel.setText(String.format("%.3f", batParallel1.getVoltage())+" V");
                    labelRes1Sit1Parallel.setText(String.format("%.3f", res1Parallel1.getResistance())+" Ohm");                    
                    break;    
                }
                
                // if voltage & resistance 2 empty
                // 1. calculate voltage from resistance 1 and current 1 (V = IR)
                // 2. calculate resistance 2 from voltage and current 2 (R = V/I)
                if (batValueSit1Parallel.getText().isEmpty() && resistance2Sit1Parallel.getText().isEmpty()){
                    batParallel1.setVoltage(res1Parallel1.getCurrent()*res1Parallel1.getResistance());
                    res1Parallel1.setVoltage(res1Parallel1.getCurrent()*res1Parallel1.getResistance());
                    res2Parallel1.setVoltage(res1Parallel1.getCurrent()*res1Parallel1.getResistance());
                    
                    res2Parallel1.setResistance(res2Parallel1.getVoltage()/res2Parallel1.getCurrent());
                                        
                    labelBatSit1Parallel.setText(String.format("%.3f", batParallel1.getVoltage())+" V");
                    labelRes2Sit1Parallel.setText(String.format("%.3f", res2Parallel1.getResistance())+" Ohm");
                    break;    
                }
                
                // if voltage & current 1 empty
                // 1. calculate voltage from resistance 2 and current 2 (V = IR)
                // 2. calculate current 1 from voltage and resistance 1 (I = V/R)
                if (batValueSit1Parallel.getText().isEmpty() && current1Sit1Parallel.getText().isEmpty()){
                    batParallel1.setVoltage(res2Parallel1.getCurrent()*res2Parallel1.getResistance());
                    res1Parallel1.setVoltage(res2Parallel1.getCurrent()*res2Parallel1.getResistance());
                    res2Parallel1.setVoltage(res2Parallel1.getCurrent()*res2Parallel1.getResistance());
                    
                    res1Parallel1.setCurrent(res1Parallel1.getVoltage()/res1Parallel1.getResistance());
                    
                    labelBatSit1Parallel.setText(String.format("%.3f", batParallel1.getVoltage())+" V");
                    labelCur1Sit1Parallel.setText(String.format("%.3f", res1Parallel1.getCurrent())+" A");
                    break;    
                }
                
                // if voltage & current 2 empty
                // 1. calculate voltage from resistance 1 and current 1 (V = IR)
                // 2. calculate current 2 from voltage and resistance 2 (I = V/R)
                if (batValueSit1Parallel.getText().isEmpty() && current2Sit1Parallel.getText().isEmpty()){
                    batParallel1.setVoltage(res1Parallel1.getCurrent()*res1Parallel1.getResistance());
                    res1Parallel1.setVoltage(res1Parallel1.getCurrent()*res1Parallel1.getResistance());
                    res2Parallel1.setVoltage(res1Parallel1.getCurrent()*res1Parallel1.getResistance());
                    
                    res2Parallel1.setCurrent(res2Parallel1.getVoltage()/res2Parallel1.getResistance());
                    
                    labelBatSit1Parallel.setText(String.format("%.3f", batParallel1.getVoltage())+" V");
                    labelCur2Sit1Parallel.setText(String.format("%.3f", res2Parallel1.getCurrent())+" A");
                    break;    
                }
                
                // if resistance 1 & resistance 2 empty
                // 1. calculate resistance 1 from voltage and current 1 (R = V/I)
                // 2. calculate resistance 2 from voltage and current 2 (R = V/I)
                if (resistance1Sit1Parallel.getText().isEmpty() && resistance2Sit1Parallel.getText().isEmpty()){
                    res1Parallel1.setResistance(res1Parallel1.getVoltage()/res1Parallel1.getCurrent());
                    
                    res2Parallel1.setResistance(res2Parallel1.getVoltage()/res2Parallel1.getCurrent());                    
                    
                    labelRes1Sit1Parallel.setText(String.format("%.3f", res1Parallel1.getResistance())+" Ohm");
                    labelRes2Sit1Parallel.setText(String.format("%.3f", res2Parallel1.getResistance())+" Ohm");
                    break;    
                }
                                 
                // if resistance 1 & current 2 empty                
                // 1. calculate resistance 1 from voltage and current 1 (R = V/I)                
                // 2. calculate current 2 from voltage and resistance 2 (I = V/R)
                if (resistance1Sit1Parallel.getText().isEmpty() && current2Sit1Parallel.getText().isEmpty()){
                    res1Parallel1.setResistance(res1Parallel1.getVoltage()/res1Parallel1.getCurrent());
                    
                    res2Parallel1.setCurrent(res2Parallel1.getVoltage()/res2Parallel1.getResistance());
                    
                    labelRes1Sit1Parallel.setText(String.format("%.3f", res1Parallel1.getResistance())+" Ohm");
                    labelCur2Sit1Parallel.setText(String.format("%.3f", res2Parallel1.getCurrent())+" A");
                    break;    
                }
                
                // if resistance 2 & current 1 empty                
                // 1. calculate resistance 2 from voltage and current 2 (R = V/I)                
                // 2. calculate current 1 from voltage and resistance 1 (I = V/R)
                if (resistance2Sit1Parallel.getText().isEmpty() && current1Sit1Parallel.getText().isEmpty()){
                    res2Parallel1.setResistance(res2Parallel1.getVoltage()/res2Parallel1.getCurrent());
                    
                    res1Parallel1.setCurrent(res1Parallel1.getVoltage()/res1Parallel1.getResistance());
                    
                    labelRes2Sit1Parallel.setText(String.format("%.3f", res2Parallel1.getResistance())+" Ohm");
                    labelCur1Sit1Parallel.setText(String.format("%.3f", res1Parallel1.getCurrent())+" A");
                    break;    
                }
                
                // if current 1 & current 2 empty             
                // 1. calculate current 1 from voltage and resistance 1 (I = V/R)
                // 2. calculate current 2 from voltage and resistance 2 (I = V/R)
                if (current1Sit1Parallel.getText().isEmpty() && current2Sit1Parallel.getText().isEmpty()){
                    res1Parallel1.setCurrent(res1Parallel1.getVoltage()/res1Parallel1.getResistance());
                    
                    res2Parallel1.setCurrent(res2Parallel1.getVoltage()/res2Parallel1.getResistance());
                    
                    labelCur1Sit1Parallel.setText(String.format("%.3f", res1Parallel1.getCurrent())+" A");                    
                    labelCur2Sit1Parallel.setText(String.format("%.3f", res2Parallel1.getCurrent())+" A");
                    break;    
                }
                
            case 1:
                
                // if voltage is missing (V = IR)
                if (batValueSit1Parallel.getText().isEmpty()){
                    batParallel1.setVoltage(res1Parallel1.getCurrent()*res1Parallel1.getResistance());
                    
                    labelBatSit1Parallel.setText(String.format("%.3f", batParallel1.getVoltage())+" V");
                    break;    
                }
                
                // if resistance 1 is missing (R = V/I)
                if (resistance1Sit1Parallel.getText().isEmpty()){
                    res1Parallel1.setResistance(res1Parallel1.getVoltage()/res1Parallel1.getCurrent());
                    
                    labelRes1Sit1Parallel.setText(String.format("%.3f", res1Parallel1.getResistance())+" Ohm");
                    break;    
                }
                
                // if resistance 2 is missing (R = V/I)
                if (resistance2Sit1Parallel.getText().isEmpty()){
                    res2Parallel1.setResistance(res2Parallel1.getVoltage()/res2Parallel1.getCurrent());
                    
                    labelRes2Sit1Parallel.setText(String.format("%.3f", res2Parallel1.getResistance())+" Ohm");
                    break;    
                }
                
                // if current 1 is missing (I = V/R)
                if(current1Sit1Parallel.getText().isEmpty()){
                    res1Parallel1.setCurrent(res1Parallel1.getVoltage()/res1Parallel1.getResistance());
                    
                    labelCur1Sit1Parallel.setText(String.format("%.3f", res1Parallel1.getCurrent())+" I");
                    break;    
                }
                
                // if current 2 is missing (I = V/R)
                if(current2Sit1Parallel.getText().isEmpty()){
                    res2Parallel1.setCurrent(res2Parallel1.getVoltage()/res2Parallel1.getResistance());
                    
                    labelCur2Sit1Parallel.setText(String.format("%.3f", res2Parallel1.getCurrent())+" I");
                    break;    
                }                
        }
