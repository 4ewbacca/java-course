package Encapsulation;

import java.awt.color.ICC_ColorSpace;

public class Printer {
    private int tonerLevel;
    private boolean duplex;
    private int pagesPrinted;


    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        if (tonerLevel<0 | tonerLevel > 100){
            tonerLevel = -1;
        }
        pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        if (tonerAmount<0 | tonerAmount > 100){
            tonerAmount = -1;
        }
        tonerAmount = tonerAmount+tonerLevel;
        return tonerAmount;

    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (int) Math.ceil(pages / 2);
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
        }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

}


