public class JackOLantern
{
    private String[][] faceFeatures;

    public JackOLantern(String[][] faceFeatures)

    {
        this.faceFeatures = faceFeatures;
    }
    public void edit(String replace, int row, int column)
    {
        faceFeatures[row][column] = replace;
    }
    public void fill(String str)
    {
        for (int i = 0; i<faceFeatures.length;i++)
        {
            for (int x = 0; x<faceFeatures[i].length;x++)
            {
                faceFeatures[i][x] = str;
            }
        }
    }
    public String toString()
    {
        String output = "";
        for(int i =0; i<faceFeatures.length;i++)
        {
            for(int x = 0;x<faceFeatures[i].length ; x++)
            {
                output = output + faceFeatures[i][x];
            }
            output = output + "\n";
        }
        return output;
    }
}
