/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        
        Customer customer = switch (type) {
            case 1 -> CustomerFactory.createCustomer("Regular");
            case 2 -> CustomerFactory.createCustomer("Mountain");
            case 3 -> CustomerFactory.createCustomer("Delinquent");
            default -> null;
        };
        
        System.out.println(customer.createMail());        
    }
}
