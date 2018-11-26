package com.company;

public class XmassTree {

    public final static char treeSymbol = '*';
    public final static char paddingSymbol = ' ';
    private final int height;

    public XmassTree(int height) {
        if (height < 1) {
            this.height = 1;
        } else {
            this.height = height;
        }
    }

    @Override
    public String toString() {
        int maxWidth = (height - 1) * 2 + 1;

        StringBuilder treeRepresentation = new StringBuilder();

        for (int width = 1, identation = height-1; width <= maxWidth; width+=2, identation--) {
            for (int i = 0; i<identation; i++) {
                treeRepresentation.append(paddingSymbol);
            }
            for (int w = 0; w<width; w++) {
                treeRepresentation.append(treeSymbol);
            }
            treeRepresentation.append(System.lineSeparator());
        }
        return treeRepresentation.toString();
    }


}
