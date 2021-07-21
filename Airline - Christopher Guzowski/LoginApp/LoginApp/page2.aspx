<%@ Page Language="C#" AutoEventWireup="true" CodeFile="page2.aspx.cs" Inherits="Greetings" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        Welcome and Thank you for choosing our Airline!<br />
        <br />

    <asp:Label ID="Label2" runat="server" Text="Please Select Your Destination: "></asp:Label>
        <asp:DropDownList ID="DropDownList2" runat="server"> 

        </asp:DropDownList>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     <asp:Label ID="Label1" runat="server" Visible="False"></asp:Label>
        <br />
        <br />
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Button ID="btnLogin" runat="server" OnClick="btnLogin_Click" Text="Proceed" /> 
    
    </div>
    </form>
</body>
</html>
