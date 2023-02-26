Ruth Vacas Miñana

1-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="inventari">
        <html>
            <body>
                <ul>
                    <xsl:for-each select="producte[@codi!='P3']">
                        <li>
                            <xsl:value-of select="@codi" />
                            <ul>
                                <li>
                                    <xsl:text>Nombre: </xsl:text>
                                    <xsl:value-of select="nom" />
                                </li>
                                <li>
                                    <xsl:text>Peso: </xsl:text>
                                    <xsl:value-of select="pes" />
                                    <xsl:value-of select="pes/@unitat" />
                                </li>
                            </ul>
                        </li>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
2-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="inventari">
        <html>
            <body>
                <ul>
                    <xsl:for-each select="producte[lloc/@edifici='A' and lloc/aula='6']">
                        <li>
                            <xsl:value-of select="@codi" />
                            <ul>
                                <li>
                                    <xsl:text>Nombre: </xsl:text>
                                    <xsl:value-of select="nom" />
                                </li>
                                <li>
                                    <xsl:text>Peso: </xsl:text>
                                    <xsl:value-of select="pes" />
                                    <xsl:value-of select="pes/@unitat" />
                                </li>
                            </ul>
                        </li>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
3-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="inventari">
        <html>
            <body>
                <ul>
                    <xsl:for-each select="producte[pes>'7' ]">
                        <li>
                            <xsl:value-of select="@codi" />
                            <ul>
                                <li>
                                    <xsl:text>Nombre: </xsl:text>
                                    <xsl:value-of select="nom" />
                                </li>
                                <li>
                                    <xsl:text>Peso: </xsl:text>
                                    <xsl:value-of select="pes" />
                                    <xsl:value-of select="pes/@unitat" />
                                </li>
                            </ul>
                        </li>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
4-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="inventari">
        <html>
            <body>
                <ul>
                    <xsl:for-each select="producte[lloc/@edifici='B' ]">
                        <li>
                            <xsl:value-of select="@codi" />
                            <ul>
                                <li>
                                    <xsl:text>Nombre: </xsl:text>
                                    <xsl:value-of select="nom" />
                                </li>
                                <li>
                                    <xsl:text>Peso: </xsl:text>
                                    <xsl:value-of select="pes" />
                                    <xsl:value-of select="pes/@unitat" />
                                </li>
                            </ul>
                        </li>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
5-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <table>
                    <xsl:for-each select="inventari/producte">
                        <tr>

                            <td>
                                <xsl:value-of select="nom" />
                            </td>
                            <td>
                                <xsl:value-of select="pes" />
                            </td>
                            <td>
                                <xsl:value-of select="lloc/@edifici" />
                                <xsl:value-of select="lloc/aula" />
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
6-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="inventari">
        <html>
            <body>
                <h1>Edificio A</h1>
                <table>
                    <xsl:for-each select="producte[lloc/@edifici='A']">
                        <tr>
                            <td>
                                <xsl:value-of select="nom" />
                            </td>
                            <td>
                                <xsl:value-of select="pes" />
                            </td>
                            <td>
                                <xsl:value-of select="lloc/@edifici" />
                                <xsl:value-of select="lloc/aula" />
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <h1>Edificio
        B</h1>
                <table>
                    <xsl:for-each select="producte[lloc/@edifici='B']">
                        <tr>
                            <td>
                                <xsl:value-of select="nom" />
                            </td>
                            <td>
                                <xsl:value-of select="pes" />
                            </td>
                            <td>
                                <xsl:value-of select="lloc/@edifici" />
                                <xsl:value-of select="lloc/aula" />
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
7-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="inventari">
        <html>
            <body>
                <h1>Aula 6</h1>
                <table>
                    <xsl:for-each select="producte[lloc/aula=6]">
                        <tr>
                            <td>
                                <xsl:value-of select="nom" />
                            </td>

                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
8-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="inventari">
        <html>
            <body>
                <h1>Aula 6</h1>
                <table>
                    <xsl:for-each select="producte[lloc/@edifici='B']">
                        <tr>
                            <td>
                                <xsl:value-of select="nom" />
                            </td>

                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
9-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="inventari">
        <html>
            <body>
                <h1>Aula 6</h1>
                <table>
                    <xsl:for-each select="producte[lloc/@edifici='A' and pes < 7]">
                        <tr>
                            <td>
                                <xsl:value-of select="nom" />
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>