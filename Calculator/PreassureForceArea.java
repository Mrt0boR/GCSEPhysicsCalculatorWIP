package Calculator;

public class PreassureForceArea {
    public PreassureModule() {
        GUISetup();
    }

    public String calculate(String forcestring, String areastring) {
        double forcestring = Double.parseDouble(forcestring);
        double areastring = Double.parseDouble(areastring);
        double pressure = forcestring/areastring;
        return Double.toString(pressure);
    }













}

//git pull git add .  git commit git push