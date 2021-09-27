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
public class User_Management implements UserManagement_Interface {

    ArrayList<Account> arrayListAccount;

    public User_Management() {
        arrayListAccount = new ArrayList<>();
    }

    public User_Management(ArrayList<Account> arrayListAccount) {
        this.arrayListAccount = arrayListAccount;
    }

    @Override
    public void add(Account account) {
        this.arrayListAccount.add(account);

    }

    @Override
    public void update(int position, Account account) {
        this.arrayListAccount.set(position, account);
    }

    @Override
    public void delete(int position) {
        this.arrayListAccount.remove(position);
    }

    @Override
    public void setArrayList(ArrayList<Account> arrayListAcount) {
        this.arrayListAccount = arrayListAcount;
    }

    @Override
    public Account get(int position) {
        return this.arrayListAccount.get(position);
    }

    @Override
    public ArrayList<Account> getArrayList() {
        return this.arrayListAccount;
    }

}
