<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

   <xsl:template match="/artists">
        <html>
            <head>				
				<title>Художники</title>
                <style type="text/css">                      
                    td, th{                       
                        border: 1px solid black;
                        text-align: center;
                        padding: 10px;
                    }
                  </style>

			</head>	
            <body>
                <h3> Художники </h3>
                <table>
                    <tr>
                        <th>ФИО</th>
                        <th>Телефона</th> 
                        <th>E-mail</th>
                        <th>Опыт работы</th>
                        <th>Достижения</th> 
                        <th>Статус</th>
                        <th>Стили</th>
                        <th>Жанры</th>
                        <th>Техники</th> 
                        <th>Материалы</th>
                    </tr>

                    <xsl:for-each select = "artist">
                        <tr>                           
                            <td><xsl:value-of select = "fullname"/></td>
                            <td><xsl:value-of select = "phone-number"/></td>
                            <td><xsl:value-of select = "e-mail"/></td>
                            <td><xsl:value-of select = "work-experience"/></td>
                            <td><xsl:value-of select = "achievements"/></td>
                            <td><xsl:value-of select = "status"/></td>
                            <xsl:for-each select="portfolio"> 
                                <td><xsl:value-of select="styles"/></td>
                                <td><xsl:value-of select="genres"/></td>
                                <td><xsl:value-of select="technicians"/></td>
                                <td><xsl:value-of select="material"/></td>
                            </xsl:for-each>                          
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>   