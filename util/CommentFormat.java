package util;

public class CommentFormat {

    public static void main(String[] args) {

        generateTitleComment(" Nizam ",110);
        generateTitleComment(" Shakil ",110);

        generateSubtitleComment("nizam",54);
        generateSubtitleComment("Companion Object",54);


    }

    static void generateTitleComment(String comment, int symbolLength) {

        System.out.println("comment : " + comment);
        System.out.println("symbolLength : " + symbolLength);

        String start = "/**";
        String symbol = "=";
        String end = "**/";

        int commentLength = comment.length();
        System.out.println("commentLength : " + commentLength);


        int requiredSymbolTextLength = (symbolLength - commentLength) / 2;
        System.out.println("requiredSymbolTextLength : " + requiredSymbolTextLength);

        String generatedSymbolText = "";

        for (int i = 0; i < requiredSymbolTextLength; i++) {
            generatedSymbolText += symbol;
        }
        System.out.println("generated SymbolText length : " + generatedSymbolText.length());

        String generatedComment = start + generatedSymbolText + comment + generatedSymbolText + end;

        System.out.println("generated Comment length : " + generatedComment.length());

        System.out.println(generatedComment);

    }

    static void generateSubtitleComment(String comment, int symbolLength) {

        System.out.println("comment : " + comment);
        System.out.println("symbolLength : " + symbolLength);

        String start = "/**";
        String symbol = "-";
        String end = "*/";

        int commentLength = comment.length();
        System.out.println("commentLength : " + commentLength);


        int requiredSymbolTextLength = (symbolLength - commentLength) / 2;
        System.out.println("requiredSymbolTextLength : " + requiredSymbolTextLength);

        String generatedSymbolText = "";

        for (int i = 0; i < requiredSymbolTextLength; i++) {
            generatedSymbolText += symbol;
        }
        System.out.println("generated SymbolText length : " + generatedSymbolText.length());

        String generatedComment = start + generatedSymbolText + comment + generatedSymbolText + end;

        System.out.println("generated Comment length : " + generatedComment.length());

        System.out.println(generatedComment);

    }


}
