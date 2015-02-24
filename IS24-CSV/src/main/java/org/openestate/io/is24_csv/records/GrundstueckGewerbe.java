/*
 * Copyright 2015 OpenEstate.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openestate.io.is24_csv.records;

import org.apache.commons.lang3.StringUtils;
import org.openestate.io.is24_csv.Is24CsvFormat;
import org.openestate.io.is24_csv.types.BebaubarNach;
import org.openestate.io.is24_csv.types.Erschliessung;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.NutzungGrundstueckGewerbe;
import org.openestate.io.is24_csv.types.ObjektkategorieGrundstueck;
import org.openestate.io.is24_csv.types.Vermarktungsart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GrundstueckGewerbe.
 *
 * @author Andreas Rudolph
 */
public class GrundstueckGewerbe extends Grundstueck
{
  private final static Logger LOGGER = LoggerFactory.getLogger( GrundstueckGewerbe.class );

  /** Grundstücksfläche, Zahl 10,2 */
  protected final static int FIELD_GRUNDSTUECKSFLAECHE = 62;

  /** Fläche teilbar ab (in m²), Zahl 8 */
  protected final static int FIELD_FLAECHE_TEILBAR_AB = 63;

  /** Empfohlene Nutzung, Zahl 2 (Mehrfachauswahl möglich, wenn Eingaben durch Semikolon getrennt werden. Jeder mögliche Wert darf max. einmal erscheinen.) */
  protected final static int FIELD_EMPFOHLENE_NUTZUNG = 64;

  /** bebaubar nach, Text 1 */
  protected final static int FIELD_BEBAUBAR_NACH = 65;

  /** Erbpachtdauer in Jahren (Heimfall nach), Zahl 3 */
  protected final static int FIELD_ERBPACHTDAUER = 66;

  /** Baugenehmigung vorhanden, Text 1 */
  protected final static int FIELD_BAUGENEHMIGUNG_VORHANDEN = 67;

  /** Abriss erforderlich, Text 1 */
  protected final static int FIELD_ABRISS_ERFORDERLICH = 68;

  /** Grundflächenzahl (GRZ), Zahl 3,2 */
  protected final static int FIELD_GRUNDFLAECHENZAHL = 69;

  /** Geschoßflächenzahl (GFZ), Zahl 3,2 */
  protected final static int FIELD_GESCHOSSFLAECHENZAHL = 70;

  /** Erschließung, Text 1 */
  protected final static int FIELD_ERSCHLIESSUNG = 71;

  /** kurzfristig bebaubar, Text 1 */
  protected final static int FIELD_KURZFRISTIG_BEBAUBAR = 72;

  /** Frei ab/Verfügbar ab/Antrittstermin, Text 50 */
  protected final static int FIELD_VERFUEGBAR_AB = 73;

  /** Kaufpreis / Erbpacht pro Jahr / Miete / Pacht, Zahl 15,2 */
  protected final static int FIELD_PREIS = 90;

  public GrundstueckGewerbe()
  {
    super();
    this.setImmobilienart( Immobilienart.GRUNDSTUECKE );
    this.setObjektkategorie( ObjektkategorieGrundstueck.GEWERBE );
  }

  public Boolean getAbrissErforderlich()
  {
    return this.getAsBoolean( FIELD_ABRISS_ERFORDERLICH );
  }

  public Boolean getBaugenehmigungVorhanden()
  {
    return this.getAsBoolean( FIELD_BAUGENEHMIGUNG_VORHANDEN );
  }

  public BebaubarNach getBebaubarNach()
  {
    return BebaubarNach.parse( this.get( FIELD_BEBAUBAR_NACH ) );
  }

  public NutzungGrundstueckGewerbe[] getEmpfohleneNutzung()
  {
    return NutzungGrundstueckGewerbe.parseList( this.get( FIELD_EMPFOHLENE_NUTZUNG ) );
  }

  public Integer getErbpachtdauer()
  {
    try
    {
      return this.getAsInteger( FIELD_ERBPACHTDAUER );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Erbpachtdauer' "
        + "from '" + this.get( FIELD_ERBPACHTDAUER ) + "'!" );
      return null;
    }
  }

  public Erschliessung getErschliessung()
  {
    return Erschliessung.parse( this.get( FIELD_ERSCHLIESSUNG ) );
  }

  public Long getFlaecheTeilbarAb()
  {
    try
    {
      return this.getAsLong( FIELD_FLAECHE_TEILBAR_AB );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Flaeche teilbar ab' "
        + "from '" + this.get( FIELD_FLAECHE_TEILBAR_AB ) + "'!" );
      return null;
    }
  }

  public Double getGeschossflaechenzahl()
  {
    try
    {
      return this.getAsDouble( FIELD_GESCHOSSFLAECHENZAHL );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Geschossflaechenzahl' "
        + "from '" + this.get( FIELD_GESCHOSSFLAECHENZAHL ) + "'!" );
      return null;
    }
  }

  public Double getGrundflaechenzahl()
  {
    try
    {
      return this.getAsDouble( FIELD_GRUNDFLAECHENZAHL );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Grundflaechenzahl' "
        + "from '" + this.get( FIELD_GRUNDFLAECHENZAHL ) + "'!" );
      return null;
    }
  }

  public Double getGrundstuecksflaeche()
  {
    try
    {
      return this.getAsDouble( FIELD_GRUNDSTUECKSFLAECHE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Grundstuecksflaeche' "
        + "from '" + this.get( FIELD_GRUNDSTUECKSFLAECHE ) + "'!" );
      return null;
    }
  }

  public Boolean getKurzfristigBebaubar()
  {
    return this.getAsBoolean( FIELD_KURZFRISTIG_BEBAUBAR );
  }

  public Double getPreis()
  {
    try
    {
      return this.getAsDouble( FIELD_PREIS );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Preis' "
        + "from '" + this.get( FIELD_PREIS ) + "'!" );
      return null;
    }
  }

  public String getVerfuegbarAb()
  {
    return this.get( FIELD_VERFUEGBAR_AB );
  }

  @Override
  protected Iterable<String> print()
  {
    this.setImmobilienart( Immobilienart.GRUNDSTUECKE );

    ObjektkategorieGrundstueck kat = this.getObjektkategorie();
    if (kat==null) this.setObjektkategorie( ObjektkategorieGrundstueck.GEWERBE );

    Vermarktungsart art = this.getVermarktungsart();
    if (!Vermarktungsart.ERBPACHT.equals( art )) this.setErbpachtdauer( null );

    return super.print();
  }

  public void setAbrissErforderlich( Boolean value )
  {
    this.set( FIELD_ABRISS_ERFORDERLICH,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setBaugenehmigungVorhanden( Boolean value )
  {
    this.set( FIELD_BAUGENEHMIGUNG_VORHANDEN,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setBebaubarNach( BebaubarNach value )
  {
    this.set( FIELD_BEBAUBAR_NACH,
      (value!=null)? value.print(): null );
  }

  public void setEmpfohleneNutzung( NutzungGrundstueckGewerbe value )
  {
    this.set( FIELD_EMPFOHLENE_NUTZUNG,
      (value!=null)? value.print(): null );
  }

  public void setEmpfohleneNutzung( Iterable<NutzungGrundstueckGewerbe> values )
  {
    this.set( FIELD_EMPFOHLENE_NUTZUNG,
      NutzungGrundstueckGewerbe.print( values ) );
  }

  public void setErbpachtdauer( Integer value )
  {
    this.set( FIELD_ERBPACHTDAUER,
      Is24CsvFormat.printNumber( value, 3 ) );
  }

  public void setErschliessung( Erschliessung value )
  {
    this.set( FIELD_ERSCHLIESSUNG,
      (value!=null)? value.print(): null );
  }

  public void setFlaecheTeilbarAb( Long value )
  {
    this.set( FIELD_FLAECHE_TEILBAR_AB,
      Is24CsvFormat.printNumber( value, 8 ) );
  }

  public void setGeschossflaechenzahl( Double value )
  {
    this.set( FIELD_GESCHOSSFLAECHENZAHL,
      Is24CsvFormat.printNumber( value, 3, 2 ) );
  }

  public void setGrundflaechenzahl( Double value )
  {
    this.set( FIELD_GRUNDFLAECHENZAHL,
      Is24CsvFormat.printNumber( value, 3, 2 ) );
  }

  public void setGrundstuecksflaeche( Double value )
  {
    this.set( FIELD_GRUNDSTUECKSFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setKurzfristigBebaubar( Boolean value )
  {
    this.set( FIELD_KURZFRISTIG_BEBAUBAR,
      Is24CsvFormat.printBoolean( value ) );
  }

  @Override
  public void setObjektkategorie( ObjektkategorieGrundstueck value )
  {
    if (ObjektkategorieGrundstueck.WOHNEN.equals( value ))
      throw new IllegalArgumentException( "The provided value (" + value +") is not supported by this record." );

    super.setObjektkategorie( (value!=null)? value: ObjektkategorieGrundstueck.GEWERBE );
  }

  public void setPreis( Double value )
  {
    this.set( FIELD_PREIS,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setVerfuegbarAb( String value )
  {
    this.set( FIELD_VERFUEGBAR_AB,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }
}