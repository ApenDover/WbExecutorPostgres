package exel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Str")
public class Str implements Comparable<Str> {
    private long realizationreport_id;
    private Date date_from;
    private Date date_to;
    private Date create_dt;
    private long suppliercontract_code;
    @Id
    private long rrd_id;
    private long gi_id;
    private String subject_name;
    private long nm_id;
    private String brand_name;
    private String sa_name;
    private String ts_name;
    private String barcode;
    private String doc_type_name;
    private int quantity;
    private int retail_price;
    private double retail_amount;
    private int sale_percent;
    private double commission_percent;
    private String office_name;
    private String supplier_oper_name;
    private Date order_dt;
    private Date sale_dt;
    private Date rr_dt;
    private long shk_id;
    private int retail_price_withdisc_rub;
    private int delivery_amount;
    private int return_amount;
    private int delivery_rub;
    private String gi_box_type_name;
    private int product_discount_for_report;
    private int supplier_promo;
    private long rid;
    private double ppvz_spp_prc;
    private double ppvz_kvw_prc_base;
    private double ppvz_kvw_prc;
    private double ppvz_sales_commission;
    private double ppvz_for_pay;
    private int ppvz_reward;
    private double acquiring_fee;
    private String acquiring_bank;
    private double ppvz_vw;
    private double ppvz_vw_nds;
    private int ppvz_office_id;
    private String ppvz_office_name;
    private int ppvz_supplier_id;
    private String ppvz_supplier_name;
    private Long ppvz_inn;
    private String declaration_number;
    private String sticker_id;
    private String site_country;
    private String bonus_type_name;
    private int penalty;
    private int additional_payment;
    private String srid;

    public Str() {
    }

    public Str(long realizationreport_id, Date date_from, Date date_to, Date create_dt, long suppliercontract_code, long rrd_id, long gi_id, String subject_name, long nm_id, String brand_name, String sa_name, String ts_name, String barcode, String doc_type_name, int quantity, int retail_price, double retail_amount, int sale_percent, double commission_percent, String office_name, String supplier_oper_name, Date order_dt, Date sale_dt, Date rr_dt, long shk_id, int retail_price_withdisc_rub, int delivery_amount, int return_amount, int delivery_rub, String gi_box_type_name, int product_discount_for_report, int supplier_promo, long rid, double ppvz_spp_prc, double ppvz_kvw_prc_base, double ppvz_kvw_prc, double ppvz_sales_commission, double ppvz_for_pay, int ppvz_reward, double acquiring_fee, String acquiring_bank, double ppvz_vw, double ppvz_vw_nds, int ppvz_office_id, String ppvz_office_name, int ppvz_supplier_id, String ppvz_supplier_name, Long ppvz_inn, String declaration_number, String sticker_id, String site_country, int penalty, int additional_payment, String srid) {
        this.realizationreport_id = realizationreport_id;
        this.date_from = date_from;
        this.date_to = date_to;
        this.create_dt = create_dt;
        this.suppliercontract_code = suppliercontract_code;
        this.rrd_id = rrd_id;
        this.gi_id = gi_id;
        this.subject_name = subject_name;
        this.nm_id = nm_id;
        this.brand_name = brand_name;
        this.sa_name = sa_name;
        this.ts_name = ts_name;
        this.barcode = barcode;
        this.doc_type_name = doc_type_name;
        this.quantity = quantity;
        this.retail_price = retail_price;
        this.retail_amount = retail_amount;
        this.sale_percent = sale_percent;
        this.commission_percent = commission_percent;
        this.office_name = office_name;
        this.supplier_oper_name = supplier_oper_name;
        this.order_dt = order_dt;
        this.sale_dt = sale_dt;
        this.rr_dt = rr_dt;
        this.shk_id = shk_id;
        this.retail_price_withdisc_rub = retail_price_withdisc_rub;
        this.delivery_amount = delivery_amount;
        this.return_amount = return_amount;
        this.delivery_rub = delivery_rub;
        this.gi_box_type_name = gi_box_type_name;
        this.product_discount_for_report = product_discount_for_report;
        this.supplier_promo = supplier_promo;
        this.rid = rid;
        this.ppvz_spp_prc = ppvz_spp_prc;
        this.ppvz_kvw_prc_base = ppvz_kvw_prc_base;
        this.ppvz_kvw_prc = ppvz_kvw_prc;
        this.ppvz_sales_commission = ppvz_sales_commission;
        this.ppvz_for_pay = ppvz_for_pay;
        this.ppvz_reward = ppvz_reward;
        this.acquiring_fee = acquiring_fee;
        this.acquiring_bank = acquiring_bank;
        this.ppvz_vw = ppvz_vw;
        this.ppvz_vw_nds = ppvz_vw_nds;
        this.ppvz_office_id = ppvz_office_id;
        this.ppvz_office_name = ppvz_office_name;
        this.ppvz_supplier_id = ppvz_supplier_id;
        this.ppvz_supplier_name = ppvz_supplier_name;
        this.ppvz_inn = ppvz_inn;
        this.declaration_number = declaration_number;
        this.sticker_id = sticker_id;
        this.site_country = site_country;
        this.penalty = penalty;
        this.additional_payment = additional_payment;
        this.srid = srid;
    }

    public long getRealizationreport_id() {
        return realizationreport_id;
    }

    public void setRealizationreport_id(long realizationreport_id) {
        this.realizationreport_id = realizationreport_id;
    }

    public Date getDate_from() {
        return date_from;
    }

    public void setDate_from(Date date_from) {
        this.date_from = date_from;
    }

    public Date getDate_to() {
        return date_to;
    }

    public void setDate_to(Date date_to) {
        this.date_to = date_to;
    }

    public Date getCreate_dt() {
        return create_dt;
    }

    public void setCreate_dt(Date create_dt) {
        this.create_dt = create_dt;
    }

    public long getSuppliercontract_code() {
        return suppliercontract_code;
    }

    public void setSuppliercontract_code(long suppliercontract_code) {
        this.suppliercontract_code = suppliercontract_code;
    }

    public long getRrd_id() {
        return rrd_id;
    }

    public void setRrd_id(long rrd_id) {
        this.rrd_id = rrd_id;
    }

    public long getGi_id() {
        return gi_id;
    }

    public void setGi_id(long gi_id) {
        this.gi_id = gi_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public long getNm_id() {
        return nm_id;
    }

    public void setNm_id(long nm_id) {
        this.nm_id = nm_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getSa_name() {
        return sa_name;
    }

    public void setSa_name(String sa_name) {
        this.sa_name = sa_name;
    }

    public String getTs_name() {
        return ts_name;
    }

    public void setTs_name(String ts_name) {
        this.ts_name = ts_name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDoc_type_name() {
        return doc_type_name;
    }

    public void setDoc_type_name(String doc_type_name) {
        this.doc_type_name = doc_type_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(int retail_price) {
        this.retail_price = retail_price;
    }

    public double getRetail_amount() {
        return retail_amount;
    }

    public void setRetail_amount(double retail_amount) {
        this.retail_amount = retail_amount;
    }

    public int getSale_percent() {
        return sale_percent;
    }

    public void setSale_percent(int sale_percent) {
        this.sale_percent = sale_percent;
    }

    public double getCommission_percent() {
        return commission_percent;
    }

    public void setCommission_percent(double commission_percent) {
        this.commission_percent = commission_percent;
    }

    public String getOffice_name() {
        return office_name;
    }

    public void setOffice_name(String office_name) {
        this.office_name = office_name;
    }

    public String getSupplier_oper_name() {
        return supplier_oper_name;
    }

    public void setSupplier_oper_name(String supplier_oper_name) {
        this.supplier_oper_name = supplier_oper_name;
    }

    public Date getOrder_dt() {
        return order_dt;
    }

    public void setOrder_dt(Date order_dt) {
        this.order_dt = order_dt;
    }

    public Date getSale_dt() {
        return sale_dt;
    }

    public void setSale_dt(Date sale_dt) {
        this.sale_dt = sale_dt;
    }

    public Date getRr_dt() {
        return rr_dt;
    }

    public void setRr_dt(Date rr_dt) {
        this.rr_dt = rr_dt;
    }

    public long getShk_id() {
        return shk_id;
    }

    public void setShk_id(long shk_id) {
        this.shk_id = shk_id;
    }

    public int getRetail_price_withdisc_rub() {
        return retail_price_withdisc_rub;
    }

    public void setRetail_price_withdisc_rub(int retail_price_withdisc_rub) {
        this.retail_price_withdisc_rub = retail_price_withdisc_rub;
    }

    public int getDelivery_amount() {
        return delivery_amount;
    }

    public void setDelivery_amount(int delivery_amount) {
        this.delivery_amount = delivery_amount;
    }

    public int getReturn_amount() {
        return return_amount;
    }

    public void setReturn_amount(int return_amount) {
        this.return_amount = return_amount;
    }

    public int getDelivery_rub() {
        return delivery_rub;
    }

    public void setDelivery_rub(int delivery_rub) {
        this.delivery_rub = delivery_rub;
    }

    public String getGi_box_type_name() {
        return gi_box_type_name;
    }

    public void setGi_box_type_name(String gi_box_type_name) {
        this.gi_box_type_name = gi_box_type_name;
    }

    public int getProduct_discount_for_report() {
        return product_discount_for_report;
    }

    public void setProduct_discount_for_report(int product_discount_for_report) {
        this.product_discount_for_report = product_discount_for_report;
    }

    public int getSupplier_promo() {
        return supplier_promo;
    }

    public void setSupplier_promo(int supplier_promo) {
        this.supplier_promo = supplier_promo;
    }

    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    public double getPpvz_spp_prc() {
        return ppvz_spp_prc;
    }

    public void setPpvz_spp_prc(double ppvz_spp_prc) {
        this.ppvz_spp_prc = ppvz_spp_prc;
    }

    public double getPpvz_kvw_prc_base() {
        return ppvz_kvw_prc_base;
    }

    public void setPpvz_kvw_prc_base(double ppvz_kvw_prc_base) {
        this.ppvz_kvw_prc_base = ppvz_kvw_prc_base;
    }

    public double getPpvz_kvw_prc() {
        return ppvz_kvw_prc;
    }

    public void setPpvz_kvw_prc(double ppvz_kvw_prc) {
        this.ppvz_kvw_prc = ppvz_kvw_prc;
    }

    public double getPpvz_sales_commission() {
        return ppvz_sales_commission;
    }

    public void setPpvz_sales_commission(double ppvz_sales_commission) {
        this.ppvz_sales_commission = ppvz_sales_commission;
    }

    public double getPpvz_for_pay() {
        return ppvz_for_pay;
    }

    public void setPpvz_for_pay(double ppvz_for_pay) {
        this.ppvz_for_pay = ppvz_for_pay;
    }

    public int getPpvz_reward() {
        return ppvz_reward;
    }

    public void setPpvz_reward(int ppvz_reward) {
        this.ppvz_reward = ppvz_reward;
    }

    public double getAcquiring_fee() {
        return acquiring_fee;
    }

    public void setAcquiring_fee(double acquiring_fee) {
        this.acquiring_fee = acquiring_fee;
    }

    public String getAcquiring_bank() {
        return acquiring_bank;
    }

    public void setAcquiring_bank(String acquiring_bank) {
        this.acquiring_bank = acquiring_bank;
    }

    public double getPpvz_vw() {
        return ppvz_vw;
    }

    public void setPpvz_vw(double ppvz_vw) {
        this.ppvz_vw = ppvz_vw;
    }

    public double getPpvz_vw_nds() {
        return ppvz_vw_nds;
    }

    public void setPpvz_vw_nds(double ppvz_vw_nds) {
        this.ppvz_vw_nds = ppvz_vw_nds;
    }

    public int getPpvz_office_id() {
        return ppvz_office_id;
    }

    public void setPpvz_office_id(int ppvz_office_id) {
        this.ppvz_office_id = ppvz_office_id;
    }

    public String getPpvz_office_name() {
        return ppvz_office_name;
    }

    public void setPpvz_office_name(String ppvz_office_name) {
        this.ppvz_office_name = ppvz_office_name;
    }

    public int getPpvz_supplier_id() {
        return ppvz_supplier_id;
    }

    public void setPpvz_supplier_id(int ppvz_supplier_id) {
        this.ppvz_supplier_id = ppvz_supplier_id;
    }

    public String getPpvz_supplier_name() {
        return ppvz_supplier_name;
    }

    public void setPpvz_supplier_name(String ppvz_supplier_name) {
        this.ppvz_supplier_name = ppvz_supplier_name;
    }

    public Long getPpvz_inn() {
        return ppvz_inn;
    }

    public void setPpvz_inn(Long ppvz_inn) {
        this.ppvz_inn = ppvz_inn;
    }

    public String getDeclaration_number() {
        return declaration_number;
    }

    public void setDeclaration_number(String declaration_number) {
        this.declaration_number = declaration_number;
    }

    public String getSticker_id() {
        return sticker_id;
    }

    public void setSticker_id(String sticker_id) {
        this.sticker_id = sticker_id;
    }

    public String getSite_country() {
        return site_country;
    }

    public void setSite_country(String site_country) {
        this.site_country = site_country;
    }

    public String getBonus_type_name() {
        return bonus_type_name;
    }

    public void setBonus_type_name(String bonus_type_name) {
        this.bonus_type_name = bonus_type_name;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getAdditional_payment() {
        return additional_payment;
    }

    public void setAdditional_payment(int additional_payment) {
        this.additional_payment = additional_payment;
    }

    public String getSrid() {
        return srid;
    }

    public void setSrid(String srid) {
        this.srid = srid;
    }

    @Override
    public int compareTo(Str o) {
        return Long.compare(this.rrd_id, o.getRrd_id());
    }
}