<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

   <xsl:template match="/orders">
        <html>
            <head>				
				<title>Заказы</title>
                <style type="text/css">
                    td, th{                       
                        border: 1px solid black;
                        text-align: center;
                        padding: 10px;
                    }
                  </style>

			</head>	
            <body>
                <h3> Заказы </h3>
                <table>
                    <tr>
                        <th>Номер заказа</th>
                        <th>Количество копий</th> 
                        <th>Статус</th>
                        <th>Предоплата</th>                        
                        <th>Дата внесения предоплаты</th>
                        <th>Вся сумма</th> 
                        <th>Дата внесения всей суммы</th>
                        <th>Дата начала работы</th>
                        <th>Дата окончания работы</th>
                        <th>ID клиента</th> 
                        <th>ID художника</th>
                        <th>ID предзаказа</th>
                    </tr>

                    <xsl:for-each select = "order">
                        <tr>                           
                            <td><xsl:value-of select = "number"/></td>
                            <td><xsl:value-of select = "copies-count"/></td>
                            <td><xsl:value-of select = "status"/></td>
                            <xsl:for-each select = "cost">
                                <td><xsl:value-of select = "prepayment"/></td>
                                <td><xsl:value-of select = "prepayment-date"/></td>
                                <td><xsl:value-of select = "all-payment"/></td>
                                <td><xsl:value-of select = "all-payment-date"/></td>
                            </xsl:for-each>
                            <xsl:for-each select = "work-date">
                                <td><xsl:value-of select = "start-date"/></td>
                                <td><xsl:value-of select = "end-date"/></td>
                            </xsl:for-each>
                            <td><xsl:value-of select = "customer-id/@id"/></td>
                            <td><xsl:value-of select = "artist-id/@id"/></td>
                            <td><xsl:value-of select = "preorder-id/@id"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>   