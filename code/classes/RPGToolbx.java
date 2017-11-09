public class RPGToolbox
{
  private String name;
  private String description;
  private String picture;

  public TTRPGToolbox()
  {
    name = "";
    description = "";
    picture = "";
  }

  public TTRPGToolbox(String newName, String newDescription, String newPicture)
  {
    name = newName;
    description = newDescription;
    picture = newPicture;
  }

  public void setName(String newName)
  {
    if (newName != null && !newName.trim().equals("") )
    {
      name = newName;
    }
    else
    {
      System.out.println("There is no name.");
    }
  }

  public String getName()
  {
    return name;
  }

  public void setDescription(String newDescription)
  {
    if (newDescription != null)
    {
      description = newDescription;
    }
    else
    {
      System.out.println("There is no description.");
    }
  }

  public String getDescription()
  {
    return description;
  }

  public void setPicture(String newPicture)
  {
    if (newPicture != null && !newPicture.trim().equals("") )
    {
      picture = newPicture;
    }
    else
    {
      System.out.println("There is no picture.");
    }
  }

  public String getPicture()
  {
    return picture;
  }

  public void writeTo(String fileName)
  {
    //stuff
  }
}

