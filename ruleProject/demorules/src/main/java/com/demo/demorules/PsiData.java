package com.demo.demorules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PsiData implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

//   @org.kie.api.definition.type.Label(value = "reading")
   private int reading;
//   @org.kie.api.definition.type.Label(value = "status")
   private java.lang.String status;

   public PsiData()
   {
   }

   public int getReading()
   {
      return this.reading;
   }

   public void setReading(int reading)
   {
      this.reading = reading;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public PsiData(int reading, java.lang.String status)
   {
      this.reading = reading;
      this.status = status;
   }

}
