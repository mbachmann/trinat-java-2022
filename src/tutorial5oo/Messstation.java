package tutorial5oo;

/**
*
* @author Cornelia Oberholzer, WI2a
*
*/

public class Messstation
{
    private String id;
    private String name;
    private String emissionsQuellTyp;
    private String umgebungsTyp;
    private int jahresMittelWert;
    private int maxTagesWert;
    private int anzTageUeber50;
    private int anzTageUeber60;
    
    public Messstation()
    {
        this.id = "";
        this.name = "";
        this.emissionsQuellTyp = "";
        this.umgebungsTyp = "";
        this.jahresMittelWert = 0;
        this.maxTagesWert = 0;
        this.anzTageUeber50 = 0;
        this.anzTageUeber60 = 0;        
    }
    
    public Messstation(String id, String name, String emissionsQuellTyp, String umgebungsTyp,
                            int jahresMittelWert, int maxTagesWert, int anzTageUeber50, int anzTageUeber60)
    {
        this.id = id;
        this.name = name;
        this.emissionsQuellTyp = emissionsQuellTyp;
        this.umgebungsTyp = umgebungsTyp;
        this.jahresMittelWert = jahresMittelWert;
        this.maxTagesWert = maxTagesWert;
        this.anzTageUeber50 = anzTageUeber50;
        this.anzTageUeber60 = anzTageUeber60;        
    }
    
    public int getAnzTageUeber50()
    {
        return anzTageUeber50;
    }
    public void setAnzTageUeber50(int anzTageUeber50)
    {
        this.anzTageUeber50 = anzTageUeber50;
    }
    public int getAnzTageUeber60()
    {
        return anzTageUeber60;
    }
    public void setAnzTageUeber60(int anzTageUeber60)
    {
        this.anzTageUeber60 = anzTageUeber60;
    }
    public String getEmissionsquellTyp()
    {
        return emissionsQuellTyp;
    }
    public void setEmissionsquellTyp(String emissionsquellTyp)
    {
        this.emissionsQuellTyp = emissionsquellTyp;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public int getJahresMittelWert()
    {
        return jahresMittelWert;
    }
    public void setJahresMittelWert(int jahresMittelWert)
    {
        this.jahresMittelWert = jahresMittelWert;
    }
    public int getMaxTagesWert()
    {
        return maxTagesWert;
    }
    public void setMaxTagesWert(int maxTagesWert)
    {
        this.maxTagesWert = maxTagesWert;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getUmgebungsTyp()
    {
        return umgebungsTyp;
    }
    public void setUmgebungsTyp(String umgebungsTyp)
    {
        this.umgebungsTyp = umgebungsTyp;
    }
    
    
}