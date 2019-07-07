/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankDAO;

import bankHelper.BankHelper;
import java.util.HashMap;

/**
 *
 * @author Acer
 * 
 */
public class BankDAO {
   HashMap<Integer,BankHelper> hm=new HashMap<Integer,BankHelper>();
   public void addToMap(int i,BankHelper bh)
   {
       hm.put(i, bh);
       System.out.println(hm);
   }
   
   public HashMap getHMValues()
   {
       return hm;
   }

//public HashMap getHMAPValues()
//   {
//      
//   }

}

