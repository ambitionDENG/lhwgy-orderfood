package com.yczn.pojo.dc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DcDishStyleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcDishStyleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDishstyleidIsNull() {
            addCriterion("DishStyleID is null");
            return (Criteria) this;
        }

        public Criteria andDishstyleidIsNotNull() {
            addCriterion("DishStyleID is not null");
            return (Criteria) this;
        }

        public Criteria andDishstyleidEqualTo(Long value) {
            addCriterion("DishStyleID =", value, "dishstyleid");
            return (Criteria) this;
        }

        public Criteria andDishstyleidNotEqualTo(Long value) {
            addCriterion("DishStyleID <>", value, "dishstyleid");
            return (Criteria) this;
        }

        public Criteria andDishstyleidGreaterThan(Long value) {
            addCriterion("DishStyleID >", value, "dishstyleid");
            return (Criteria) this;
        }

        public Criteria andDishstyleidGreaterThanOrEqualTo(Long value) {
            addCriterion("DishStyleID >=", value, "dishstyleid");
            return (Criteria) this;
        }

        public Criteria andDishstyleidLessThan(Long value) {
            addCriterion("DishStyleID <", value, "dishstyleid");
            return (Criteria) this;
        }

        public Criteria andDishstyleidLessThanOrEqualTo(Long value) {
            addCriterion("DishStyleID <=", value, "dishstyleid");
            return (Criteria) this;
        }

        public Criteria andDishstyleidIn(List<Long> values) {
            addCriterion("DishStyleID in", values, "dishstyleid");
            return (Criteria) this;
        }

        public Criteria andDishstyleidNotIn(List<Long> values) {
            addCriterion("DishStyleID not in", values, "dishstyleid");
            return (Criteria) this;
        }

        public Criteria andDishstyleidBetween(Long value1, Long value2) {
            addCriterion("DishStyleID between", value1, value2, "dishstyleid");
            return (Criteria) this;
        }

        public Criteria andDishstyleidNotBetween(Long value1, Long value2) {
            addCriterion("DishStyleID not between", value1, value2, "dishstyleid");
            return (Criteria) this;
        }

        public Criteria andShitangidIsNull() {
            addCriterion("ShiTangID is null");
            return (Criteria) this;
        }

        public Criteria andShitangidIsNotNull() {
            addCriterion("ShiTangID is not null");
            return (Criteria) this;
        }

        public Criteria andShitangidEqualTo(Long value) {
            addCriterion("ShiTangID =", value, "shitangid");
            return (Criteria) this;
        }

        public Criteria andShitangidNotEqualTo(Long value) {
            addCriterion("ShiTangID <>", value, "shitangid");
            return (Criteria) this;
        }

        public Criteria andShitangidGreaterThan(Long value) {
            addCriterion("ShiTangID >", value, "shitangid");
            return (Criteria) this;
        }

        public Criteria andShitangidGreaterThanOrEqualTo(Long value) {
            addCriterion("ShiTangID >=", value, "shitangid");
            return (Criteria) this;
        }

        public Criteria andShitangidLessThan(Long value) {
            addCriterion("ShiTangID <", value, "shitangid");
            return (Criteria) this;
        }

        public Criteria andShitangidLessThanOrEqualTo(Long value) {
            addCriterion("ShiTangID <=", value, "shitangid");
            return (Criteria) this;
        }

        public Criteria andShitangidIn(List<Long> values) {
            addCriterion("ShiTangID in", values, "shitangid");
            return (Criteria) this;
        }

        public Criteria andShitangidNotIn(List<Long> values) {
            addCriterion("ShiTangID not in", values, "shitangid");
            return (Criteria) this;
        }

        public Criteria andShitangidBetween(Long value1, Long value2) {
            addCriterion("ShiTangID between", value1, value2, "shitangid");
            return (Criteria) this;
        }

        public Criteria andShitangidNotBetween(Long value1, Long value2) {
            addCriterion("ShiTangID not between", value1, value2, "shitangid");
            return (Criteria) this;
        }

        public Criteria andDishstylenoIsNull() {
            addCriterion("DishStyleNo is null");
            return (Criteria) this;
        }

        public Criteria andDishstylenoIsNotNull() {
            addCriterion("DishStyleNo is not null");
            return (Criteria) this;
        }

        public Criteria andDishstylenoEqualTo(String value) {
            addCriterion("DishStyleNo =", value, "dishstyleno");
            return (Criteria) this;
        }

        public Criteria andDishstylenoNotEqualTo(String value) {
            addCriterion("DishStyleNo <>", value, "dishstyleno");
            return (Criteria) this;
        }

        public Criteria andDishstylenoGreaterThan(String value) {
            addCriterion("DishStyleNo >", value, "dishstyleno");
            return (Criteria) this;
        }

        public Criteria andDishstylenoGreaterThanOrEqualTo(String value) {
            addCriterion("DishStyleNo >=", value, "dishstyleno");
            return (Criteria) this;
        }

        public Criteria andDishstylenoLessThan(String value) {
            addCriterion("DishStyleNo <", value, "dishstyleno");
            return (Criteria) this;
        }

        public Criteria andDishstylenoLessThanOrEqualTo(String value) {
            addCriterion("DishStyleNo <=", value, "dishstyleno");
            return (Criteria) this;
        }

        public Criteria andDishstylenoLike(String value) {
            addCriterion("DishStyleNo like", value, "dishstyleno");
            return (Criteria) this;
        }

        public Criteria andDishstylenoNotLike(String value) {
            addCriterion("DishStyleNo not like", value, "dishstyleno");
            return (Criteria) this;
        }

        public Criteria andDishstylenoIn(List<String> values) {
            addCriterion("DishStyleNo in", values, "dishstyleno");
            return (Criteria) this;
        }

        public Criteria andDishstylenoNotIn(List<String> values) {
            addCriterion("DishStyleNo not in", values, "dishstyleno");
            return (Criteria) this;
        }

        public Criteria andDishstylenoBetween(String value1, String value2) {
            addCriterion("DishStyleNo between", value1, value2, "dishstyleno");
            return (Criteria) this;
        }

        public Criteria andDishstylenoNotBetween(String value1, String value2) {
            addCriterion("DishStyleNo not between", value1, value2, "dishstyleno");
            return (Criteria) this;
        }

        public Criteria andDishstylenameIsNull() {
            addCriterion("DishStyleName is null");
            return (Criteria) this;
        }

        public Criteria andDishstylenameIsNotNull() {
            addCriterion("DishStyleName is not null");
            return (Criteria) this;
        }

        public Criteria andDishstylenameEqualTo(String value) {
            addCriterion("DishStyleName =", value, "dishstylename");
            return (Criteria) this;
        }

        public Criteria andDishstylenameNotEqualTo(String value) {
            addCriterion("DishStyleName <>", value, "dishstylename");
            return (Criteria) this;
        }

        public Criteria andDishstylenameGreaterThan(String value) {
            addCriterion("DishStyleName >", value, "dishstylename");
            return (Criteria) this;
        }

        public Criteria andDishstylenameGreaterThanOrEqualTo(String value) {
            addCriterion("DishStyleName >=", value, "dishstylename");
            return (Criteria) this;
        }

        public Criteria andDishstylenameLessThan(String value) {
            addCriterion("DishStyleName <", value, "dishstylename");
            return (Criteria) this;
        }

        public Criteria andDishstylenameLessThanOrEqualTo(String value) {
            addCriterion("DishStyleName <=", value, "dishstylename");
            return (Criteria) this;
        }

        public Criteria andDishstylenameLike(String value) {
            addCriterion("DishStyleName like", value, "dishstylename");
            return (Criteria) this;
        }

        public Criteria andDishstylenameNotLike(String value) {
            addCriterion("DishStyleName not like", value, "dishstylename");
            return (Criteria) this;
        }

        public Criteria andDishstylenameIn(List<String> values) {
            addCriterion("DishStyleName in", values, "dishstylename");
            return (Criteria) this;
        }

        public Criteria andDishstylenameNotIn(List<String> values) {
            addCriterion("DishStyleName not in", values, "dishstylename");
            return (Criteria) this;
        }

        public Criteria andDishstylenameBetween(String value1, String value2) {
            addCriterion("DishStyleName between", value1, value2, "dishstylename");
            return (Criteria) this;
        }

        public Criteria andDishstylenameNotBetween(String value1, String value2) {
            addCriterion("DishStyleName not between", value1, value2, "dishstylename");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andImagepathIsNull() {
            addCriterion("ImagePath is null");
            return (Criteria) this;
        }

        public Criteria andImagepathIsNotNull() {
            addCriterion("ImagePath is not null");
            return (Criteria) this;
        }

        public Criteria andImagepathEqualTo(String value) {
            addCriterion("ImagePath =", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotEqualTo(String value) {
            addCriterion("ImagePath <>", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathGreaterThan(String value) {
            addCriterion("ImagePath >", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathGreaterThanOrEqualTo(String value) {
            addCriterion("ImagePath >=", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathLessThan(String value) {
            addCriterion("ImagePath <", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathLessThanOrEqualTo(String value) {
            addCriterion("ImagePath <=", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathLike(String value) {
            addCriterion("ImagePath like", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotLike(String value) {
            addCriterion("ImagePath not like", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathIn(List<String> values) {
            addCriterion("ImagePath in", values, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotIn(List<String> values) {
            addCriterion("ImagePath not in", values, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathBetween(String value1, String value2) {
            addCriterion("ImagePath between", value1, value2, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotBetween(String value1, String value2) {
            addCriterion("ImagePath not between", value1, value2, "imagepath");
            return (Criteria) this;
        }

        public Criteria andFoodtypeidIsNull() {
            addCriterion("FoodTypeID is null");
            return (Criteria) this;
        }

        public Criteria andFoodtypeidIsNotNull() {
            addCriterion("FoodTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andFoodtypeidEqualTo(Long value) {
            addCriterion("FoodTypeID =", value, "foodtypeid");
            return (Criteria) this;
        }

        public Criteria andFoodtypeidNotEqualTo(Long value) {
            addCriterion("FoodTypeID <>", value, "foodtypeid");
            return (Criteria) this;
        }

        public Criteria andFoodtypeidGreaterThan(Long value) {
            addCriterion("FoodTypeID >", value, "foodtypeid");
            return (Criteria) this;
        }

        public Criteria andFoodtypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("FoodTypeID >=", value, "foodtypeid");
            return (Criteria) this;
        }

        public Criteria andFoodtypeidLessThan(Long value) {
            addCriterion("FoodTypeID <", value, "foodtypeid");
            return (Criteria) this;
        }

        public Criteria andFoodtypeidLessThanOrEqualTo(Long value) {
            addCriterion("FoodTypeID <=", value, "foodtypeid");
            return (Criteria) this;
        }

        public Criteria andFoodtypeidIn(List<Long> values) {
            addCriterion("FoodTypeID in", values, "foodtypeid");
            return (Criteria) this;
        }

        public Criteria andFoodtypeidNotIn(List<Long> values) {
            addCriterion("FoodTypeID not in", values, "foodtypeid");
            return (Criteria) this;
        }

        public Criteria andFoodtypeidBetween(Long value1, Long value2) {
            addCriterion("FoodTypeID between", value1, value2, "foodtypeid");
            return (Criteria) this;
        }

        public Criteria andFoodtypeidNotBetween(Long value1, Long value2) {
            addCriterion("FoodTypeID not between", value1, value2, "foodtypeid");
            return (Criteria) this;
        }

        public Criteria andMealtypeid1IsNull() {
            addCriterion("MealTypeID1 is null");
            return (Criteria) this;
        }

        public Criteria andMealtypeid1IsNotNull() {
            addCriterion("MealTypeID1 is not null");
            return (Criteria) this;
        }

        public Criteria andMealtypeid1EqualTo(Boolean value) {
            addCriterion("MealTypeID1 =", value, "mealtypeid1");
            return (Criteria) this;
        }

        public Criteria andMealtypeid1NotEqualTo(Boolean value) {
            addCriterion("MealTypeID1 <>", value, "mealtypeid1");
            return (Criteria) this;
        }

        public Criteria andMealtypeid1GreaterThan(Boolean value) {
            addCriterion("MealTypeID1 >", value, "mealtypeid1");
            return (Criteria) this;
        }

        public Criteria andMealtypeid1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("MealTypeID1 >=", value, "mealtypeid1");
            return (Criteria) this;
        }

        public Criteria andMealtypeid1LessThan(Boolean value) {
            addCriterion("MealTypeID1 <", value, "mealtypeid1");
            return (Criteria) this;
        }

        public Criteria andMealtypeid1LessThanOrEqualTo(Boolean value) {
            addCriterion("MealTypeID1 <=", value, "mealtypeid1");
            return (Criteria) this;
        }

        public Criteria andMealtypeid1In(List<Boolean> values) {
            addCriterion("MealTypeID1 in", values, "mealtypeid1");
            return (Criteria) this;
        }

        public Criteria andMealtypeid1NotIn(List<Boolean> values) {
            addCriterion("MealTypeID1 not in", values, "mealtypeid1");
            return (Criteria) this;
        }

        public Criteria andMealtypeid1Between(Boolean value1, Boolean value2) {
            addCriterion("MealTypeID1 between", value1, value2, "mealtypeid1");
            return (Criteria) this;
        }

        public Criteria andMealtypeid1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("MealTypeID1 not between", value1, value2, "mealtypeid1");
            return (Criteria) this;
        }

        public Criteria andMealtypeid2IsNull() {
            addCriterion("MealTypeID2 is null");
            return (Criteria) this;
        }

        public Criteria andMealtypeid2IsNotNull() {
            addCriterion("MealTypeID2 is not null");
            return (Criteria) this;
        }

        public Criteria andMealtypeid2EqualTo(Boolean value) {
            addCriterion("MealTypeID2 =", value, "mealtypeid2");
            return (Criteria) this;
        }

        public Criteria andMealtypeid2NotEqualTo(Boolean value) {
            addCriterion("MealTypeID2 <>", value, "mealtypeid2");
            return (Criteria) this;
        }

        public Criteria andMealtypeid2GreaterThan(Boolean value) {
            addCriterion("MealTypeID2 >", value, "mealtypeid2");
            return (Criteria) this;
        }

        public Criteria andMealtypeid2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("MealTypeID2 >=", value, "mealtypeid2");
            return (Criteria) this;
        }

        public Criteria andMealtypeid2LessThan(Boolean value) {
            addCriterion("MealTypeID2 <", value, "mealtypeid2");
            return (Criteria) this;
        }

        public Criteria andMealtypeid2LessThanOrEqualTo(Boolean value) {
            addCriterion("MealTypeID2 <=", value, "mealtypeid2");
            return (Criteria) this;
        }

        public Criteria andMealtypeid2In(List<Boolean> values) {
            addCriterion("MealTypeID2 in", values, "mealtypeid2");
            return (Criteria) this;
        }

        public Criteria andMealtypeid2NotIn(List<Boolean> values) {
            addCriterion("MealTypeID2 not in", values, "mealtypeid2");
            return (Criteria) this;
        }

        public Criteria andMealtypeid2Between(Boolean value1, Boolean value2) {
            addCriterion("MealTypeID2 between", value1, value2, "mealtypeid2");
            return (Criteria) this;
        }

        public Criteria andMealtypeid2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("MealTypeID2 not between", value1, value2, "mealtypeid2");
            return (Criteria) this;
        }

        public Criteria andMealtypeid3IsNull() {
            addCriterion("MealTypeID3 is null");
            return (Criteria) this;
        }

        public Criteria andMealtypeid3IsNotNull() {
            addCriterion("MealTypeID3 is not null");
            return (Criteria) this;
        }

        public Criteria andMealtypeid3EqualTo(Boolean value) {
            addCriterion("MealTypeID3 =", value, "mealtypeid3");
            return (Criteria) this;
        }

        public Criteria andMealtypeid3NotEqualTo(Boolean value) {
            addCriterion("MealTypeID3 <>", value, "mealtypeid3");
            return (Criteria) this;
        }

        public Criteria andMealtypeid3GreaterThan(Boolean value) {
            addCriterion("MealTypeID3 >", value, "mealtypeid3");
            return (Criteria) this;
        }

        public Criteria andMealtypeid3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("MealTypeID3 >=", value, "mealtypeid3");
            return (Criteria) this;
        }

        public Criteria andMealtypeid3LessThan(Boolean value) {
            addCriterion("MealTypeID3 <", value, "mealtypeid3");
            return (Criteria) this;
        }

        public Criteria andMealtypeid3LessThanOrEqualTo(Boolean value) {
            addCriterion("MealTypeID3 <=", value, "mealtypeid3");
            return (Criteria) this;
        }

        public Criteria andMealtypeid3In(List<Boolean> values) {
            addCriterion("MealTypeID3 in", values, "mealtypeid3");
            return (Criteria) this;
        }

        public Criteria andMealtypeid3NotIn(List<Boolean> values) {
            addCriterion("MealTypeID3 not in", values, "mealtypeid3");
            return (Criteria) this;
        }

        public Criteria andMealtypeid3Between(Boolean value1, Boolean value2) {
            addCriterion("MealTypeID3 between", value1, value2, "mealtypeid3");
            return (Criteria) this;
        }

        public Criteria andMealtypeid3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("MealTypeID3 not between", value1, value2, "mealtypeid3");
            return (Criteria) this;
        }

        public Criteria andMealtypeid4IsNull() {
            addCriterion("MealTypeID4 is null");
            return (Criteria) this;
        }

        public Criteria andMealtypeid4IsNotNull() {
            addCriterion("MealTypeID4 is not null");
            return (Criteria) this;
        }

        public Criteria andMealtypeid4EqualTo(Boolean value) {
            addCriterion("MealTypeID4 =", value, "mealtypeid4");
            return (Criteria) this;
        }

        public Criteria andMealtypeid4NotEqualTo(Boolean value) {
            addCriterion("MealTypeID4 <>", value, "mealtypeid4");
            return (Criteria) this;
        }

        public Criteria andMealtypeid4GreaterThan(Boolean value) {
            addCriterion("MealTypeID4 >", value, "mealtypeid4");
            return (Criteria) this;
        }

        public Criteria andMealtypeid4GreaterThanOrEqualTo(Boolean value) {
            addCriterion("MealTypeID4 >=", value, "mealtypeid4");
            return (Criteria) this;
        }

        public Criteria andMealtypeid4LessThan(Boolean value) {
            addCriterion("MealTypeID4 <", value, "mealtypeid4");
            return (Criteria) this;
        }

        public Criteria andMealtypeid4LessThanOrEqualTo(Boolean value) {
            addCriterion("MealTypeID4 <=", value, "mealtypeid4");
            return (Criteria) this;
        }

        public Criteria andMealtypeid4In(List<Boolean> values) {
            addCriterion("MealTypeID4 in", values, "mealtypeid4");
            return (Criteria) this;
        }

        public Criteria andMealtypeid4NotIn(List<Boolean> values) {
            addCriterion("MealTypeID4 not in", values, "mealtypeid4");
            return (Criteria) this;
        }

        public Criteria andMealtypeid4Between(Boolean value1, Boolean value2) {
            addCriterion("MealTypeID4 between", value1, value2, "mealtypeid4");
            return (Criteria) this;
        }

        public Criteria andMealtypeid4NotBetween(Boolean value1, Boolean value2) {
            addCriterion("MealTypeID4 not between", value1, value2, "mealtypeid4");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("StartTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("StartTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("EndTime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("EndTime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andMaxnumIsNull() {
            addCriterion("MaxNum is null");
            return (Criteria) this;
        }

        public Criteria andMaxnumIsNotNull() {
            addCriterion("MaxNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxnumEqualTo(Integer value) {
            addCriterion("MaxNum =", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotEqualTo(Integer value) {
            addCriterion("MaxNum <>", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumGreaterThan(Integer value) {
            addCriterion("MaxNum >", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaxNum >=", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLessThan(Integer value) {
            addCriterion("MaxNum <", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLessThanOrEqualTo(Integer value) {
            addCriterion("MaxNum <=", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumIn(List<Integer> values) {
            addCriterion("MaxNum in", values, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotIn(List<Integer> values) {
            addCriterion("MaxNum not in", values, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumBetween(Integer value1, Integer value2) {
            addCriterion("MaxNum between", value1, value2, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotBetween(Integer value1, Integer value2) {
            addCriterion("MaxNum not between", value1, value2, "maxnum");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("Notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("Notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("Notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("Notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("Notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("Notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("Notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("Notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("Notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("Notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("Notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("Notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("Notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("Notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andDishstylestatusIsNull() {
            addCriterion("DishStyleStatus is null");
            return (Criteria) this;
        }

        public Criteria andDishstylestatusIsNotNull() {
            addCriterion("DishStyleStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDishstylestatusEqualTo(Boolean value) {
            addCriterion("DishStyleStatus =", value, "dishstylestatus");
            return (Criteria) this;
        }

        public Criteria andDishstylestatusNotEqualTo(Boolean value) {
            addCriterion("DishStyleStatus <>", value, "dishstylestatus");
            return (Criteria) this;
        }

        public Criteria andDishstylestatusGreaterThan(Boolean value) {
            addCriterion("DishStyleStatus >", value, "dishstylestatus");
            return (Criteria) this;
        }

        public Criteria andDishstylestatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DishStyleStatus >=", value, "dishstylestatus");
            return (Criteria) this;
        }

        public Criteria andDishstylestatusLessThan(Boolean value) {
            addCriterion("DishStyleStatus <", value, "dishstylestatus");
            return (Criteria) this;
        }

        public Criteria andDishstylestatusLessThanOrEqualTo(Boolean value) {
            addCriterion("DishStyleStatus <=", value, "dishstylestatus");
            return (Criteria) this;
        }

        public Criteria andDishstylestatusIn(List<Boolean> values) {
            addCriterion("DishStyleStatus in", values, "dishstylestatus");
            return (Criteria) this;
        }

        public Criteria andDishstylestatusNotIn(List<Boolean> values) {
            addCriterion("DishStyleStatus not in", values, "dishstylestatus");
            return (Criteria) this;
        }

        public Criteria andDishstylestatusBetween(Boolean value1, Boolean value2) {
            addCriterion("DishStyleStatus between", value1, value2, "dishstylestatus");
            return (Criteria) this;
        }

        public Criteria andDishstylestatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DishStyleStatus not between", value1, value2, "dishstylestatus");
            return (Criteria) this;
        }

        public Criteria andF1IsNull() {
            addCriterion("F1 is null");
            return (Criteria) this;
        }

        public Criteria andF1IsNotNull() {
            addCriterion("F1 is not null");
            return (Criteria) this;
        }

        public Criteria andF1EqualTo(String value) {
            addCriterion("F1 =", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotEqualTo(String value) {
            addCriterion("F1 <>", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThan(String value) {
            addCriterion("F1 >", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThanOrEqualTo(String value) {
            addCriterion("F1 >=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThan(String value) {
            addCriterion("F1 <", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThanOrEqualTo(String value) {
            addCriterion("F1 <=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1Like(String value) {
            addCriterion("F1 like", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotLike(String value) {
            addCriterion("F1 not like", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1In(List<String> values) {
            addCriterion("F1 in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotIn(List<String> values) {
            addCriterion("F1 not in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1Between(String value1, String value2) {
            addCriterion("F1 between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotBetween(String value1, String value2) {
            addCriterion("F1 not between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF2IsNull() {
            addCriterion("F2 is null");
            return (Criteria) this;
        }

        public Criteria andF2IsNotNull() {
            addCriterion("F2 is not null");
            return (Criteria) this;
        }

        public Criteria andF2EqualTo(String value) {
            addCriterion("F2 =", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotEqualTo(String value) {
            addCriterion("F2 <>", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThan(String value) {
            addCriterion("F2 >", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThanOrEqualTo(String value) {
            addCriterion("F2 >=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThan(String value) {
            addCriterion("F2 <", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThanOrEqualTo(String value) {
            addCriterion("F2 <=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2Like(String value) {
            addCriterion("F2 like", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotLike(String value) {
            addCriterion("F2 not like", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2In(List<String> values) {
            addCriterion("F2 in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotIn(List<String> values) {
            addCriterion("F2 not in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2Between(String value1, String value2) {
            addCriterion("F2 between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotBetween(String value1, String value2) {
            addCriterion("F2 not between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF3IsNull() {
            addCriterion("F3 is null");
            return (Criteria) this;
        }

        public Criteria andF3IsNotNull() {
            addCriterion("F3 is not null");
            return (Criteria) this;
        }

        public Criteria andF3EqualTo(String value) {
            addCriterion("F3 =", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotEqualTo(String value) {
            addCriterion("F3 <>", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThan(String value) {
            addCriterion("F3 >", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThanOrEqualTo(String value) {
            addCriterion("F3 >=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThan(String value) {
            addCriterion("F3 <", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThanOrEqualTo(String value) {
            addCriterion("F3 <=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3Like(String value) {
            addCriterion("F3 like", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotLike(String value) {
            addCriterion("F3 not like", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3In(List<String> values) {
            addCriterion("F3 in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotIn(List<String> values) {
            addCriterion("F3 not in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3Between(String value1, String value2) {
            addCriterion("F3 between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotBetween(String value1, String value2) {
            addCriterion("F3 not between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andStatusidIsNull() {
            addCriterion("StatusID is null");
            return (Criteria) this;
        }

        public Criteria andStatusidIsNotNull() {
            addCriterion("StatusID is not null");
            return (Criteria) this;
        }

        public Criteria andStatusidEqualTo(Short value) {
            addCriterion("StatusID =", value, "statusid");
            return (Criteria) this;
        }

        public Criteria andStatusidNotEqualTo(Short value) {
            addCriterion("StatusID <>", value, "statusid");
            return (Criteria) this;
        }

        public Criteria andStatusidGreaterThan(Short value) {
            addCriterion("StatusID >", value, "statusid");
            return (Criteria) this;
        }

        public Criteria andStatusidGreaterThanOrEqualTo(Short value) {
            addCriterion("StatusID >=", value, "statusid");
            return (Criteria) this;
        }

        public Criteria andStatusidLessThan(Short value) {
            addCriterion("StatusID <", value, "statusid");
            return (Criteria) this;
        }

        public Criteria andStatusidLessThanOrEqualTo(Short value) {
            addCriterion("StatusID <=", value, "statusid");
            return (Criteria) this;
        }

        public Criteria andStatusidIn(List<Short> values) {
            addCriterion("StatusID in", values, "statusid");
            return (Criteria) this;
        }

        public Criteria andStatusidNotIn(List<Short> values) {
            addCriterion("StatusID not in", values, "statusid");
            return (Criteria) this;
        }

        public Criteria andStatusidBetween(Short value1, Short value2) {
            addCriterion("StatusID between", value1, value2, "statusid");
            return (Criteria) this;
        }

        public Criteria andStatusidNotBetween(Short value1, Short value2) {
            addCriterion("StatusID not between", value1, value2, "statusid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("CreateUserID is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("CreateUserID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(Long value) {
            addCriterion("CreateUserID =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(Long value) {
            addCriterion("CreateUserID <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(Long value) {
            addCriterion("CreateUserID >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("CreateUserID >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(Long value) {
            addCriterion("CreateUserID <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(Long value) {
            addCriterion("CreateUserID <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<Long> values) {
            addCriterion("CreateUserID in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<Long> values) {
            addCriterion("CreateUserID not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(Long value1, Long value2) {
            addCriterion("CreateUserID between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(Long value1, Long value2) {
            addCriterion("CreateUserID not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andModifyuseridIsNull() {
            addCriterion("ModifyUserID is null");
            return (Criteria) this;
        }

        public Criteria andModifyuseridIsNotNull() {
            addCriterion("ModifyUserID is not null");
            return (Criteria) this;
        }

        public Criteria andModifyuseridEqualTo(Long value) {
            addCriterion("ModifyUserID =", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridNotEqualTo(Long value) {
            addCriterion("ModifyUserID <>", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridGreaterThan(Long value) {
            addCriterion("ModifyUserID >", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("ModifyUserID >=", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridLessThan(Long value) {
            addCriterion("ModifyUserID <", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridLessThanOrEqualTo(Long value) {
            addCriterion("ModifyUserID <=", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridIn(List<Long> values) {
            addCriterion("ModifyUserID in", values, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridNotIn(List<Long> values) {
            addCriterion("ModifyUserID not in", values, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridBetween(Long value1, Long value2) {
            addCriterion("ModifyUserID between", value1, value2, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridNotBetween(Long value1, Long value2) {
            addCriterion("ModifyUserID not between", value1, value2, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("ModifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("ModifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("ModifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("ModifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("ModifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("ModifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("ModifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("ModifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("ModifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("ModifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("ModifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andDishstylecountIsNull() {
            addCriterion("DishStyleCount is null");
            return (Criteria) this;
        }

        public Criteria andDishstylecountIsNotNull() {
            addCriterion("DishStyleCount is not null");
            return (Criteria) this;
        }

        public Criteria andDishstylecountEqualTo(Integer value) {
            addCriterion("DishStyleCount =", value, "dishstylecount");
            return (Criteria) this;
        }

        public Criteria andDishstylecountNotEqualTo(Integer value) {
            addCriterion("DishStyleCount <>", value, "dishstylecount");
            return (Criteria) this;
        }

        public Criteria andDishstylecountGreaterThan(Integer value) {
            addCriterion("DishStyleCount >", value, "dishstylecount");
            return (Criteria) this;
        }

        public Criteria andDishstylecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("DishStyleCount >=", value, "dishstylecount");
            return (Criteria) this;
        }

        public Criteria andDishstylecountLessThan(Integer value) {
            addCriterion("DishStyleCount <", value, "dishstylecount");
            return (Criteria) this;
        }

        public Criteria andDishstylecountLessThanOrEqualTo(Integer value) {
            addCriterion("DishStyleCount <=", value, "dishstylecount");
            return (Criteria) this;
        }

        public Criteria andDishstylecountIn(List<Integer> values) {
            addCriterion("DishStyleCount in", values, "dishstylecount");
            return (Criteria) this;
        }

        public Criteria andDishstylecountNotIn(List<Integer> values) {
            addCriterion("DishStyleCount not in", values, "dishstylecount");
            return (Criteria) this;
        }

        public Criteria andDishstylecountBetween(Integer value1, Integer value2) {
            addCriterion("DishStyleCount between", value1, value2, "dishstylecount");
            return (Criteria) this;
        }

        public Criteria andDishstylecountNotBetween(Integer value1, Integer value2) {
            addCriterion("DishStyleCount not between", value1, value2, "dishstylecount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}