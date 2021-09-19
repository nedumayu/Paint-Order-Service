<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

   <xsl:template match="/customers">
        <html>
            <head>				
				<title>Клиенты</title>
                <style type="text/css">
                    td, th{                       
                        border: 1px solid black;
                        text-align: center;
                        padding: 10px;
                    }
                  </style>

			</head>	
            <body>
                <h3> Клиенты </h3>
                <table>
                    <tr>
                        <th>ФИО</th>
                        <th>Телефона</th> 
                        <th>E-mail</th>
                        <th>Статус</th>
                    </tr>

                    <xsl:for-each select = "customer">
                        <tr>                           
                            <td><xsl:value-of select = "fullname"/></td>
                            <td><xsl:value-of select = "phone-number"/></td>
                            <td><xsl:value-of select = "e-mail"/></td>
                            <td><xsl:value-of select = "status"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>   