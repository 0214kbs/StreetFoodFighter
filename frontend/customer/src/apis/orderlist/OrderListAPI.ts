import api from '../api';

const OrderListAPI = async () => {
  const accessToken = localStorage.getItem('user-accessToken');

  try {
    const response = await api.get(`/api/order-server/orders`, {
      headers: { Authorization: `${accessToken}` },
    });
    // console.log('OrderListAPI', response.data);
    return response.data.response;
  } catch (error) {
    console.error(error);
    return null;
  }
};

export default OrderListAPI;
