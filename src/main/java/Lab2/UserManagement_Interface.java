/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.ArrayList;

/**
 *
 * @author vuvantu
 */
public interface UserManagement_Interface {

    public void add(Account account);

    public void update(int position, Account account);

    public void delete(int position);

    public void setArrayList(ArrayList<Account> arrayListAcount);

    public Account get(int position);

    public ArrayList<Account> getArrayList();
}
