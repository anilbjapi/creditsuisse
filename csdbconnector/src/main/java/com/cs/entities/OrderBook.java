package com.cs.entities;

import java.util.Date;

public class OrderBook extends BaseEntity{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_book.order_id
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	private Integer orderId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_book.description
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_book.client_id
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	private Integer clientId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_book.quantity
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	private Integer quantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_book.entry_date
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	private Date entryDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_book.price
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	private Double price;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_book.instrument_id
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	private Integer instrumentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_book.is_order_open
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	private String isOrderOpen;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_book.order_type
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	private String orderType;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_book.order_id
	 * @return  the value of order_book.order_id
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_book.order_id
	 * @param orderId  the value for order_book.order_id
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_book.description
	 * @return  the value of order_book.description
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_book.description
	 * @param description  the value for order_book.description
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_book.client_id
	 * @return  the value of order_book.client_id
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public Integer getClientId() {
		return clientId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_book.client_id
	 * @param clientId  the value for order_book.client_id
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_book.quantity
	 * @return  the value of order_book.quantity
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_book.quantity
	 * @param quantity  the value for order_book.quantity
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_book.entry_date
	 * @return  the value of order_book.entry_date
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public Date getEntryDate() {
		return entryDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_book.entry_date
	 * @param entryDate  the value for order_book.entry_date
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_book.price
	 * @return  the value of order_book.price
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_book.price
	 * @param price  the value for order_book.price
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_book.instrument_id
	 * @return  the value of order_book.instrument_id
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public Integer getInstrumentId() {
		return instrumentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_book.instrument_id
	 * @param instrumentId  the value for order_book.instrument_id
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public void setInstrumentId(Integer instrumentId) {
		this.instrumentId = instrumentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_book.is_order_open
	 * @return  the value of order_book.is_order_open
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public String getIsOrderOpen() {
		return isOrderOpen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_book.is_order_open
	 * @param isOrderOpen  the value for order_book.is_order_open
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public void setIsOrderOpen(String isOrderOpen) {
		this.isOrderOpen = isOrderOpen == null ? null : isOrderOpen.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_book.order_type
	 * @return  the value of order_book.order_type
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_book.order_type
	 * @param orderType  the value for order_book.order_type
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType == null ? null : orderType.trim();
	}
}