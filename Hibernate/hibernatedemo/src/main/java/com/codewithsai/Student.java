package com.codewithsai;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
@Id
  private int Sroll;
  private String Sname;
  private String Saddress;
 private int Sphone;
  public int getSroll() {
    return Sroll;
  }
  public void setSroll(int sroll) {
    Sroll = sroll;
  }
  public String getSname() {
    return Sname;
  }
  public void setSname(String sname) {
    Sname = sname;
  }
  public String getSaddress() {
    return Saddress;
  }
  public void setSaddress(String saddress) {
    this.Saddress = saddress;
  }
  public int getSphone() {
    return Sphone;
  }
  public void setSphone(int sphone) {
    Sphone = sphone;
  }
  @Override
  public String toString() {
    return "Student [Sroll=" + Sroll + ", Sname=" + Sname + ", Sphone=" + Sphone + ", address=" + Saddress + "]";
  }


}
