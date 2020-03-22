public class worlddata {
    private String material;
    private int yAxis, xAxis;

    public worlddata()
    {
        this.material = "";
        yAxis = xAxis = 0;
    }

    public worlddata(String material)
    {
        this.material = material;
        yAxis = xAxis = 0;
    }

    public worlddata(String material, int yAxis, int xAxis)
    {
        this.material = material;
        this.yAxis = yAxis;
        this.xAxis = xAxis;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setAxis(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public int getxAxis() {
        return xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }
}
