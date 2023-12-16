class ResistorColor {

    private final static String Colours[] ={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};

    int colorCode(String color) {
        for(int i=0;i<Colours.length;i++){
            if(color.equalsIgnoreCase(Colours[i])){
                return i;
            }
        }
        return 0;
    }

    String[] colors() {
       return Colours;
    }
}
