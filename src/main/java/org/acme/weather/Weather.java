package org.acme.weather;

/**
 * Weather
 */
public class Weather {

  private Conditions main;
  private String name;

  /**
   * @return the main
   */
  public Conditions getMain() {
    return main;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @param main the main to set
   */
  public void setMain(Conditions main) {
    this.main = main;
  }

  public static class Conditions {

    private double temp;

    /**
     * @return the temp
     */
    public double getTemp() {
      return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(double temp) {
      this.temp = temp;
    }

  }

}
