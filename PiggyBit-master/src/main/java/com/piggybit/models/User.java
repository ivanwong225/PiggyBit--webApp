package com.piggybit.models;

import java.util.Collection;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Document(collection = "Users")
public class User implements UserDetails {
	@Id
	public String id;
	public String userName;
	public String password;
	public String firstName;
	public String lastName;
	public String email;
	public String yodleeUser;
	public String yodleePass;
	public String address;
	public String city;
	public String state;
	public String country;
	public String zipcode;
	public String timeZone;

	public String coinbaseAccount;
	public String refreshToken;
	public String accessToken;
	public String authCode;
	public String currency;
	public String cryptocurrency;
	public int priceMargin;
	public int investmentPeriod;
	public List<eventLog> eventLogs;

	public User() {
		super();
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public User(String userName, String password, String firstName, String lastName, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public User(String userName, String password, String firstName, String lastName, String email, String yodleeUser,
			String yodleePass, String address, String city, String state, String country, String zipcode,
			String timeZone, String currency) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.yodleeUser = yodleeUser;
		this.yodleePass = yodleePass;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.timeZone = timeZone;
		this.currency = currency;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getYodleeUser() {
		return yodleeUser;
	}

	public void setYodleeUser(String yodleeUser) {
		this.yodleeUser = yodleeUser;
	}

	public String getYodleePass() {
		return yodleePass;
	}

	public void setYodleePass(String yodleePass) {
		this.yodleePass = yodleePass;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getCoinbaseAccount() {
		return coinbaseAccount;
	}

	public void setCoinbaseAccount(String coinbaseAccount) {
		this.coinbaseAccount = coinbaseAccount;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCryptocurrency() {
		return cryptocurrency;
	}

	public void setCryptocurrency(String cryptocurrency) {
		this.cryptocurrency = cryptocurrency;
	}

	public int getPriceMargin() {
		return priceMargin;
	}

	public void setPriceMargin(int priceMargin) {
		this.priceMargin = priceMargin;
	}

	public int getInvestmentPeriod() {
		return investmentPeriod;
	}

	public void setInvestmentPeriod(int investmentPeriod) {
		this.investmentPeriod = investmentPeriod;
	}

	public List<eventLog> getEventLogs() {
		return eventLogs;
	}

	public void setEventLogs(List<eventLog> eventLogs) {
		this.eventLogs = eventLogs;
	}

	public void addEventLogs(eventLog eventLogs) {
		this.eventLogs.add(eventLogs);
	}

	@Override
	public String toString() {
		return "Id : " + id + "\nuserName : " + userName + "\npassword : " + password + "\nfirstName : " + firstName
				+ "\nlastName : " + lastName + "\nemail : " + email + "\nrefreshToken : " + refreshToken
				+ "\naccessToken : " + accessToken + "\ncoinbaseAcc : " + coinbaseAccount;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
}
