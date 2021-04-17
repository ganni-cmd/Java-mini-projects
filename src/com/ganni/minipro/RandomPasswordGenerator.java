
  package com.ganni.minipro;
  
  import java.util.Random;
  
  public class RandomPasswordGenerator {
  
  public static void main(String[] args) {
  
  
  int length = 10; System.out.println(passwordGenerator(length)); }
  
  static char[] passwordGenerator(int len) {
  
  System.out.println("Generating password using Random class ");
  System.out.println(" Your password is : ");
  
  String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
  String lower = "abcdefghijklmnopqrstuvwxyz"; 
  String number = "1234567890";
  String symbol ="!@#$%^&*()<>?";
  
  String values = upper + lower + number + symbol;
  
  Random r = new Random(); 
  char[] password = new char[len];
  
  for (int i = 1; i < len; i++) {
  
  password[i] = values.charAt(r.nextInt(values.length())); }
  
  return password;
  
  }
  
  }
 