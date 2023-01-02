package com.dsa.common;

import com.dsa.exception.InputArrNumberFormatException;
import com.dsa.exception.NotReadableFromCmdLineException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Logger;

public class InputArrayFromCmdLine {
    static Logger log = Logger.getLogger(InputArrayFromCmdLine.class.getName());
    public static int[] getInputFromCmdLine(){
        try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))){
            log.info("Please enter an array to sort...");
            String arr = r.readLine();
           return Arrays.stream(arr.split(",")).mapToInt(Integer::parseInt).toArray();
        }catch (NumberFormatException e){
            throw new InputArrNumberFormatException("Please enter numbers with comma like .'1,10,12,34,9'",e);
        }
        catch (IOException e) {
            throw new NotReadableFromCmdLineException("Not able to read the value from command line",e);
        }
    }
    private InputArrayFromCmdLine(){}
}
