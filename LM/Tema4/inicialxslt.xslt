Ruth Vacas Miñana
1-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" />
    <xsl:template match="ciclo">
        <html>
            <body>
                <p>
                    <strong>
                        <xsl:value-of select="nombre" />
                    </strong>
                </p>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
2-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" />
    <xsl:template match="ciclo">
        <html>
            <body>

                <li>
                    <u>
                        <xsl:value-of select="nombre" />
                    </u>
                </li>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
3-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" />
    <xsl:template match="ciclo">
        <html>
            <body>

                <li>
                    <u><xsl:value-of select="@codigo" />: <xsl:value-of select="nombre" /></u>
                </li>

            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
4-
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" />
    <xsl:template match="ciclo">
        <html>
            <body>
                <h1>GRADO SUPERIOR</h1>
                <li>
                    <u><xsl:value-of select="@codigo" />: <xsl:value-of select="nombre" /></u>
                </li>

            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>