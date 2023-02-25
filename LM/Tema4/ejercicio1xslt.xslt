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

2-NO VA
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match=" /">
        <inventari>
            <xsl:if select="inventari/producte">
            <xsl:if test="@edifici=' A'">
            <producte>
                <pes>
                    <xsl:value-of select="pes" />
                </pes>
                <nom>
                    <xsl:value-of select="nom" />
                </nom>
                <lloc>
                    <xsl:attribute name="edifici">
                        <xsl:value-of
                            select="lugar/@edifici" />
                    </xsl:attribute>
                    <aula>
                        <xsl:value-of
                            select="lloc/aula" />
                    </aula>
                </lloc>
            </producte>
        </inventari>
    </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>
3-
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <inventari>
            <xsl:for-each select="inventari/producte">
                <xsl:if test="pes &lt; 7">
                    <producte>
                        <pes>
                            <xsl:value-of select="pes" />
                        </pes>
                        <nom>
                            <xsl:value-of select="nom" />
                        </nom>
                        <lloc>
                            <xsl:attribute name="edifici">
                                <xsl:value-of
                                    select="lloc/@edifici" />
                            </xsl:attribute>
                            <aula>
                                <xsl:value-of
                                    select="lloc/aula" />
                            </aula>
                        </lloc>
                    </producte>
                </xsl:if>
            </xsl:for-each>
        </inventari>
    </xsl:template>
</xsl:stylesheet>