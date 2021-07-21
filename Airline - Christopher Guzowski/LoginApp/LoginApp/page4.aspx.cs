using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;


public partial class page4 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Label1.Text = "Your flight leaves on " + Session["DepDate"] + " at " + Session["DepTime"] + " from " + Session["BoardingLocation"] + ",\nand Arrives in " + Session["toLocation"] + " on " + Session["ArrDate"] + " at " + Session["ArrTime"];
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        ClientScript.RegisterClientScriptBlock(this.GetType(), "alert", "Printing!", true);
    }
}