import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import java.text.DecimalFormat;

public class converterTest {

    double initialAmount;
    DecimalFormat decimalFormat;
    double amountInDollars;
    double amountInEuros;
    double amountInBritishPound;
    double amountInIndianRupee;
    double amountInCanadianDollar;
    double amountInSingaporeDollar;
    double amountInSwissFranc;
    double amountInMalaysianRinggit;
    double amountInJapaneseYen;
    double amountInChineseYuan;

    @Before
    public void setUp() {
        initialAmount = 0;
        decimalFormat = new DecimalFormat("#.00");
        amountInDollars = 5.00;
        amountInEuros = 40.65;
        amountInBritishPound = 35.46;
        amountInIndianRupee = 56.34;
        amountInCanadianDollar = 135.98;
        amountInSingaporeDollar = 43.90;
        amountInSwissFranc = 329.56;
        amountInMalaysianRinggit = 212.30;
        amountInJapaneseYen = 25.73;
        amountInChineseYuan = 1005.34;
    }

    @Test
    public void dollarToEuroTest() {
        amountInEuros = amountInDollars * .94;
        String finalAmount = decimalFormat.format(amountInEuros);
        String expect = "4.70";
        String actual = finalAmount;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void euroToDollarTest() {
        amountInDollars = amountInEuros / .94;
        String finalAmount = decimalFormat.format(amountInDollars);
        String expect = "43.24";
        String actual= finalAmount;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void euroToPound(){
        amountInDollars = amountInEuros / .94;
        amountInBritishPound = amountInDollars / .82;
        String finalAmount = decimalFormat.format(amountInBritishPound);
        String expect = "52.74";
        String actual = finalAmount;
        Assert.assertEquals(expect, actual);

    }

    @Test
    public void poundToRupee(){
        amountInDollars = amountInBritishPound / .82;
        amountInIndianRupee = amountInDollars * 68.32;
        String finalAmount = decimalFormat.format(amountInIndianRupee);
        String expect = "2954.42";
        String actual = finalAmount;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void rupeeToCanadianDollar(){
        amountInDollars = amountInIndianRupee / 68.32;
        amountInCanadianDollar = amountInDollars / 1.32;
        String finalAmount = decimalFormat.format(amountInCanadianDollar);
        String expect= ".62";
        String actual = finalAmount;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void canadianDollarToSingaporeDollar(){
        amountInDollars = amountInCanadianDollar * 1.35;
        amountInSingaporeDollar = amountInDollars / 1.43;
        String finalAmount = decimalFormat.format(amountInSingaporeDollar);
        String expect = "128.37";
        String actual = finalAmount;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void singaporeDollarToSwissFranc(){
        amountInDollars = amountInSingaporeDollar * 1.43;
        amountInSwissFranc = amountInDollars / 1.01;
        String finalAmount = decimalFormat.format(amountInSwissFranc);
        String expect= "62.16";
        String actual = finalAmount;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void swissFrancToRinggit(){
        amountInDollars = amountInSwissFranc / 1.01;
        amountInMalaysianRinggit = amountInDollars * 4.47;
        String finalAmount = decimalFormat.format(amountInMalaysianRinggit);
        String expect ="1458.55";
        String actual = finalAmount;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void ringgitToYen(){
        amountInDollars = amountInMalaysianRinggit / 4.47;
        amountInJapaneseYen = amountInDollars * 115.84;
        String finalAmount = decimalFormat.format(amountInJapaneseYen);
        String expect= "5501.75";
        String actual= finalAmount;
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void YenToYuan(){
        amountInDollars = amountInJapaneseYen / 115.84;
        amountInChineseYuan = amountInDollars * 6.92;
        String finalAmount = decimalFormat.format(amountInChineseYuan);
        String expect="1.54";
        String actual= finalAmount;
        Assert.assertEquals(expect, actual);
    }
}
