package com.example.CurrencyConverter;
import com.sun.source.util.SourcePositions;

import java.util.*;
import java.text.DecimalFormat;
public class Currency_Converter {
    public static void main(String[] args) {
        double rupee,dollar,pound,code,euro,KWD;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner in = new Scanner(System.in);
        System.out.println("Currency Converter\nEnter the currency code \n1:Rupees\n2:Dollar\n3:Pound\n4:Euro\n5:Kuwati dinar");
        code= in.nextInt();
        if(code == 1) {
            System.out.println("Enter amount in rupees:");
            rupee = in.nextDouble();
            dollar = rupee / 83.1898;
            System.out.println("Dollar : " + f.format(dollar));
            pound = rupee / 105.86;
            System.out.println("Pound : " + f.format(pound));
            euro = rupee / 91.16;
            System.out.println("Euro : " + f.format(euro));
            KWD = rupee / 271.94;
            System.out.println("Kuwati dinar : " + f.format(KWD));
        } else if (code == 2) {
            System.out.println("Enter amount in dollar:");
            dollar = in.nextDouble();
            rupee = dollar * 83.1898;
            System.out.println("Rupees :" +f.format(rupee));
            pound = dollar * 0.79;
            System.out.println("Pound : "+f.format(pound));
            euro = dollar * 0.91;
            System.out.println("Euro : "+f.format(euro));
            KWD = dollar * 0.31;
            System.out.println("Kuwaiti dinar : "+f.format(KWD));
        } else if (code == 3) {
            System.out.println("Enter the amount in Pound");
            System.out.println("Enter amount in dollar:");
            pound = in.nextDouble();
            rupee = pound * 105.86;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = pound * 1.27;
            System.out.println("Dollar : "+f.format(dollar));
            euro = pound * 1.16;
            System.out.println("Euro : "+f.format(euro));
            KWD = pound * 0.39;
            System.out.println("Kuwaiti dinar : "+f.format(KWD));
        } else if (code == 4) {
            System.out.println("Enter amount in Euro:");
            euro = in.nextDouble();
            rupee = euro * 91.16;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = euro * 1.10;
            System.out.println("dollar : "+f.format(dollar));
            pound = euro * 0.86;
            System.out.println("pound : "+f.format(pound));
            KWD = euro * 0.34;
            System.out.println("Kuwaiti dinar : "+f.format(KWD));
        } else if (code == 5) {
            System.out.println("Enter amount in Kuwaiti dinar:");
            KWD = in.nextDouble();
            rupee = KWD * 271.94;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = KWD * 3.27;
            System.out.println("Dollar : "+f.format(dollar));
            pound = KWD * 2.57;
            System.out.println("Pound : "+f.format(pound));
            euro = KWD * 2.98;
            System.out.println("Euro : "+f.format(euro));
        }
        else
            System.out.println("Invalid Code!");
    }
}