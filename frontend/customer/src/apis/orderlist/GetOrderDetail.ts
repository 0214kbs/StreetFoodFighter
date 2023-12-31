import api from '../api';

const GetOrderDetailAPI = async (orderId: any) => {
  const accessToken = localStorage.getItem('user-accessToken');

  try {
    const response = await api.get(`/api/order-server/orders/${orderId}`, {
      headers: { Authorization: `${accessToken}` },
    });
    // console.log('OrderDetail : ', response.data);
    return response.data;
  } catch (error) {
    console.error(error);
    return null;
  }
};

export default GetOrderDetailAPI;
