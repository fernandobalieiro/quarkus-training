package com.training.quarkus;

import com.training.quarkus.model.CallLog;
import com.training.quarkus.model.Caller;
import com.training.quarkus.service.CallLogService;
import com.training.quarkus.service.CallerService;

import java.util.Scanner;

public class QuarkusTraining {
    //FIXME
    private static final CallerService callerService = //???
    private static final CallLogService callLogService = //???

    public static void main(String[] args) {

        // A valid phone number to try out: +35199999991

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter phone Number: ");
            String phone = in.nextLine();

            if (phone == null || phone.isEmpty()) {
                System.out.println("Phone number cannot be blank.\n");
                continue;
            }

            // TODO Invoke public methods from CallerService and CallLogService here.
            Caller caller = //???
            CallLog callLog = //???

            // TODO Print the result calling callLogService.printCallInformation() method;
        }
    }
}
