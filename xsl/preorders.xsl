<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

   <xsl:template match="/preorders">
        <html>
            <head>				
				<title>Предзаказы</title>
                <style type="text/css">
                    td, th{                       
                        border: 1px solid black;
                        text-align: center;
                        padding: 10px;
                    }
                  </style>

			</head>	
            <body>
                <h3> Предзаказы </h3>
                <table>
                    <tr>
                        <th>ID клиента</th>
                        <th>Стиль</th> 
                        <th>Жанр</th>
                        <th>Техника</th>                        
                        <th>Материал</th>
                        <th>Ширина</th> 
                        <th>Высота</th>
                        <th>Тип срока</th>
                        <th>Срок</th>
                        <th>Комментарий</th> 
                        <th>Пример картины</th>
                    </tr>

                    <xsl:for-each select = "preorder">
                        <tr>                           
                            <td><xsl:value-of select = "customer-id/@id"/></td>
                            <td><xsl:value-of select = "style"/></td>
                            <td><xsl:value-of select = "genre"/></td>
                            <td><xsl:value-of select = "technique"/></td>
                            <td><xsl:value-of select = "material"/></td>
                            <xsl:for-each select = "picture-size">
                                <td><xsl:value-of select = "width"/></td>
                                <td><xsl:value-of select = "length"/></td>
                            </xsl:for-each>
                            <xsl:for-each select = "term">
                                <td><xsl:value-of select = "term-type"/></td>
                                <td><xsl:value-of select = "days-count"/></td>
                            </xsl:for-each>
                            <td><xsl:value-of select = "comment"/></td>
                            <td><xsl:value-of select = "picure"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>   