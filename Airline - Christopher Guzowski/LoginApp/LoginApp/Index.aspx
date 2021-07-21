<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Index.aspx.cs" Inherits="_Default" %>

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

    &nbsp;<br />

    <asp:Label ID="Label1" runat="server" Text="Please select boarding location: "></asp:Label>
        <asp:DropDownList ID="DropDownList1" runat="server">
            <asp:ListItem>Poland</asp:ListItem>
            <asp:ListItem>New York</asp:ListItem>
            <asp:ListItem>California</asp:ListItem>
            <asp:ListItem>Texas</asp:ListItem>
            <asp:ListItem>Russia</asp:ListItem>
            <asp:ListItem>China</asp:ListItem>
        </asp:DropDownList>
        <br />
        <br />
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        
        <asp:Button ID="btnProceed" runat="server" OnClick="btnProceed_Click" Text="Proceed" />
        
        <br />
    
    </div>
    </form>
</body>
</html>
