/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a;

/**
 *
 * @author ruthv
 */
public class A {
class Article {
  String nom;
  double preu;
  final double IVA = 0.21;
  int quantitat;

  public Article(String nom, double preu, int quantitat) {
    this.nom = nom;
    this.preu = preu;
    this.quantitat = quantitat;
  }

  public double getPreuIVA() {
    return preu * (1 + IVA);
  }
}

public class Main {
  public  void main(String[] args) {
    Article pijama = new Article("Pijama", 10, 5);

    System.out.println(pijama.nom + " - Preu: " + pijama.preu + "€ - IVA: 21% - PVP: " + pijama.getPreuIVA() + "€");

    pijama.preu = 15;

    System.out.println(pijama.nom + " - Preu: " + pijama.preu + "€ - IVA: 21% - PVP: " + pijama.getPreuIVA() + "€");
  }
}}
