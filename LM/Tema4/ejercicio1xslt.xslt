Ruth Vacas Miñana

1-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="inventari">
        <html>
            <body>
                <ul>
                    <xsl:for-each select="producte">
                        <li> Element <xsl:value-of select="@codi" />
                            <ul>
                            <li> Nombre: <xsl:value-of select="nom" /></li>
                            <li> Peso: <xsl:value-of select="pes"/><xsl:value-of select="pes/@unitat" /></li>
                            </ul>
                        </li>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>

2-
