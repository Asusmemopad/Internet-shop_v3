import React from 'react'

const Goods = ({ goods }) => {
  return (
    <div>
      <center><h1>Інтернет магазин</h1></center>
      { goods.map((goods) => (
        <div className="card">
          <div className="card-body">
            <h5 className="card-title">{goods.name}</h5>
            <h6 className="card-subtitle mb-2 text-muted">Ціна: {goods.price}</h6>
            <p className="card-text">Код товару: {goods.code}</p>
          </div>
        </div>
      ))}
    </div>
  )
};

export default Goods