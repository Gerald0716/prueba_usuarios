/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import client.userCliente;
import dto.userDto;
import java.util.List;

/**
 *
 * @author geral
 */
public class UsersImple {
    
    public static void main(String[] args) {
        userCliente userClient = new userCliente();
          List<userDto> list = userClient.listUser();
          
          for (userDto c: list) {
              
              System.out.println("Nombre:"+ c.getName());
          } 
                
                
         }
}
