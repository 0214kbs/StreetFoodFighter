import { useEffect, useState } from 'react';
import { Curpos, Filter, Research, Position, StyledTop, Topbar } from './Main.styled';
import Card from '@/components/main/card';

declare global {
  interface Window {
    kakao: any;
  }
}
const MainPage = () => {
  const [map, setMap] = useState<any>();
  const [marker, setMarker] = useState<any>();

  useEffect(() => {
    window.kakao.maps.load(() => {
      const container = document.getElementById('map');
      const options = {
        center: new window.kakao.maps.LatLng(33.450701, 126.570667),
        level: 3,
      };

      setMap(new window.kakao.maps.Map(container, options));
      setMarker(new window.kakao.maps.Marker());
    });
  }, []);
  return (
    <div style={{ height: '100%' }}>
      <StyledTop>
        <Topbar>
          <Filter>
            <img src="/images/top/filter.png" style={{ width: '35px' }} />
          </Filter>

          <Position>부산시 강서구 녹산동</Position>
        </Topbar>
        <Research>현 위치에서 재검색</Research>
      </StyledTop>
      <Curpos>
        <img src="/images/orderfunding/curpos.png" style={{ width: '40px' }} />
      </Curpos>
      <div style={{ position: 'fixed', bottom: '70px', zIndex: '3', display: 'flex', gap: '10px' }}>
        <Card />
        <Card />
      </div>
      <div style={{ height: '100%' }}>
        <div id="map" style={{ width: '100%', height: '100%' }}></div>
      </div>
    </div>
  );
};

export default MainPage;
