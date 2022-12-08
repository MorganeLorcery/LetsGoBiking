
package com.baeldung.soap.ws.client.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.baeldung.soap.ws.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Itineraire_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "Itineraire");
    private final static QName _Etape_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "Etape");
    private final static QName _ArrayOfPaths_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "ArrayOfPaths");
    private final static QName _Paths_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "Paths");
    private final static QName _ArrayOfInstruction_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "ArrayOfInstruction");
    private final static QName _Instruction_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "Instruction");
    private final static QName _Points_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "Points");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _ArrayOfArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfArrayOfint");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _GetItineraireOrigin_QNAME = new QName("http://tempuri.org/", "origin");
    private final static QName _GetItineraireDestination_QNAME = new QName("http://tempuri.org/", "destination");
    private final static QName _GetItineraireResponseGetItineraireResult_QNAME = new QName("http://tempuri.org/", "GetItineraireResult");
    private final static QName _PointsCoordinates_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "coordinates");
    private final static QName _InstructionText_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "text");
    private final static QName _PathsBbox_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "bbox");
    private final static QName _PathsInstructions_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "instructions");
    private final static QName _PathsPoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "points");
    private final static QName _EtapePaths_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "paths");
    private final static QName _ItineraireEtape1_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "Etape1");
    private final static QName _ItineraireEtape2_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "Etape2");
    private final static QName _ItineraireEtape3_QNAME = new QName("http://schemas.datacontract.org/2004/07/RootingService", "Etape3");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.baeldung.soap.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetItineraire }
     * 
     */
    public GetItineraire createGetItineraire() {
        return new GetItineraire();
    }

    /**
     * Create an instance of {@link GetItineraireResponse }
     * 
     */
    public GetItineraireResponse createGetItineraireResponse() {
        return new GetItineraireResponse();
    }

    /**
     * Create an instance of {@link Itineraire }
     * 
     */
    public Itineraire createItineraire() {
        return new Itineraire();
    }

    /**
     * Create an instance of {@link GetItineraireActivemq }
     * 
     */
    public GetItineraireActivemq createGetItineraireActivemq() {
        return new GetItineraireActivemq();
    }

    /**
     * Create an instance of {@link GetItineraireActivemqResponse }
     * 
     */
    public GetItineraireActivemqResponse createGetItineraireActivemqResponse() {
        return new GetItineraireActivemqResponse();
    }

    /**
     * Create an instance of {@link Etape }
     * 
     */
    public Etape createEtape() {
        return new Etape();
    }

    /**
     * Create an instance of {@link ArrayOfPaths }
     * 
     */
    public ArrayOfPaths createArrayOfPaths() {
        return new ArrayOfPaths();
    }

    /**
     * Create an instance of {@link Paths }
     * 
     */
    public Paths createPaths() {
        return new Paths();
    }

    /**
     * Create an instance of {@link ArrayOfInstruction }
     * 
     */
    public ArrayOfInstruction createArrayOfInstruction() {
        return new ArrayOfInstruction();
    }

    /**
     * Create an instance of {@link Instruction }
     * 
     */
    public Instruction createInstruction() {
        return new Instruction();
    }

    /**
     * Create an instance of {@link Points }
     * 
     */
    public Points createPoints() {
        return new Points();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfint }
     * 
     */
    public ArrayOfArrayOfint createArrayOfArrayOfint() {
        return new ArrayOfArrayOfint();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Itineraire }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Itineraire }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "Itineraire")
    public JAXBElement<Itineraire> createItineraire(Itineraire value) {
        return new JAXBElement<Itineraire>(_Itineraire_QNAME, Itineraire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etape }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Etape }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "Etape")
    public JAXBElement<Etape> createEtape(Etape value) {
        return new JAXBElement<Etape>(_Etape_QNAME, Etape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaths }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPaths }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "ArrayOfPaths")
    public JAXBElement<ArrayOfPaths> createArrayOfPaths(ArrayOfPaths value) {
        return new JAXBElement<ArrayOfPaths>(_ArrayOfPaths_QNAME, ArrayOfPaths.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paths }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Paths }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "Paths")
    public JAXBElement<Paths> createPaths(Paths value) {
        return new JAXBElement<Paths>(_Paths_QNAME, Paths.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInstruction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfInstruction }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "ArrayOfInstruction")
    public JAXBElement<ArrayOfInstruction> createArrayOfInstruction(ArrayOfInstruction value) {
        return new JAXBElement<ArrayOfInstruction>(_ArrayOfInstruction_QNAME, ArrayOfInstruction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Instruction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Instruction }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "Instruction")
    public JAXBElement<Instruction> createInstruction(Instruction value) {
        return new JAXBElement<Instruction>(_Instruction_QNAME, Instruction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Points }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Points }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "Points")
    public JAXBElement<Points> createPoints(Points value) {
        return new JAXBElement<Points>(_Points_QNAME, Points.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfArrayOfint")
    public JAXBElement<ArrayOfArrayOfint> createArrayOfArrayOfint(ArrayOfArrayOfint value) {
        return new JAXBElement<ArrayOfArrayOfint>(_ArrayOfArrayOfint_QNAME, ArrayOfArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "origin", scope = GetItineraire.class)
    public JAXBElement<String> createGetItineraireOrigin(String value) {
        return new JAXBElement<String>(_GetItineraireOrigin_QNAME, String.class, GetItineraire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "destination", scope = GetItineraire.class)
    public JAXBElement<String> createGetItineraireDestination(String value) {
        return new JAXBElement<String>(_GetItineraireDestination_QNAME, String.class, GetItineraire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Itineraire }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Itineraire }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetItineraireResult", scope = GetItineraireResponse.class)
    public JAXBElement<Itineraire> createGetItineraireResponseGetItineraireResult(Itineraire value) {
        return new JAXBElement<Itineraire>(_GetItineraireResponseGetItineraireResult_QNAME, Itineraire.class, GetItineraireResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "origin", scope = GetItineraireActivemq.class)
    public JAXBElement<String> createGetItineraireActivemqOrigin(String value) {
        return new JAXBElement<String>(_GetItineraireOrigin_QNAME, String.class, GetItineraireActivemq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "destination", scope = GetItineraireActivemq.class)
    public JAXBElement<String> createGetItineraireActivemqDestination(String value) {
        return new JAXBElement<String>(_GetItineraireDestination_QNAME, String.class, GetItineraireActivemq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "coordinates", scope = Points.class)
    public JAXBElement<ArrayOfArrayOfint> createPointsCoordinates(ArrayOfArrayOfint value) {
        return new JAXBElement<ArrayOfArrayOfint>(_PointsCoordinates_QNAME, ArrayOfArrayOfint.class, Points.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "text", scope = Instruction.class)
    public JAXBElement<String> createInstructionText(String value) {
        return new JAXBElement<String>(_InstructionText_QNAME, String.class, Instruction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "bbox", scope = Paths.class)
    public JAXBElement<ArrayOfint> createPathsBbox(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_PathsBbox_QNAME, ArrayOfint.class, Paths.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInstruction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfInstruction }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "instructions", scope = Paths.class)
    public JAXBElement<ArrayOfInstruction> createPathsInstructions(ArrayOfInstruction value) {
        return new JAXBElement<ArrayOfInstruction>(_PathsInstructions_QNAME, ArrayOfInstruction.class, Paths.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Points }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Points }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "points", scope = Paths.class)
    public JAXBElement<Points> createPathsPoints(Points value) {
        return new JAXBElement<Points>(_PathsPoints_QNAME, Points.class, Paths.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaths }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPaths }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "paths", scope = Etape.class)
    public JAXBElement<ArrayOfPaths> createEtapePaths(ArrayOfPaths value) {
        return new JAXBElement<ArrayOfPaths>(_EtapePaths_QNAME, ArrayOfPaths.class, Etape.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etape }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Etape }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "Etape1", scope = Itineraire.class)
    public JAXBElement<Etape> createItineraireEtape1(Etape value) {
        return new JAXBElement<Etape>(_ItineraireEtape1_QNAME, Etape.class, Itineraire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etape }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Etape }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "Etape2", scope = Itineraire.class)
    public JAXBElement<Etape> createItineraireEtape2(Etape value) {
        return new JAXBElement<Etape>(_ItineraireEtape2_QNAME, Etape.class, Itineraire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etape }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Etape }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RootingService", name = "Etape3", scope = Itineraire.class)
    public JAXBElement<Etape> createItineraireEtape3(Etape value) {
        return new JAXBElement<Etape>(_ItineraireEtape3_QNAME, Etape.class, Itineraire.class, value);
    }

}
