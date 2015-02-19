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

package org.openestate.io.openimmo.examples;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Calendar;
import java.util.Locale;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.openimmo.OpenImmoTransferDocument;
import org.openestate.io.openimmo.OpenImmoUtils;
import org.openestate.io.openimmo.OpenImmoVersion;
import org.openestate.io.openimmo.xml.Aktion;
import org.openestate.io.openimmo.xml.Anbieter;
import org.openestate.io.openimmo.xml.Haus;
import org.openestate.io.openimmo.xml.Immobilie;
import org.openestate.io.openimmo.xml.ObjectFactory;
import org.openestate.io.openimmo.xml.Openimmo;
import org.openestate.io.openimmo.xml.Uebertragung;

/**
 * Example for XML writing.
 * <p>
 * This example illustrates the programatic creation of an OpenImmo document,
 * how the document is written into XML and how the document is downgraded to
 * earlier OpenImmo versions.
 *
 * @author Andreas Rudolph
 */
public class OpenImmoWritingExample
{
  private final static ObjectFactory FACTORY = OpenImmoUtils.getFactory();
  private final static boolean PRETTY_PRINT = true;

  /**
   * Start the example application.
   *
   * @param args
   * command line arguments
   */
  public static void main( String[] args )
  {
    // create an OpenImmo object with some example data
    Openimmo openimmo = FACTORY.createOpenimmo();
    openimmo.setUebertragung( createUebertragung() );
    openimmo.getAnbieter().add( createAnbieter() );

    // convert OpenImmo object into a XML document
    OpenImmoTransferDocument doc = null;
    try
    {
      doc = OpenImmoTransferDocument.newDocument( openimmo );
    }
    catch (Exception ex)
    {
      System.err.println( "Can't create XML document!" );
      ex.printStackTrace( System.err );
      System.exit( 1 );
    }

    // write XML document into a java.io.File
    try
    {
      write( doc, File.createTempFile( "openimmo-", ".xml" ) );
    }
    catch (IOException ex)
    {
      System.err.println( "Can't create temporary file!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }

    // write XML document into a java.io.OutputStream
    write( doc, new NullOutputStream() );

    // write XML document into a java.io.Writer
    write( doc, new NullWriter() );

    // write XML document into a string and send it to the console
    writeToConsole( doc );

    // downgrade XML document to an earlier OpenImmo version
    // and write it to the console
    doc.downgrade( OpenImmoVersion.V1_2_3 );
    writeToConsole( doc );

    // downgrade XML document to the first OpenImmo version
    // and write it to the console
    doc.downgrade( OpenImmoVersion.V1_1 );
    writeToConsole( doc );
  }

  /**
   * Create an {@link Anbieter} with some example data.
   *
   * @return
   * an example {@link Anbieter} object
   */
  protected static Anbieter createAnbieter()
  {
    // create an example agency
    Anbieter anbieter = FACTORY.createAnbieter();
    anbieter.setAnbieternr( "123456" );
    anbieter.setFirma( "Agency Name" );
    anbieter.setOpenimmoAnid( "123456");

    // add some real estates to the agency
    anbieter.getImmobilie().add( createImmobilie() );
    anbieter.getImmobilie().add( createImmobilie() );

    return anbieter;
  }

  /**
   * Create an {@link Immobilie} with some example data.
   *
   * @return
   * an example {@link Immobilie} object
   */
  protected static Immobilie createImmobilie()
  {
    // create an example real estate
    Immobilie immobilie = FACTORY.createImmobilie();

    // add some administrative informations
    immobilie.setVerwaltungTechn( FACTORY.createVerwaltungTechn() );
    immobilie.getVerwaltungTechn().setAktion( FACTORY.createAktion() );
    immobilie.getVerwaltungTechn().getAktion().setAktionart( Aktion.AktionArt.CHANGE );
    immobilie.getVerwaltungTechn().setObjektnrIntern( RandomStringUtils.randomNumeric( 10 ) );

    // set categorization
    immobilie.setObjektkategorie( FACTORY.createObjektkategorie() );
    immobilie.getObjektkategorie().setNutzungsart( FACTORY.createNutzungsart() );
    immobilie.getObjektkategorie().getNutzungsart().setANLAGE( RandomUtils.nextInt( 0, 2 )==1 );
    immobilie.getObjektkategorie().getNutzungsart().setGEWERBE( RandomUtils.nextInt( 0, 2 )==1 );
    immobilie.getObjektkategorie().getNutzungsart().setWAZ( RandomUtils.nextInt( 0, 2 )==1 );
    immobilie.getObjektkategorie().getNutzungsart().setWOHNEN( RandomUtils.nextInt( 0, 2 )==1 );
    immobilie.getObjektkategorie().setVermarktungsart( FACTORY.createVermarktungsart() );
    immobilie.getObjektkategorie().getVermarktungsart().setKAUF( true );
    immobilie.getObjektkategorie().setObjektart( FACTORY.createObjektart() );

    Haus singleFamilyHouse = FACTORY.createHaus();
    singleFamilyHouse.setHaustyp( Haus.Haustyp.EINFAMILIENHAUS );
    immobilie.getObjektkategorie().getObjektart().getHaus().add( singleFamilyHouse );

    // add some informations about the location
    immobilie.setGeo( FACTORY.createGeo() );
    immobilie.getGeo().setPlz( RandomStringUtils.randomNumeric( 5 ) );
    immobilie.getGeo().setOrt( "Berlin" );
    immobilie.getGeo().setLand( FACTORY.createLand() );
    immobilie.getGeo().getLand().setIsoLand( Locale.GERMANY.getISO3Country() );

    // add some informations about prices
    immobilie.setPreise( FACTORY.createPreise() );
    immobilie.getPreise().setHeizkosten( 456.0 );
    immobilie.getPreise().setKaufpreis( FACTORY.createKaufpreis() );
    immobilie.getPreise().getKaufpreis().setAufAnfrage( false );
    immobilie.getPreise().getKaufpreis().setValue( 123456.79 );

    // add some informations about features
    immobilie.setAusstattung( FACTORY.createAusstattung() );
    immobilie.getAusstattung().setGaestewc( true );
    immobilie.getAusstattung().setGartennutzung( true );
    immobilie.getAusstattung().setHeizungsart( FACTORY.createHeizungsart() );
    immobilie.getAusstattung().getHeizungsart().setZENTRAL( true );
    immobilie.getAusstattung().getHeizungsart().setFUSSBODEN( true );

    // add some descriptions
    immobilie.setFreitexte( FACTORY.createFreitexte() );
    immobilie.getFreitexte().setObjekttitel( "A title for the property." );
    immobilie.getFreitexte().setObjektbeschreibung( "Some longer descriptive text about the property." );

    // set the contact person
    immobilie.setKontaktperson( FACTORY.createKontaktperson() );
    immobilie.getKontaktperson().setName( "Max Mustermann" );
    immobilie.getKontaktperson().setEmailFeedback( "max@mustermann.org" );
    immobilie.getKontaktperson().setTelDurchw( "030/123456789" );
    immobilie.getKontaktperson().setPlz( RandomStringUtils.randomNumeric( 5 ) );
    immobilie.getKontaktperson().setOrt( "Berlin" );
    immobilie.getKontaktperson().setLand( FACTORY.createLand() );
    immobilie.getKontaktperson().getLand().setIsoLand( Locale.GERMANY.getISO3Country() );

    return immobilie;
  }

  /**
   * Create an {@link Uebertragung} with some example data.
   *
   * @return
   * an example {@link Uebertragung} object
   */
  protected static Uebertragung createUebertragung()
  {
    // create an example transfer
    Uebertragung uebertragung = FACTORY.createUebertragung();
    uebertragung.setArt( Uebertragung.Art.OFFLINE );
    uebertragung.setModus( Uebertragung.Modus.NEW );
    uebertragung.setSendersoftware( "OpenEstate.org" );
    uebertragung.setSenderversion( "1.0-SNAPSHOT" );
    uebertragung.setTechnEmail( "info@openestate.org" );
    uebertragung.setTimestamp( Calendar.getInstance() );
    uebertragung.setUmfang( Uebertragung.Umfang.VOLL );
    return uebertragung;
  }

  /**
   * Write a {@link TransferDocument} into a {@link File}.
   *
   * @param doc
   * the document to write
   *
   * @param file
   * the file, where the document is written to
   */
  protected static void write( OpenImmoTransferDocument doc, File file )
  {
    System.out.println( "writing document with version " + doc.getDocumentVersion() );
    try
    {
      doc.toXml( file, PRETTY_PRINT );
      System.out.println( "> written to: " + file.getAbsolutePath() );
    }
    catch (Exception ex)
    {
      System.err.println( "Can't write document into a file!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }
  }

  /**
   * Write a {@link TransferDocument} into an {@link OutputStream}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the stream, where the document is written to
   */
  protected static void write( OpenImmoTransferDocument doc, OutputStream output )
  {
    System.out.println( "writing document with version " + doc.getDocumentVersion() );
    try
    {
      doc.toXml( output, PRETTY_PRINT );
      System.out.println( "> written to a java.io.OutputStream" );
    }
    catch (Exception ex)
    {
      System.err.println( "Can't write document into an OutputStream!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }
  }

  /**
   * Write a {@link TransferDocument} into an {@link Writer}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( OpenImmoTransferDocument doc, Writer output )
  {
    System.out.println( "writing document with version " + doc.getDocumentVersion() );
    try
    {
      doc.toXml( output, PRETTY_PRINT );
      System.out.println( "> written to a java.io.Writer" );
    }
    catch (Exception ex)
    {
      System.err.println( "Can't write document into an OutputStream!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }
  }

  /**
   * Write a {@link TransferDocument} into a {@link String} and print the
   * results to the console.
   *
   * @param doc
   * the document to write
   */
  protected static void writeToConsole( OpenImmoTransferDocument doc )
  {
    System.out.println( "writing document with version " + doc.getDocumentVersion() );
    try
    {
      String xml = doc.toXmlString( PRETTY_PRINT );
      System.out.println( StringUtils.repeat( "-", 50 ) );
      System.out.println( xml );
      System.out.println( StringUtils.repeat( "-", 50 ) );
    }
    catch (Exception ex)
    {
      System.err.println( "Can't write document into a string!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }
  }
}